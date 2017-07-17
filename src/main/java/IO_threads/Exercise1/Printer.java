package IO_threads.Exercise1;

/**
 * Created by tanerali on 17/07/2017.
 */
class Printer implements Runnable{
    Thread thrd;
    long millisecondSleep;

    Printer (String name, long millisecondSleep) {
        thrd = new Thread(this, name);
        this.millisecondSleep = millisecondSleep;
        thrd.start();
    }

    public void run () {
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(millisecondSleep);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
