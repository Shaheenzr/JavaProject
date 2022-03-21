package com.company;

/**
 * @author Shaheen Nazar
 * @date 20th Feb 2022
 * @description This is NazarShaheenA5.java class, it will test Player.java,
 *              Attacker.java & Goalkeeper.java class functionality.
 */
public class NazarShaheenA5 {
    public static void main(String args[]){

        // This is the object of Attacker
        Attacker a = new Attacker( "Lionel Messi", 29, 3, 0);

        int totalPointForAttacker = 0;// It will store total point of Attacker

        // get scored & missed point of Attacker
        int scored = a.getGoalsScored();
        int missed = a.getGoalsMissed();

        // Calculate total point based on question instruction
        totalPointForAttacker = scored * 3 - missed * 1;

        /*
         * If totalPointForAttacker is greater than zero means non negative then set
         * totalPointForAttacker for Attacker player otherwise set zero(0)
         */
        if (totalPointForAttacker > 0)
            a.setTotalPoints(totalPointForAttacker);
        else
            a.setTotalPoints(0);

        //Display Attacker info on console
        a.printInfo();
        System.out.println("");

        // This is the object of Goalkeeper
        Goalkeeper g = new Goalkeeper("Petr Cech", 34, 5, 1);

        int totalPointForGoalkeeper = 0; // It will store total point of Goalkeeper

        // get saved & conceded point of Goalkeeper
        int saved = g.getGoalsSaved();
        int conceded = g.getGoalsConceded();

        // Calculate total point based on question instruction
        totalPointForGoalkeeper = saved * 1 - conceded * 1;

        /*
         * If totalPointForGoalkeeper is greater than zero means non negative then set
         * totalPointForGoalkeeper for Goalkeeper player otherwise set zero(0)
         */
        if (totalPointForGoalkeeper > 0)
            g.setTotalPoints(totalPointForGoalkeeper);
        else
            g.setTotalPoints(0);

        //Display Goalkeeper info on console
        g.printInfo();

        /**
         * Call isLeading() method by passing Goalkeeper class object as a parameter and
         * check who is leading. Goalkeeper or Attacker. If Attacker is leading then
         * isLeading() return true otherwise false.
         */
        if (a.isLeading(g)) {
            System.out.println(a.getName() + " leads " + g.getName() + " by "
                    + (a.getTotalPoints() - g.getTotalPoints()) + " points.");
        }else if(g.isLeading(a)) {
            System.out.println(g.getName() + " leads " + a.getName() + " by "
                    + (g.getTotalPoints() - a.getTotalPoints()) + " points.");
        } else{
            System.out.printf("Both " + a.getName() + " and "
                    + g.getName()  + " have same amount of points\n");
        }

    }
}
