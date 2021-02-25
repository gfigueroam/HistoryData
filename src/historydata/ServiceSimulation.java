package historydata;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import historybaseline.BaselineBooleanUnderstandingOfValidInput;
import historydata.Predicates;

/*
import info.scce.addlib.mide.example.email.baseline.FrederiksBooleanRules;
import info.scce.addlib.mide.example.email.baseline.FrederiksBooleanUnderstandingOfUrgentEmails;
import info.scce.addlib.mide.example.email.baseline.FrederiksFuzzyRules;
import info.scce.addlib.mide.example.email.baseline.FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax;
import info.scce.addlib.mide.example.email.baseline.FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax2Bins;
import info.scce.addlib.mide.example.email.baseline.FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax3Bins;
import info.scce.addlib.mide.example.email.baseline.FrederiksFuzzyUnderstandingOfUrgentEmailsProbabilistic;

/**
 * Change details to match new program
 * @author PC
 *
 */
public class ServiceSimulation {

	private static final String TITLE_TEXT = "Compare Histroy Data Services";
	private static final String NO_SERVICE_SELECTED_TEXT = "Please select at least one decision service to start the simulation";

	//private static final int BINS = 5;

	private JFrame frame;
	private JPanel controlPanel;
	private JPanel diagramPanel;
	private ServiceSelectionPanel<Boolean> selectBooleanServices;
	//private ServiceSelectionPanel<Double> selectFuzzySeervices;
	private StartStopPanel startStop;

	private final List<Service<Predicates, Boolean>> booleanServices = new ArrayList<>();
	private Service<Predicates, Boolean> referenceBooleanService;
	//private final List<Service<Predicates, Double>> fuzzyServices = new ArrayList<>();
	//private Service<Predicates, Double> referenceFuzzyService;

	private SimulationThread simulationThread = null;

	public ServiceSimulation withBooleanDecisionService(String name, Function<Predicates, Boolean> f) {
		Service<Predicates, Boolean> service = new Service<>(name, f);
		booleanServices.add(service);
		return this;
	}

	public ServiceSimulation withReferenceBooleanDecisionService(String name, Function<Predicates, Boolean> f) {
		referenceBooleanService = new Service<>(name, f);
		return this;
	}

	/*
	public ServiceSimulation withFuzzyDecisionService(String name, Function<Predicates, Double> f) {
		Service<Predicates, Double> service = new Service<>(name, f);
		fuzzyServices.add(service);
		return this;
	}

	public ServiceSimulation withReferenceFuzzyDecisionService(String name, Function<Predicates, Double> f) {
		referenceFuzzyService = new Service<>(name, f);
		return this;
	}*/

	public ServiceSimulation withBaselineBooleanDecisionServices() {
		Service<Predicates, Boolean> s0 = new Service<>("Baseline: Valid Data Input",
				new BaselineBooleanUnderstandingOfValidInput()::isValidHistoricalInput);//isValidInput
		booleanServices.add(s0);
		
		/*Service<Predicates, Boolean> s1 = new Service<>("Frederik's boolean rule 'alerting subject'",
				new FrederiksBooleanRules()::alertingSubject);
		booleanServices.add(s1);*/
		return this;
	}

	public ServiceSimulation withBaselineFuzzyDecisionServices() {
		/*Service<Predicates, Double> s0 = new Service<>("Frederik's fuzzy understanding of urgent emails (min-max)",
				new FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax()::emailUrgent);
		Service<Predicates, Double> s1 = new Service<>(
				"Frederik's fuzzy understanding of urgent emails (min-max, 3 bins)",
				new FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax3Bins()::emailUrgent);
		Service<Predicates, Double> s2 = new Service<>(
				"Frederik's fuzzy understanding of urgent emails (min-max, 2 bins)",
				new FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax2Bins()::emailUrgent);
		Service<Predicates, Double> s3 = new Service<>(
				"Frederik's fuzzy understanding of urgent emails (probabilistic)",
				new FrederiksFuzzyUnderstandingOfUrgentEmailsProbabilistic()::emailUrgent);
		Service<Predicates, Double> s4 = new Service<>("Frederik's fuzzy rule 'alerting subject'",
				new FrederiksFuzzyRules()::alertingSubject);
		fuzzyServices.add(s0);
		fuzzyServices.add(s1);
		fuzzyServices.add(s2);
		fuzzyServices.add(s3);
		fuzzyServices.add(s4);*/
		return this;
	}

	public void start() {

		/* Ensure reference services */
		if (referenceBooleanService == null) {
			withReferenceBooleanDecisionService("Baseline: Valid Data Input",
					new BaselineBooleanUnderstandingOfValidInput()::isValidHistoricalInput);//isValidInput
		}
		/*if (referenceFuzzyService == null) {
			withReferenceFuzzyDecisionService("Frederik's fuzzy understanding of urgent emails (min-max)",
					new FrederiksFuzzyUnderstandingOfUrgentEmailsMinMax()::emailUrgent);
		}*/

		buildGUI();
		updateGUI();
	}

	private void buildGUI() {

		/* Build control panel */
		controlPanel = new JPanel();
		selectBooleanServices = new ServiceSelectionPanel<>(booleanServices);
		controlPanel.add(selectBooleanServices);
		//selectFuzzySeervices = new ServiceSelectionPanel<>(fuzzyServices);
		//controlPanel.add(selectFuzzySeervices);
		startStop = new StartStopPanel();
		startStop.btnStart().addActionListener(this::onStart);
		startStop.btnStop().addActionListener(this::onStop);
		controlPanel.add(startStop);

		/* Build diagram panel */
		diagramPanel = new JPanel();
		diagramPanel.setLayout(new BoxLayout(diagramPanel, BoxLayout.X_AXIS));

		/* Build frame */
		frame = new JFrame(TITLE_TEXT);
		Container p = frame.getContentPane();
		p.add(controlPanel, BorderLayout.NORTH);
		p.add(diagramPanel, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	private void updateGUI() {
		boolean inProgress = simulationThread != null;
		startStop.updateGUI(inProgress);
		frame.pack();
	}

	private void onStart(ActionEvent e) {
		boolean succefullyStopped = stopSimulation();
		if (succefullyStopped)
			startSimulation();
		updateGUI();
	}

	private void onStop(ActionEvent e) {
		stopSimulation();
		updateGUI();
	}

	private void startSimulation() {

		/* Collect selected services */
		List<Service<Predicates, Boolean>> selectedBooleanServices = selectBooleanServices.selectedServices();
		//List<Service<Predicates, Double>> selectedFuzzyServices = selectFuzzySeervices.selectedServices();

		if (selectedBooleanServices.isEmpty()){// && selectedFuzzyServices.isEmpty()) {
			JOptionPane.showMessageDialog(frame, NO_SERVICE_SELECTED_TEXT);
		} else {

			/* Create service diagrams and adapters */
			diagramPanel.removeAll();
			List<ServiceAdapter<?>> serviceAdapters = new ArrayList<>();
			for (Service<Predicates, Boolean> s : selectedBooleanServices) {
				BooleanServiceDiagramPanel diagram = new BooleanServiceDiagramPanel(s.name());
				diagramPanel.add(diagram);
				serviceAdapters.add(new ServiceAdapter<>(s, referenceBooleanService, diagram));
			}
			/*for (Service<Predicates, Double> s : selectedFuzzyServices) {
				FuzzyServiceDiagramPanel diagram = new FuzzyServiceDiagramPanel(s.name(), BINS);
				diagramPanel.add(diagram);
				serviceAdapters.add(new ServiceAdapter<>(s, referenceFuzzyService, diagram));
			}

			/* Start simulation if possible */
			simulationThread = new SimulationThread(serviceAdapters);
			simulationThread.start();
		}
	}

	private boolean stopSimulation() {
		if (simulationThread != null) {
			simulationThread.interrupt();
			try {
				simulationThread.join();
				simulationThread = null;
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		return simulationThread == null;
	}
}
