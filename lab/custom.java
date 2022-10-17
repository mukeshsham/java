//NAME:MUKESH.S
//BATCH:2576
//our own custom exception
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);//calling parent class constructor
	}
}
class Custom
{
  static void check(int age)throws InvalidAgeException
  {
	  if(age<18)
	    throw new InvalidAgeException("in valid");//throw invalid age exception
	  else
		  System.out.println(" valid");//valid message
  }
public static void main(String[] args)throws InvalidAgeException
{
  Custom1 c=new Custom();
  check(30);//call check method
}
}