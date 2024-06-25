package memberKmj;

import myUtil.MyUtil;

public class MemberInfo {

	private static MyUtil ut = new MyUtil();
	
	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		Member member = new Member();
		
		member.setMemberId("1");
		member.setMemberName("백종원");
		member.setMemberGender("남성");
		member.setMemberEmail("paik@naver.com");
		member.setMemberPhone("010-1111-2222");
		
		String memberId = member.getMemberId();
		String memberName = member.getMemberName();
		String memberGender = member.getMemberGender();
		String memberEmail = member.getMemberEmail();
		String memberPhone = member.getMemberPhone();
		
		System.out.println("회원 아이디 : " + memberId);
		System.out.println("회원명 : " + memberName);
		System.out.println("성별 : " + memberGender);
		System.out.println("이메일 : " + memberEmail);
		System.out.println("연락처 : " + memberPhone);
		
		ut.enter();
		
		member.memberInfo(member);
		
		ut.enter();
		
		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
		member = new Member("2", "안보현");
		
		System.out.println("회원 아이디 : " + member.getMemberId());
		System.out.println("회원명 : " + member.getMemberName());
		
		enter();
		
		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)
		Member dramaMem1 = new Member("dramaMem1", "이정재");
		Member dramaMem2 = new Member("dramaMem2", "박해수");
		Member dramaMem3 = new Member("dramaMem3", "오영수");
		Member dramaMem4 = new Member("dramaMem4", "정호연");
		Member dramaMem5 = new Member("dramaMem5", "허성태");
		
		System.out.println("===== 오징어게임 시즌1 드라마 출연진 =====");
		System.out.println("회원아이디 : " + dramaMem1.getMemberId() + " / 회원명 : " + dramaMem1.getMemberName());
		System.out.println("회원아이디 : " + dramaMem2.getMemberId() + " / 회원명 : " + dramaMem2.getMemberName());
		System.out.println("회원아이디 : " + dramaMem3.getMemberId() + " / 회원명 : " + dramaMem3.getMemberName());
		System.out.println("회원아이디 : " + dramaMem4.getMemberId() + " / 회원명 : " + dramaMem4.getMemberName());
		System.out.println("회원아이디 : " + dramaMem5.getMemberId() + " / 회원명 : " + dramaMem5.getMemberName());
		
		enter();
		
//		System.out.println(member.memberInfo(dramaMem1));
		
		enter();
		
		MemberDrama.dramaMemberInfo();
		
	}
	
	public static void enter() {
		System.out.println();
	}
	
}