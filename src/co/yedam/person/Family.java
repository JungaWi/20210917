package co.yedam.person;

public class Family {
	private person[] people;
	private String group;
	
	public Family() {
		people = new person[2];		
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void addPerson(person person) {
		for (int i=0; i<people.length; i++) {
			if(people[i] == null) {
				people[i] = person;
				break;
			}
		}
	}
	
	public String getGroup() {
		return this.group;
	}
	
	public void showfamily() {
		for(int i=0; i<people.length; i++) {
			if (people[i] !=null) {
				System.out.println("�̸�: "
						+people[i].getName()+"Ű: "
						+people[i].getHeight()
						+"������:  "+people[i].getWeight());
			}
		}
	}
	
}
