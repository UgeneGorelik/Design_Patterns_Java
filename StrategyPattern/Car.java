package StrategyPattern;
//concrete type of tranport
public class Car extends Transport {

	public Car(String name) {
		super(name );
		//says if it can fly or not
		this.flyingType= new NoFly();
		
	}

}
