package java_05.car;

public class Truck extends Car {
	
	private double weight; // 적재량
	
	public Truck() { }

	public Truck(String model, int wheel, int seat, String fuel, double weight) {
		// 부모 클래스인 Car의 private 매개변수를 그대로 사용하기 위해 super 예약어 사용
		super(model, wheel, seat, fuel); // Car의 매개변수 불러옴
		this.weight = weight;
	}

	// getter / setter
	// 부모(Car)는 만들어져 있으니까 자식 것만.
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// Car.toString() 오버라이딩
	@Override
	public String carInfo() {
		String trResult = "";
		
		trResult += super.carInfo();
		trResult += "\n" + "적재량 : " + weight;
		
		return trResult;
	}
	
	public void carProp() {
		System.out.println("[ 트럭 장점 ] 물건을 많이 실을 수 있다.");
	}
	
}