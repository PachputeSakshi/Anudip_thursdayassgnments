package thursday_assignments;


class Threads extends Thread 
{
    public Threads(String name)
    {
        super(name);
    }

    @Override
    public void run() 
    {
        for (int i=1;i<=5;i++) 
        {
            System.out.println(Thread.currentThread().getName() +": " + i);
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}