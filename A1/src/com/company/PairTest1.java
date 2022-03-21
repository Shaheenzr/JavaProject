package com.company;

 class Pair<T>{
    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;
    }

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public void setFirst( T newValue){
             this.first = newValue;
    }
    public T getFirst(){
        return this.first;
    }

    public void setSecond(T newValue){
        this.second = newValue;
    }
    public T getSecond(){
        return this.second;
    }
}

public class PairTest1 {
     public static void main(String args[]){
         String[] words = {"Mary", "had", "a","little","lamb"};
         Pair<String> mm = Arrayalg.minmax(words);
         System.out.println("min = "+ mm.getFirst());
         System.out.println("max = "+ mm.getSecond());
     }
}

class Arrayalg{

     public static Pair<String> minmax(String[] s){
         String min = s[0];
         String max = s[0];
         if( s== null || s.length == 0){
             return null;
         }else{
             for(int i =0; i<s.length;i++){
                 if(min.compareTo(s[i]) > 0){
                     max = s[i];
                 }

                 if (max.compareTo(s[i]) < 0){
                     min = s[i];
                 }
             }
         }
       return new Pair<>(min,max);
     }
}
