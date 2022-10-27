//NAME : MUKESH S
//BATCH : CG2576
package anudip.org;
import java.util.Iterator;
import java.util.PriorityQueue;

public class collectionquee {
	public static void main(String[] args) {
		
		PriorityQueue<String> q=new PriorityQueue<>();
		q.add("work");
		q.add("mm");
		q.add("tyu");
		q.add("fghj");
		q.add("ddff");
		System.out.println(q.peek());
		Iterator<String> i=q.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		q.remove();
		q.poll();
	}

}