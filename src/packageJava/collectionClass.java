package packageJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class collectionClass {

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<Integer>();
		list.add(10);list.add(20);list.add(15);list.add(11);list.add(5);list.add(23);list.add(41);list.add(0);list.add(1);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		
		Collections.synchronizedList(list);//collectionClass  is used for synchronization of the objects
		Collections.swap(list, 0, 4);
		System.out.println(list);
		                                   //COMPARATOR INTERFACE
		
		List<Student2> ll=new LinkedList<Student2>();//here this code is used for comparator interface
		Student2 s1=new Student2(12,400,"trishika");
		Student2 s2=new Student2(11,600,"deepak");
		Student2 s3=new Student2(15,300,"kamal");
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		System.out.println(ll);
		Collections.sort(ll, new Student2(0, 0, null));
		System.out.println(ll);
	}

}
