package day1_Test;

public class CallByValue {
	int a = 50;

	void change(CallByValue c) {
		c.a = c.a + 100;
		
	}

	public static void main(String args[]) {
		CallByValue c = new CallByValue();

		System.out.println("CallByValue before change " + c.a);
		c.change(c);
		System.out.println("CallByValue after change " + c.a);

	}

}
