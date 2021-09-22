package co.yedam.lesson;

/*
 * 선생님 이름, 과목
 */

public class Teacher {
	//필드
	private String name;
	private String major;
	
	//생성자
	// Teacher t1=new Teacher(); => 공간 만드는 걸 인스턴스 생성.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	//메소드... 필드 값만 바꾸고 싶을 떄
	public void setName(String name) {
		this.name =name;
	}
	
	public void setMajor (String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name;		
	}
	
	public String getmajor () {
		return this.major;		
	}

}
