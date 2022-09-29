//NAME :MUKESH S
//BATCH: 2576
//write a program using constructor,named method,anonymous,static method
abstract class Program//abstract class
{
	abstract void sub();//abstract method
}	
class Anonymous//class creation
{
	int x,y;
	static String s="Student";//static variable
	Anonymous()//constructor 
	{
        System.out.println("This is constructor method");
	}
	void add()//instance method
	{
		int x=5;
		int y=6;
		System.out.println("The sum of two number is:"+(x+y));
	}
	static void change()//static method
	{
		s="Student";//change the static value
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Program p=new Program()//Anonymous method
		{
	       void sub()//abstract method implementation
	       {
		      int x=3;
		      int y=9;
		      System.out.println("The subtraction  of two number is:"+(x-y));
		   } 
		};
		p.sub();//call the abstract method
		Anonymous n=new Anonymous();//object creation
		n.add();//call the instance method
		Anonymous.change();//call static method using class name
	}
}