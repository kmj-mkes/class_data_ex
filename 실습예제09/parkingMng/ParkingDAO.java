package java_07.parkingMng;

public class ParkingDAO {
	// Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
	// addMember, updateMember, deleteMember, findMember, findAllMember

	final int ROW = 4;
	final int COL = 5;

	//저장소
	String[][] parkingSpace;
	String[][] parkingNum;

	public ParkingDAO() {
		parkingSpace = new String[ROW][COL];
		parkingNum = new String[ROW][COL];
		
		int parkingCnt = 0;
		
		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				parkingCnt++;
				parkingNum[i][j] = parkingCnt + "";
			}
		}
	}

	//저장
	public void insertParking(String location, String car) {		
		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				
				if (location.equals(parkingNum[i][j])) {
					parkingSpace[i][j] = car;
				} else {
					
				}
			}
		}
	}

	//삭제
	public void deleteParking(int r, int c) {		
		parkingSpace[r][c] = null;
	}

	//출력
	public String[][] selectParking() {	
		return parkingSpace;
	}
	
	public String selectParkingSpace(String location) {
		
		String result = "";
		
		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				if (location.equals(parkingNum[i][j])) {
					result = parkingSpace[i][j];
				} else {
					
				}
			}
		}
		
		return result;
	}
}