package java_11.phoneBookMap.controller;

import java_11.phoneBookMap.service.PhoneBookServiceImpl;

/*
	문제) 이름, 주소, 전화번호를 멤버로 갖는 Phone클래스를 만들고,
		Map을 이용하여 전화번호 정보를 관리하는 프로그램을 작성하시오.

		이 프로그램에는 아래의 메뉴가 있고 이 메뉴를 구현하시오.
		------------------------
		1. 전화번호 등록
		2. 전화번호 수정
		3. 전화번호 삭제
		4. 전화번호 검색
		5. 전화번호 전체 출력
		0. 프로그램 종료
		------------------------

		- 사용되는 Map의 구조는 key값으로 '등록될 사람의 이름'을 사용하고
		  value값으로는 'Phone클래스의 인스턴스'로 한다.
		  ( HashMap<String, Phone>  )

		- 삭제, 검색 기능은 '이름'을 입력 받아 처리한다.

	실행예시)
		------------------------
		1. 전화번호 등록
		2. 전화번호 수정
		3. 전화번호 삭제
		4. 전화번호 검색
		5. 전화번호 전체 출력
		0. 프로그램 종료
		------------------------
		작업번호 >> 1

		새롭게 등록할 전화번호 정보를 입력하세요.
		이 름 >> 홍길동
		전화번호 >> 010-1111-1111
		주 소 >> 대전시 중구 오류동

		'홍길동'의 전화번호 등록 완료!!

		------------------------
		1. 전화번호 등록
		2. 전화번호 수정
		3. 전화번호 삭제
		4. 전화번호 검색
		5. 전화번호 전체 출력
		0. 프로그램 종료
		------------------------
		작업번호 >> 	1

		새롭게 등록할 전화번호 정보를 입력하세요.
		이 름 >> 홍길동

		'홍길동'은 이미 등록된 사람입니다.

		------------------------
		1. 전화번호 등록
		2. 전화번호 수정
		3. 전화번호 삭제
		4. 전화번호 검색
		5. 전화번호 전체 출력
		0. 프로그램 종료
		------------------------
		작업번호 >> 	5

		=============================================================
		번호     이 름     전화번호           주 소
		=============================================================
		 1      홍길동    010-1111-1111  대전시 중고 오류동
		~~~
		~~~
		=============================================================
		출력 완료...

		------------------------
		1. 전화번호 등록
		2. 전화번호 수정
		3. 전화번호 삭제
		4. 전화번호 검색
		5. 전화번호 전체 출력
		0. 프로그램 종료
		------------------------
		작업번호 >> 	0

		프로그램을 종료합니다...

 */
public class PhoneBookController {
	public static void main(String[] args) {
		PhoneBookServiceImpl phoneBookService = new PhoneBookServiceImpl();

		phoneBookService.phoneBookStart();
	}
}