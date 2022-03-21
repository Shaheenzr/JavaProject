package com.company;
import java.util.Scanner;

public class NazarShaheenA2 {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in); //Scanner Class instance
        int size; //Input the size by user

        System.out.print("Please Enter the length of an array: ");

        // Repeat until next item is an integer
        while (!keyboard.hasNextInt()) {
            keyboard.next(); // Read and discard offending non-int input
            System.err.print("Please enter an integer value ranging from  1 to 10: "); // Re-prompt
        }
        size = keyboard.nextInt();

        if (size <= 10 & size > 0) {

            //creating an array and Calling the method for input element into array
            int[] originalArray = getArray(size);


            System.out.print("The input array is: [ ");
            //Print the array
            for(int i = 0; i < originalArray.length; i++)
            {
                System.out.print(originalArray[i] + " ");
            }

            System.out.print("]");
            System.out.println();

            //Method calling for fetching largest array element along with index of first occurrence.
            getLargest(originalArray);

            //Method calling for fetching the smallest array element along with indexes.
            getSmallest(originalArray);

            /*Creating another array for sorted elements
              and calling the getSorted method for obtaining the array
             */
            int[] sortedArray = getSorted(originalArray);


            System.out.print("The sorted array is: [ ");
            //Print the array
            for(int i = 0; i < sortedArray.length; i++)
            {
                System.out.print(sortedArray[i] + " ");
            }

            System.out.print("]");
            System.out.println();


            //Method calling for count the even and odd Numbers
            getOddEven(originalArray);


             /*Creating another array for reverse elements
              and calling the getReverse method for obtaining the array
             */
            int[] reverseArray = getReverse(originalArray);


            System.out.print("The array in reverse order is: [ ");
            //Print the array
            for(int i = 0; i < reverseArray.length; i++)
            {
                System.out.print(reverseArray[i] + " ");
            }

            System.out.print("]");
            System.out.println();


            System.out.println();// for space

            //End of the program
            System.out.println("Program Completed.");
        }
        else {
            System.err.println("Program takes integer array length from 1 to 10");
            System.err.print("Please try the program again with valid input");
        }

    }

    //Method 1 : To get and return array
    public static int[] getArray(int size) {

        int[] arr = new int[size]; //Creates an array of specified size
        System.out.println("Please Enter the " + size + " elements in the array: ");

        Scanner keyboard2 = new Scanner(System.in);//Scanner Class Instance

        //Loop iterates till the end of the array
        for (int i = 0; i < size; i++) {
            String input=keyboard2.next();
                try
                {
                    Integer.parseInt(input);
                    arr[i]=Integer.parseInt(input);
                }
                catch (NumberFormatException e)
                {
                    System.err.println("Elements entered is/are not valid : all must be integer");
                    System.err.print("Please try the program again with valid input");
                    System.exit(0);
                }
            }

        return arr;
    }

    //Method 2 : To Get the largest array element along with its index of first occurrence.
    public static void getLargest(int[] arr)
    {
        //Assume first element as largest
        int largest = arr[0];
        int index = 0;

        //Loop iterates from second to last element of the array
        for(int i = 1; i < arr.length; i++)
        {
            //check every element to be largest
            if(arr[i] >  largest)
            {
                largest = arr[i];
                index = i;
            }
        }
        //Print the largest element with its index
        System.out.println("The Largest Number is: " + largest);
        System.out.println("The first index of the largest number is: " + index);
    }

    //Method 3 : To get the smallest array element along with indexes.
    public static void getSmallest(int[] arr)
    {
        //Assume first element as smallest
        int smallest = arr[0];

        //Loop iterates till the end of the array
        for(int i = 1; i < arr.length; i++)
        {
            //to find the smallest element
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }

        //print the smallest element
        System.out.println("The smallest number is: " + smallest);

        System.out.print("All indexes of the smallest number are: ");

        //Loop iterates till the end of the array
        for(int i = 0; i < arr.length; i++)
        {
            //Check the smallest element
            if(arr[i] == smallest)

                System.out.print(i+" "); //Print its index
        }

        System.out.println();
    }

    //Method 4: To get the sorted array
    public static int[] getSorted(int[] arr)
    {

        int[] sortArr = new int[arr.length]; //Create an array
        int temp;

        //Copying all elements of original array into another one array
        for(int i = 0; i < arr.length; i++)
            sortArr[i] = arr[i];

        for (int i = 0; i < sortArr.length; i++)
        {
            for (int j = i+1; j < sortArr.length; j++)
            {
                if(sortArr[i] > sortArr[j])
                {
                    temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
        return sortArr; //return sorted array
    }

    //Method 5: To get the reverse array
    public static int[] getReverse(int[] arr)
    {
        int[] Revarr = new int[arr.length]; //Create an array
        int j = 0;

        //Loop iterates from end to beginning of array
        for(int i = arr.length - 1; i >= 0; i--)
        {
            //Copy the element
            Revarr[j] = arr[i];
            j = j + 1;
        }

        return Revarr; //return reverse array
    }

    //Method 6: To count the number of even and odds
    public static void getOddEven(int arr[])
    {
        //Variables to intiliaze the odd and even counts
        int countOdd = 0, countEven = 0;

        //Loop iterates till the end of the array
        for(int i = 0; i<arr.length; i++)
        {
            //if number is even then divisible by 2
            if (arr[i]%2==0)
                countEven = countEven + 1;
            else
                countOdd = countOdd + 1;
        }

        //print the count of even and odd Numbers
        System.out.println("Count of Even Numbers: " + countEven);
        System.out.println("Count of Odd Numbers: " + countOdd);
    }


}


