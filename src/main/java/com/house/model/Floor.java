package com.house.model;

import java.util.*;
public class Floor extends BaseHall {

    //Задаём этаж с его квартирами
    public ArrayList<Flat> flats  = new ArrayList<Flat>();
    public Floor(int id,double square, ArrayList<Flat> flats){
        super(id,square);
        this.flats=flats;
    }

}
