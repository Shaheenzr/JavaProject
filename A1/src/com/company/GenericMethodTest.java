package com.company;

public class GenericMethodTest {

    public static <T> void  printArray(T[] Arr){
        for( int i= 0; i< Arr.length; i++){
            System.out.print(Arr[i] +" ");
        }
    }

    public static void main(String args[])
    {
        Integer[] intArray = { 1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A','B','C','D','E'};
        String[] stringArray ={"This", "is","a","String","array"};

        System.out.println("Array integerArray contains: ");
        printArray(intArray);
        System.out.println();

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);
        System.out.println();

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);
        System.out.println();

        System.out.println("\nArray stringArray contains:");
        printArray(stringArray);
        System.out.println();


    }
}
