package historydata;

public class BooleanServiceDiagramPanel extends ServiceDiagramPanel<Boolean> {

	private static final long serialVersionUID = -6178718005026318976L;

	private static final String[] CATEGORY_NAMES = new String[] { "false", "true" };

	public BooleanServiceDiagramPanel(String serviceName) {
		super(serviceName, CATEGORY_NAMES);
	}

	@Override
	public int category(Boolean value) {
		return value ? 1 : 0;
	}
}
