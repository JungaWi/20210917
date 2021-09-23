package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// 친구, 학교친구, 회사친구 => 배열에 저장.
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "1111-1211");
		friends[5] = new Friend("홍길동", "1111-1234");
		friends[1] = new Friend("김길동", "2222-1211");
		friends[2] = new Friend("홍수아", "2222-1311");
		friends[3] = new UnivFriend("박수진", "2345-1234", "수학과");
		friends[4] = new CompFriend("김철수", "2222-1212", "영업부");

	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.친구등록 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("-------------------------------");
			int menu = ScanUtil.readInt("메뉴를 선택하세요."); // static 타입일 경우 (정적 메소드)
			if (menu == 1) {
				System.out.println("등록");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
				System.out.println("수정");
				modify();
			} else if (menu == 4) {
				System.out.println("삭제");
				delete();
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}

		}
		System.out.println("끝.");

	}

	private void addFriend() {
		// 친구, 학교친구, 회사친구
		System.out.println("1.친구 2.학교친구 3.회사친구");
		int choice = ScanUtil.readInt("메뉴를 선택");
		String name = ScanUtil.readStr("친구이름 입력");
		String phone = ScanUtil.readStr("연락처를 입력");
		Friend friend = null;

		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공입력");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서입력");
			friend = new CompFriend(name, phone, depart);

		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록 성공.");

	}

	private void showList() {
		// 이름, 연락처 입력 => 홍길동, 김길동 -> "길동"
		// 1111-1211, 2222-1211 "1211" 조회.
		// 길동, 1211 -> 이름 & 연락처.

		String name = ScanUtil.readStr("조회 할 이름 입력"); // ""
		String phone = ScanUtil.readStr("조회 할 연락처 입력"); // ""

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) { // 값이 있는 경우에만 조회하겠다는 의미
				if (!name.equals("") && !phone.equals("")) { // 이름과 연락처 둘 다 입력했을 때
					if (friends[i].getPhone().indexOf(phone) != -1 && friends[i].getName().indexOf(name) != -1)
						System.out.println(friends[i].toString());

				} else if (!phone.equals("")) { // 연락처만 입력했을 때
					if (friends[i].getPhone().indexOf(phone) != -1)
						System.out.println(friends[i].toString());

				} else if (!name.equals("")) {
					if (friends[i].getName().indexOf(name) != -1) // -1이 아니다는 찾는 정보가 포함되지 않있다는 뜻
						System.out.println(friends[i].toString()); // 이름만 입력했을 때

				} else { // 아무 것도 입력 안 했을 때 : 엔터, 엔터
					System.out.println(friends[i].toString());

				}

			}
		}
	}

	private void modify() {
		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("수정 할 친구를 선택하세요.");
		String phone = ScanUtil.readStr("바꿀 번호를 입력하세요.");
		if (!phone.equals("")) // 값을 넣어줄 때만 바꾸기
			friends[num].setPhone(phone);

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요.");
			if (!major.equals("")) // 값을 넣어줄 때만 바꾸기
				((UnivFriend) friends[num]).setMajor(major);
		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀 부서를 입력하세요.");
			if (!depart.equals("")) // 값을 넣어줄 때만 바꾸기
				((CompFriend) friends[num]).setDepart(depart);
		}

		System.out.println("수정 완료.");
	}

	private void delete() {
		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("삭제 할 친구를 선택하세요.");
		if (friends[num] != null) {
			friends[num] = null;
			System.out.println("삭제 완료.");
		} else {
			System.out.println("삭제할 정보가 없습니다.");
		}
		
		
	

	}

}
