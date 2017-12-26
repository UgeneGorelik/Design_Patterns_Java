package OopDecoratorPattern;

public class PizzaMaker {

	public static void main(String[] args) {
	Pizza basicPizza = new TomatoSauce(new Mozarella(new PlainPizza())) ;
	basicPizza.Description();


	}

}
