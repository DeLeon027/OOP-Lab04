package it.unibo.oop.lab04.robot.arms;

public class BasicArm {
	
	private final static double COST_OF_PICKUP = 10;
	private final static double COST_OF_DROPDOWN = 10;
	
	String name;
	boolean grabbing;
	
	public BasicArm(String name){
		this.name = name;
		
	}
	
	public boolean isGrabbing() {
		return grabbing;
	}
	
	public void pickUp() {
		if(!isGrabbing()) {
			grabbing = true;
		}
	}
	
	public void dropDown() {
		grabbing = false;
	}

	public double getConsuptionForPickUp() {
		return COST_OF_PICKUP;
	}
	
	public double getConsuptionForDropDown() {
		return COST_OF_DROPDOWN;
	}

	@Override
	public String toString() {
		return "BasicArm [name=" + name + ", grabbing=" + grabbing + "]";
	}
	
	
}
