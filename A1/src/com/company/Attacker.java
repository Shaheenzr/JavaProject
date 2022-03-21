package com.company;

/**
 * @author Shaheen Nazar
 * @date 20 Feb 2022
 * @description This is Attacker.java class that extends Player.java class
 */

public class Attacker extends Player{
    private int GoalsScored;
    private int GoalsMissed;

    /**
     * @param name
     * @param age
     * @param scored
     * @param missed
     * @description This is 4 argument constructor, it will take name, age, scored &
     *              missed as argument's
     */
    public Attacker(String name, int age, int scored, int missed){
        super(name,age);
        GoalsScored = scored;
        GoalsMissed = missed;
    }

    /**
     * getter for goals scored by the player
     * @return GoalsScored
     */
    public int getGoalsScored() {
        return GoalsScored;
    }

    /**
     * getter for goals missed by the player
     * @return GoalsMissed
     */
    public int getGoalsMissed() {
        return GoalsMissed;
    }

    /**
     * This is overridden printInfo() method, it will display Attacker info on
     * console
     */
    @Override
    public void printInfo() {

        // Call super class printInfo() method for display name & age of a Player
        super.printInfo();

        // Display other player info
        System.out.println("Type: Attacker\nGoals scored: " + GoalsScored
                + "\nGoals Missed: " + GoalsMissed
                + "\nTotal points: " + super.getTotalPoints());
    }

}
