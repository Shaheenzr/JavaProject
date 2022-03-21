package com.company;
import java.lang.*;


public class nazarShaheenA1 {

    public static void main(String[] args) {

         try {

             nazarShaheenA1 progA1 = new nazarShaheenA1(); //created object progA1

             /*Fist check: if user has provided required number of arguments
               if not, then print usage or else continue with the program
             */

             if ((args.length != 4)) {

                 progA1.printUsage(); // calls the printUsage method

             }
             else{

                   String regex_Num = "-?[0-9]+";

                   for(int i=0;i<args.length;i++) {

                      if (!(args[i].matches(regex_Num))){

                           System.out.println("You have provided input argument" + " " +(i+1)+ " as " + args[i] );

                      }
                 }

                   // variable declaration
                   int x1, x2, y1, y2;
                   double dis;

                   x1 = Integer.parseInt(args[0]); //Convert's string input to integer and then stored in variable x1
                   y1 = Integer.parseInt(args[1]); //Convert's string input to integer and then stored in variable y1
                   x2 = Integer.parseInt(args[2]); //Convert's string input to integer and then stored in variable x2
                   y2 = Integer.parseInt(args[3]); //Convert's string input to integer and then stored in variable y2

                   dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); //actual calculation of distance

                   System.out.println("The Distance between" +
                        "(" + x1 + "," + y1 + ")" +" and " + "(" + x2 + "," + y2 + ")" + " " + "is" + " " +
                        String.format("%.2f", dis)); // Prints the Distance calculated in the previous line

                   System.out.print("Program Completed"); // states that Program is completed

             }


        }catch (NumberFormatException e) {

            System.err.println("$$$ This program requires four input arguments which must be integer $$$");
            
        }

    }

    private void printUsage() {
        System.err.println("Usage: java nazarShaheenA1 <number1> <number2> <number3> <number4>");

    }

}








