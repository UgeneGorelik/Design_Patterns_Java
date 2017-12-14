package OopDecoratorPattern;

public class Mozarella extends ToppingDecorator{

	public Mozarella(Pizza NewPizza) {
		super(NewPizza);

		System.out.println("Mozarella");	
	}

}
