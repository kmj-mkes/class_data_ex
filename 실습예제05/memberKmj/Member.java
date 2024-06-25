package memberKmj;

public class Member {
	
	// 회원 아이디
	// 회원 명
	// 성별
	// 이메일
	// 연락처
	
	private String memberId;
	private String memberName;
	private String memberGender;
	private String memberEmail;
	private String memberPhone;
	
	// 생성자
	public Member() {
		
	}
	
	public Member(String args1, String args2) {
		this.memberId = args1;
		this.memberName = args2;
	}
	
	public Member(String args1, String args2, String args3, String args4, String args5) {
		this.memberId = args1;
		this.memberName = args2;
		this.memberGender = args3;
		this.memberEmail = args4;
		this.memberPhone = args5;
	}
	
//	public String memberInfo(Member m) {
//		String result = "[ 회원정보 ] " + m.memberId + " 님의 이름은 " + m.memberName + " 입니다.";		
//		return result;
//	}
	
	public void memberInfo(Member m) {
		System.out.println("[ 회원정보 ]");
		System.out.println("회원 아이디 : " + m.memberId);
		System.out.println("회원명 : " + m.memberName);
		System.out.println("성별 : " + m.memberGender);
		System.out.println("이메일 : " + m.memberEmail);
		System.out.println("연락처 : " + m.memberPhone);
	}
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	
	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	/**
	 * @return the memberGenger
	 */
	public String getMemberGender() {
		return memberGender;
	}
	
	/**
	 * @param memberGenger the memberGenger to set
	 */
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	
	/**
	 * @return the memberEmail
	 */
	public String getMemberEmail() {
		return memberEmail;
	}
	
	/**
	 * @param memberEmail the memberEmail to set
	 */
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	/**
	 * @return the memberPhone
	 */
	public String getMemberPhone() {
		return memberPhone;
	}
	
	/**
	 * @param memberPhone the memberPhone to set
	 */
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

}