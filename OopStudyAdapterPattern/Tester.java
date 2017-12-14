package OopStudyAdapterPattern;

public class Tester {

	public static void main(String[] args) {
		
			
			enemyTank e7=new enemyTank();
			 e7.fireWeapon();
			 enemyrobot a1=new enemyrobot();  
			 
			 EnemyrobotAdapter Erobot=new EnemyrobotAdapter(a1);
			 Erobot.fireWeapon();
			
		


	}

}
