package java_11.phoneBookMap.dao;

import java.util.HashMap;

import java_11.phoneBookMap.model.Phone;

public class PhoneBookDAO {

	// 저장소
	HashMap<String, Phone> phoneBookMap;
	
	// 생성자
	public PhoneBookDAO() {
		phoneBookMap = new HashMap<String, Phone>();
	}
	
	// 전화번호 등록
	public void insert(String name, String tel, String addr) {
		phoneBookMap.put(name, new Phone(name, tel, addr));
	}

	// 전화번호 수정
	public void update(String name, String tel, String addr) {
		phoneBookMap.put(name, new Phone(name, tel, addr));
	}
	
	// 전화번호 삭제
	public void delete(String name) {
		phoneBookMap.remove(name);
	}
	
	// 전화번호 중복 체크
	public boolean dupCheck(String name) {
		
		// true : 이미 등록 되어 있음
		// false : 등록된 정보 없음
		
		if (phoneBookMap.containsKey(name)) {
			return true;
		} else {
			return false;
		}
	}
	
	// 전화번호 검색
	public Phone search(String name) {
		Phone phone = phoneBookMap.get(name);
		return phone;
	}
	
	// 전화번호 전체 출력
	public HashMap<String, Phone> searchAll() {
		return phoneBookMap;
	}
}