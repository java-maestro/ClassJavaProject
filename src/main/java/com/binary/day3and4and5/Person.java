package com.binary.day3and4and5;

public class Person {
    private String name;
    private int id;
    private String address;


    public  void setName(String name){
        this.name = new String(name);
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }



}
