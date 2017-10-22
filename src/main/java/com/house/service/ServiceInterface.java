package main.java.com.house.service;

import main.java.com.house.service.model.*;

import java.util.List;

public interface ServiceInterface {


    void addHouse(House house);
    void updateHouse(int idHouse, House house);
    void removeHouse(int idHouse);
    String searchHouse(int idHouse);
    int returnSize();
    List<House> returnHouses();

}
