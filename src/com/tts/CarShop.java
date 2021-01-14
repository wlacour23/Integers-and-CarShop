package com.tts;

import java.util.HashMap;
import java.util.Scanner;

public class CarShop {
    public static void Car(){

        Scanner finder = new Scanner(System.in);

        HashMap<String, String> inventory = new HashMap<>();

        inventory.put("Civic","Honda");
        inventory.put("Corolla", "Toyota");
        inventory.put("Altima", "Nissan");
        inventory.put("Taurus", "Ford");
        inventory.put("Dart", "Dodge");
        inventory.put("Camaro","Chevrolet");
        inventory.put("Mustang","Ford");
        inventory.put("Roadster","Mercedes");
        inventory.put("Soul","Kia");
        inventory.put("Eclipse", "Mitsubishi");

        System.out.println("What model are you looking for today?");
        String carModel = finder.next();

        String output = inventory.get(carModel);
        if (output == null) {
            System.out.println("We currently do not have that model in stock");
        } else{
            System.out.println("Oh you're looking for a " + carModel+ "?"+ "Our"+ output + "selection is right over here.");
        }
    }
}
