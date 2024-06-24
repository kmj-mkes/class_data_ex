package java_02;

import java.util.Scanner;

public class Method05_re {

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 구하시오.
		- Scanner를 통해 숫자 입력 받기
		- 숫자의 합을 구하는 구문은 메소드로 작성하기
		--------------------------
		 */

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int result = 0;

		System.out.print("1부터의 합을 계산할 숫자를 입력해 주세요  : ");
		num = sc.nextInt();

		// 1. 메소드 호출
		// 단, 1보다 작은 숫자는 계산이 불가함
		// 입력받은 숫자의 유효성 체크가 필요
		// 유효성 체크를 어디서 할 것인지, 어떤 조건으로 체크를 할 것인지	

		if (num >= 1) {
			result = sum(num);
			System.out.println("1부터 " + num + "까지의 합은 " + result + " 입니다.");
		} else {
			System.out.println("1보다 큰 숫자를 입력해 주세요.");
		}

		sc.close();

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