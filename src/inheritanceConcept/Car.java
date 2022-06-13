package inheritanceConcept;

public class Car {
	int wheels=4;
	
	//static methods cant be override but can inherit.
	//private methods cant be override.
	//final method or variable cant be override.
	public void start() {
		System.out.println("car...start");
	
	}
	public void stop() {
		System.out.println("car...stop");
	}
	public void refuel() {
		System.out.println("car...refuel");
	}
}
