package co.yedam.member;

public class Member {
	//user1(���̵�), ȫ�浿(�̸�), �뱸 �߱� �Ŵ絿(�ּ�)
	private String memberId;
	private String name;
	private String address;
	
	//������ : �ʵ忡 ���� �ʱ�ȭ
	public Member() {
		memberId = "user1";
		name = "������";
		address = "�뱸 �߱� ���ϵ�";				
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}
	
	//get set �޼ҵ�
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

	
	//�޼ҵ�
	public void showInfo() {
		System.out.println("ID : "+memberId+", �̸� : "+name+", �ּ� : "+address);
	}
	
	public void showMemberId() {
		System.out.println("ID : "+memberId);
	}
	
	public void showName() {
		System.out.println("�̸� : "+name);
	}
	
	public void showAddress() {
		System.out.println("�ּ� : "+address);
	}

}
