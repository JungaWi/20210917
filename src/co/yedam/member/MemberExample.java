package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "�ڹ̸�", "�뱸 �߱� ���ϵ�"); //������ ȣ��
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "�߱� ���ϵ�";
		m1.setAddress("�߱� ���ϵ�");	
		
//		System.out.println("ID : "+m1.memberId);
		System.out.println("ID : "+m1.getMemberId());
//		System.out.println("�̸� : "+m1.name);
		System.out.println("�̸� : "+m1.getName());
//		System.out.println("�ּ� : "+m1.address);
		System.out.println("�ּ� : "+m1.getAddress());
		
	
		
				
		Member m3 = new Member("user3", "������", "�뱸 �ϱ� ���쵿");
		m3.showInfo();
		m3.setMemberId("user355");
		m3.setName("������");
		m3.setAddress("�뱸 �ϱ� ���쵿");	
		
		System.out.println("ID : "+m3.getMemberId());
		System.out.println("�̸� : "+m3.getName());
		System.out.println("�ּ� : "+m3.getAddress());

	}

}
