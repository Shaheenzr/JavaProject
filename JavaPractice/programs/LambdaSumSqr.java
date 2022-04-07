
interface Sum {
    int sum(int var1, int var2);
}

interface Square {
    int sqr(int var1);
}

public class LambdaSumSqr {
    public static void main(String[] args) {
        Square sq = (x) -> {
            return x * x;
        };
        System.out.println("The square of number 4 is: " + sq.sqr(4));
        Sum sum = (x, y) -> {
            return x + y;

        };

        System.out.println("The sum of 5 and 6 is: " + sum.sum(5, 6));
    }
}
