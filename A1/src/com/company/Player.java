package com.company;

/**
 * @author Shaheen Nazar
 * @date 20 Feb  2022
 * @description This is Player.java class, it will hold the info of Player
 */
public class Player {
    private String Name;
    private int Age;
    private int TotalPoints;
    /**
     * @param name
     * @param age
     * @description This is 2 argument constructor, it will take name & age as arguments
     */
    public Player(String name, int age){
        Name=name;
        Age = age;
    }
    /**
     * setter for total points of the player
     * @param points - total points to be set
     */
    public void setTotalPoints(int points) {
        this.TotalPoints = points;
    }

    /**
     * getter for total points of the player
     * @return totalPoints
     */
    public int getTotalPoints() {
        return TotalPoints;
    }

    /**
     * getter for the player name
     * @return player name
     */
    public String getName() {
        return Name;
    }

    /**
     * getter for player age
     * @return player age
     */
    public int getAge() {
        return Age;
    }

    /**
     * This is printInfo() method, it will display player name & age on console
     */
    public void printInfo(){
        System.out.println("Name: " + Name + "\nAge: " + Age);
    }

    /**
     * Checks whether the current player is leading the other player or not
     * Current player leads the other player if current player has more points than
     * the other player
     * @param otherPlayer - Player
     * @return boolean true if total points more than other player totalPoints
     */
    public boolean isLeading(Player otherPlayer){
        // If current player is leading with parameter player return true otherwise return false
        if (this.getTotalPoints() > otherPlayer.getTotalPoints())
            return true;
        else
            return false;
    }


}
