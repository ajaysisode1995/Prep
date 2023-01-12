package multithreadingPro;

public class ConstructorRef {
	interface Interf{
		public Sample getString(int i);
	}
	public static void main(String[] args) {
		Interf i=s->new Sample(5);
		System.out.println(i.getString(3));
	}
}
