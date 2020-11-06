package it.unibo.oop.lab04.robot.composable.components;

import it.unibo.oop.lab04.robot.composable.Component;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;

public class AtomicBattery extends Component {
	
	
	public AtomicBattery(ComposableRobot robot) {
		super(robot);
	}

	@Override
	public boolean doOperation() {
		this.getRobotConnected().recharge();
		return false;
	}

	@Override
	public boolean doOperation(String command) {
		System.out.println("OPERAZIONE NON SUPPORTATA DALLA BATTERIA ATOMICA!");
		return false;
	}

}
