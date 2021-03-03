package historydata;

import java.text.ParseException;
import java.util.List;

import org.jfree.data.Value;
import org.jfree.data.Values;

public class SimulationThread extends Thread {

	private static final int DELAY_IN_MS = 10;

	private final List<ServiceAdapter<?>> services;
	private HistoryData currentInputData;
	private ProcessData processor;
	private int counter = 1;
	

	public SimulationThread(List<ServiceAdapter<?>> services) {
		this.services = services;
	}

	/**
	 * History Data
	 */
	@Override
	public void run() {
		try {
			
			setupFiles();
			//While we have data in file to be processed
			while (counter < processor.getSize()) {
				
				/* Generate random email */
				startProcessingData();
				if(currentInputData!=null)
				{
					System.out.println(this.currentInputData);
	
					/* Use services */
					for (ServiceAdapter<?> s : services)
						s.post(currentInputData);
	
					/* Wait a bit */
					Thread.sleep(DELAY_IN_MS);
					counter++;
				}
			}
			System.out.println("\n\n************************\n"
					+ "Classification Complete \n"
					+"************************");
		} catch (InterruptedException e) {
		}
	}
	
	/**
	 * Select file for testing
	 */
	private void setupFiles() {
		CSVReader reader = new CSVReader();
		List<String[]> data;
		
		if(reader.isFileFound()) {
			data = reader.getData();
			this.processor = new ProcessData(data);
		}
	}
	
	/**
	 * 
	 * ----------------------------
	 * FORMAL CHECKER OF DATA INPUT
	 * ----------------------------
	 * TODO Change index based on actual data sheet for Historical Data
	 * @throws ParseException 
	 */
	public void startProcessingData(){
		currentInputData = new HistoryData();
		String[] values = processor.getCurrentRow(counter);
		
		int i = 0;
		for (String s : values) {
			System.out.println(i + " -- " + s);
			i++;
		}
		
		//ID
		//currentInputData.setIsNumeric(values[0]);
		currentInputData.setIsValidIDFormat(values[0]);
		
		//Sex
		currentInputData.setIsValidSex(values[5]);
		
		//Age
		currentInputData.setIsValidAge(values[8]);
		
		//Martial Status
		currentInputData.setMaritalStatus(values[9]);
		
		//Registration Data
		currentInputData.setIsRegistrationDateOutOfRange(values[21]);
		
		/*
		//Cause of Death
		currentInputData.setCauseOfDeathInput(values[4]);
		
		//Certification
		currentInputData.setCertification(values[5]);
		*/
		
		//Valid Informant Present at Death
		currentInputData.setIsValidInformant(values[17]);
		currentInputData.setIsPresentAtDeathInput(values[19]);
		
		//Qualified Informant or Address of Informant
		currentInputData.setIsQualifiedInformant(values[18]);
		currentInputData.setIsValidInformantAddress(values[20]); //TODO What to do if no data at end of row...array only has 8 spots, error
		
		//Rank - Profession or Occupation
		currentInputData.setIsValidRank(values[11]);
	}
}
