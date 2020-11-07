package it.unibo.oop.lab04.robot.composable.components;

import it.unibo.oop.lab04.robot.base.RobotEnvironment;
import it.unibo.oop.lab04.robot.composable.Component;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;
import it.unibo.oop.lab04.robot.composable.NotControllable;

public class BorderNavigator extends Component implements NotControllable {
	

	public BorderNavigator(ComposableRobot robot) {
		super(robot);
	}


	@Override
	public boolean doOperation() {

		while (this.getRobotConnected().getPosition().getY() != RobotEnvironment.Y_LOWER_LIMIT) {
			this.getRobotConnected().moveDown();
			
		}
		// Y = 0
		while (this.getRobotConnected().getPosition().getX() != RobotEnvironment.X_LOWER_LIMIT) {
			this.getRobotConnected().moveLeft();
			
		}

		for (int i = 0; i <= RobotEnvironment.X_UPPER_LIMIT; i++) {
			this.getRobotConnected().moveRight();
			System.out.println("ciclo 1");
			
		}
		for (int i = 0; i <= RobotEnvironment.Y_UPPER_LIMIT; i++) {
			this.getRobotConnected().moveUp();
			System.out.println("ciclo 2");
			
		}
		for (int i = 0; i <= RobotEnvironment.X_UPPER_LIMIT; i++) {
			this.getRobotConnected().moveLeft();
			System.out.println("ciclo 3");
			
		}
		for (int i = 0; i <= RobotEnvironment.Y_UPPER_LIMIT; i++) {
			this.getRobotConnected().moveDown();
			System.out.println("ciclo 4");
			
		}

		if (this.getRobotConnected().getPosition().getY() == 0 && this.getRobotConnected().getPosition().getX() == 0) {
			return true;
		}

		return false;
	}

}
