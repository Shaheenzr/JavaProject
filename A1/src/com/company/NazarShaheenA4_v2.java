package com.company;
import java.util.Scanner;


// class named Item
class Item {
    //private double fields - length, height, width, and weight
    private double length;
    private double height=1;
    private double width;
    private double weight;

    //constructor with the 3 package dimensions
    public Item(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    //constructor with length and width of a thin, flat item
    public Item(double length, double width) {
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

//public class with the same name as the file
public class NazarShaheenA4_v2 {
    private Item item;
    private String customerName;

    //Two private fields - an Item storing the Item instance and a String storing the customer's name.
    public NazarShaheenA4_v2(String customerName, Item item) {
        this.item = item;
        this.customerName = customerName;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the item to " + customerName + ": ");
        while (true) {
            try {
                item.setWeight(Double.parseDouble(sc.nextLine()));
                break;
            }
            catch (Exception e) {
                System.out.print("Weight should be one number. Please try again: ");
            }
        }
    }

    //private method validatePackage() - validates the package
    private int validatePackage() {
        if (((item.getLength() > 16 || item.getHeight() > 16 || item.getWidth() > 16) || (item.getHeight() > 12 && item.getWidth() > 12)
                || (item.getHeight() > 12 && item.getLength() > 12) || (item.getLength() > 12 && item.getWidth() > 12)) && item.getWeight() > 10)
            return 1;

        else if ((item.getLength() > 16 || item.getHeight() > 16 || item.getWidth() > 16) || (item.getHeight() > 12 && item.getWidth() > 12)
                || (item.getHeight() > 12 && item.getLength() > 12) || (item.getLength() > 12 && item.getWidth() > 12))
            return 2;

        else if (item.getWeight() > 10)
            return 3;

        return 4;
    }

    //public method deliver() - displays if the package is acceptable to Hub Locker or not
    //and also displays necessary details of the package
    public void deliver() {
        String result = "";

        switch (validatePackage()) {
            case 1:
                result += "too large and too heavy";
                break;

            case 2:
                result += "too large";
                break;

            case 3:
                result += "too heavy";
                break;

            case 4:
                result += "eligible";
                break;
        }

        System.out.println("The package to " + customerName + " is " + result + " for Locker delivery\n");
    }

    //Test Cases
    public static void main(String[] args) {
        NazarShaheenA4_v2 delivery1 = new NazarShaheenA4_v2("Ghiassi", new Item(12, 11, 15));
        delivery1.deliver();

        NazarShaheenA4_v2 delivery2 = new NazarShaheenA4_v2("Srihari", new Item(17, 10, 15));
        delivery2.deliver();

        NazarShaheenA4_v2 delivery3 = new NazarShaheenA4_v2("Yue", new Item(10, 13, 11));
        delivery3.deliver();

        NazarShaheenA4_v2 delivery4 = new NazarShaheenA4_v2("Shaheen", new Item(15, 18, 9));
        delivery4.deliver();

        NazarShaheenA4_v2 delivery5 = new NazarShaheenA4_v2("John", new Item(10, 10));
        delivery5.deliver();

        NazarShaheenA4_v2 delivery6 = new NazarShaheenA4_v2("Smith", new Item(10, 18));
        delivery6.deliver();
    }
}

