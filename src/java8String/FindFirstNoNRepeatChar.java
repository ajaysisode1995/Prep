package java8String;

public class FindFirstNoNRepeatChar {
	public static void main(String[] args) {
		String inputStr ="ajay Sisode";

        for(char i :inputStr.toCharArray()){
        	
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
    }
 }
 }
