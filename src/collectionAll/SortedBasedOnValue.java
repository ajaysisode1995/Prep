package collectionAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortedBasedOnValue {
	public static void main(String[] args) {
		Map<Integer, String> l1=new HashMap<>();
		l1.put(121, "XX");
		l1.put(101, "ABC");
		l1.put(111, "ABCD");
		l1.put(131, "XXX");
		
		System.out.println("Original value of map");
		l1.forEach((x,v)->System.out.println(x+" "+v));
		
		Set<Entry<Integer,String>> entrySet = l1.entrySet();
		List<Entry<Integer,String>> l=new ArrayList<>(entrySet);
		
		Collections.sort(l, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println("sorted value of map");
		l.forEach(x->{
			System.out.println(x.getValue()+" "+x.getKey());
		});
		
	}
}
