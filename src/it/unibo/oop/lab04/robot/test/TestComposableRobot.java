package it.unibo.oop.lab04.robot.test;

import it.unibo.oop.lab04.robot.base.BaseRobot;
import it.unibo.oop.lab04.robot.base.RobotPosition;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;
import it.unibo.oop.lab04.robot.composable.components.*;

/**
 * Utility class for testing composable robots
 * 
 */
public final class TestComposableRobot {

    private static final int CYCLES = 200;

    private TestComposableRobot() {
    	
    	
    }

    private static void assertEquality(final String propertyName, final Object expected, final Object actual) {
        if (actual == null || !actual.equals(expected)) {
            System.out.println(propertyName + " was expected to be " + expected
                    + ", but it yields " + actual + " (ERROR!)");
        } else {
            System.out.println(propertyName + ": " + actual + " (CORRECT)");
        }
    }
    
    public static void main(final String[] args) {

        /*
         * Write your own test.
         * 
         * You will need a robot with an atomic battery, two arms, and a
         * navigator system. Turn on the battery only when the level is below
         * 50%.
         */
    	
    	ComposableRobot robottino = new ComposableRobot("robottino-01");
    	
    	robottino.atomicBattery = new AtomicBattery(robottino);
    	robottino.borderNavigator = new BorderNavigator(robottino);
    	robottino.twoGrippingArms = new TwoGrippingArms(robottino);
    	
         final var r0pos = robottino + " position";
         final var r0bat = robottino + " battery";
         assertEquality(r0pos, new RobotPosition(0, 0), robottino.getPosition());
         assertEquality(r0bat, BaseRobot.BATTERY_FULL, robottino.getBatteryLevel());

         System.out.println("----------START---------");
         
         
         

    }
}
