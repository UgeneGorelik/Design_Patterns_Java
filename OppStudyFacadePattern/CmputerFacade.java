package OppStudyFacadePattern;

public class CmputerFacade {

	private StartProg Prog1;
	private RunProg Prog2;
	
	CmputerFacade(){
		 this.Prog1= new StartProg();
		  this.Prog2= new RunProg();
		
		
	}
	
	
	public void start() {
		Prog1.run();
		Prog2.run();
	
		
	}
	
	
}
