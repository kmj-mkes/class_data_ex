package java_11.phoneBookMap.service;

public interface PhoneBookService {

	// 시작 메서드
	public void phoneBookStart();

	// 메뉴를 출력하고 작업 번호를 입력 받아 반환하는 메서드
	public int displayMenu();
	
	// 새로운 전화번호 정보를 등록하는 메서드 
	// 이미 등록된 사람은 등록되지 않음 (동명이인 없음)
	public void insert();
	
	// 전화번호 정보를 수정하는 메서드
	public void update();
	
	// 전화번호 정보를 삭제하는 메서드
	public void delete();

	// 전화번호 정보를 검색하는 메서드
	public void search();
	
	// 전체 자료를 출력하는 메서드
	public void searchAll();
	
}