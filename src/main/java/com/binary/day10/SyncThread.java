package com.binary.day10;

public class SyncThread extends  Thread{

    SynchronizationExample synchronizationExample;

    public SyncThread(SynchronizationExample synchronizationExample) {
        this.synchronizationExample = synchronizationExample;
    }

    @Override
    public void run() {
        boolean stop = false;
       while (!stop){
           if(synchronizationExample.count >= 100){
               stop = true;
               this.stop();
           }else{

               synchronizationExample.increase();
           }

       }
    }
}
