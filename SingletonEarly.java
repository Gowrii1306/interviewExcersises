package day1_Test;

public class SingletonEarly {
	private static final SingletonEarly instance = new SingletonEarly();
	public String s;

	private SingletonEarly() {
		s = "Early Initialization output";
	}

	public static SingletonEarly getInstance() {
		return instance;
	}

	public static void main(String args[]) {
		SingletonEarly text = SingletonEarly.getInstance();
		SingletonEarly te = SingletonEarly.getInstance();

		System.out.println(text.s);
		System.out.println(te.s);

	}

}
