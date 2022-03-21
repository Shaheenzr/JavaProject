package com.company;

class ArrayMinMax<T>{
    T Max;
    T Min;

    public ArrayMinMax( T max, T min){
        Max = max;
        Min = min;
    }
    public T getMax(){
        return Max;
    }
    public T getMin(){
        return Min;
    }
}

public class GenericArrayMinMax {
    public static void main (String args[]){
        Integer[] intArray = { 78 , 90, 24, 56, 45};
        ArrayMinMax<Integer> arrobj = ArrayResults.minmax(intArray);
        System.out.println("min = "+ arrobj.getMax());
        System.out.println("max = "+ arrobj.getMin());
    }
}

class ArrayResults{
    public static ArrayMinMax<Integer> minmax(Integer[] arr){
        Integer max = arr[0];
        Integer min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
     return new ArrayMinMax<>(min,max);

    }
}
