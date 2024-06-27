package java_05.car;

public class CarExecute {
	public static void main(String[] args) {

		//		CarService service = new CarService();

		// carEx1() - 기본 Car, 화물차 Truck, 경차 LightCar 객체 생성 및 내용 확인
//		carEx01();
		
		// instanceof 예제
		instanceofEx();
		
		// 매개변수가 있는 생성자로 세가지 타입의 차량 정보 생성
		// 셍성된 차량 정보를 Car 객체 배열로 등록
		carEx02();
	}

	public static void carEx01() {
		// 기본 Car
		Car c1 = new Car();
		c1.setModel("승용차");
		c1.setWheel(4);
		c1.setSeat(4);
		c1.setFuel("휘발유");
		System.out.println(c1.carInfo());

		// 화물차 Truck
		Car c2 = new Truck();
		c2.setModel("화물차");
		c2.setWheel(10);
		c2.setSeat(3);
		c2.setFuel("경유");
		((Truck) c2).setWeight(1);
		System.out.println(c2.carInfo());
		
		Truck truck = (Truck) c2;
		truck.setWeight(1.5);
		System.out.println(c2.carInfo());

		// 경차 LightCar
		LightCar c3 = new LightCar();
		c3.setModel("경차");
		c3.setWheel(4);
		c3.setSeat(4);
		c3.setFuel("휘발유");
		c3.setDiscountOffer(0.7);
		System.out.println(c3.carInfo());

	}

	public static void instanceofEx() {
		// instanceof를 통해 형변환 가능 확인
		Car car = new Car();
		Truck truck = new Truck();
		
		// 비교 대상 객체 instanceof 타입
		if (car instanceof Truck) {
			System.out.println("변환 가능");
			Truck testTruck = (Truck) car;
			testTruck.carInfo();
		} else {
			System.out.println("변환 불가");
		}
		
		if (truck instanceof Car) {
			System.out.println("변환 가능");
			Car testCar = (Car) truck;
			testCar.carInfo();
		} else {
			System.out.println("변환 불가");
		}
	}
	
	public static void carEx02() {
		Car[] carList = new Car[3];

		// carList[i] == Car 참조변수
		carList[0] = new Truck("", 6, 4, "경유", 1); // 업캐스팅
		carList[1] = new LightCar("", 4, 4, "휘발유", 0.3); // 업캐스팅
		carList[2] = new Car("", 4, 2, "전기");

		// 향상된 for문 >> 객체형 배열의 경우, 해당 객체로 바로 대입하여 사용 가능
		for (Car c : carList) {
			String carModel = getCarModel(c);
			c.setModel(carModel);
			System.out.println(c.carInfo());
		}
	}

	public static String getCarModel(Car car) {
		String carModel = "";
		
		if (car instanceof Truck) {
			carModel = "화물차";
		} else if (car instanceof LightCar) {
			carModel = "경차";
		} else {
			carModel = "전기차";
		}
		
		System.out.println("getCarModel Result >> " + carModel);
		
		return carModel;
	}

}