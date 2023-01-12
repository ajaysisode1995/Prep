package Java8_shortCut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatDemo {
	public static void main(String[] args) {
		List<Number> list = Arrays.asList(2.3,4.5,3.0,2,6.4);
		
		list.stream().flatMap(num->Stream.of(num)).forEach(System.out::println);
		
		List<String> list2 = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");
		
		list2.stream().flatMap(str->Stream.of(str.charAt(2))).forEach(System.out::println);
	}
}
