package ch08;

public class ZookeeperTester {

	public static void main(String[] args) {
		CageRepository cageRepo = new CageRepository();
		Cage<Tiger> cage = cageRepo.getTigerCage();
		Cage cage2 = new Cage<Tiger>();
		
//		Tiger tiger = new Tiger();
//		keeper.push(cage, tiger);
	}
}
