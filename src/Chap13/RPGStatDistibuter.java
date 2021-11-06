package Chap13;

import java.util.Scanner;
class RPGStatDistibuter
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name;
        int strength;
        int luck;
        int health;
        int intelligence;
        int speed;

        System.out.println("Welcome To Alex's Game!");
        System.out.println("You have 30 skill points to split between 5 different skills:" +
                " strength, luck, health, intelligence and speed");

        System.out.println("Enter your character's name:");
        name = scan.nextLine();

        System.out.println("Enter your character's strength:");
        strength = scan.nextInt();

        System.out.println("Enter your character's luck:");
        luck = scan.nextInt();

        System.out.println("Enter your character's health:");
        health = scan.nextInt();

        System.out.println("Enter your character's intelligence:");
        intelligence = scan.nextInt();

        System.out.println("Enter your character's speed:");
        speed = scan.nextInt();



        int skillTotal = strength + luck + health + intelligence + speed;
        int pointsOver = skillTotal - 30;

        if (!name.equals("Alex")) {
            if (skillTotal > 30) {
                System.out.println("You can't make your character to overpowered! " +
                        "You're using " + pointsOver + " too many points!");
            }
            else {
                System.out.println("Alex's Game");
                System.out.println(name + ":");
                System.out.println("Strength: " + strength);
                System.out.println("Luck: " + luck);
                System.out.println("Health: " + health);
                System.out.println("Intelligence: " + intelligence);
                System.out.println("Speed: " + speed);
            }
        }
        else {
        System.out.println("Alex's Game");
        System.out.println(name + ":");
        System.out.println("Strength: " + strength);
        System.out.println("Luck: " + luck);
        System.out.println("Health: " + health);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Speed: " + speed);
    }

    }
}

