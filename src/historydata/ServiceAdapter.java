package historydata;

import javax.swing.SwingUtilities;

import historydata.Predicates;

public class ServiceAdapter<R> {

	private final Service<Predicates, R> service;
	private final Service<Predicates, R> referenceService;
	private final ServiceDiagramPanel<R> diagram;

	public ServiceAdapter(Service<Predicates, R> service, Service<Predicates, R> referenceService,
			ServiceDiagramPanel<R> diagram) {

		this.service = service;
		this.referenceService = referenceService;
		this.diagram = diagram;
	}

	public void post(HistoryData currentDataInput) {
		R result = service.function().apply(currentDataInput);
		R referenceResult = referenceService.function().apply(currentDataInput);
		System.out.println(service.name() + " = " + result);
		SwingUtilities.invokeLater(() -> diagram.post(result, referenceResult));
	}
}
