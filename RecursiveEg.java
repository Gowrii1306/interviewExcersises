package day1_Test;

public class RecursiveEg {
	static void p() {
		System.out.println("hello");
		p();
	}

	public static void main(String[] args) {
		p();
	}
}
