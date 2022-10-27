//NAME : MUKESH S
//BATCH : CG2576
public class Synchronization implements Runnable
{
    int tickets = 3;
    static int x = 3, y = 2, z = 1;
    public void bookticket (String name, int wantedtickets)
    {
        if (wantedtickets <= tickets)
        {
            System.out.println (wantedtickets + " booked to " + name);
            tickets = tickets - wantedtickets;
        }
        else
        {
            System.out.println ("No tickets book");
        }
    }
    public void run ()
    {
        String name = Thread.currentThread ().getName ();
        if (name.equals ("t1"))
        {
            bookticket (name, x);
        }
        else if (name.equals ("t2"))
        {
            bookticket (name, y);
        }
        else
        {
            bookticket (name, z);
        }
    }
    public static void main (String[]args)
    {
        Synchronization s = new Synchronization ();
        Thread t1 = new Thread (s);
        Thread t2 = new Thread (s);
        Thread t3 = new Thread (s);
        t1.setName ("t1");
        t2.setName ("t2");
        t3.setName ("t3");
        t1.start ();
        t2.start ();
        t3.start ();
    }
}
