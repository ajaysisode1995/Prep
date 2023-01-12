package java8Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MissingElementIn_A {
	public static void main(String[] args) {
		int[] arr= {8,1,2,3,4,5,7};
		
		int n=7;
		Arrays.sort(arr);
		int actualsum=(n*(n+1)/2);
		
		int sum = Arrays.stream(arr).sum();
		
		int missingElement=actualsum-sum;
		System.out.println(missingElement);
		
		System.out.println("MAx element found:");
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max);
	}
}
