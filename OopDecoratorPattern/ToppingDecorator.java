package OopDecoratorPattern;

public abstract class ToppingDecorator implements Pizza{
	
	protected Pizza TempPizza;
	
	public ToppingDecorator(Pizza NewPizza) {
		TempPizza=NewPizza;
	}
	
	public void Description() {
		TempPizza.Description();
	}

}
