package packageJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<String, Object> mp=new TreeMap<String,Object>();
		mp.put("name", "deepak");
		mp.put("age", 30);//duplicate keys not allow but no error
		mp.put("age", 45);
		mp.put("age1", 30);//duplicate value allow
		mp.put("salary", 500000);
		mp.put("company", "google");
		mp.put(null, null);
		mp.put(null, null);
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(15);l1.add(12);l1.add(10);l1.add(12);l1.add(11);l1.add(20);//if u want to add array or other whole object in map 
		mp.put("arr", l1);// then use this step
	
		System.out.println(mp);
		System.out.println(mp.get("salary"));
		
		Set<String> s=mp.keySet();//used to return all keyys
		System.out.println(s);
		
		Collection<Object> o=mp.values();//used to return all value
		System.out.println(o);
		System.out.println(mp.size());
		
		System.out.println(mp.getOrDefault("name", "girls"));//if name present in map then return it otherwise return default value girls
    	System.out.println(mp.getOrDefault("boys", "girls"));//if boys present in map then return it otherwise return default value girls
    	System.out.println(mp.containsKey("name"));//if name available then print true otherwise false
    	
    	for(String s1:mp.keySet())//another method to iterate
    		//System.out.println(s1);//if u want to print the keys only
    	    System.out.println(s1+" "+mp.get(s1));//if u want to print key along with value
	
	}
}
