package it.unibo.oop.lab04.robot.composable;

import it.unibo.oop.lab04.robot.base.BaseRobot;



public class ComposableRobot extends BaseRobot {
	
	private NotControllable borderNavigator;
	private Controllable twoGrippingArms;	
	private NotControllable atomicBattery;

	public ComposableRobot(String robotName) {
		super(robotName);
	}	
	
	
	public NotControllable getBorderNavigator() {
		return borderNavigator;
	}


	public Controllable getTwoGrippingArms() {
		return twoGrippingArms;
	}



	public void setAtomicBattery(NotControllable atomicBattery) {
		this.atomicBattery = atomicBattery;
	}


	public void setBorderNavigator(NotControllable borderNavigator) {
		this.borderNavigator = borderNavigator;
	}


	public void setTwoGrippingArms(Controllable twoGrippingArms) {
		this.twoGrippingArms = twoGrippingArms;
	}


	
	
	@Override
	public boolean isBatteryEnough(double operationCost) {
		if(this.atomicBattery!=null) {
			if(super.getBatteryLevel()<50) {
				this.atomicBattery.doOperation();
			}
		}
		return super.isBatteryEnough(operationCost);
	}
	
	
	
}
