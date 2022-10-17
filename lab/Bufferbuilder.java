//NAME:MUKESH.S
//BATCH:2576
//STRING BUILDER AND STRING BUFFER CLASSES AND METHODS 
class StringBufferBuilder
{
	public static void main(String[] args)
	{
		//string buffer class using new keyword
		StringBuffer sb=new StringBuffer("mukesh");
		StringBuffer sb1=new StringBuffer("arun");
		
	    StringBuilder sb2=new StringBuilder("yak");
		StringBuilder sb3=new StringBuilder("paul");
		
		System.out.println("THE BELOW METHODS ARE STRING BUFFER CLASS METHODS");
		//in string buffer equals method checkig referrence
        System.out.println("Equals method:"   +sb.equals(sb1));
		//using append method adding atlast in the string
		System.out.println("append method:"  +sb.append("naveen"));
		//insert method using inserting new string to old one
		System.out.println("inserting string:"  +sb2.insert(0,"monu"));
		//delete the characters
		System.out.println("Delete the character:"   +sb1.delete(3,1));
		//reverse the string
		System.out.println("reverse string:"  +sb3.reverse());
	}
}