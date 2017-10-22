package main.java.com.house.controller;

import main.java.com.house.service.model.*;
import main.java.com.house.service.ServiceInterface;
import main.java.com.house.service.Service;

import java.util.*;
import java.io.*;

public class Controller implements ControllerInterface {

    public ServiceInterface service = new Service();

    //Задаём метод для сумирования площадей внутри дома и метод выдачи отчёта
    public void makeReport(){



    }

    public void addHouse(House house)
    {
        service.addHouse(house);
    }

    public void removeHouse(int index)
    {
        service.removeHouse(index);
    }

    public List<House> returnHouses()
    {
        return service.returnHouses();
    }

    public int returnSize()
    {
        return service.returnSize();
    }

    public double sumS(List<Integer> index,List<House> houses){
        double sum =0;

        for (int i=0;i<index.size();i++){
            for (int j=0;j<houses.size();j++){
                if (houses.get(j).getId()==index.get(i)){
                    sum+=sumH(houses.get(i));
                }
            }
        }

        return sum;
    }

    public double sumH(House house){
        double sum = 0;

        sum+=house.getSquare();
        for (Entrance ent: house.entrances){
            sum+=ent.getSquare();
            for(Floor flo:ent.floors){
                sum+=flo.getSquare();
                for(Flat fla:flo.flats){
                    for(Room roo:fla.rooms){
                        sum+=roo.getSquare();
                    }
                }
            }
        }

        return sum;
    }


}
