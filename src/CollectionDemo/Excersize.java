package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Excersize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emp= new ArrayList<>();
		emp.add("Vivek");
		emp.add("Vishal");
		emp.add("Deepak");
		emp.add("qwer");
		System.out.println(emp);
		emp.remove(2);
		System.out.println(emp);
		emp.removeAll(emp);
		System.out.println(emp);
		Queue<String> emp1= new PriorityQueue<>();
		emp1.add("Vivek");
		emp1.add("Vishal");
		emp1.add("Deepak");
		emp1.add("qwer");
		emp1.add("Vivek");
		System.out.println(emp1);
		emp1.remove();
		System.out.println(emp1);
		emp1.removeAll(emp1);
		System.out.println(emp1);
		HashSet<String> emp2= new HashSet<>();
		emp2.add("Vivek");
		emp2.add("Vishal");
		emp2.add("Deepak");
		emp2.add("qwer");
		emp2.add("Vivek");
		System.out.println(emp2);
		emp2.remove("Vishal");
		System.out.println(emp2);
		emp2.removeAll(emp2);
		System.out.println(emp2);
		LinkedList<String> emp3=new LinkedList<String>();
		emp3.add("Vivek");
		emp3.add("Vishal");
		emp3.add("Deepak");
		emp3.add("qwer");
		emp3.add("Vivek");
		System.out.println(emp3);
		emp3.remove("Vishal");
		System.out.println(emp3);
		emp3.removeAll(emp3);
		System.out.println(emp3);
		
		
		
		

	}

}
