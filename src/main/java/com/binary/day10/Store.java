package com.binary.day10;

import java.time.LocalDateTime;

public class Store {

     int products = 100000;
     int stacked = 0;

    long startTime = 0;
  public Store(){
      startTime = System.currentTimeMillis();
  }
    public void takeProducts() {
      if(products <=0){
          long end = System.currentTimeMillis();
          System.out.println("********************time******************** "+ (end - startTime));
      }
        products--;
        // System.out.println("produts "+products);
    }

    public void stackProducts() {
        stacked++;
        //System.out.println("stacked "+stacked);
    }
}
