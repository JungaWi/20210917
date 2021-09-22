package co.yedam;

public class Member {
	// 필드(정보 저장)
	int memberId;
	String name;
	String phone;
	
	// 메소드(기능)
	//메인 메소드가 없으면 static 안 써도 됨
	public void showInfo() {
		System.out.println("ID: "+memberId+", 이름 : "+name+", 연락처 : "+phone);
		

	}
	

}
