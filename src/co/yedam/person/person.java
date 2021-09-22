package co.yedam.person;

/*
 * 이름, 키, 몸무게, 혈액형, 나이
 */
public class person {
	private String name;
	private String height;
	private String weight;
	private String bloodtype;
	private String age;

	
	public person(String name, String height, String weight, String bloodtype, String age) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.bloodtype=bloodtype;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;		
	}
	
	public void setHeight(String height) {
		this.height=height;		
	}
	
	public void setWeight(String weight) {
		this.weight=weight;		
	}
	
	public void setBloodtype(String bloodtype) {
		this.bloodtype=bloodtype;		
	}
	
	public void setAge(String age) {
		this.age=age;		
	}	
	
	
	public String getName() {
		return this.name;		
	}
	
	public String getHeight() {
		return this.height;		
	}
	
	public String getWeight() {
		return this.weight;		
	}
	
	public String getBloodtype() {
		return this.bloodtype;		
	}
	
	public String getAge() {
		return this.age;		
	}

}
