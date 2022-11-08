package exception;

public class TestExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int b=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.exit(0);
			System.out.println("Ok");
		}
	
		
		System.out.println("Hello");

	}

}
