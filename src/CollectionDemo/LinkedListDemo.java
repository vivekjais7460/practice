package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits= new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("grapes");
		fruits.add("pear");
		Iterator<String> itr= fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
