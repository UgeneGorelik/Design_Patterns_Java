package StrategyPattern;

//concrete type of tranport
public class Plane extends Transport{

	public Plane(String name) {
		super(name);
//says if it can fly or not
		this.flyingType= new itFlys();
	}

}
