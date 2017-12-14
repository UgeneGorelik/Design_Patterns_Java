package OopStudyAdapterPattern;

public class EnemyrobotAdapter implements EnemyAttacker {

	enemyrobot theRobot;
	
	public EnemyrobotAdapter(enemyrobot e) {
		theRobot=e;
	}
	
	public void fireWeapon() {
		theRobot.AttackWithHands();
		
	}

}
