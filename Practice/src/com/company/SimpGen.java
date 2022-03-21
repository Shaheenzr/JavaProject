package com.company;

class TwoGen<T,V>
{
    T ob1;
    V ob2;

    //creating constructor
    TwoGen( T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    //show types of T and V
    void showTypes(){
        System.out.println("Type of T is: " + ob1.getClass().getName());
        System.out.println("Type of V is: " + ob2.getClass().getName());
    }
    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}

public class SimpGen {
    public static void main(String args[])
    {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String> (88, "Generics");

        //show the types
        tgObj.showTypes();

        //Obtain the value and show it
        int a = tgObj.getOb1();
        System.out.println("value: "+ a);

        String str = tgObj.getOb2();
        System.out.println("Value: " +str);

        System.out.println();

        //another way of showing
        System.out.println("Value 1: " +tgObj.ob1);
        System.out.println("Value 2: " +tgObj.ob2);

    }
}
