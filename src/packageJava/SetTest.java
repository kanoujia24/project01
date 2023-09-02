package packageJava;


	import java.util.ArrayList;
	import java.util.ArrayList;
     import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
	import java.util.Set;
    import java.util.TreeSet;

	public class SetTest {
		public static void main(String[] args) {
			Set<Integer> hs=new HashSet<Integer>();
			System.out.println(hs.add(50));//BY THESE TWO SYSNTAX WE CAN CHECK DUPLICATE ELEMENT NOT ADDING IN SET BECAUSE IF ELEMENT
			System.out.println(hs.add(50));// ADD THEN IT WII RETURN TRUEIF NOT ADD THEN RETURN FALSE
			System.out.println(hs);
			hs.add(12);hs.add(15);hs.add(10);hs.add(14);hs.add(12);hs.add(10);hs.add(11);
			System.out.println(hs);
			
			Iterator<Integer> itr=hs.iterator();
			while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			}
			
			ArrayList<Integer> l1=new ArrayList<Integer>();
			l1.add(15);l1.add(12);l1.add(10);l1.add(12);l1.add(11);l1.add(20);
			System.out.println(l1);
			Set<Integer> hs1=new HashSet<Integer>(l1);//FOR REMOVING DUPLICATE ELEMENT CONVERT LIST INTO SET DUPLICATE ELEMENT AUTOMATICALLY REMOVE
			System.out.println(hs1);
			
			Set<Integer> hs2=new LinkedHashSet<Integer>();
			hs2.add(12);hs2.add(15);hs2.add(10);hs2.add(14);hs2.add(12);hs2.add(10);hs2.add(11);
			System.out.println(hs2);
			
			Set<Integer> ts=new TreeSet<Integer>();
			ts.add(12);ts.add(15);ts.add(10);ts.add(14);ts.add(12);ts.add(10);ts.add(11);
			System.out.println(ts);
			
			Set<String> ts1=new TreeSet<String>();
			ts1.add("deepak");ts1.add("kamal");ts1.add("trishu");ts1.add("jeetu");ts1.add("amar");ts1.add("gyan");ts1.add("deepika");
			System.out.println(ts1);
			
			Iterator<String> itr1=ts1.iterator();
			while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
			}
			System.out.println();
			
	}
		}


