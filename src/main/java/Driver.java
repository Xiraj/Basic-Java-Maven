import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count Result:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Increment Result:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Decrement Result:" + counter.getCount());
		
	}

}
