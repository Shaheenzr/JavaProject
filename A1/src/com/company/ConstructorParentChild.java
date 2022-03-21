package com.company;

class ParentClass{
    private int x,y;
    ParentClass(){
            System.out.println("inside parent class default constructor");
            x = 70;
            y = 80;
        }
    ParentClass(int a, int b){
        System.out.println("inside parent class parameterized constructor");
        x=a;
        y=b;
    }
 //getter and setter for x as it is declared private
    public void setX(int a){
        x = a;
    }
    public int getX(){
        return x;
    }

    //getter and setter for y as it is declared private
    public void setY(int b){
        y = b;
    }
    public int getY(){
        return y;
    }

}


public class ConstructorParentChild extends ParentClass{

    private int f,g;

    ConstructorParentChild(){
        //super(90,100);
        f = 30; g = 40;
        System.out.println("inside child class default constructor");
    }
    ConstructorParentChild(int first, int second){
        //super(50,60);
        f= first;
        g= second;
        System.out.println("inside child class parameterized constructor");
    }

    public void showValues() {
        System.out.println("values in parent class are: " + getX() + " and " + getY());
        System.out.println("values in child class are: " + f + " and " + g);
    }

    public static void main(String args[]){

        ConstructorParentChild obj1 = new ConstructorParentChild();
        System.out.println(" ");

        ConstructorParentChild obj2 = new ConstructorParentChild(10,20);
        System.out.println(" ");

        obj1.showValues();

        System.out.println(" ");

        obj2.showValues();
    }
}
