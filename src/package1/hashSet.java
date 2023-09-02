package package1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class hashSet implements Comparable<hashSet> {//comparable interface implement for overriding the camapreto() mathed
	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(45);ll.add(12);ll.add(20);ll.add(14);ll.add(12);ll.add(11);
		System.out.println(ll);//it print ordered list and  print duplicate element
		Set<Integer> hs=new HashSet<Integer>();
		System.out.println(hs.add(12));//if add then return true 
		System.out.println(hs.add(12));//if does not add then return false it shows that duplcate element can't add in sets
		hs.add(45);hs.add(12);hs.add(20);hs.add(14);hs.add(12);hs.add(11);
		System.out.println(hs);//it print unordered list and not print duplicate element
		Set<Integer> hs2=new HashSet<Integer>(ll);
		System.out.println(hs2);
//		Set<Integer> hs1=new HashSet<Integer>();//mathed use to nmbr of duplicate element present in array 
//		int[] arr= {45,12,47,23,45,12,47,01,26,23,01};
//		int count=0;
//		for(int i:arr) {
//			if(!hs1.add(i))
//				count++;
//			}
//		System.out.println(count);
		

		Set<Integer> hs1=new HashSet<Integer>();//mathed use to print duplicate element present in array 
		int[] arr= {45,12,47,23,45,12,47,01,26,23,01};
		int count=0;
		for(int i:arr) {
			if(!hs1.add(i)) {
				System.out.println(i);	
			count++;
			}
			}
		System.out.println(count);
		
		//TO CHECK TWO NULL ARE NOT SAME 
		hashSet c1=new hashSet();//by creating object
		hashSet c2=new hashSet();
		Set<hashSet> sh=new HashSet<hashSet>();
		sh.add(c1);
		sh.add(c2);
		System.out.println(sh);
		System.out.println(c1==c2);
		
		Set<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(45);lhs.add(12);lhs.add(20);lhs.add(14);lhs.add(12);lhs.add(11);
		System.out.println(lhs);
		
		Set<Integer> ts=new TreeSet<Integer>();
		ts.add(45);ts.add(12);ts.add(20);ts.add(14);ts.add(12);ts.add(11);
		System.out.println(ts);
		
	}

@Override
public int compareTo(hashSet o) {//THIS MATHED OVERRIDE TO CHECK WHICH OBBJECT IS SMALL WHICH ONE BIG MAINLY FOR STRING
	// TODO Auto-generated method stub
	return 0;
}

	
	}


