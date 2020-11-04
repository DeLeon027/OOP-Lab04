package it.unibo.oop.lab04.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

	public static final double MOVEMENT_DELTA_CONSUMPTION = 1.2;
	public static final double MOVEMENT_DELTA_CONSUMPTION_1ARM = 1.6;
	public static final double MOVEMENT_DELTA_CONSUMPTION_2ARM = 2.0;

	BasicArm dx = new BasicArm("dx");
	BasicArm sx = new BasicArm("sx");

	int oggettiTrasportati;

	public RobotWithTwoArms(String robotName) {
		super(robotName);
		this.oggettiTrasportati = 0;
	}

	@Override
	public boolean pickUp() {
		if (!dx.isGrabbing()) {
			dx.pickUp();
			this.oggettiTrasportati++;
			return true;
		} else if (!sx.isGrabbing()) {
			sx.pickUp();
			this.oggettiTrasportati++;
			return true;
		}
		return false;
	}

	@Override
	public boolean dropDown() {
		if (dx.isGrabbing()) {
			dx.dropDown();
			this.oggettiTrasportati--;
			return true;
		} else if (sx.isGrabbing()) {
			sx.dropDown();
			this.oggettiTrasportati--;
			return true;
		}

		return false;
	}

	@Override
	public int getCarriedItemsCount() {
		return this.oggettiTrasportati;
	}

	protected double getBatteryRequirementForMovement() {
		if (this.oggettiTrasportati == 2) {
			return RobotWithTwoArms.MOVEMENT_DELTA_CONSUMPTION_2ARM;
		} else if (this.oggettiTrasportati == 1) {
			return RobotWithTwoArms.MOVEMENT_DELTA_CONSUMPTION_1ARM;
		} else {
			return RobotWithTwoArms.MOVEMENT_DELTA_CONSUMPTION;
		}
	}

}
