package it.unibo.oop.lab04.robot.composable.components;

import it.unibo.oop.lab04.robot.arms.BasicArm;
import it.unibo.oop.lab04.robot.composable.Component;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;

public class TwoGrippingArms extends Component {

	public TwoGrippingArms(ComposableRobot robot) {
		super(robot);
	}
	
	BasicArm dx = new BasicArm("dx");
	BasicArm sx = new BasicArm("sx");

	@Override
	public boolean doOperation() {
		System.out.println("LE BRACCIA VOGLIONO SAPERE SE PRENDERE O LASCIARE GLI OGGETTI!");
		return false;
	}

	@Override
	public boolean doOperation(String command) {
		if(command.equals("pickup")) {
			if (!dx.isGrabbing()) {
				dx.pickUp();
				return true;
			} else if (!sx.isGrabbing()) {
				sx.pickUp();
				return true;
			}
		}
		else if(command.equals("dropdown")){
			if (dx.isGrabbing()) {
				dx.dropDown();
				return true;
			} else if (sx.isGrabbing()) {
				sx.dropDown();
				return true;
			}
		}
		return false;
	}

}
