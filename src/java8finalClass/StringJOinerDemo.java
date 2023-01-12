package java8finalClass;

import java.util.StringJoiner;

public class StringJOinerDemo {
	public static void main(String[] args) {
		StringJoiner sj1=new StringJoiner(",","[","]");
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);
		
		StringJoiner sj2=new StringJoiner(":");
		sj2.add("P").add("Q");
		System.out.println(sj2);
		
		StringJoiner merge = sj1.merge(sj2);
		System.out.println(merge);
	}
}
