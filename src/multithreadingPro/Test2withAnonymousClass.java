package multithreadingPro;

public class Test2withAnonymousClass {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<5;i++) {
					System.out.println("child thread");
				}
			}
		});
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread");
		}
	}
}
