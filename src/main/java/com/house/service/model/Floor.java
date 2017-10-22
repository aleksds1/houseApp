package main.java.com.house.service.model;

import java.util.*;
public class Floor extends BaseHall {

    //Задаём этаж с его квартирами
    public List<Flat> flats  = new ArrayList<Flat>();
    public Floor(int id,double square, List<Flat> flats){
        super(id,square);
        this.flats=flats;
    }

}
