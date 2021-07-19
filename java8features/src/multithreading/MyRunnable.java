package multithreading;

public class MyRunnable {

    public static void main(String[] args) {

        Runnable r=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("child Thread...");
            }

        };
        Thread t=new Thread(r);
        t.start();

        for (int i=0;i<10;i++)
        {
            System.out.println("Main Thread...");
        }
    }


}
