package java_00;

import java.util.Scanner;

public class ForWhile01_re {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로

		int forTotal = 0;

		for (int i=1; i<=10; i++) {
			forTotal = forTotal + i;
			// total += i;

			// System.out.println(i + " :: " + forTotal);
		}

		System.out.println("for total ==== " + forTotal);



		// (예제) 1부터 100까지의 합을 While문으로

		int w = 1;
		int whileTotal = 0;

		while (w <= 100) {
			whileTotal = whileTotal + w;
			// whileTotal += w;			
			w++;

			// System.out.println(w + " :: " + whileTotal);
		}

		System.out.println("while total ==== " + whileTotal);
		System.out.println();


		// (for) 1~100까지의 정수 중 6의 배수 출력
		System.out.println("(for) 1~100까지의 정수 중 6의 배수 출력");

		for (int i=1; i<=100; i++) {
			if (i % 6 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println();


		// (while) 1~100까지의 정수 중 6의 배수 출력
		System.out.println("(while) 1~100까지의 정수 중 6의 배수 출력");

		int k = 1;

		while (k <= 100) {
			if (k % 6 == 0) {
				System.out.print(k + " ");
			}

			k++;
		}

		System.out.println();
		System.out.println();


		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		System.out.println("(for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수");

		for (int i=1; i<=200; i++) {
			if (i % 6 == 0 && i % 12 != 0) {
				System.out.print(i + " ");
			}
		}


		System.out.println();
		System.out.println();


		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		System.out.println("(while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력");

		int e = 1;

		while (e <= 200) {
			if (e % 6 == 0 && e % 12 != 0) {
				System.out.print(e + " ");
			}

			e++;
		}

		System.out.println();
		System.out.println();


		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수의 합 출력
		int forSum = 0;

		for (int i=1; i<=200; i++) {
			if (i % 6 == 0 && i % 12 != 0) {
				forSum = forSum + i;
			}
		}

		System.out.println("(for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수의 합 :: " + forSum);


		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수의 합 출력
		int whileSum = 0;
		int ws = 1;

		while (ws <= 200) {
			if (ws % 6 == 0 && ws % 12 != 0) {
				whileSum = whileSum + ws;
			}

			ws++;
		}

		System.out.println("(while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수의 합 :: " + whileSum);
		System.out.println();


		// (for) 1~60000까지의 정수 중 100의 배수는 몇개일까요?
		int count = 0;
		for (int i=1; i<=60000; i++) {
			if (i % 100 == 0) {
				count++;
			}
		}
		
		System.out.println("(for) 1~60000까지의 정수 중 100의 배수 : " + count + " 개");
		System.out.println();
		
		
		// (while) 1~60000까지의 정수 중 100의 배수는 몇개일까요?
		int wCount = 0;
		int ac = 1;
		
		while (ac <= 60000) {
			if (ac % 100 == 0) {
				wCount++;
			}
			
			ac++;
		}
		
		System.out.println("(while) 1~60000까지의 정수 중 100의 배수 : " + wCount + " 개");
	}

}