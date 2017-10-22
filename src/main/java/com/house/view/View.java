package main.java.com.house.view;

//import main.java.com.house.model.*;
import main.java.com.house.service.Service;
import main.java.com.house.service.model.*;
import main.java.com.house.controller.*;
import java.util.*;
//import java.util.Scanner;
import java.io.*;

public class View implements ViewInterface{

    //Класс для отрисовки меню
    //Service service = new Service();
    ControllerInterface controller = new Controller();


    public void loadMainMenu(){

        System.out.println("\nВведите желаемую команду\n1 - просмотреть информацию о домах\n2 - добавить дом\n3 - изменить дом\n4 - удалить дом\n5 - выход из программы");
        //Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String indexTemp = "1";
        try {
            indexTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(Integer.valueOf(indexTemp));
        int index = Integer.valueOf(indexTemp);
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

        System.out.println("\nВведите индекс дома, последний используемый - "+(controller.returnSize()-1));
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String indexTemp="0";
        try {
            indexTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = Integer.valueOf(indexTemp);
        System.out.println("\nВведите адрес дома");
        //BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));
        String address = null;
        try {
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nВведите площадь дома");
        String sqHouseTemp="1.0";
        try {
            sqHouseTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        double sqHouse = Double.valueOf(sqHouseTemp);
        System.out.println("\nВведите количество подъездов");
        String numEntranceTemp = "0";
        try {
            numEntranceTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numEntrance = Integer.valueOf(numEntranceTemp);
        System.out.println("\nВведите количество этажей");
        String numFloorTemp = "0";
        try {
            numFloorTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numFloor = Integer.valueOf(numFloorTemp);
        List<Entrance> entrances = new ArrayList<Entrance>();
        for (int i=0;i<numEntrance;i++){

            System.out.println("\nВведите индекс подъезда");
            String indEntranceTemp = "0";
            try {
                indEntranceTemp = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int indEntrance = Integer.valueOf(indEntranceTemp);
            System.out.println("\nВведите площадь подъезда");
            //double sqEntrance = in.nextDouble();
            String sqEntranceTemp="1.0";
            try {
                sqEntranceTemp = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            double sqEntrance = Double.valueOf(sqEntranceTemp);
            List<Floor> floors = new ArrayList<Floor>();
            for(int j=0;j<numFloor;j++){

                System.out.println("\nВведите количество квартир на этаже");
                String numFlatTemp = "0";
                try {
                    numFlatTemp = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int numFlat = Integer.valueOf(numFlatTemp);

                System.out.println("\nВведите индекс этажа");
                String indFloorTemp = "0";
                try {
                    indFloorTemp = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int indFloor = Integer.valueOf(indFloorTemp);
                System.out.println("\nВведите площадь этажа");
                String sqFloorTemp = "1.0";
                try {
                    sqFloorTemp = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                double sqFloor = Double.valueOf(sqFloorTemp);
                List<Flat> flats = new ArrayList<Flat>();
                for (int k=0;k<numFlat;k++){

                    System.out.println("\nВведите индекс квартиры");
                    String indFlatTemp = "0";
                    try {
                        indFlatTemp = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int indFlat = Integer.valueOf(indFlatTemp);
                    System.out.println("\nВведите номер квартиры");
                    String numberTemp = "0";
                    try {
                        numberTemp = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int number = Integer.valueOf(numberTemp);
                    System.out.println("\nВведите количество комнат (с коридорами) в квартире");
                    String numRoomTemp = "0";
                    try {
                        numRoomTemp = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int numRoom = Integer.valueOf(numRoomTemp);
                    List<Room> rooms = new ArrayList<Room>();
                    for (int l=0;l<numRoom;l++){

                        System.out.println("\nВведите индекс комнаты");
                        String indTemp = "0";
                        try {
                            indTemp = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        int ind = Integer.valueOf(indTemp);
                        System.out.println("\nВведите площадь комнаты");
                        String sqRoomTemp = "1.0";
                        try {
                            sqRoomTemp = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        double sqRoom = Double.valueOf(sqRoomTemp);
                        System.out.println("\nВыберите тип комнаты:\n1 - жилая\n2 - нежилая");
                        String ind2Temp = "1";
                        try {
                            ind2Temp = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        int ind2 = Integer.valueOf(ind2Temp);
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
        //controller.service.houses.add(house);
        controller.addHouse(house);
        loadMainMenu();

    }

    public void loadDeleteMenu(){

        System.out.println("\nВведите индекс удаляемого дома");
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String indexTemp = "0";
        try {
            indexTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = Integer.valueOf(indexTemp);
        controller.removeHouse(index);
        loadMainMenu();

    }

    public void loadUpdateMenu(){

        System.out.println("\nВведите индекс дома, в котором проводятся изменения. В ходе изменения необходимо пересоздать весь дом");
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String indexTemp = "0";
        try {
            indexTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = Integer.valueOf(indexTemp);
        controller.removeHouse(index);
        System.out.println("\nВведите адрес дома");
        //BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String address = null;
        try {
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nВведите площадь дома");
        String sqHouseTemp = "1.0";
        try {
            sqHouseTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        double sqHouse = Double.valueOf(sqHouseTemp);
        System.out.println("\nВведите количество подъездов");
        String numEntranceTemp = "0";
        try {
            numEntranceTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numEntrance = Integer.valueOf(numEntranceTemp);
        System.out.println("\nВведите количество этажей");
        String numFloorTemp = "0";
        try {
            numFloorTemp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numFloor = Integer.valueOf(numFloorTemp);

        List<Entrance> entrances = new ArrayList<Entrance>();
        for (int i=0;i<numEntrance;i++){

            System.out.println("\nВведите индекс подъезда");
            String indEntranceTemp = "0";
            try {
                indEntranceTemp = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int indEntrance = Integer.valueOf(indEntranceTemp);
            System.out.println("\nВведите площадь подъезда");
            String sqEntranceTemp = "1.0";
            try {
                sqEntranceTemp = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            double sqEntrance = Double.valueOf(sqEntranceTemp);

            List<Floor> floors = new ArrayList<Floor>();
            for(int j=0;j<numFloor;j++){

                System.out.println("\nВведите количество квартир на этаже");
                String numFlatTemp = "0";
                try {
                    numFlatTemp = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int numFlat = Integer.valueOf(numFlatTemp);

                System.out.println("\nВведите индекс этажа");
                String indFloorTemp = "0";
                try {
                    indFloorTemp = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int indFloor = Integer.valueOf(indFloorTemp);
                System.out.println("\nВведите площадь этажа");
                String sqFloorTemp = "1.0";
                try {
                    sqFloorTemp = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                double sqFloor = Double.valueOf(sqFloorTemp);
                List<Flat> flats = new ArrayList<Flat>();
                for (int k=0;k<numFlat;k++){

                    System.out.println("\nВведите индекс квартиры");
                    String indFlatTemp = "0";
                    try {
                        indFlatTemp = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int indFlat = Integer.valueOf(indFlatTemp);
                    System.out.println("\nВведите номер квартиры");
                    String numberTemp = "0";
                    try {
                        numberTemp = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int number = Integer.valueOf(numberTemp);
                    System.out.println("\nВведите количество комнат (с коридорами) в квартире");
                    String numRoomTemp = "0";
                    try {
                        numRoomTemp = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int numRoom = Integer.valueOf(numRoomTemp);
                    List<Room> rooms = new ArrayList<Room>();
                    for (int l=0;l<numRoom;l++){

                        System.out.println("\nВведите индекс комнаты");
                        String indTemp = "0";
                        try {
                            indTemp = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        int ind = Integer.valueOf(indTemp);
                        System.out.println("\nВведите площадь комнаты");
                        String sqRoomTemp = "1.0";
                        try {
                            sqRoomTemp = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        double sqRoom = Double.valueOf(sqRoomTemp);
                        System.out.println("\nВыберите тип комнаты:\n1 - жилая\n2 - нежилая");
                        String ind2Temp = "1";
                        try {
                            ind2Temp = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        int ind2 = Integer.valueOf(ind2Temp);
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
        controller.addHouse(house);

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

        System.out.println("\nНа текущий момент есть: "+controller.returnSize()+" домов");
        double sum =0;
        //ArrayList<String> addresses = new ArrayList<String>();
        List<House> allHouses = controller.returnHouses();
        for (House house:allHouses){
            sum+=controller.sumH(house);
            //addresses.add(house.getAddress());
            System.out.println("\nАдрес: "+house.getAddress());
        }
        System.out.println("\nСуммарная площадь домов равна "+sum);
        loadMainMenu();

    }



}
//enum Type{LIVINGROOM,HALL}