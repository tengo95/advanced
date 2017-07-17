package IO_threads.Exercise1;

/**
 * Created by tanerali on 17/07/2017.
 */

class Souter extends Thread {
    long millisecondSleep;

    Souter (String name, long millisecondSleep) {
        super(name);
        this.millisecondSleep = millisecondSleep;
        start();
    }

    public void run () {
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(millisecondSleep);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
