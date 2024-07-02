package java_08.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {

	final int RoomCnt = 10;
	
	List<Room> roomList;

	public HotelDAO() {
		roomList = new ArrayList<Room>(RoomCnt);
		
		for (int i=0; i<RoomCnt; i++) {
			roomList.add(new Room(false));
		}
	}

	public void checkOut(int roomNum) {
		roomList.set(roomNum-1, new Room(false));
	}

	public void checkIn(int roomNum) {
		roomList.set(roomNum-1, new Room(true));
	}
	
	public boolean selectRoom(int roomNum) {
		boolean isAvailable = roomList.get(roomNum-1).isUsing();		
		return isAvailable;
	}

	public List<Room> selectRoomList() {
		return roomList;
	}
}