package packageJava;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;

	public class ArrayList1 {
		public static void main(String[] args) {
			LinkedList<String> list=new LinkedList<String>();
			list.add("deepak");list.add("trishu");list.add("kamal");list.add("jeetu");list.add("deepak");list.add("kamal");
			System.out.println(list);
			
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("deepak1");list1.add("trishu1");list1.add("kamal1");list1.add("jeetu1");list1.add("deepak");
			System.out.println(list1);
			
			Iterator<String> it=list1.iterator() ;// print the list by using iterator 
			while(it.hasNext())
			System.out.print(it.next()+" ");
			System.out.println();
			
			for(String i:list1)// by using for each loop
				System.out.print(i+" ");
			System.out.println();
			
			for(int i=0;i<list1.size();i++)//by using for loop
				System.out.print(list1.get(i)+" ");
			System.out.println();
			
			
			list.addAll(list1);
			System.out.println(list);
			
			
		    list.remove("kamal");
		    System.out.println(list);
		    
		    list1.removeAll(list1);
		    System.out.println(list1);
		    
		    ArrayList<Integer> list2=new ArrayList<Integer>();
			list2.add(10);list2.add(15);list2.add(21);list2.add(10);list2.add(12);
			System.out.println(list2);
			
			for(int i:list2)//here we can write Integer  or int
			System.out.print(i+" ");
			list2.remove(0);
			System.out.println(list2);
			
			HashSet<Integer> hs=new HashSet<Integer>();
		    hs.add(10);hs.add(12);hs.add(15);hs.add(10);hs.add(20);hs.add(21);hs.add(10);
		    System.out.println(hs);
		    
		    //IF U WNAT TO WRITE DIFFERENT TYPE OF DATA TYPE ELEMENT IN LIST THEN CREATE 
		    LinkedList<Object> ob=new LinkedList<Object>();
		    ob.add("deepak");ob.add(25);ob.add("kamal");ob.add("21");
		    System.out.println(ob);
		    
	}
		}

