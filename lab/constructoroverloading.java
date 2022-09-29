//NAME :MUKESH S
//BATCH: 2576
//write a program using constructor overloading
class Bankcustomer
{
	int accno;
	String atype;
	double amt;
	Bankcustomer()
	{
		accno=3567890;
		atype="depositor";
		amt=60000;
	}
    Bankcustomer(int x,String y,double z)//constructor
	{
	   accno=x;
	   atype=y;
       amt=z;
	}
    void show()//print the details
	{
         System.out.println(accno+"   "+atype+"    "+amt);
    }
public static void main(String[] args)
{
   Bankcustomer s=new Bankcustomer();//no object
   Bankcustomer s1=new Bankcustomer(3567678,"checkbalance",50000);
   Bankcustomer s2=new Bankcustomer(3567456,"Withdraw",40000);
   s.show();
   s1.show();
   s2.show();
}
}