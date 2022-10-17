//NAME:MUKESH.S
//BATCH:2576
//nested try demo
class Nestedtrydemo
{
	public static void main(String[] args)
	{
		try
		{
			try
			{
				String s=null;//null pointer exception
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();//print message
			}
			try
			{
				int[] x={24,48,76};//array index out of bounds exception
				System.out.println(x[4]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.toString());
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		System.out.println("REST OF CODE");
	}
}