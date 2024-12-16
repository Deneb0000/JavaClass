package days15;

//			-able : 움직일 수 있는
interface Movable {
	 int COLOR = 1;	//상수 /앞에 public static final 생략
	//안붙혀도 생략되어있다
	/*public abstract*/void move(int x, int y);
}//interface Movable

abstract class Unit{
	int currentHP; //현재 유닛의 체력
	int x; // 현재유닛의 위치(x좌표)
	int y; // 현재유닛의 위치(y좌표)
}

interface Attackable{
	void attack(Unit unit);
}

interface Fightable extends Movable, Attackable{	//인터페이스 끼리 다중상속(extends)이 가능하다
	
}

class AirUnit extends Unit{//하늘유닛
	
}

class GroundUnit extends Unit{
	
}
//		┌수송선
class DropShip extends AirUnit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
}	

//군인
//class Fighter implements Movable, Attackable{
class Fighter extends GroundUnit implements Fightable{

	@Override
	public void move(int x, int y) {
		//걷기, 뛰어서...
		
	}

	@Override
	public void attack(Unit unit) {
		// 총, 칼...
		
	}

}
							// ┌기능?
class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void move(int x, int y) {
		// 탱크 이동
		
	}

	@Override
	public void attack(Unit unit) {
		// 포 이동
		
	}
	
}

interface Repairable{
	
}
//공격, 수리, 건축
//수리 가능 : 탱크, scv
//수리 불가능 : fighter
class SCV extends GroundUnit implements  Fightable, Repairable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	
	//수리하는 메서드 추가
	void repair(Repairable unit) {
		if (unit instanceof Tank) {
			//탱크 수리하는 코딩
		}else if (unit instanceof SCV) {
			//SCV 수리하는 코딩			
		}
		
	}
	
}

//해상유닛
class Marine extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		//바다이동
		
	}

	@Override
	public void attack(Unit unit) {
		// 공격
		
	}
	
}