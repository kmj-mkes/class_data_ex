package java_11.phoneBookMap.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import java_11.phoneBookMap.dao.PhoneBookDAO;
import java_11.phoneBookMap.model.Phone;

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
public class PhoneBookServiceImpl implements PhoneBookService {

	public static PhoneBookDAO phoneBookDAO;
	public static Scanner sc = new Scanner(System.in);

	// 생성자
	public PhoneBookServiceImpl() {
		phoneBookDAO = new PhoneBookDAO();

	}

	// 시작 메서드
	public void phoneBookStart() {
		System.out.println("**************************************");
		System.out.println("    전 화 번 호 관 리 프 로 그 램");
		System.out.println("**************************************");
		System.out.println();

		while(true) {
			int choice = displayMenu();
			switch(choice) {
			case 1 : 	// 등록
				insert(); break;
			case 2 : 	// 수정
				update(); break;
			case 3 : 	// 삭제
				delete(); break;
			case 4 : 	// 검색
				search(); break;
			case 5 : 	// 전체 출력
				searchAll(); break;
			case 0 : 	// 종료
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println();
				System.out.println("작업 번호를 잘못 입력했습니다.");
				System.out.println("다시 선택하세요.");
			}
		}
	}

	// 메뉴를 출력하고 작업 번호를 입력 받아 반환하는 메서드
	public int displayMenu() {
		System.out.println();
		System.out.println("------------------------");
		System.out.println(" 1. 전화번호 등록");
		System.out.println(" 2. 전화번호 수정");
		System.out.println(" 3. 전화번호 삭제");
		System.out.println(" 4. 전화번호 검색");
		System.out.println(" 5. 전화번호 전체 출력");
		System.out.println(" 0. 프로그램 종료");
		System.out.println("------------------------");
		System.out.print("작업번호 >> ");
		return sc.nextInt();
	}

	// 새로운 전화번호 정보를 등록하는 메서드 
	// 이미 등록된 사람은 등록되지 않음 (동명이인 없음)
	public void insert() {
		System.out.println();
		System.out.println("새롭게 등록할 전화번호 정보를 입력하세요.");
		System.out.print("이 름 >> ");
		String name = sc.next();

		// 이미 등록된 사람인지 검사한다.
		if (phoneBookDAO.dupCheck(name)) {
			System.out.println(name + "씨는 이미 등록된 사람입니다.");
			return;
		}

		System.out.print("전화번호 >> ");
		String tel = sc.next();

		sc.nextLine();   // 입력 버퍼 비우기

		System.out.print("주 소 >> ");
		String addr = sc.nextLine();

		phoneBookDAO.insert(name, tel, addr);

		System.out.println("'" + name + "'의 전화번호 등록 완료!!");
	}

	// 전화번호 정보를 수정하는 메서드
	public void update() {
		System.out.println();
		System.out.println("수정할 전화번호 정보를 입력하세요...");
		System.out.print("이 름 >> ");
		String name = sc.next();

		// 수정할 사람이 이미 등록되어 있는지 검사
		if (!phoneBookDAO.dupCheck(name)) {
			System.out.println();
			System.out.println(name + "씨의 전화번호 정보가 없습니다.");
			return;
		}

		System.out.print("새로운 전화번호 >> ");
		String newTel = sc.next();

		sc.nextLine();   // 입력 버퍼 비우기

		System.out.print("새로운 주소 >> ");
		String newAddr = sc.nextLine();

		// 수정 작업 ==> 같은 key값에 새로운 value값을 추가하면 된다.
		phoneBookDAO.update(name, newTel, newAddr);

		System.out.println(name + "씨의 전화번호 정보를 수정했습니다.");
	}

	// 전화번호 정보를 삭제하는 메서드
	public void delete() {
		System.out.println();
		System.out.println("삭제할 전화번호 정보를 입력하세요...");
		System.out.print("이 름 >> ");
		String name = sc.next();

		// 삭제할 사람이 있는지 검사
		if (!phoneBookDAO.dupCheck(name)) {
			System.out.println();
			System.out.println(name + "씨의 전화번호 정보가 없습니다.");
			return;
		}

		phoneBookDAO.delete(name);

		System.out.println(name + "씨의 전화번호 정보를 삭제했습니다.");
	}

	// 전화번호 정보를 검색하는 메서드
	public void search() {
		System.out.println();
		System.out.println("검색할 전화번호 정보를 입력하세요...");
		System.out.print("이 름 >> ");
		String name = sc.next();

		System.out.println();

		// 검색할 사람이 있는지 검사
		if (!phoneBookDAO.dupCheck(name)) {
			System.out.println(name + "씨의 전화번호 정보가 없습니다.");
			return;
		}

		Phone phone = phoneBookDAO.search(name);
		System.out.println(name + "씨의 전화번호 정보");
		System.out.println("-------------------------");
		System.out.println(" 이 름 : " + phone.getName());
		System.out.println(" 전 화 : " + phone.getTel());
		System.out.println(" 주 소 : " + phone.getAddr());
		System.out.println("-------------------------");
	}

	// 전체 자료를 출력하는 메서드
	public void searchAll() {
		System.out.println();
		System.out.println("=============================================================");
		System.out.println(" 번호     이 름     전화번호           주 소");
		System.out.println("=============================================================");

		HashMap<String, Phone> phoneBookMap = phoneBookDAO.searchAll();

		if (phoneBookMap.size() == 0) {
			System.out.println("\t등록된 전화번호 정보가 없습니다.");
		} else {
			int num = 0;	// 번호 출력용

			Iterator<String> keyIt = phoneBookMap.keySet().iterator();
			while (keyIt.hasNext()) {
				num++;
				String key = keyIt.next();   		// key값(등록된 이름) 구하기
				Phone p = phoneBookMap.get(key);  	// value값(Phone객체) 구하기
				System.out.println(num + "\t" + p.getName() + "\t" + p.getTel() + "\t" + p.getAddr());
			}
		}

		System.out.println("=============================================================");
		System.out.println("출력 완료 !!");
	}
}