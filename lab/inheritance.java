//NAME: MUKESH S
//BATCH: 2576
class person{
    void pid()
    {
        System.out.println("007");
    }
    void pname()
    {
        System.out.println("Mukesh");
    }
}
class student extends person{
    void marks(){
      System.out.println("98");   
    }
}
class Emp extends person{
    void salary(){
         System.out.println("45000");
    }
}
public class main{
    public static void main(String[]args){
        Emp e=new Emp();
        e.pid();
        e.pname();
        e.salary();
    }
}
