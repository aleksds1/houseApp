package main.java.com.house.view;

import main.java.com.house.model.*;
import main.java.com.house.service.Service;
import main.java.com.house.controller.Controller;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class View {

    //Класс для отрисовки меню
    //Service service = new Service();
    Controller controller = new Controller();


    public void loadMainMenu(){

        System.out.println("\nВведите желаемую команду\n1 - просмотреть информацию о домах\n2 - добавить дом\n3 - изменить дом\n4 - удалить дом\n5 - выход из программы");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        switch(index){

            case 1:
                loadReport();
                loadMainMenu();
            case 2:
                loadAddMenu();
                loadMainMenu();
            case 3:
                loadUpdateMenu();
                loadMainMenu();
            case 4:
                loadDeleteMenu();;
                loadMainMenu();
            case 5:
                System.exit(0);
            default:
                System.out.println("\nНе выбрана команда");
                loadMainMenu();

        }

    }

    public void loadAddMenu(){

        System.out.println("\nВведите индекс дома, последний используемый - "+(controller.service.houses.size()-1));
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        System.out.println("\nВведите адрес дома");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String address = null;
        try {
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nВведите площадь дома");
        double sqHouse = in.nextDouble();
        System.out.println("\nВведите количество подъездов");
        int numEntrance = in.nextInt();
        System.out.println("\nВведите количество этажей");
        int numFloor = in.nextInt();

        ArrayList<Entrance> entrances = new ArrayList<Entrance>();
        for (int i=0;i<numEntrance;i++){

            System.out.println("\nВведите индекс подъезда");
            int indEntrance = in.nextInt();
            System.out.println("\nВведите площадь подъезда");
            double sqEntrance = in.nextDouble();

            ArrayList<Floor> floors = new ArrayList<Floor>();
            for(int j=0;j<numFloor;j++){

                System.out.println("\nВведите количество квартир на этаже");
                int numFlat = in.nextInt();

                System.out.println("\nВведите индекс этажа");
                int indFloor = in.nextInt();
                System.out.println("\nВведите площадь этажа");
                double sqFloor = in.nextDouble();
                ArrayList<Flat> flats = new ArrayList<Flat>();
                for (int k=0;k<numFlat;k++){

                    System.out.println("\nВведите индекс квартиры");
                    int indFlat = in.nextInt();
                    System.out.println("\nВведите номер квартиры");
                    int number = in.nextInt();
                    System.out.println("\nВведите количество комнат (с коридорами) в квартире");
                    int numRoom = in.nextInt();
                    ArrayList<Room> rooms = new ArrayList<Room>();
                    for (int l=0;l<numRoom;l++){

                        System.out.println("\nВведите индекс комнаты");
                        int ind = in.nextInt();
                        System.out.println("\nВведите площадь комнаты");
                        double sqRoom = in.nextDouble();
                        System.out.println("\nВыберите тип комнаты:\n1 - жилая\n2 - нежилая");
                        int ind2 = in.nextInt();
                        Room.Type type;
                        if(ind2==1){
                            type =Room.Type.LIVINGROOM;
                        }
                        else{
                            type=Room.Type.HALL;
                        }
                        Room tempRoom = new Room(ind,sqRoom,type);
                        rooms.add(tempRoom);

                    }
                    Flat tempFlat = new Flat(indFlat,number,rooms);
                    flats.add(tempFlat);

                }
                Floor tempFloor = new Floor(indFloor,sqFloor,flats);
                floors.add(tempFloor);

            }
            Entrance tempEnt = new Entrance(indEntrance,sqEntrance,floors);
            entrances.add(tempEnt);

        }
        House house = new House(index,sqHouse,address,entrances);
        controller.service.houses.add(house);
        loadMainMenu();

    }

    public void loadDeleteMenu(){

        System.out.println("\nВведите индекс удаляемого дома");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        controller.service.removeHouse(index);
        loadMainMenu();

    }

    public void loadUpdateMenu(){

        System.out.println("\nВведите индекс дома, в котором проводятся изменения. В ходе изменения необходимо пересоздать весь дом");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        controller.service.removeHouse(index);
        System.out.println("\nВведите адрес дома");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String address = null;
        try {
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nВведите площадь дома");
        double sqHouse = in.nextDouble();
        System.out.println("\nВведите количество подъездов");
        int numEntrance = in.nextInt();
        System.out.println("\nВведите количество этажей");
        int numFloor = in.nextInt();

        ArrayList<Entrance> entrances = new ArrayList<Entrance>();
        for (int i=0;i<numEntrance;i++){

            System.out.println("\nВведите индекс подъезда");
            int indEntrance = in.nextInt();
            System.out.println("\nВведите площадь подъезда");
            double sqEntrance = in.nextDouble();

            ArrayList<Floor> floors = new ArrayList<Floor>();
            for(int j=0;j<numFloor;j++){

                System.out.println("\nВведите количество квартир на этаже");
                int numFlat = in.nextInt();

                System.out.println("\nВведите индекс этажа");
                int indFloor = in.nextInt();
                System.out.println("\nВведите площадь этажа");
                double sqFloor = in.nextDouble();
                ArrayList<Flat> flats = new ArrayList<Flat>();
                for (int k=0;k<numFlat;k++){

                    System.out.println("\nВведите индекс квартиры");
                    int indFlat = in.nextInt();
                    System.out.println("\nВведите номер квартиры");
                    int number = in.nextInt();
                    System.out.println("\nВведите количество комнат (с коридорами) в квартире");
                    int numRoom = in.nextInt();
                    ArrayList<Room> rooms = new ArrayList<Room>();
                    for (int l=0;l<numRoom;l++){

                        System.out.println("\nВведите индекс комнаты");
                        int ind = in.nextInt();
                        System.out.println("\nВведите площадь комнаты");
                        double sqRoom = in.nextDouble();
                        System.out.println("\nВыберите тип комнаты:\n1 - жилая\n2 - нежилая");
                        int ind2 = in.nextInt();
                        Room.Type type;
                        if(ind2==1){
                            type =Room.Type.LIVINGROOM;
                        }
                        else{
                            type=Room.Type.HALL;
                        }
                        Room tempRoom = new Room(ind,sqRoom,type);
                        rooms.add(tempRoom);

                    }
                    Flat tempFlat = new Flat(indFlat,number,rooms);
                    flats.add(tempFlat);

                }
                Floor tempFloor = new Floor(indFloor,sqFloor,flats);
                floors.add(tempFloor);

            }
            Entrance tempEnt = new Entrance(indEntrance,sqEntrance,floors);
            entrances.add(tempEnt);

        }
        House house = new House(index,sqHouse,address,entrances);
        controller.service.houses.add(house);

        /*System.out.println("\nЧто вы хотите изменить?\n1 - Данные о доме\n2 - данные о подъезде\n3 - данные об этаже\n4 - данные о квартире\n5 - данные о комнате\n6 - выйти в главное меню");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        switch(index){

            case 1:
                System.out.println("\nВведите индекс дома, в котором проводятся изменения");
                int indHouse = in.nextInt();
                System.out.println("\nВыберите пункт для изменения\n1 - адрес\n2 - площадь\n3 - выйти в главное меню");
                int changepoint1 = in.nextInt();
                switch(changepoint1){
                    case 1:
                        System.out.println("\nВведите новый адрес");
                        String newAddress = in.next();


                }
            case 2:
                System.out.println("\nВведите индекс дома, в котором проводятся изменения");
                int indHouse2 = in.nextInt();
            case 3:
                System.out.println("\nВведите индекс дома, в котором проводятся изменения");
                int indHouse3 = in.nextInt();
            case 4:
                System.out.println("\nВведите индекс дома, в котором проводятся изменения");
                int indHouse4 = in.nextInt();
            case 5:
                System.out.println("\nВведите индекс дома, в котором проводятся изменения");
                int indHouse5 = in.nextInt();
            case 6:
                loadMainMenu();
            default:
                System.out.println("\nНе выбрана команда");
                loadMainMenu();

        }*/

    }

    public void loadReport(){

        System.out.println("\nНа текущий момент есть: "+controller.service.houses.size()+" домов");
        double sum =0;
        //ArrayList<String> addresses = new ArrayList<String>();
        for (House house:controller.service.houses){
            sum+=controller.sumH(house);
            //addresses.add(house.getAddress());
            System.out.println("\nАдрес: "+house.getAddress());
        }
        System.out.println("\nСуммарная площадь домов равна "+sum);
        loadMainMenu();

    }



}
//enum Type{LIVINGROOM,HALL}