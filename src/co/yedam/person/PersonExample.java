package co.yedam.person;

import co.yedam.lesson.Lesson;

public class PersonExample {
	public static void main(String[] args) {
		person p1=new person("ȫ�浿","180CM","65KG","AB��","25��");
		person p2=new person("�漺��","165CM","70KG","A��","35��");
		
		Family f1 = new Family();
		f1.setGroup("����");
		f1.addPerson(p1);
		f1.addPerson(p2);
		
		
	}

}
