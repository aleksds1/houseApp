package com.house.model;

public class BaseHall extends BaseEntity{

    //Для всех потомков с площадью
    private double square;
    public double getSquare(){
        return square;
    }
    public void setSquare(double square){
        this.square=square;
    }
    public BaseHall(int id,double square){
        super(id);
        this.square=square;
    }

}