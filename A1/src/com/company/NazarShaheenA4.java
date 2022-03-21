package com.company;
import java.util.Scanner;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * purpose: To check if your order is eligible for Amazon Hub Locker delivery:
 *    The criteria are:
 *    The shipping weight is less than 10 lbs.
 *    The product dimensions are smaller than 16 x 12 x 14 inches.
 * Source: geeksforgeeks.org,javatpoint.com has been referred for understanding concepts used
 *         in this program
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

public class NazarShaheenA4 {

    //Two private fields - an Item storing the Item instance and a String storing the customer's name.
    private Item1 item;
    private String customerName;

    /* constructor used for initialization of class variables and
     * checks if the user input for the item weight is a valid input(only one number)
     */
    NazarShaheenA4(String customerName, Item1 item){
        this.item=item;
        this.customerName= customerName;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the item to "+customerName+": ");
        String weight = sc.nextLine();
        while(weight.split(" ").length>1 || !Character.isDigit(weight.charAt(0))) {
            System.out.print("Weight should be one number. Please enter again:");
            weight=sc.nextLine();
        }
        item.setWeight(Double.parseDouble(weight));
    }

    // main method from where compiler starts executing the program
    public static void main(String[] args) {

        NazarShaheenA4 delivery1 = new NazarShaheenA4("Ghiassi", new Item1 (12, 11, 15)); // weight: 9
        delivery1.deliver();

        NazarShaheenA4 delivery2 = new NazarShaheenA4("Srihari", new Item1 (17, 10, 15)); // weight: 8
        delivery2.deliver();

        NazarShaheenA4 delivery3 = new NazarShaheenA4("Yue", new Item1 (10, 13, 11)); // weight: 12
        delivery3.deliver();

        NazarShaheenA4 delivery4 = new NazarShaheenA4("Shaheen", new Item1 (15, 18, 9)); // weight: 14
        delivery4.deliver();

        NazarShaheenA4 delivery5 = new NazarShaheenA4("John", new Item1(10,10)); // weight: 1
        delivery5.deliver();

        NazarShaheenA4 delivery6 = new NazarShaheenA4("Smith", new Item1(10,18)); // weight: 3
        delivery6.deliver();

        System.out.println("Program Completed");
    }

    /* This method is the one having the logic used for validating the package.
     * it returns a value to deliver() method according to validation done inside.
     */
    private int validatePackage(Item1 item) {
        if((item.getLength()>16 || item.getHeight()>12 || item.getWidth()>14) && item.getWeight()>10) {
            return 1;
        } else if(item.getLength()>16 || item.getHeight()>12 || item.getWidth()>14) {
            return 2;
        } else if(item.getWeight()>10) {
            return 3;
        } else {
            return 4;
        }
    }

    /* This method helps in displaying message if the package is acceptable to
     * Hub Locker or not according to the value returned by ValidatePackage method.
     */
    public void deliver(){
        int result = validatePackage(item);
        if(result==1) {
            System.out.println("The package to "+customerName+" is too large and too heavy for Locker delivery");
        } else if(result==2) {
            System.out.println("The package to "+customerName+" is too large for Locker delivery");
        } else if(result==3) {
            System.out.println("The package to "+customerName+" is too heavy for Locker delivery");
        } else {
            System.out.println("The package to "+customerName+" is eligible for Locker delivery");
        }
        System.out.println();
    }

}

// class named Item
class Item1{

    //private double fields - length, height, width, and weight
    private double length;
    private double height;
    private double width;
    private double weight;

    //constructor with the 3 package dimensions
    public Item1(double height, double width, double length) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    //constructor with length and width of a thin, flat item
    public Item1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getters to get package dimensions and weight.
    public double getLength() {
        return length;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getWeight() {
        return weight;
    }

    //A setter for package weight.
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
