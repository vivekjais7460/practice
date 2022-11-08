package exception;

public class Eligibility {
	public static void eligible(Integer exp) {
		if(exp<10) {
			throw new ArithmeticException("This person is not eleigible");}
		else {
			System.out.println("This is eligible person");
		}
			
		}
	  public static void main(String[] args) {
		eligible(11);
	}
	}


