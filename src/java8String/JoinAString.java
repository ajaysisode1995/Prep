package java8String;

public class JoinAString {
	public static void main(String[] args) {
		String s1[]= {"hhh","xxx","yyy"};
		String newSingleString = String.join("", s1);
		System.out.println(newSingleString);
	}
}
