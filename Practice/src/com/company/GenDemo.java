package com.company;

class Gen<T>{
    T ob; //object of type T
    Gen(T o)
    {
        ob = o;
    }
    // return ob
    public T getOb(){
        return ob;
    }
    // show type of T
    void showType(){
        System.out.println("Type of T is: "+ ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String args[]){

        //create a Gen reference for Integer
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        //get the type of data used by iOb
        iOb.showType();

        int v = iOb.getOb();//no cast is needed
        System.out.println("value: " + v);

        System.out.println();

        //Create a Gen object for Strings
        Gen<String> strOb = new Gen<String>("Generics Test");

        //show the type of data used by strOb
        strOb.showType();

        String str = strOb.getOb();//no cast is needed
        System.out.println("value: "+str);

    }
}
