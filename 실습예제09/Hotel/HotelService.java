package java_08.Hotel;

import java.util.List;
import java.util.Scanner;

public class HotelService {
	public static HotelDAO hotelDAO;
	public static Scanner sc = new Scanner(System.in);

	public HotelService() {
		hotelDAO = new HotelDAO();
	}

	public void startProgram() {
		while (true) {
			int choice = this.printMenu();

			switch (choice) {
			case 1:
				this.checkIn();
				break;
			case 2:
				this.checkOut();
				break;
			case 3:
				this.roomInfo();
				break;
			case 4:
				System.out.println("시스템 종료 !!");
				System.exit(0);
				break;
			default:
				System.out.println("1 ~ 4 사이의 정수를 입력해주세요.");
				break;
			}
		}
	}

	public int printMenu() {
		System.out.println("=== 호텔 관리 프로그램 ===");
		System.out.println("[ 호텔에는 총 " + hotelDAO.RoomCnt + " 개의 객실이 있습니다. ]");
		System.out.println("----------------------------------------------------");
		System.out.println("1.입실   2.퇴실   3.방보기   4.종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();

		return input;
	}

	public void checkIn() {
		System.out.println("몇 번 방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();
		
		if (roomNum < 1 || roomNum > hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1 ~ " + hotelDAO.RoomCnt + "호실 까지의 객실이 있습니다.");
			System.out.println("다시 선택해 주세요.");
		} else if (!hotelDAO.selectRoom(roomNum)) {
			hotelDAO.checkIn(roomNum);
		} else {
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 선택해 주세요.");
		}		
	}

	public void checkOut() {
		System.out.println("몇 번 방에서 퇴실하시겠습니까?");
		int roomNum = sc.nextInt();

		hotelDAO.checkOut(roomNum);
	}

	public void roomInfo() {
		int i = 1;

		List<Room> rooms = hotelDAO.selectRoomList();
		
		System.out.println("----------------------------------------------------");

		for (Room r : rooms) {
			if (r.isUsing()) {
				System.out.println("■ " + i + "호 방은 현재 손님이 있습니다.");
			} else {
				System.out.println("□ " + i + "호 방은 현재 비어 있습니다.");
			}

			i++;
		}
		
		System.out.println("----------------------------------------------------");
	}
}