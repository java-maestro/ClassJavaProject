package com.binary.day10;

public class SynchronizationExample {
    int count = 0;


    public synchronized void increase (){
        count++;
        System.out.println("Increase count: " + count + " By "+ Thread.currentThread().getName());
    }
}
