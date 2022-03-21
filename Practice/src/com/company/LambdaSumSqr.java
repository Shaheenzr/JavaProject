package com.company;

interface Square{
    int sqr(int x);
}
interface Sum{
    int sum(int x, int y);
}
public class LambdaSumSqr {
    public static void main(String args[]){
        Square sq = (x)-> x*x;
        System.out.println("The square of number 4 is: "+ sq.sqr(4));

        Sum sum = (x,y)-> x+y;
        System.out.println("The sum of 5 and 6 is: "+ sum.sum(5,6));
    }
}
