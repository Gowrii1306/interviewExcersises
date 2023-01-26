package day1_Test;

public class AccessModifiersEg {
	 int data = 40;

	public void msg() {
		System.out.println("Hello java");
	}
	
	public static void main(String[] args) {
		AccessModifiersEg s = new AccessModifiersEg();
		System.out.println(s.data);
		s.msg();
	}
}
