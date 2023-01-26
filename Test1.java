package day1_Test;

import java.util.Optional;

public class Test1 {
	public static void main(String[] args) {
		     
        String s = "JAVA OPTIONAL CLASS EXAMPLE";  
        System.out.println("Of Method: "+Optional.of(s));
        System.out.println("Nullable Optional: "+Optional.ofNullable(null));  
	}
}