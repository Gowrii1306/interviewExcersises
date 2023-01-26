package day1_Test;

public class StringBufferClass {
public static void main(String[] args) {
//	StringBuffer s = new StringBuffer(" Hello");
//	s.append(" java");
//	System.out.println(s);
//	s.insert(1,"Insert ");
//	System.out.println(s);
//	s.replace(0,0,"Replace");
//	System.out.println(s);
//	s.reverse();
//	System.out.println(s);
	
	StringBuilder sb = new StringBuilder("Hey");
	sb.append("Hai");
	System.out.println(sb);
	sb.replace(1, 1, "Replace");
	System.out.println(sb);
	
			
}
}
