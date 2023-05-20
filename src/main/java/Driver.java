import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count Result:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Increment Result:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Decrement Result:" + counter.getCount());

		counter.divide(2);

		System.out.println("Divide Result :" + counter.getCount());	
		
		counter.divide(4);

		System.out.println("Divide Result :" + counter.getCount());
		
	}

}
