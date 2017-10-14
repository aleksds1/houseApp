package main.java.com.house.model;

public class Room extends BaseHall {

    //Задаём  типы комнат(жилая и коридоры)
    public enum Type{LIVINGROOM,HALL}
    public Type type;
    public Type getType(){
        return type;
    }
    public void setType(Type type){
        this.type=type;
    }
    public Room(int id,double square,Type type){
        super(id,square);
        this.type=type;
    }

}
