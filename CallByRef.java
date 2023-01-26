package day1_Test;

public class CallByRef {
	static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a =10;
		int b = 100;
		System.out.println(add(a,b));
	}
}
