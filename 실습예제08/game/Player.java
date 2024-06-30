package java_06.game;

/*
# 부모 클래스, 상위 클래스 (Parent, super class)

- 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
- 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
 멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
 */

public class Player {

	private String name;
	private int level;
	private int atk;
	private int hp;


	public void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}



}