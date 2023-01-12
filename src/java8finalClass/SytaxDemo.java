package java8finalClass;

import java.util.ArrayList;
import java.util.List;

public class SytaxDemo {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(23);
		l1.add(34);
		l1.forEach(x->{System.out.print(x);
		});
		
	}
}
