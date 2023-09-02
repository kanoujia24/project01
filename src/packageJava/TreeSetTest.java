package packageJava;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(12);ts.add(13);ts.add(10);ts.add(20);ts.add(9);ts.add(0);ts.add(12);
		System.out.println(ts);
		
		Iterator itr=ts.iterator();//use for iterat the set
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		
		System.out.println();//use for print new line
		
		Iterator it=ts.descendingIterator();//use for iterat the set in descending order
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();//use for print new line
		
		System.out.println("lowest value of the set"+ts.first());//method used for only print  lowest value of the set 
		System.out.println("highest value of the set"+ts.last());//method used for only print  highest value of the set 
		
		System.out.println("size os the set"+ts.size());
		System.out.println();
		
		System.out.println("lowest value of the set"+ts.pollFirst());//method used for print and remove lowest value of the set 
		System.out.print("highest value of the set"+ts.pollLast());//method used for print and remove  highest value of the set
		
		System.out.println();
		
		System.out.println("lowest value of the set"+ts.first());//these two line are verifiying above two method of removal of element
		System.out.println("highest value of the set"+ts.last());
		
		System.out.println("after using remove method the tree set is"+" "+ts);
		
		System.out.println("size os the set"+ts.size());//used tp print the size of the set
		
//		ts.clear();//used to clear all the element of the set
//		System.out.println(ts);
		
		ts.remove(12);
		System.out.println("after using remove 12 the tree set is"+" "+ts);
		
		
		System.out.println(ts.isEmpty());
		
		String s="deepakkumar";//program for print last three character and convert them into uppercase letter
		s=s.substring(8,11);
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
		                              // COPARABLE INTERFACE
		
		Students s1=new Students("deepak",15,500);//Comparable interface implements in Students class
		Students s2=new Students("trishu",20,600);// every clarification given in Students class
		Students s3=new Students("trishika",30,700);
		TreeSet<Students> tsh=new TreeSet<Students>();
		tsh.add(s1);
		tsh.add(s2);
		System.out.println("Students attributes are"+" "+tsh);
		
	}

}
