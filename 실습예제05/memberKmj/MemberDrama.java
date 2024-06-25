package memberKmj;

public class MemberDrama {
	
	public static void main(String[] args) {

		dramaMemberInfo();
		
	}

	public static void dramaMemberInfo() {
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
	}

}