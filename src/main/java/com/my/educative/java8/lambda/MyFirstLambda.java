package com.my.educative.java8.lambda;

public class MyFirstLambda{

    public static void main(String args[]){
        Runnable r1=() -> {  System.out.println("vikas");} ;

        Thread t1 = new Thread(r1);
        t1.start();
    }

}