package LearningJava.Chapter6_SeaBattle.Hard;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; //ship's position
    private String name; //ship's name

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "miss(";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "SICK!!!";
                System.out.println("OH! You have sunk " + name);
            } else {
                result = "Hit!!";
            }
        }


        return result;
    }
}
