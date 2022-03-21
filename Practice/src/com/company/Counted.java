package com.company;
/****************************************************************
 *  Author:  Shaheen 10th Feb 2022  *
 *  Purpose:  A  Java  class  to  demonstrate  how  static  members
 *  are  defined,  initialized,  and  used.
 *  Source:  Wigglesworth/examples/classes,  pp173
 * * *
 ****************************************************************/

public class Counted {
    private int value;
    private static int count = 0; // simple initial clause

    public Counted()
    {
        ++count;
        System.out.println("Creating a counted object in constructor");
        System.out.println("static variable 'count' contains the value "+ count);
        value = -1;
        System.out.println("class variable 'value' contains the value "+ value);
        System.out.println();
    }
    //method finalize
    public void finalize()
    {
        --count;
        System.out.println("Destroying a "+ "Counted object");
    }
    //method to return the number of objects
    public static int getCount()
    {
        return count;
    }
    // method to get the value of the object
    public Counted setValue(int newValue)
    {
        value = newValue;
        return this;
    }
    //Accessor function to return the value of the object
    //@return the value of the object
    public int getValue()
    {
        return value;
    }

    public static void main(String[] args)
    {
        Counted a = new Counted();
        Counted b = new Counted();
        Counted c = new Counted();
        System.out.println("There are " + Counted.getCount() + " Counted objects");

        Counted d = new Counted();
        System.out.println("There are " + Counted.getCount() + " Counted objects");
        System.out.println("count " + count);
        a = null;
        System.gc();// start garbage collection
        System.runFinalization();
        System.out.println("There are " + a.getCount() + " Counted objects");
        /* without the next three method calls,
        the object b,c and d would be picked up in the succeeding garbage collection
        */
        b.setValue(1);
        c.setValue(2);
        d.setValue(3);

    }
}
