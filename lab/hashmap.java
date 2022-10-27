//NAME : MUKESH S
//BATCH : CG2576
package anudip.org;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		HashMap<Integer, String>m=new HashMap<>();
		m.put(1, "abc");
		m.put(2, "fgh");
		m.put(3, "xyz");
		m.replace(1, "rty");
		m.remove(3);
		System.out.println(m.entrySet());
		
	
          LinkedHashMap<Integer, String>m1=new LinkedHashMap<Integer, String>();
          m1.put(8, "add");
  		m1.put(1, "fxd");
  		m1.put(4, "ddf");
  		
  		System.out.println(m1.entrySet());
  		
  		TreeMap<Integer, String> m2=new TreeMap<>();
  		m2.put(8, "add");
  		m2.put(1, "fxd");
  		m2.put(4, "ddf");
  		System.out.println(m2.entrySet());
  		
}}
