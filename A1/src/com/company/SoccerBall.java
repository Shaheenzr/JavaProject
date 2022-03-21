package com.company;

interface Inflatable{
    public void inflate();
}

interface Kickable{
    public void kick();
}

class Sportsball{

    int circum;
    int weight;
    String shape;

    //default constructor
    Sportsball(){
        System.out.println("Inside Sportsball (parent class) default constructor");
    }
    //parameterized constructor
    Sportsball( int circum, int weight,String shape){
        this.circum = circum;
        this.weight = weight;
        this.shape = shape;
    }
    public void manufacture(){
        System.out.println("Making a sports ball");
    }

    public String toString() {
        System.out.println(" ");
        return("Circumference : "+ circum + " cm, Weight: " + weight + " grams, Shape: " + shape);
    }
}

public class SoccerBall extends Sportsball implements Inflatable,Kickable{

    public static final String shape = "Round";

    //default constructor
    SoccerBall(){
        System.out.println("Inside SoccerBall (child class) default constructor");
    }
    //parameterized constructor
    SoccerBall( int attr1, int attr2){
        super(attr1,attr2, shape);
    }

    public String toString(){
        return("The attributes are >> " + super.toString() );
    }

    public void inflate(){
        System.out.println("Inflating a soccer ball");
    }

    public void kick(){
        System.out.println("Kicking a soccer ball");
    }

    public static void g1(Inflatable x){
        System.out.println(" ");
        System.out.println("Inside static g1 method");
        x.inflate();
    }

    public static void g2(Kickable y){
        System.out.println(" ");
        System.out.println("Inside static g2 method");
        y.kick();
    }

    public static void g3(Sportsball z){
        System.out.println(" ");
        System.out.println("Inside static g3 method");
        z.manufacture();
    }

    public static void main(String args[]){
        SoccerBall ball = new SoccerBall();
        ball.inflate();
        ball.kick();
        ball.manufacture();

        SoccerBall attribute = new SoccerBall(70, 450);
        System.out.println("Soccer Ball: " + attribute);

        g1(ball);
        g2(ball);
        g3(ball);
    }
}
