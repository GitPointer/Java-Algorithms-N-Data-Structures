package com.my.educative.java8.lambda;

public class Greeter {

    public static void doGreeting(Greeting greeting){
        greeting.greet();
    }


    
      public static void main(String args[]){
        //by object oriented way
        JapaneseGreeting japaneseGreeting = new JapaneseGreeting();
        doGreeting(japaneseGreeting);
        FrenchGreeting frenchGreeting =new FrenchGreeting();
        doGreeting(frenchGreeting);
        
        //by creating anonymous class
        doGreeting(new FrenchGreeting(){

            @Override
            public void greet() {
                System.out.println("Bonjour");
                
            }  
            
        });

        //To make our code less cumbersome, let’s remove all the unnecessary code step-by-step and create our first lambda expression.

        //Step-1 -> Compiler knows that doGreeting(Greeting greeting) method take in a Greeting type parameter So, we do not need to specifically create anonymous class of type Greeting.
        //Step 2 -> We know that the Greeting interface has only one method. So, we don’t need to provide the method name. We are only concerned with the method body.
        //Step 3 -> The compiler can understand that the body does not return anything. So, mentioning the return type is redundant. We can also remove the public declaration.
        //Please note that we add a -> between the empty brackets and the method body. This is how a lambda expression is declared.
        doGreeting(() -> System.out.println("Bonjour(via Lambda)"));



    } 
    
    


}
