import java.io.PrintStream;

class ParentClass {
    private int x;
    private int y;

    ParentClass() {
        System.out.println("inside parent class default constructor");
        this.x = 70;
        this.y = 80;
    }

    ParentClass(int a, int b) {
        System.out.println("inside parent class parameterized constructor");
        this.x = a;
        this.y = b;
    }

    public void setX(int a) {
        this.x = a;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int b) {
        this.y = b;
    }

    public int getY() {
        return this.y;
    }
}


public class ConstructorCalling extends ParentClass {
    private int f;
    private int g;

    ConstructorCalling() {
        this.f = 30;
        this.g = 40;
        System.out.println("inside child class default constructor");
    }

    ConstructorCalling(int first, int second) {
        this.f = first;
        this.g = second;
        System.out.println("inside child class parameterized constructor");
    }

    public void showValues() {
        PrintStream var10000 = System.out;
        int var10001 = this.getX();
        var10000.println("values in parent class are: " + var10001 + " and " + this.getY());
        System.out.println("values in child class are: " + this.f + " and " + this.g);
    }

    public static void main(String[] args) {
        ConstructorCalling obj1 = new ConstructorCalling();
        System.out.println(" ");
        ConstructorCalling obj2 = new ConstructorCalling(10, 20);
        System.out.println(" ");
        obj1.showValues();
        System.out.println(" ");
        obj2.showValues();
    }
}