package com.binary.day10;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;

public class Group <G> {

    private ArrayList<G> groupMembers;

    public Group(){
       groupMembers = new ArrayList<>();
    }

    public void add(G element){
        groupMembers.add(element);
    }

    public  void print(){
        for(G element :groupMembers){
            System.out.println(element);
        }
    }
}
