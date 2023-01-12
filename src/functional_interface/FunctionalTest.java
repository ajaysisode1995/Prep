package functional_interface;

public class FunctionalTest {
	public void m2() {
//		int x=777;
//		Interf it=(y)->{
//			int y1=888;
//			System.out.println();
					};
	
	public static void main(String[] args) {
		Interf i1=(i)->i*i;
		int m1 = i1.m1(2);
		System.out.println(m1);
	}

	
}
