package historydata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import historydata.Predicates;

public class ServiceSelectionPanel<R> extends JPanel {

	private static final long serialVersionUID = -8020513821504810732L;

	private List<Service<Predicates, R>> services;
	private List<JCheckBox> checkBoxes = new ArrayList<>();

	public ServiceSelectionPanel(List<Service<Predicates, R>> services) {
		this.services = services;
		buildGUI(services);
	}

	private void buildGUI(List<Service<Predicates, R>> services) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (Service<Predicates, R> s : services) {
			JCheckBox ckb = new JCheckBox(s.name());
			checkBoxes.add(ckb);
			add(ckb);
		}
	}

	public List<Service<Predicates, R>> selectedServices() {
		ArrayList<Service<Predicates, R>> selectedServices = new ArrayList<>();
		Iterator<Service<Predicates, R>> itServices = services.iterator();
		Iterator<JCheckBox> itCheckBoxes = checkBoxes.iterator();
		while (itServices.hasNext() && itCheckBoxes.hasNext()) {
			Service<Predicates, R> s = itServices.next();
			JCheckBox cb = itCheckBoxes.next();
			if (cb.isSelected())
				selectedServices.add(s);
		}
		return selectedServices;
	}
}
