package historydata;

import java.util.function.Function;

public class Service<T, R> {

	private String name;
	private Function<T, R> function;

	public Service(String name, Function<T, R> function) {
		this.name = name;
		this.function = function;
	}

	public String name() {
		return name;
	}

	public Function<T, R> function() {
		return function;
	}
}
