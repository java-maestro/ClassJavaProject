package com.binary.day10;

import java.time.LocalDateTime;

public class ThreadsIntro {
    public static void main(String[] args) throws InterruptedException {

//        Threads
//		-> separate execution flow that divide the stack allowing for concurrent processing in a
//		  java application.
//		-> this allows faster processing in cases where the processes need not happen linearly.
//		 -> generally order of multiple threads is not possible.

        //		Threads life cycle states =>
//		New :  This the state of a new thread object that has not started executing yet.
//		Runnable : (running) the thread has started.
//		Blocked : A thread is waiting on a synchronized resource being used by another thread.
//		Waiting : A thread is paused for an unspecified amount of time.
//		Timed_waiting : The thread is paused for an specified amount of time.
//		Terminated: the thread execution has finished.

        //		Thread Methods :
//		.run() =>  the run method is the actual processes that will be run by the thread.
//		.start() => actually tells the JVM to create a exeution flow in the stack and then runs the run method in that flow.
//		.join() => puts a thread into wating for another thread to complete, when this mearges threads
//		.isAlive() => gives the state of the thread
//		Thread.currentThread() => gives the thread name that is currently running.
//		Thread.sleep(ms) => thread is waiting for an specified amount of time.

        //		 Creating a Threads -> there are two ways
//		 1. Extending the Thread class and overriding the run() method can create a Thread object.
//		 2. Implementing the Runnable interface will also allow you to create a Thread.
//		    => single abstract method => run()


        Store store1 = new Store();
        long startTime = System.currentTimeMillis();
        MyThread thread1 = new MyThread(store1);
        MyThread thread2 = new MyThread(store1);
        MyThread thread3 = new MyThread(store1);
        //thread1.start();
        //thread2.start();
       // thread3.start();

        ExeThread t1 = new ExeThread();
        t1.start();
        System.out.println(t1.isAlive());
//        Thread.sleep(3000);
        System.out.println(" after wait");

        t1.stop();
        System.out.println(t1.isAlive());

        SynchronizationExample example = new SynchronizationExample();

        SyncThread syncThread1 = new SyncThread(example);
        SyncThread syncThread2 = new SyncThread(example);
        SyncThread syncThread3 = new SyncThread(example);

        syncThread1.start();
        syncThread2.start();
        syncThread3.start();


    }
}
