package java_05.animal;

public class MainExecute {

	public static void main(String[] args) {
	    Animal animal = new Animal();
	    
	    animal.move();
	    animal.moveAnimal(new Human());
	    animal.moveAnimal(new Tiger());
	    animal.moveAnimal(new Eagle());
	}

}