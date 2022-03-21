package com.company;

/**
 * @author Shaheen Nazar
 * @date 20th Feb 2022
 * @description This is Goalkeeper.java class that extends Player.java class
 */
public class Goalkeeper extends Player{
    private int GoalsSaved;
    private int GoalsConceded;
    /**
     * @param name
     * @param age
     * @param saved
     * @param conceded
     * @description This is 4 argument constructor, it will take name, age, saved &
     *              conceded as a argument
     */
    public Goalkeeper(String name, int age, int saved, int conceded){
        super(name,age);
        GoalsSaved = saved;
        GoalsConceded = conceded;
    }
    /**
     * getter for goals saved by the player
     * @return GoalsSaved
     */

    public int getGoalsSaved() {
        return GoalsSaved;
    }
    /**
     * getter for goals conceded by the player
     * @return GoalsConceded
     */
    public int getGoalsConceded() {
        return GoalsConceded;
    }

    /*
     * This is overridden printInfo() method, it will display Goalkeeper info on
     * console
     */
    @Override
    public void printInfo() {
        // Call super class printInfo() method for display name & age of a Player
        super.printInfo();
        System.out.println("Type: Goalkeeper\nGoals scored: " + GoalsSaved
                + "\nGoals Missed: " + GoalsConceded
                + "\nTotal points: " + super.getTotalPoints());
    }


}
