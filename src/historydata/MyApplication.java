package historydata;

public class MyApplication {

	public static void main(String[] args) {
		
		/* Create simulation */
		ServiceSimulation simulation = new ServiceSimulation();

		/* Add some exemplary Boolean decision services for comparison */
		simulation.withBaselineBooleanDecisionServices();

		/* Add your own Boolean decision service */
		simulation.withBooleanDecisionService("Users: Valid Data Input",
				new GeneratedDecisionService()::isValidHistoricalInput);

		/* Start the simulation */
		simulation.start();

	}

	

}
