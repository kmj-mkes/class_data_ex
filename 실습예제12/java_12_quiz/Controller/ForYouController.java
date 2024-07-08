package java_12_quiz.Controller;

import java_12_quiz.service.ForYouServiceImpl;

/*
	문제) 이름, 주소, 전화번호를 멤버로 갖는 Phone클래스를 만들고,
		Map을 이용하여 전화번호 정보를 관리하는 프로그램을 작성하시오.

		- 비지니스 로직 클래스 참조
		- 프로그램 실행
 */
public class ForYouController {
	public static void main(String[] args) {
		ForYouServiceImpl forYouServiceImpl = new ForYouServiceImpl();

		forYouServiceImpl.programStart();
	}
}