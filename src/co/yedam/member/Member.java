package co.yedam.member;

public class Member {
	//user1(아이디), 홍길동(이름), 대구 중구 신당동(주소)
	private String memberId;
	private String name;
	private String address;
	
	//생성자 : 필드에 값을 초기화
	public Member() {
		memberId = "user1";
		name = "박지원";
		address = "대구 중구 내일동";				
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}
	
	//get set 메소드
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public String getMemberId() {
		 return memberId;
	}
	
	public void setName(String n) {
		memberId = n;
	}
	
	public String getName() {
		 return name;
	}
	
	public void setAddress(String a) {
		address=a;
	}
	
	public String getAddress() {
		return address;
	}

	
	//메소드
	public void showInfo() {
		System.out.println("ID : "+memberId+", 이름 : "+name+", 주소 : "+address);
	}
	
	public void showMemberId() {
		System.out.println("ID : "+memberId);
	}
	
	public void showName() {
		System.out.println("이름 : "+name);
	}
	
	public void showAddress() {
		System.out.println("주소 : "+address);
	}

}
