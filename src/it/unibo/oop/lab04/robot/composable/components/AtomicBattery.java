package it.unibo.oop.lab04.robot.composable.components;

import it.unibo.oop.lab04.robot.composable.Component;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;
import it.unibo.oop.lab04.robot.composable.NotControllable;

public class AtomicBattery extends Component implements NotControllable {
	
	
	public AtomicBattery(ComposableRobot robot) {
		super(robot);
	}

	@Override
	public boolean doOperation() {
		this.getRobotConnected().recharge();
		return false;
	}

}
