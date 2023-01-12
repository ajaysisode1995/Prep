package java8finalClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindFirstEle {
	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         myList
         .stream()
         .findFirst()
         .ifPresent(System.out::println);
         
         String str="dipak";
         
        String collect = str.chars()
        		.filter(x->(char)x!='p')
        		.mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        		
         System.out.println(collect);
         
         
//         String replace = str.replace("p", "");
//         System.out.println(replace.length());
         
         
	}
}
