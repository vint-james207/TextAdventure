package com.james;

import java.util.ArrayList;

//import static com.james.Main.scanner;

/**
 * Created by jamesyburr on 5/18/16.
 */
public class Player extends Character {
    String weapon;
    String location;

    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage = 20;
    }

    public void chooseName() {
        System.out.println("What is your name?");
        name = Main.nextLine();
        System.out.printf("Welcome, %s\n", name);
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = Main.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("Sword is a fine choice!");
        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice!");
        } else {
            throw new Exception("Invalid weapon");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [Forest/Tunnel]");
        location = Main.nextLine();

        if(location.equalsIgnoreCase("forest")){
            System.out.println("Entering the forest...");
        }
        else if (location.equalsIgnoreCase("tunnel")){
            System.out.println("Entering tunnel...");
        }
        else {
            throw new Exception("Invalid location");
        }
    }

    public void findItem(String item) {
        System.out.printf("You found %s! Pick it up! [y/n]\n", item);
        String answer = Main.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);

            System.out.printf("You now have %s items\n", items.size());
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
