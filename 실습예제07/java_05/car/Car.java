package java_05.car;

public class Car {
	
	// 필드
	private String model; // 차종
	private int wheel; // 바퀴 개수
	private int seat; // 좌석 수
	private String fuel; // 연료
	
	// 기본 생성자
	public Car() { }

	// 매개 변수 생성자
	public Car(String model, int wheel, int seat, String fuel) {
		this.model = model;
		this.wheel = wheel;
		this.seat = seat;
		this.fuel = fuel;
	}
	
	public String carInfo() {
		String result = "[ 자동차 정보 : " + model + " ]" + "\n";
		result += "바퀴 수 : " + wheel + "\n";
		result += "좌석 수 : " + seat + "\n";
		result += "사용 연료 : " + fuel;
		
		return result;
	}
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public int getSeat() {
		return seat;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
}