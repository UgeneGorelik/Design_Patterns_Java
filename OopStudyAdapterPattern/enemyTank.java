package OopStudyAdapterPattern;

public class enemyTank implements EnemyAttacker{

	@Override
	public void fireWeapon() {
		System.out.println("EnemyTank fires weapon");
		
	}

}
