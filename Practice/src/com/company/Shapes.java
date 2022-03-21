package com.company;

// a class for two-dimensional object
class TwoDShape{
    private double width;
    private double height;

    /*TwoDShape(double w, double h){
        width = w;
        height =h;
    }*/
    //getter and setters for width as its declared private
    public void setWidth(double w){
        width = w;
    }
    public double getWidth(){
        return width;
    }
   //getter and setters for height as its declared private
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// A subclass of TwoDShape class for triangles
class Triangle extends TwoDShape{
    private String style;

    Triangle(String s, double w, double h){
        //super(w,h);
        style = s;

    }
    double area(){
        return getWidth() * getHeight() /2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

public class Shapes {
    public static void main(String args[]){
        Triangle t1 = new Triangle("filled", 4.0,4.0);
        Triangle t2 = new Triangle("outlined",8.0,12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+ t1.area());

        System.out.println(" ");

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+ t2.area());

    }
}
