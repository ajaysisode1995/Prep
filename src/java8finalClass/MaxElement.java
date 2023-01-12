package java8finalClass;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//		 Integer integer = myList.stream().max(Integer::compareTo).get();
//		 System.out.println(integer);
		 
		 Integer integer = myList.stream().max((x,y)->x.compareTo(y)).get();
		 System.out.println(integer);
	}
}
