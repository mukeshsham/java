//NAME :MUKESH S
//BATCH: 2576
//write a program to print student details
class Student//class name
{
	int sid;//data members
	String sname;
	int marks;
	void input(int x,String y,int z)//input method
	{
		sid=x;//assign the values
		sname=y;
		marks=z;
	}
    void output()//output method
	{
         System.out.println(sid+"  " +sname+"  "+marks);//print the details
	}
public static void main(String[] args)//main method
{
   Student s=new Student();//object creation
   s.input(3,"mukesh",100);//give the input
   s.output();
}
}
