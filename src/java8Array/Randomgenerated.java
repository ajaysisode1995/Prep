package java8Array;

import java.util.Random;
public class Randomgenerated {
	public static void main(String[] args) {
		
		Random r=new Random();
		r.ints().limit(5).sorted().forEach(x->System.out.println(x));
	}
}
