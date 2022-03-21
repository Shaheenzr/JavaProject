
public class Drinks {
    public static void main(String args[]){
        Coffee t1 = new Coffee();
        t1.start();
        new Tea().start();

    }

}

class Coffee extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("I like Coffee");
            yield();
        }
    }
}

class Tea extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("I like Tea");
            yield();
        }
    }
}
