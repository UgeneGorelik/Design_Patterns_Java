package ObserverPattern;

import java.util.ArrayList;
import java.util.Observer;

//implementation of the observable object itself

public class Observable implements Subject {
	
//data belongs to the obsevable object
	int observedData1;
	int observedData2;
//list of observers
	ArrayList<ConcreteObserver> observerList;
//constructor	
	public   Observable() {
		observerList= new ArrayList<>();
	}
	
//add observer
	public void register(ConcreteObserver o) {
		observerList.add(o);
		
	}

//remove observer
	public void unregister(ConcreteObserver o) {
		int index=observerList.indexOf(o);
		System.out.println("Deleted ok");
		observerList.remove(index);
		
	}

//update data of the observable object Keep in mind that the it updates all observers also
	public void update(int a ,int b) {
		this.observedData1=a;
		this.observedData2=b;
		for (ConcreteObserver o : observerList) {
			
			o.updateObserverData(observedData1,observedData2);
			
		}
		
	}

}
