package Java8_shortCut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortStringUsingSecondChar {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Ajay");
		l1.add("Sagar");
		l1.add("Dipak");
		l1.add("kunal");
		
//l1.stream().sorted().skip(1).limit(1).forEach(x->System.out.println(x));
		
		System.out.println("\n");
		 List<Character> collect2 = l1.stream().map(x->x.charAt(0)).sorted().collect(Collectors.toList());
		 collect2.forEach(x->System.out.println(x));
		System.out.println("\n");
		List<String> collect = l1.stream().map(x->x.substring(1)).sorted().collect(Collectors.toList());
		collect.forEach(x->System.out.println(x));
		System.out.println("\n");
//		l1.stream().map(x->{
//			if (x.charAt(1)) {
//				
//			}
//			return x;
//		});
		
		System.out.println("\n");
		List<String> collect3 = l1.stream().map(x->x.substring(0,1)).sorted().collect(Collectors.toList());
		collect3.forEach(x->System.out.println(x));
	}
}

