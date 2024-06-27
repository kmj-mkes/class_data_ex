package java_05;

public class MainExecute {

	public static void main(String[] args) {
		// 부모 클래스인 Point
		System.out.println("== 부모 클래스인 Point ==");
		
		Point point = new Point();
//		Point point = new Point(10, 20);

		System.out.println("x좌표는 :" + point.getX());
		System.out.println("y좌표는 :" + point.getY());

		point.setX(1);
		point.setY(2);

		System.out.println("x좌표는 :" + point.getX());
		System.out.println("y좌표는 :" + point.getY());
		
		// 자식 클래스인 Circle - 부모 클래스 Point의 속성 및 메소드를 그대로 사용할 수 있다.
		// 단, 접근 제어자가 private인 경우는 사용 불가
		System.out.println("== 자식 클래스인 Circle ==");
		
		Circle cCircle = new Circle();
//		Circle cCircle = new Circle(100, 200);

		System.out.println("x좌표는 :" + cCircle.getX());
		System.out.println("y좌표는 :" + cCircle.getY());

		cCircle.setX(20);
		cCircle.setY(30);

		System.out.println("x좌표는 :" + cCircle.getX());
		System.out.println("y좌표는 :" + cCircle.getY());
	}

}
