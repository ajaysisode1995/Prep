package multithreadingPro;

public class Test {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=5;i++) {
				System.out.println("Runnable  Thread");
			}};
			
			Thread t=new Thread(r);
			t.start();
			
			for(int i=0;i<5;i++) {
				System.out.println("main method Thread");
			}
		}
}
