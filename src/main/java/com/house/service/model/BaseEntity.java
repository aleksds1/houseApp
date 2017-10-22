package main.java.com.house.service.model;

public class BaseEntity{

    //У всех потомков будет свой ID
    private int id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public BaseEntity(int id){
        this.id=id;
    }

}