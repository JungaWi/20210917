package co.yedam.account;

public class AppExe {
	public static void main(String[] args) {
		AppMain main = AppMain.getinstance(); //인스턴스
		main.execute();
		
//		AppMain main2 = AppMain.getinstance();
		
//		if(main == main2) { //메모리 주소 값 == 메모리 주소 값
//			System.out.println("같은 값");			
//		} else {
//			System.out.println("다른 값");
//		}
		
	}

}
