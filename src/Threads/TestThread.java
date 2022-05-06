package Threads;

/*
    Java is a multi-threaded programming language which means we can develop multi-threaded program using Java.
    A multithreaded program contains two or more parts that can run concurrently
    and each part can handle a different task at the same time making
    optimal use of the available resources specially when your computer has multiple CPUs.

    By definition, multitasking is when multiple processes share common processing resources such as a CPU.
    Multi-threading extends the idea of multitasking into applications
    where you can subdivide specific operations within a single application into individual threads.
    Each of the threads can run in parallel. The OS divides processing time not only among different applications,
    but also among each thread within an application.

    Multi-threading enables you to write in a way where multiple activities can proceed concurrently in the same program.

    Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.

    Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10).
    By default, every thread is given priority NORM_PRIORITY (a constant of 5).

    Threads with higher priority are more important to a program
    and should be allocated processor time before lower-priority threads.
    However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent.

    Create a Thread by Implementing a Runnable Interface
        If your class is intended to be executed as a thread then you can achieve this by implementing a `Runnable` interface.
        You will need to follow three basic steps −

        Step 1

        As a first step, you need to implement a run() method provided by a Runnable interface.
        This method provides an entry point for the thread and you will put your complete business logic inside this method.
        Following is a simple syntax of the run() method −

                public void run( )

        Step 2

        As a second step, you will instantiate a Thread object using the following constructor −

                Thread(Runnable threadObj, String threadName);


        Where, `threadObj` is an instance of a class that implements the Runnable interface
            and `threadName` is the name given to the new thread.

        Step 3

        Once a Thread object is created, you can start it by calling start() method,
        which executes a call to run( ) method. Following is a simple syntax of start() method −

                void start();
*/
class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    //Constructor
    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    // All magic happens inside start().
    // The start() method will cause the JVM to spawn a new `thread` and make the newly spawned thread execute run().
    // The start() method internally calls the run() method of Runnable interface to execute the code specified in the run() method in a separate thread.
    public void startThread () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);          // this is the instance of the thread class created in TestThread.
            t.start ();                 // If you directly call run() method its body is executed in context of current thread
        }
    }
}

public class TestThread {
    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.startThread();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.startThread();
    }
}
