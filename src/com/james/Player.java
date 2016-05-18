package com.james;

import static com.james.Main.scanner;

/**
 * Created by jamesyburr on 5/18/16.
 */
public class Player {
    String name;
    String weapon;
    String location;

    public void chooseName() {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        String weapon = scanner.nextLine();

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
        String location = scanner.nextLine();

        if(location.equalsIgnoreCase("forest")){
            System.out.println("Entering the forest...");
        }
        else if (location.equalsIgnoreCase("tunnel")){
            System.out.println("Entering tunnell...");
        }
        else {
            throw new Exception("Invalid location");
        }
    }
}
