package java8finalClass;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ReverseOrder {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
myList.stream()
.sorted(Collections.reverseOrder()).forEach(x->System.out.println(x));

	}
}
