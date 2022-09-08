//Name: Mukesh.S
//Batch: 2576
//program to get student details
import java.util.Scanner;
public class student {
public static void main(String[]args)
{
String name;
int id,attendence;
Scanner input=new Scanner(System.in);
System.out.println("Enter the student name:");
name=input.nextLine();
System.out.println("Enter the student id:");
id=input.nextInt();
System.out.println("Enter the student attendence:");
attendence=input.nextInt();
System.out.println("the name of the student:"+name );
System.out.println("the id of the student:"+id);
System.out.println("the attendence of the student:"+attendence );
}
}