package com.company;

interface InterfaceEx{
    void showMessage();
    default void getSides() {
        System.out.println("I am interface default method.");
    }
}

abstract class ClassEx{
    abstract void showMess();
}
 class InterfaceAndAbstactClass extends ClassEx implements InterfaceEx{


    public static void statmethod(){
        System.out.println("This is a static method");
    }
    public static void main(String args[]){

        InterfaceAndAbstactClass obj1 = new InterfaceAndAbstactClass();
        obj1.getSides();
        obj1.showMessage();
        obj1.showMess();
        statmethod();

    }
     /*public void getSides() {
         System.out.println("I am child's default method.");

     }*/
    @Override
    public void showMessage() {
        System.out.println("This is interface method implementation");
    }

    void showMess(){
        System.out.println("This is abstact class method implementation");
     }

}
