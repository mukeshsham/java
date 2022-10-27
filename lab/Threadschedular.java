//NAME : MUKESH S
//BATCH : CG2576
package anudip.org;
class sleepjoin extends Thread{
	 public void run() {
		for (int i = 0; i <4; i++) {
		try {
		Thread.sleep(400);	
		} catch (Exception e) {
			
		}
		System.out.println(i);
		}
	}
}

public class sleep {
	public static void main(String[] args) {
		sleepjoin s1=new sleepjoin();
		sleepjoin s2=new sleepjoin();
		s1.start();
		try {
			s1.join();
		} catch (Exception e) {
			
		}
		s2.start();
	}

}
