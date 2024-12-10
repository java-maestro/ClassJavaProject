package com.binary.day10;

public class MyThread extends Thread {

    Store store;
    public MyThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        boolean stop = true;
        while(stop){
            this.store.takeProducts();
            this.store.stackProducts();
            if(store.products <0){
                stop = false;
                this.stop();
            }
        }

    }
}
