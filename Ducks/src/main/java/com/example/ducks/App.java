package com.example.ducks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Ducks!" );

        Duck mallard = new Mallard();
        //mallard.display();
        Duck rubber = new RubberDuck();
        interfaceTest(mallard);
        interfaceTest(rubber);
        rubber.setFlyBehaviour(new FlyRocketPowered());
        interfaceTest(rubber);
        // INTERFACE VS ABSTRACT CLASS!!!!
    }

    private static void interfaceTest(Duck duck){
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
