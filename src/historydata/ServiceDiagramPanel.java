package historydata;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public abstract class ServiceDiagramPanel<R> extends JPanel {

	private static final long serialVersionUID = 4680384209955615613L;

	private static final String FREQUENCY_TEXT = "Frequency";
	private static final String SINGLETON_ROW_KEY = "singleton-row-key";

	private String[] categoryNames;
	private int[] frequency;
	private int[] falsePositives;
	private int[] falseNegatives;

	private JFreeChart barChart;
	private DefaultCategoryDataset categoryDataset;
	private JLabel lblQuality;

	public ServiceDiagramPanel(String serviceName, String[] categoryNames) {
		this.categoryNames = categoryNames;
		int n = categoryNames.length;
		this.frequency = new int[n];
		this.falsePositives = new int[n];
		this.falseNegatives = new int[n];
		this.categoryDataset = new DefaultCategoryDataset();
		buildGUI(serviceName);
		updateGUI();
	}

	private void buildGUI(String serviceName) {
		setBackground(Color.WHITE);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		barChart = ChartFactory.createBarChart(serviceName, null, FREQUENCY_TEXT, categoryDataset,
				PlotOrientation.VERTICAL, false, true, false);
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		add(chartPanel);
		lblQuality = new JLabel();
		lblQuality.setAlignmentX(CENTER_ALIGNMENT);
		add(lblQuality);
	}

	private void updateGUI() {

		/* Update frequency */
		for (int i = 0; i < frequency.length; i++)
			categoryDataset.setValue(frequency[i], SINGLETON_ROW_KEY, categoryNames[i]);

		/* Update upper bound */
		int ub = findFrequencyUpperBound();
		barChart.getCategoryPlot().getRangeAxis().setRange(0, ub);

		/* Update quality */
		double roundedPercentage = Math.round(1000.0 * agreement()) / 10.0;
		lblQuality.setText(roundedPercentage + "% agreement with reference service");
	}

	private double agreement() {
		int falseCases = 0;
		int allCases = 0;
		for (int i = 0; i < falsePositives.length; i++) {
			falseCases += falsePositives[i];
			allCases += frequency[i];
		}
		int trueCases = allCases - falseCases;
		return 1.0 * trueCases / allCases;
	}

	private int findFrequencyUpperBound() {

		/* Find maximum frequency */
		int maxFrequency = 0;
		for (int i = 0; i < frequency.length; i++)
			maxFrequency = Math.max(maxFrequency, frequency[i]);

		/* Correct to next power of 2 */
		int exp = (int) Math.ceil(Math.log(maxFrequency) / Math.log(2));
		int upperBound = (int) Math.pow(2, exp);

		/* Ensure upper bound is at least 2 */
		if (upperBound < 2)
			upperBound = 2;

		return upperBound;
	}

	public void post(R serviceResult, R correctResult) {

		/* Derive categories */
		int serviceCategory = category(serviceResult);
		int correctCategory = category(correctResult);

		/* Record service behavior */
		frequency[serviceCategory]++;

		/* Evaluate service quality */
		if (serviceCategory != correctCategory) {
			falsePositives[serviceCategory]++;
			falseNegatives[correctCategory]++;
		}

		updateGUI();
	}

	public abstract int category(R value);
}
