package memberKmj;

import java.util.List;
import java.util.Scanner;

public class MemberView {
	
	MemberController mController;
	Scanner sc = new Scanner(System.in);
	
	public MemberView() {
		mController = new MemberController();
	}
	
	public void startProgram() {
			while(true) {
				int count = 0;
				int choice = this.printMenu();
				
				switch(choice) {
				case 1:
					this.inputMember();
					break;
				case 2:
					this.modifyMember();
					break;
				case 3:
					this.removeMember();
					break;
				case 4:
					this.printOneMember();
					break;
				case 5:
					this.printAllMembers();
					break;
				case 6:
					this.displayMsg("프로그램 종료");
					count++;
					break;
				default:
					this.displayMsg("1~6 사이의 수를 입력해주세요.");
					break;
				}
				if (count == 1) break;
			}
	}

	public int printMenu() {
		// ===== 회원 관리 프로그램 =====
		// 1. 회원 정보 등록
		// 2. 회원 정보 수정
		// 3. 회원 정보 삭제
		// 4. 회원 정보 출력(이름)
		// 5. 회원 전체 정보 출력
		// 6. 프로그램 종료
		// 선택: 1
		
		System.out.println("\n===== 회원 관리 프로그램 =====");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택: ");
		
		int choice = sc.nextInt();
		
		return choice;
	}

	public void inputMember() {
		// ===== 회원 정보 입력 =====
		// 아이디: khuser01
		// 비밀번호: pass01
		// 이름: 홍용자
		// 이메일: khuser01@kh.com
		// 전화번호: 01012345678
		// 정보를 저장중입니다...
		// 저장완료!

		Member member = new Member();
		
		System.out.print("아이디: ");
		String memberId = sc.next();
		
		System.out.print("비밀번호: ");
		String memberPw = sc.next();
		
		System.out.print("이름: ");
		String memberName = sc.next();
		
		System.out.print("이메일: ");
		String email = sc.next();
		
		System.out.print("전화번호: ");
		String phone = sc.next();
		
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setPhone(phone);
		
		mController.insertMember(member);
	}

	public void modifyMember() {
		// ===== 회원 정보 수정 =====
		// 아이디를 입력해주세요: khuser01
		// 수정할 정보를 입력해주세요
		// 비밀번호: pass11
		// 이메일: hongyj@naver.com
		// 전화번호: 01082829291
		// 정보를 수정중입니다...
		// 수정완료!

		// ===== 회원 정보 수정 =====
		// 아이디를 입력해주세요: khuser11
		// 회원정보가 존재하지 않습니다


		List<Member> members = mController.findAllMember();
		
		System.out.print("아이디를 입력해주세요: ");
		String memberId = sc.next();
		
		boolean id = false;
		
		for (int i=0; i<members.size();i++) {
			if (members.get(i).getMemberId().equals(memberId)) {
				System.out.println("수정할 정보를 입력해주세요");
				
				System.out.print("비밀번호: ");
				members.get(i).setMemberPw(sc.next());
				
				System.out.print("이메일: ");
				members.get(i).setEmail(sc.next());
				
				System.out.print("전화번호: ");
				members.get(i).setPhone(sc.next());
				
				System.out.println("수정완료!");
				
				id = true;
				break;
				
			} else continue;
		}
		
		if (id == false) {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	public void removeMember() {
		// ===== 회원 정보 수정 =====
		// 삭제할 회원의 아이디를 입력해주세요: khuser01
		// 정보를 삭제중입니다
		// 삭제완료!

		// ===== 회원 정보 수정 =====
		// 삭제할 회원의 아이디를 입력해주세요: khuser11
		// 회원정보가 존재하지 않습니다
		
		List<Member> members = mController.findAllMember();
		
		System.out.print("삭제할 회원의 아이디를 입력해주세요: ");
		String memberId = sc.next();
		
		boolean id = false;
		
		for (int i=0; i<members.size();i++) {
			if (members.get(i).getMemberId().equals(memberId)) {
				System.out.println("정보를 삭제중입니다");
				members.remove(members.get(i));
				System.out.println("삭제완료!");
				id = true;
				
				break;
			} else continue;
		}
		
		if (id == false) {				
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	public void printOneMember() {
		// ===== 회원 정보 출력(아이디) =====
		// 아이디: khuser01, 이름: 홍용자, 이메일: hongyj@naver.com, 폰번호: 01082829291

		List<Member> members = mController.findAllMember();
		
		System.out.print("조회할 아이디를 입력해주세요: ");
		String memberId = sc.next();
		
		boolean id = false;
		
		for (int i=0; i<members.size();i++) {
			if (members.get(i).getMemberId().equals(memberId)) {
				System.out.println("===== 회원 정보 출력("+ members.get(i).getMemberId() +") =====");
				System.out.print("아이디: "+members.get(i).getMemberId()+" ");
				System.out.print("이름: "+members.get(i).getMemberName()+" ");
				System.out.print("이메일: "+members.get(i).getEmail()+" ");
				System.out.print("전화번호: "+members.get(i).getPhone()+"\n");
				id = true;
				break;
			}
		} if (id == false) {				
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	public void printAllMembers() {
		// ===== 회원 전체 정보 출력 =====
		// 아이디: khuser01, 이름: 홍용자, 이메일: hongyj@naver.com, 폰번호: 01082829291
		// 아이디: khuser02, 이름: 이용자, 이메일: khuser02@naver.com, 폰번호: 01082829292
		// 아이디: khuser03, 이름: 삼용자, 이메일: khuser03@naver.com, 폰번호: 01082829293
		// 아이디: khuser04, 이름: 사용자, 이메일: khuser04@naver.com, 폰번호: 01082829294
		// 아이디: khuser05, 이름: 오용자, 이메일: khuser05@naver.com, 폰번호: 01082829295
		// 아이디: khuser06, 이름: 육용자, 이메일: khuser06@naver.com, 폰번호: 01082829296
		
		List<Member> members = mController.findAllMember();
		
		System.out.println("===== 회원 전체 정보 출력 =====");
		
		for (int i=0; i<members.size();i++) {
			System.out.print("아이디: "+members.get(i).getMemberId()+" ");
			System.out.print("이름: "+members.get(i).getMemberName()+" ");
			System.out.print("이메일: "+members.get(i).getEmail()+" ");
			System.out.print("전화번호: "+members.get(i).getPhone()+"\n");
		}
	}

	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
