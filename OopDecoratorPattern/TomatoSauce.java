package OopDecoratorPattern;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza NewPizza) {
		super(NewPizza);

		System.out.println("Sauce");	
	}

}
