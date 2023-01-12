package java8Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find2_UnQ_Ele {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(2,2,3,1,1,4,5,5);
		
	//	myList.stream().distinct().collect(Collectors.toList()).forEach(x->System.out.println(x));;
		
		Integer i1 = myList
		.stream()
		.distinct().
		sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		System.out.println(i1);
	}
}
