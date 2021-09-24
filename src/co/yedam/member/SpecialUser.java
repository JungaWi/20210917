package co.yedam.member;

public class SpecialUser extends User {
	private int point;

	public SpecialUser(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getPoint() {
		return point;
	}

	public SpecialUser(String userId, String userPw, String userName, Grade userGrade, int userAge) {
		super(userId, userPw, userName, userGrade, userAge);
		// TODO Auto-generated constructor stub
	}
	
	public SpecialUser(String userId, String userPw, String userName, Grade userGrade, int userAge, int point) {
		super(userId, userPw, userName, userGrade, userAge);
		this.point = point;
		// TODO Auto-generated constructor stub
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public void showInfo() {
		System.out.printf("User [userId:%s, userPw:%s, userName:%s, userGrade:%s, userAge:%d, point:%d]\n", 
				super.getUserId(), super.getUserPw(), super.getUserName(), super.getUserGrade(), super.getUserAge(), this.point);
	}
	

}