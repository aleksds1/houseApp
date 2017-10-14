package main.java.com.house.service;

import main.java.com.house.model.*;
import java.util.*;
import java.io.*;
public class Service {

    //Класс для CRUDS-операций со всеми домами
    public ArrayList<House> houses = new ArrayList<House>();

    public Service(){
        houses=createTestHomes();
    }

    public void addHouse(House house){

        houses.add(house);

    }

    public void updateHouse(int idHouse, House house){

        for(int i=0;i<houses.size();i++){
            House temp = houses.get(i);
            if (temp.getId()==idHouse){
                houses.set(i,house);
            }
        }

    }

    public void removeHouse(int idHouse){

        for(int i=0;i<houses.size();i++){
            House temp = houses.get(i);
            if (temp.getId()==idHouse){
                houses.remove(i);
            }
        }

    }

    public String searchHouse(int idHouse){
        String address = "Ничего не было найдено";

        for(int i=0;i<houses.size();i++) {
            House temp = houses.get(i);
            if (temp.getId() == idHouse) {
                address = temp.getAddress();
            }
        }

        return address;
    }

    //Тестовые дома
    public ArrayList<House> createTestHomes(){

        String adsress[] = new String[] {"ул Ленина д 1","ул Ленина д 2"}; //Два дома
        double entranceSquare[] = new double[] {2,2,3,3}; //По два подъезда в каждом = 4 подъезда
        double floorSquare[] = new double[] {3,3,3,4,4,4}; //По 3 этажа в каждом = 12 этажных площадок
        //По две квартиры на этаж = 24 квартиры
        double roomSquare[] = new double[] {10,3,10,3,10,3,10,3,10,3,10,3,10,3,10,3,10,3,10,3,10,3,10,3,11,3,11,3,11,3,11,3,11,3,11,3,11,3,11,3,11,3,11,3,11,3,11,3}; //Одна комната в каждой квартире + коридор = 48

        Room room1 = new Room(1,10, Room.Type.LIVINGROOM);
        Room room2 = new Room(2,3, Room.Type.HALL);
        ArrayList<Room> temp1 = new ArrayList<Room>();
        temp1.add(room1);
        temp1.add(room2);
        Flat flat1 = new Flat(1,1,temp1);

        Room room3 = new Room(3,10, Room.Type.LIVINGROOM);
        Room room4 = new Room(4,3, Room.Type.HALL);
        ArrayList<Room> temp2 = new ArrayList<Room>();
        temp2.add(room3);
        temp2.add(room4);
        Flat flat2 = new Flat(2,2,temp2);

        Room room5 = new Room(5,10, Room.Type.LIVINGROOM);
        Room room6 = new Room(6,3, Room.Type.HALL);
        ArrayList<Room> temp3 = new ArrayList<Room>();
        temp3.add(room5);
        temp3.add(room6);
        Flat flat3 = new Flat(3,3,temp3);

        Room room7 = new Room(7,10, Room.Type.LIVINGROOM);
        Room room8 = new Room(8,3, Room.Type.HALL);
        ArrayList<Room> temp4 = new ArrayList<Room>();
        temp4.add(room7);
        temp4.add(room8);
        Flat flat4 = new Flat(4,4,temp4);

        Room room9 = new Room(9,10, Room.Type.LIVINGROOM);
        Room room10 = new Room(10,3, Room.Type.HALL);
        ArrayList<Room> temp5 = new ArrayList<Room>();
        temp5.add(room9);
        temp5.add(room10);
        Flat flat5 = new Flat(5,5,temp5);

        Room room11 = new Room(11,10, Room.Type.LIVINGROOM);
        Room room12 = new Room(12,3, Room.Type.HALL);
        ArrayList<Room> temp6 = new ArrayList<Room>();
        temp6.add(room11);
        temp6.add(room12);
        Flat flat6 = new Flat(6,6,temp6);

        ArrayList<Flat> flattemp1 = new ArrayList<Flat>();
        flattemp1.add(flat1);
        flattemp1.add(flat2);
        Floor floor1 = new Floor(1,3,flattemp1);

        ArrayList<Flat> flattemp2 = new ArrayList<Flat>();
        flattemp2.add(flat3);
        flattemp2.add(flat4);
        Floor floor2 = new Floor(2,3,flattemp2);

        ArrayList<Flat> flattemp3 = new ArrayList<Flat>();
        flattemp3.add(flat5);
        flattemp3.add(flat6);
        Floor floor3 = new Floor(3,3,flattemp3);

        ArrayList<Floor> floortemp1 = new ArrayList<Floor>();
        floortemp1.add(floor1);
        floortemp1.add(floor2);
        floortemp1.add(floor3);
        Entrance entrance1 = new Entrance(1,5,floortemp1);

        ArrayList<Entrance> enttemp1 = new ArrayList<Entrance>();
        enttemp1.add(entrance1);
        House house1 = new House(1,7,"ул Ленина д 1",enttemp1);

        Room room13 = new Room(13,11, Room.Type.LIVINGROOM);
        Room room14 = new Room(14,3, Room.Type.HALL);
        ArrayList<Room> temp7 = new ArrayList<Room>();
        temp7.add(room13);
        temp7.add(room14);
        Flat flat7 = new Flat(7,7,temp7);

        Room room15 = new Room(15,11, Room.Type.LIVINGROOM);
        Room room16 = new Room(16,3, Room.Type.HALL);
        ArrayList<Room> temp8 = new ArrayList<Room>();
        temp8.add(room15);
        temp8.add(room16);
        Flat flat8 = new Flat(8,8,temp8);

        Room room17 = new Room(17,11, Room.Type.LIVINGROOM);
        Room room18 = new Room(18,3, Room.Type.HALL);
        ArrayList<Room> temp9 = new ArrayList<Room>();
        temp9.add(room17);
        temp9.add(room18);
        Flat flat9 = new Flat(9,9,temp9);

        Room room19 = new Room(19,11, Room.Type.LIVINGROOM);
        Room room20 = new Room(20,3, Room.Type.HALL);
        ArrayList<Room> temp10 = new ArrayList<Room>();
        temp10.add(room19);
        temp10.add(room20);
        Flat flat10 = new Flat(10,10,temp10);

        Room room21 = new Room(21,11, Room.Type.LIVINGROOM);
        Room room22 = new Room(22,3, Room.Type.HALL);
        ArrayList<Room> temp11 = new ArrayList<Room>();
        temp11.add(room21);
        temp11.add(room22);
        Flat flat11 = new Flat(11,11,temp11);

        Room room23 = new Room(23,11, Room.Type.LIVINGROOM);
        Room room24 = new Room(24,3, Room.Type.HALL);
        ArrayList<Room> temp12 = new ArrayList<Room>();
        temp12.add(room23);
        temp12.add(room24);
        Flat flat12 = new Flat(12,12,temp12);

        ArrayList<Flat> flattemp4 = new ArrayList<Flat>();
        flattemp4.add(flat7);
        flattemp4.add(flat8);
        Floor floor4 = new Floor(4,4,flattemp4);

        ArrayList<Flat> flattemp5 = new ArrayList<Flat>();
        flattemp5.add(flat9);
        flattemp5.add(flat10);
        Floor floor5 = new Floor(5,4,flattemp5);

        ArrayList<Flat> flattemp6 = new ArrayList<Flat>();
        flattemp6.add(flat11);
        flattemp6.add(flat12);
        Floor floor6 = new Floor(6,4,flattemp6);

        ArrayList<Floor> floortemp2 = new ArrayList<Floor>();
        floortemp2.add(floor4);
        floortemp2.add(floor5);
        floortemp2.add(floor6);
        Entrance entrance2 = new Entrance(2,6,floortemp2);

        ArrayList<Entrance> enttemp2 = new ArrayList<Entrance>();
        enttemp2.add(entrance1);
        House house2 = new House(2,8,"ул Ленина д 2",enttemp2);

        ArrayList<House> housestemp = new ArrayList<House>();
        housestemp.add(house1);
        housestemp.add(house2);
        return housestemp;

    }

}
