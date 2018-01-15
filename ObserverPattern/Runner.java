package ObserverPattern;

public class Runner {
	
	public static void main(String [] args) {
		Observable ob= new Observable();
		ConcreteObserver o= new ConcreteObserver(ob);
		ob.update(1, 2);
	}

}
