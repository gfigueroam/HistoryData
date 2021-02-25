package historydata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomHistoryGenerator {

	private final Random rand = new Random();

	/**
	 * Change Predicates
	 * @return
	 */
	public HistoryData next() {
		return new HistoryData();
	}

	public List<HistoryData> next(int n) {
		List<HistoryData> nextN = new ArrayList<>();
		for (int i = 0; i < n; i++)
			nextN.add(next());
		return nextN;
	}
}
