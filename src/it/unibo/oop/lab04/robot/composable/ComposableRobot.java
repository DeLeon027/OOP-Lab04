package it.unibo.oop.lab04.robot.composable;

import it.unibo.oop.lab04.robot.base.BaseRobot;


public class ComposableRobot extends BaseRobot {
	

	public ComposableRobot(String robotName) {
		super(robotName);
	}
		
	public Component atomicBattery;
	public Component borderNavigator;
	public Component twoGrippingArms;
	
}
