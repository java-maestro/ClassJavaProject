package com.binary.day3;

public class Phone {

    private String color;
    private String brand;
    private double price;
    private String model;


    // default constructor
      public Phone(){

      }
    // parametrized constructor
    public Phone(String color, String brand, double price, String model) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    // parametrized constructor
    public Phone( String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

   public  void setColor(String color){
       this.color = color;
   }

   public String getColor(){
       return color;
   }

   public void setBrand(String brand){
       this.brand = brand;
   }

   public String getBrand(){
       return brand;
   }
   public void setPrice(double price){
       this.price = price;
   }

   public double getPrice(){
       return price;
   }
   public void setModel(String model){
       this.model = model;
   }
   public String getModel(){
       return model;
   }




}
