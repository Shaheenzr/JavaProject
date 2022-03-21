package com.company;

class ParentProb1{
    private int rollno;
    private String StudentName;
    private Double GPA;
    ParentProb1(){
        System.out.println("inside parent default constructor");
        rollno = 100;
        StudentName = "John Doe";
        GPA = 3.67;
    }

    ParentProb1(int rollno, String StudentName, Double GPA){
        System.out.println("inside parent class parameterized constructor");
        this.rollno = rollno;
        this.StudentName = StudentName;
        this.GPA = GPA;
    }
    public int getRollno(){
        return this.rollno;
    }
    public String getStudentName(){
        return this.StudentName;
    }
    public Double getGPA(){
        return this.GPA;
    }
    public void DisplayInfo(){
        System.out.println("The name of the student is: " + getStudentName() );
        System.out.println("The student Id of the student is: "+ getRollno());
        System.out.println("The student GPA is: " + getGPA());
    }
}

public class InheritanceProb1 extends ParentProb1{
    private String cityName ;
    private int zipCode;
    private String stateName;
    public static final Double HIGHEST_GPA = 4.0;

    InheritanceProb1(){
        System.out.println("Inside child default constructor");
        cityName = "Santa Clara";
        zipCode = 560100;
        stateName = "California";
    }

    InheritanceProb1(String cityName,int zipCode, String stateName){
        super(101,"Rahul", HIGHEST_GPA);
        System.out.println("Inside child class parameterized constructor");
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.stateName = stateName;
    }
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("The student lives in the city: " + cityName);
        System.out.println("The zipcode of the city is: "+ zipCode);
        System.out.println("The name of the state is : " + stateName);
    }

    public static void main(String args[]){
        InheritanceProb1 childObj = new InheritanceProb1();
        childObj.DisplayInfo();
        System.out.println();

        InheritanceProb1 childObj2 = new InheritanceProb1("Sacramento",751006,"Utah");
        childObj2.DisplayInfo();

        System.out.println();

        ParentProb1 parentObj = new ParentProb1();
        parentObj.DisplayInfo();

    }
}
