package ObserverPattern;

//interface for the Object that will be observed

import java.util.Observer;

public interface Subject {
	
	public void register(ConcreteObserver o);
	public void unregister(ConcreteObserver o);
	public void update(int a,int b);

}
