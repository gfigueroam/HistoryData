package historydata;

import java.util.List;

/**
 * This class process a single row from the data processor,
 * it includes read and post it to the service specified.
 *
 */
public class RowProcessingThread implements Runnable {
	
	private  int rowNumber;
	private ProcessData processor;
	private List<ServiceAdapter<?>> services;
	
	/**
	 * Constructor
	 * @param processor Data processor from where the information is extracted
	 * @param services Service to post the results
	 * @param rowNumber number of the row to be processed
	 */
	public RowProcessingThread(ProcessData processor, List<ServiceAdapter<?>> services, int rowNumber) {
		this.rowNumber = rowNumber;
		this.processor = processor;
		this.services = services;
	}
	
	public void run() {
		
		HistoryData rowInputData = getRowInputData();
		
		if(rowInputData!=null)
		{
			System.out.println(rowInputData);

			for (ServiceAdapter<?> s : services)
				s.post(rowInputData);
		}
		
	}
	
	/**
	 * Get a single row information into an HistoryData object
	 * @return History Data
	 */
	private  HistoryData getRowInputData() {
		HistoryData rowInputData = new HistoryData();
		String[] values = null;
		
		synchronized(processor) {
			values = processor.getCurrentRow(rowNumber);
		}
		
		if(values == null)
			return null;
		
		//ID
		rowInputData.setIsValidIDFormat(values[0]);
		
		//Sex
		rowInputData.setIsValidSex(values[5]);
		
		//Age
		rowInputData.setIsValidAge(values[8]);
		
		//Martial Status
		rowInputData.setMaritalStatus(values[9]);
		
		//Forename
		rowInputData.setIsValidForename(values[6]);
		
		//Surname
		rowInputData.setIsValidSurname(values[7]);
		
		//Registration Data
		rowInputData.setIsRegistrationDateOutOfRange(values[21]);
		
		/*
		//Cause of Death
		currentInputData.setCauseOfDeathInput(values[4]);
		
		//Certification
		currentInputData.setCertification(values[5]);
		*/
		
		//Valid Informant Present at Death
		rowInputData.setIsValidInformant(values[17]);
		rowInputData.setIsPresentAtDeathInput(values[19]);
		
		//Qualified Informant or Address of Informant
		rowInputData.setIsQualifiedInformant(values[18]);
		rowInputData.setIsValidInformantAddress(values[20]);
		return rowInputData;
		
	}

}
