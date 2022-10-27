//NAME : MUKESH S
//BATCH : CG2576
package anudip.org;
import java.util.ArrayList;
import java.util.Iterator;

class details {
	int rolno;
	String name;
	public details(int rolno, String name) {
		super();
		this.rolno = rolno;
		this.name = name;
	}
	
}

public class student {
	public static void main(String[] args) {
		details d1=new details(41, "mukesh");
		details d2 =new details(40, "monish");
		ArrayList<details>a=new ArrayList<>();
		a.add(d1);
		a.add(d2);
		Iterator<details> i=a.iterator();
		while (i.hasNext()) {
			details dt=(details)i.next();
			System.out.println(dt.name+" "+dt.rolno);
		}
	}

}
