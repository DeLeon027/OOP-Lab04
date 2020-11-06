package it.unibo.oop.lab04.robot.composable;

public abstract class Component {
	
	private boolean connected;
	private boolean switchedOn;
	private ComposableRobot robotConnected;
	
	public Component(ComposableRobot robot){
		this.robotConnected=robot;
	}
	
	public boolean isConnected() {
		return this.connected;
	}
	
	public boolean isSwitchedOn() {
		return this.switchedOn;
	}
	
	public void powerOn() {
		this.switchedOn=true;
	}
	
	public void powerOff() {
		this.switchedOn=false;
	}
	
	public ComposableRobot getRobotConnected() {
		return robotConnected;
	}
	
	public abstract boolean doOperation();
	
	public abstract boolean doOperation(String command);


}
