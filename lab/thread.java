//NAME : MUKESH S
//BATCH : CG2576
package anudip.org;
class tread1 extends Thread{
	public void run() {
		System.out.println("sucess");
	}
}

public class threaddem {
	public static void main(String[] args) {
		tread1 t=new tread1();
		
		t.start();
		t.setName("vijay");
		System.out.println(t.getName());
	}

}
