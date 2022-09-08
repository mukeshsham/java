//Name: Mukesh.S
//Batch: 2576
// assignmentoperator, multiple assigment
class  Assignment 
{
	public static void main(String[] args) 
	{
        int x;
        x=5;
        x+=3; //x=x+3
        x-=2;//x=x-2
        System.out.println("x value is "+x);
	}
}
// Arithemetic operator +,-,*,%
class Arthimetic
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		a=10;
		b=3;
		c=a+b;
		d=a-b;
		System.out.print(c+"  "+d);
    }
}
//unary operator ++,--
class  Unary
{
	public static void main(String[] args) 
	{
		int a,b,c;
		a=5;
		b=++a;
		System.out.println(a+" "+b);
	}
}
// ternary operator ?,:
class Ternary 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		x=10;
		y=50;
		z=(x>y) ? x : y;
		System.out.println("z value is "+ z);
	}
}

//Bitwise operator &,|
class Bitwise 
{
    public static void main(String[] args) 
	{
		int a,b;
		a=20;
		b=4;
        System.out.println(a&b);
    }
}

// logical operators &&,||
class Logical 
{
    public static void main(String[] args) 
	{
		int a,b;
		a=10;
		b=5;
		boolean flag;
		flag=(a>5) && (b>5);
        System.out.println("flag value "+flag);
	}
}

// relational operators<,>
class Relational
{
    public static void main(String[] args) 
	{
		int a,b;
		a=10;
		b=5;
		boolean b1,b2;
		b1=(a>b);
		b2=(a<b);
        System.out.println(b1+" "+b2);
	}
}

