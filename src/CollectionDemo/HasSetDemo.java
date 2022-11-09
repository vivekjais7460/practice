package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("vivek");
		hs.add("vishal");
		System.out.println(hs);
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
