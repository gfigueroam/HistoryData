package historydata;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SimulationThread extends Thread {

	private static final int  DELAY_IN_MS = 10;
	private static final int THREAD_POOL_SIZE = 20;

	private final List<ServiceAdapter<?>> services;
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
		
		long start = System.currentTimeMillis();
		
		setupFiles();
		
		try {
			
			//Create thread pool to process each row in a single thread
			ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
			
			while (counter < processor.getSize()) {
				
				//Processing rowNumber = counter
				RowProcessingThread rowProcessing = new RowProcessingThread(processor, services, counter);
				executor.execute(rowProcessing);
				
				counter++;
			}
			
			//waiting for all the threads to finish
			executor.shutdown();
			while(!executor.isTerminated()) {
				Thread.sleep(DELAY_IN_MS);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long timeElapsed = System.currentTimeMillis() - start;
		
		System.out.println("\n\n************************\n"
				+ "Classification Complete \n  in:" +timeElapsed
				+"ms \n  ************************");
	
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
	
}