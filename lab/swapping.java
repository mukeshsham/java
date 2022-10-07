//NAME: MUKESH S
//BATCH: 2576
//swap the integer,double
class Swapping
{
	void swap(int x,int y)//swap two integer number
	{
       int t;
	   t=x;
	   x=y;
	   y=t;
	   System.out.println("The Swapping of two number is:");
	    System.out.print(x+"   " +y);
		System.out.println();
	}
	void swap(double x,double y)//swap two  double number
	{
       double t;
	   t=x;
	   x=y;
	   y=t;
	   System.out.println("The Swapping of two double is:");
	   System.out.print(x+"  "+y);
	}
public static void main(String[] args)
{
    Swapping s=new Swapping();
	s.swap(20,30);//calling two integer number
	s.swap(67.5,38.5);//calling two double number
}
}