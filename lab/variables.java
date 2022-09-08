//Name: Mukesh.S
//Batch: 2576
//Types of variables
class VariableType
{
     int a=10;          //instance variable
     static int b=20;          //static variable
     public int m1()
     {
          int c = 30;          //local variable
          System.out.println("c = "+c);
          return 0;
     }
     public static void main(String args[])
     {
          VariableType v = new VariableType ();
          System.out.println("a = "+v.a+"  b = "+b);
          v.m1();          //invoke the m1 method
     }
}