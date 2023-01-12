package multithreadingPro;

public class TestWithMethosRef {
	public static void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) {
		Runnable r=TestWithMethosRef::m1;
		Thread t1=new Thread(r);
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}
	}
}
