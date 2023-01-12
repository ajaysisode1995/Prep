package java8String;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Join_A_String_Sente {
	public static void main(String[] args) {
		String[] ar1= {"I","am","new","joiner","In","backend"};
		
		String str1 = ar1.toString();
		
		//char[] charArray = str1.toCharArray();
		
		String join = String.join("", ar1);
		System.out.println(join);
		
		List<String> myList = Arrays.asList(ar1);
		
		System.out.println(myList);
		
		StringJoiner strJoiner = new StringJoiner("");
		strJoiner.add(join);
		System.out.println(strJoiner);
		
		String ArrayString[] = { "Good", "Morning", "Everyone" };

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ArrayString.length; i++) {
            sb.append(ArrayString[i]+" ");
        }
        String str = sb.toString();
        System.out.println(str);
    }
	}

	

