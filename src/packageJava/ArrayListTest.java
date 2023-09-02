package packageJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(15);l1.add(12);l1.add(10);l1.add(12);l1.add(11);l1.add(20);
		System.out.println(l1);
		System.out.println(l1.contains(12));
		l1.size();
		System.out.println();
		System.out.println(l1.size());
		Iterator itr=l1.iterator();//itrating arraylist using iterator
		while(itr.hasNext()) {
			System.out.print(" "+itr.next()+" ");
		}
		
		System.out.println();//iterating using foreach method
		for(Integer num:l1) {
			System.out.print(" "+num+" ");
		}
		
		System.out.println("the return element"+" "+l1.get(2));//get method return the value at specified index
		
		l1.set(5, 50);//set method change the value at specified index
		for(Integer elem:l1) {
			System.out.print(" "+elem+" ");
		}
		
			System.out.println();
			l1.remove(2);
			System.out.println(l1);
			
			ArrayList<Integer> l2=new ArrayList<Integer>();
			l1.add(15);l1.add(12);l1.add(10);l1.add(12);l1.add(11);l1.add(20);
			
			l1.addAll(l2);
			System.out.println(l1);
			System.out.println(l2.size());
			
			l1.remove(5);
			System.out.println(l1);
			
			l1.removeAll(l2);
			System.out.println(l2);
			
		
		
	}
}
