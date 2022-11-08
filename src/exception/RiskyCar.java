package exception;

import java.io.IOException;

class Car1{
	void breakDown() throws IOException{
		throw new IOException("this is broken down");
	}
}
public class RiskyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  Car1 c1=new Car1();
        	  c1.breakDown();
        	  }
          catch(Exception e) {
        	  System.out.println("Exception handle" +e);
          }
          System.out.println("Hello");
	}

}
