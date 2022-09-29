//NAME :MUKESH S
//BATCH: 2576
//write a program print Bankcustomer details using package
package anudip;//package creation
public class Bankcustomer//class name "Bankcustomers"
{
	int accno;//data members
	String cname;
	double amt;
	public void get(int a,String b,double c)//method
	{
		accno=a;
		cname=b;
		amt=c;
	}
	public void show()//method
	{
		System.out.println(accno+"   " +cname+"   "+amt);
	}	
}
	

