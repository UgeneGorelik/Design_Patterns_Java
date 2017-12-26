package OopStudyAdapterPattern;

public class Tester {

	public static void main(String[] args) {			
	    		 enemyTank et=new enemyTank();
			 et.fireWeapon();
			 enemyrobot er=new enemyrobot();  
		         EnemyrobotAdapter Erobot=new EnemyrobotAdapter(er);
			 Erobot.fireWeapon();
		}

}
