package StrategyPattern;

//this is the Interface that add options 
//how to implement certain trait of other Class
//sort of Stratrgy how to do it

public interface Flys {
	
	String fly();

}

//can it fly ? Stratregy1
class itFlys implements Flys{

	
	public String fly() {
		
		return "flys Great";
	}
	
}

//can it fly ? Stratregy2
 class NoFly implements Flys{

	
	public String fly() {
		return "not flys at all";
	}
	
}