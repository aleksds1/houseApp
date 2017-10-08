package com.house.model;

import java.util.*;
public class Entrance extends BaseHall {

    //Задаём подъезд с его этажами и наличием лифта
    public ArrayList<Floor> floors = new ArrayList<Floor>();
    private boolean isElevator;
    public boolean getElevator(){
        return isElevator;
    }
    public void setElevator(boolean elevator){
        this.isElevator=elevator;
    }
    public Entrance(int id,double square,ArrayList<Floor> floors){
        super(id,square);
        this.floors=floors;
    }

}
