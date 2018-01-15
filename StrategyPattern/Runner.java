package StrategyPattern;

public class Runner {
	
	public static void main(String [] args) {
		Transport c= new Car("A Car");
		Transport p= new Plane("A Plane");
		c.tryToFly();
		p.tryToFly();
	}

}
