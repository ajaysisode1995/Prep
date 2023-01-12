package java8String;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepeate {
	public static void main(String[] args) {
		String input= "ava Hungry Blog Alive is Awesome";
		
		
	Character ch = input
			.chars()
			.mapToObj(s->
			Character.toLowerCase(Character.valueOf((char) s)))
	        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	        .entrySet()
			.stream()
			.filter(entry->entry.getValue()==1L)
			.map(entry->entry.getKey())
			.findFirst()
			.get();
	
	System.out.println(ch);
	}
}
