package com.house.model;

import java.util.*;
public class Flat extends BaseEntity {

    //Задаём квартиру с её номером и списком комнат
    private int number;
    public ArrayList<Room> rooms = new ArrayList<Room>();
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public Flat(int id,int number, ArrayList<Room> rooms){
        super(id);
        this.number=number;
        this.rooms=rooms;
    }

}
