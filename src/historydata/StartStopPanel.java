package historydata;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartStopPanel extends JPanel {

	private static final long serialVersionUID = -6885133350683192072L;

	private static final String START_TEXT = "Start";
	private static final String RESTART_TEXT = "Restart";
	private static final String STOP_TEXT = "Stop";

	private JButton btnStart, btnStop;

	public StartStopPanel() {
		buildGUI();
	}

	private void buildGUI() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		btnStart = new JButton(START_TEXT);
		add(btnStart);
		btnStop = new JButton(STOP_TEXT);
		add(btnStop);
		updateGUI(false);
	}

	public void updateGUI(boolean inProgress) {
		if (inProgress) {
			btnStart.setText(RESTART_TEXT);
			btnStop.setEnabled(true);
		} else {
			btnStart.setText(START_TEXT);
			btnStop.setEnabled(false);
		}
	}

	public JButton btnStart() {
		return btnStart;
	}

	public JButton btnStop() {
		return btnStop;
	}
}
