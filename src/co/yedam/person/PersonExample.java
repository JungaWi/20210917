package co.yedam.person;

import co.yedam.lesson.Lesson;

public class PersonExample {
	public static void main(String[] args) {
		person p1=new person("홍길동","180CM","65KG","AB형","25세");
		person p2=new person("방성수","165CM","70KG","A형","35세");
		
		Family f1 = new Family();
		f1.setGroup("가족");
		f1.addPerson(p1);
		f1.addPerson(p2);
		
		
	}

}
