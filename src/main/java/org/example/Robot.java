package org.example;

public class Robot {

    //Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;

    //Constructor
    public Robot() {
        this.name = "Larry";
        this.weaponName = "Sword";
        this.weaponPower = 50;
    }
    //Methods (CAN DO)
    public void Attack(){
        System.out.println(this.name + "attacks with their" + this.weaponPower + "for"+ this.weaponPower + "damage!");
    }
}
