package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "박미림", "대구 중구 내일동"); //생성자 호출
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "중구 남일동";
		m1.setAddress("중구 남일동");	
		
//		System.out.println("ID : "+m1.memberId);
		System.out.println("ID : "+m1.getMemberId());
//		System.out.println("이름 : "+m1.name);
		System.out.println("이름 : "+m1.getName());
//		System.out.println("주소 : "+m1.address);
		System.out.println("주소 : "+m1.getAddress());
		
	
		
				
		Member m3 = new Member("user3", "위정아", "대구 북구 국우동");
		m3.showInfo();
		m3.setMemberId("user355");
		m3.setName("위정아");
		m3.setAddress("대구 북구 국우동");	
		
		System.out.println("ID : "+m3.getMemberId());
		System.out.println("이름 : "+m3.getName());
		System.out.println("주소 : "+m3.getAddress());

	}

}
