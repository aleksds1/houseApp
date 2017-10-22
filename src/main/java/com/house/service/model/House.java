package main.java.com.house.service.model;

import java.util.*;
public class House extends BaseHall {

    //Задаём дом с его подъездами и адресом
    public List<Entrance> entrances = new ArrayList<Entrance>();
    private String address;
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public House(int id, double square, String address,  List<Entrance> ent){
        super(id,square);
        this.address=address;
        this.entrances=ent;
    }

}
