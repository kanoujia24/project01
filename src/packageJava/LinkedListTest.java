package packageJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("deepak");
		list.add("kamal");
		list.add("jeetu");
		list.add("gyan");
		list.add("trishu");
		System.out.print(list+" ");
		
		System.out.println();
		
		Iterator itr=list.iterator();
//		for(String s:list)
//			System.out.print(s+" ");
//		
//		System.out.println();
//		
//		for(String ss:list)
//			System.out.print(ss+" ");
//		
//		System.out.println();
//		
//		System.out.print(list.get(2));
//		
//		System.out.println();
//		
//		list.set(1, "amit");
//		for(String s1:list )
//			System.out.print(s1+" ");
	}

}
