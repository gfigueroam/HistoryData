package historydata;

public class FuzzyServiceDiagramPanel extends ServiceDiagramPanel<Double> {

	private static final long serialVersionUID = -5659977011710016889L;

	private final int bins;

	public FuzzyServiceDiagramPanel(String serviceName, int bins) {
		super(serviceName, categoryNames(bins));
		this.bins = bins;
	}

	private static String[] categoryNames(int bins) {
		String[] categoryNames = new String[bins];
		for (int i = 0; i < bins; i++) {
			double lbl = (i + 0.5) / bins;
			categoryNames[i] = "" + lbl;
		}
		return categoryNames;
	}

	@Override
	public int category(Double value) {
		if (value < 0)
			return 0;
		if (value >= 1)
			return bins - 1;
		return (int) (value.doubleValue() * bins);
	}
}
