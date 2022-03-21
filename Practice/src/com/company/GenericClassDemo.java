package com.company;

class GenericClass<T>{
    private T t; //t variable is of type T
    private T v; // v variable of type T
    public GenericClass(T t, T v){
        this.t = t;
        this.v = v;
    }
    public void showType(T t, T v){
        System.out.println("Type of T stored by variable t is" + t.getClass().getName() );
        System.out.println("Type of T stored by variable v is" + v.getClass().getName() );
    }

    public <T extends Number> double add (T one, T two)
    {
        return one.doubleValue() + two.doubleValue();
    }

    public T getT(){
        return this.t;
    }

    public T getV(){
        return this.v;
    }

}
public class GenericClassDemo {

    public static void main(String args[]){

        GenericClass<Integer> intobj = new GenericClass<Integer>(5,6);
        System.out.println("The values are of integer type now, they are: "+ intobj.getT()+ " and " + intobj.getV());
        System.out.println();

        GenericClass<String> Stringobj = new GenericClass<String>("You are"," Stronger than you believe");
        System.out.println("The values are of String type now, they are: "+ Stringobj.getT()+ Stringobj.getV());
        System.out.println();

        intobj.showType(5, 10);
        System.out.println();

        Stringobj.showType("You are","Learning Java generics");
        System.out.println();

        System.out.println("The addition of two numbers is: "+intobj.add(2,3));

    }
}
