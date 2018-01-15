package ObserverPattern;

//implementation of concrete observer

public class ConcreteObserver implements Observer {
     private int oData1;
     private int oData2;
     public static int Id=0;
     
     private Subject Ob;
 
 //constuctor Having in itself the Observable for having option to run its methods   
     public ConcreteObserver(Observable o) {
    	 
    	 this.Ob=o;
    	 
    	 this.Id++;
    	 
    	 o.register(this);
     }
    
  
 //update and report the changes in the observed
	
	public void updateObserverData(int observedData1, int observedData2) {
		this.oData1=observedData1;
		this.oData2=observedData2;
		System.out.println("observer's : "+Id+" Data  was updated to "+ oData1+" and "+oData2);
		
	}

}
