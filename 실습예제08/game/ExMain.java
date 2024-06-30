package java_06.game;

public class ExMain {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.setLevel(1);
		w1.setAtk(3);
		w1.setHp(50);
		w1.setName("전사1");
		w1.setRage(60);
		w1.characterInfo();

		System.out.println("----------------------------");

		Mage m1 = new Mage();
		m1.setName("마법사1");
		m1.setLevel(1);
		m1.setAtk(2);
		m1.setHp(50);
		m1.setMana(100);
		m1.characterInfo();

		System.out.println("----------------------------");

		Hunter h1 = new Hunter();
		h1.setName("사냥꾼1");
		h1.setLevel((int) (Math.random() * 100));
		h1.setAtk(4);
		h1.setHp(50);
		h1.setPet("멍멍이");
		h1.characterInfo();
	}

}
