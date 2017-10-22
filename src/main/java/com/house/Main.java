package main.java.com.house;

import main.java.com.house.view.View;
import main.java.com.house.view.ViewInterface;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        ViewInterface view = new View();
        view.loadMainMenu();

    }

}
