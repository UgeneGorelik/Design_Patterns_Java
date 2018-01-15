package StrategyPattern;

//the Transport sort of abstarct type 

public class Transport {
	
	
	public String name;
	
	public Flys flyingType;
//constructor	
	public Transport(String name) {
		this.name=name;
		
	}
//function that says can it or cant fly	
	public void  tryToFly() {
		System.out.println(this.name +" " +this.flyingType.fly());
	}
//change fly detail	
	public void setFlying(Flys newType) {
		this.flyingType=newType;
	}
	

}
