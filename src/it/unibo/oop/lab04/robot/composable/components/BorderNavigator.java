package it.unibo.oop.lab04.robot.composable.components;

import it.unibo.oop.lab04.robot.base.RobotEnvironment;
import it.unibo.oop.lab04.robot.composable.Component;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;

public class BorderNavigator extends Component {
	

	public BorderNavigator(ComposableRobot robot) {
		super(robot);
	}


	@Override
	public boolean doOperation() {

		while (this.getRobotConnected().getPosition().getY() != RobotEnvironment.Y_LOWER_LIMIT) {
			this.getRobotConnected().moveDown();
			if(this.getRobotConnected().getBatteryLevel()<50) {
				this.getRobotConnected().atomicBattery.doOperation();
			}
		}
		// Y = 0
		while (this.getRobotConnected().getPosition().getX() != RobotEnvironment.X_LOWER_LIMIT) {
			this.getRobotConnected().moveLeft();
			if(this.getRobotConnected().getBatteryLevel()<50) {
				this.getRobotConnected().atomicBattery.doOperation();
			}
		}

		int i = 0;

		for (i = 0; i <= RobotEnvironment.X_UPPER_LIMIT; i++) {
			this.getRobotConnected().moveRight();
			if(this.getRobotConnected().getBatteryLevel()<50) {
				this.getRobotConnected().atomicBattery.doOperation();
			}
		}
		for (i = 0; i <= RobotEnvironment.Y_UPPER_LIMIT; i++) {
			this.getRobotConnected().moveUp();
			if(this.getRobotConnected().getBatteryLevel()<50) {
				this.getRobotConnected().atomicBattery.doOperation();
			}
		}
		for (i = 0; i <= RobotEnvironment.X_LOWER_LIMIT; i++) {
			this.getRobotConnected().moveLeft();
			if(this.getRobotConnected().getBatteryLevel()<50) {
				this.getRobotConnected().atomicBattery.doOperation();
			}
		}
		for (i = 0; i <= RobotEnvironment.Y_LOWER_LIMIT; i++) {
			this.getRobotConnected().moveDown();
			if(this.getRobotConnected().getBatteryLevel()<50) {
				this.getRobotConnected().atomicBattery.doOperation();
			}
		}

		if (this.getRobotConnected().getPosition().getY() == 0 && this.getRobotConnected().getPosition().getX() == 0) {
			return true;
		}

		return false;
	}

	@Override
	public boolean doOperation(String command) {
		System.out.println("IL NAVIGATORE DI CONFINE NON ACCETTA COMANDI!");
		return false;
	}

}
