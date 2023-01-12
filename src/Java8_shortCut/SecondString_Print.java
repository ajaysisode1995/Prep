package Java8_shortCut;

import java.util.List;
import java.util.stream.Stream;

public class SecondString_Print {
	public static void main(String[] args) {
		String[] ar= {"AJay","Sisode","Sagar","Kuldeep"}; 
		
		System.out.println(ar[1]);
		Stream<String> list = Stream.of(ar);
	
		
		
		
	}
}
