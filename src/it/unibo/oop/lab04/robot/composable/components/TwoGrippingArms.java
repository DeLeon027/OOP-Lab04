package it.unibo.oop.lab04.robot.composable.components;

import it.unibo.oop.lab04.robot.arms.BasicArm;
import it.unibo.oop.lab04.robot.composable.Component;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;
import it.unibo.oop.lab04.robot.composable.Controllable;


public class TwoGrippingArms extends Component implements Controllable {

	BasicArm dx;
	BasicArm sx;
	
	public TwoGrippingArms(ComposableRobot robot) {
		super(robot);
		this.dx = new BasicArm("dx");
		this.sx = new BasicArm("sx");
	}

	@Override
	public boolean doOperation(String command) {

			if (command.equals("pick")) {
				if (!dx.isGrabbing() && this.getRobotConnected().isBatteryEnough(dx.getConsuptionForPickUp())) {
					dx.pickUp();
					return true;
				} else if (!sx.isGrabbing() && this.getRobotConnected().isBatteryEnough(sx.getConsuptionForPickUp())) {
					sx.pickUp();
					return true;
				}
				return false;
			}

			if (command.equals("drop")) {
				if (dx.isGrabbing() && this.getRobotConnected().isBatteryEnough(dx.getConsuptionForDropDown())) {
					dx.dropDown();
					return true;
				} else if (sx.isGrabbing() && this.getRobotConnected().isBatteryEnough(sx.getConsuptionForDropDown())) {
					sx.dropDown();
					return true;
				}
				return false;
			}
		
		return false;
	}
	
	public int count() {
		int count=0;
		if(dx.isGrabbing()) {
			count++;
		}
		if(sx.isGrabbing()) {
			count++;
		}
		return count;
	}

}
