package java_05.car;

public class LightCar extends Car {
	
	private double discountOffer; // 할인 혜택
	
	public LightCar() { }
	
	public LightCar(String model, int wheel, int seat, String fuel, double discountOffer) {
		// 부모 클래스인 Car의 private 매개변수를 그대로 사용하기 위해 super 예약어 사용
		super(model, wheel, seat, fuel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	@Override
	public String carInfo() {
		String lcResult = "";
		
		lcResult += super.carInfo();
		lcResult += "\n" + "할인율 : " + ( discountOffer * 100 ) + "%";
		
		return lcResult; 
	}
	
	public void carProp() {
		System.out.println("[경차 혜택 ] 고속도로 요금, 주차장 요금, 세금 혜택을 받을 수 있다.");
	}
	
}