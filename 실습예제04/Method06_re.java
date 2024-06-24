package java_02;

import java.util.Scanner;

public class Method06_re {

	/*
	 * private 해당 클래스 내에서만 사용 (다른 클래스에서 참조 불가)
	 * static 미리 할당 받아 놓고 클래스 내에서 사용하겠다고 선언
	 * Scanner 객체를 메소드(함수) 내에서 사용하기 위해 사용하는 선언 방식
	 * 해당 클래스 어디서는 Scanner 객체 사용 가능
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 구하시오.
		- Scanner를 통해 숫자 입력 받기
		- 숫자의 합을 구하는 구문은 메소드로 작성하기 
		--------------------------
		[ 조건 추가 ]
		- 숫자 입력 부분도 메소드로 구현
		- 잘못된 숫자가 입력되었을 시, 다시 한번 숫자를 입력받을 수 있도록 구현
		- 정상적인 계산이 종료되면 프로그램 종료
		 */

		int num = 0;
		int result = 0;
		boolean flag = true;

		while (flag) {
			num = num();

			if (num >= 1) {
				result = sum(num);
				System.out.println("1부터 " + num + "까지의 합은 " + result + " 입니다.");
				flag = false;
			} else {
				System.out.println("1보다 큰 숫자를 입력해 주세요.");
			}
		}
	}

	// 숫자 입력 받기
	public static int num() {
		int num = 0;

		System.out.print("1부터의 합을 계산할 숫자를 입력해 주세요  : ");
		num = sc.nextInt();

		return num;
	}

	// sum 계산식
	public static int sum(int num) {
		int result = 0;

		for (int i=1; i<=num; i++) {
			result += i;
		}

		return result;
	}
}