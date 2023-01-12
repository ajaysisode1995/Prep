package multithreadingPro;

public class Test3WithoutAnoCls {
	public static void main(String[] args) {
		Thread t=new Thread(()->{
			for(int i=1;i<=6;i++) {
				System.out.println("child thread call");
			}
		});
		t.start();
		for(int i=1;i<=6;i++) {
			System.out.println("main thread call");
		}
	}
}
