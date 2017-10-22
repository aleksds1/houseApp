package main.java.com.house.controller;

import main.java.com.house.service.model.House;

import java.util.List;

public interface ControllerInterface {

    double sumS(List<Integer> index, List<House> houses);
    double sumH(House house);
    void addHouse(House house);
    void removeHouse(int index);
    List<House> returnHouses();
    int returnSize();

}
