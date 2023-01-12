package Java8_shortCut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodeDecodeList {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(16);
		l1.add(12);
		l1.add(10);
		l1.add(20);
		
		//l1.stream().filter(x->x>12).collect(Collectors.toList()).forEach(x->System.out.println(x));
		
		List<Integer> list = findElement(l1);
		for(Integer x:list) {
			System.out.println(x);
		}
	}
		private static List<Integer> findElement(List<Integer> l) {
		List<Integer> list = new ArrayList<>();
		
		for(Integer x:l) {
			if (x>12) {
				list.add(x);
			}
		}
		return list;
	}
}
