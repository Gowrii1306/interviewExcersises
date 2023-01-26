package day1_Test;

public class SingletonLazyInitialization {
	private static SingletonLazyInitialization ini;
	public String s;

	private SingletonLazyInitialization() {
		s = "I am learning Java";
	}

	public static SingletonLazyInitialization getIni() {
		if (ini == null) {
			ini = new SingletonLazyInitialization();
		}
		return ini;
	}

	public static void main(String args[]) {
		SingletonLazyInitialization text = SingletonLazyInitialization.getIni();
		SingletonLazyInitialization te = SingletonLazyInitialization.getIni();

		System.out.println(text.s);
		System.out.println(te.s);

	}
}