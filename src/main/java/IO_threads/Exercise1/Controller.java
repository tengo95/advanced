package IO_threads.Exercise1;

/**
 * Created by tanerali on 17/07/2017.
 */

class Controller {
    public static void main(String[] args) {

        Printer ob1 = new Printer("Child1",400);
        Printer ob2 = new Printer("Child2",400);
        Printer ob3 = new Printer("Child3",400);
        Printer ob4 = new Printer("Child4",400);
        Printer ob5 = new Printer("Child5",400);

        Souter anotherOb1 = new Souter("Kid1",500);
        Souter anotherOb2 = new Souter("Kid2",500);
        Souter anotherOb3 = new Souter("Kid3",500);
        Souter anotherOb4 = new Souter("Kid4",500);
        Souter anotherOb5 = new Souter("Kid5",500);


    }
}

