package FirstPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		
		//ArrayList
		
		/*ArrayList <String> obj = new ArrayList<String> ();
		
		obj.add("Soujanya");
		obj.add("Sravanthi");
		obj.add("Tazeen");
		obj.add("Farhana");
		obj.add("Sridevi");
		obj.add("Rajani");
		
		System.out.println(obj);
		System.out.println(obj.get(3));
		System.out.println(obj.get(5));
		//System.out.println(obj.get(6));
		obj.add("Automation");
		System.out.println(obj.get(6));
		obj.add(0, "Testing");
		System.out.println(obj);
		obj.add(4, "Training");
		System.out.println(obj);
		obj.remove("Sridevi");
		System.out.println(obj.contains("Sridevi"));
		System.out.println(obj.remove(2));
		System.out.println(obj);
		//obj.add(1);
		System.out.println(obj);
		System.out.println(obj.add("Tazeen"));
		System.out.println(obj);
		
		*/
		
		//HashSet
		
		/*HashSet obj = new HashSet();
		obj.add("Soujanya");
		obj.add("Sravanthi");
		obj.add("Tazeen");
		obj.add("Farhana");
		obj.add("Sridevi");
		obj.add("Rajani");
		obj.add(100);
		
		//System.out.println(obj);
		//obj.remove("Tazeen");
		//System.out.println(obj);
		//obj.removeAll(obj);
		//obj.add("Rajani");
		//System.out.println(obj);
		
		Iterator i = obj.iterator();
		//System.out.println(i);
		/*System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		*/
		
		//HashMap
		HashMap obj = new HashMap();
		obj.put(0,"Soujanya");
		obj.put(1,"Sravanthi");
		obj.put(2,"Tazeen");
		obj.put(3,"Farhana");
		obj.put(5,"Sridevi");
		obj.put(10,"Rajani");
		
		System.out.println(obj);
		System.out.println(obj.get(5));
		System.out.println(obj.get(4));
		
		Set sm = obj.entrySet();
		System.out.println(sm);
		Iterator i = sm.iterator();
		/*System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next()); */
		
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
