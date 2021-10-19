package adt;

public class App {

    public static void main(String[] args){
        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        System.out.println(myCounter.getCurrentValue());
    }

}
