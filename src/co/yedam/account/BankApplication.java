package co.yedam.account;

import java.util.Scanner;

public class BankApplication {
	private static Account [] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택 >> ");
			
			int selectNo = scanner.nextInt();			
			scanner.nextLine();	
			
			if (selectNo == 1) {
				createAccount();				
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("종료.");
				run = false;
			} else {
				System.out.println("잘못된 값을 입력했습니다.");				
			}			
		}
		
		
	}
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌 생성");
		System.out.println("-------");
		
		String ano = readString("계좌번호 : ");
		String owner = readString("예금주 : ");
		int balance = readInt("초기 입금액 : ");
				
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i = 0; i <accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
		
	}
	
	private static void accountList() {
		for (Account newAccount : accountArray) {
			if (newAccount != null) {
				System.out.println(newAccount.getOwner() + " " + newAccount.getAno() + " " + newAccount.getBalance());
			} 			
			
		}
	}
	
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		
		String ano = readString("계좌번호 : ");
		if (findAccount(ano) !=null) {
			int balance = readInt("입금액 : ");
			findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
			System.out.println("예금 완료.");
		}	
	}
	
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		
		String ano = readString("계좌번호 : ");
		if (findAccount(ano) !=null) {
			int balance = readInt("출금액 : ");
			if (balance > findAccount(ano).getBalance()) {
				System.out.println("잔고 부족.");			
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
				System.out.println("출금 완료.");
			}
		}
		
	}
	
	private static Account findAccount(String ano) {
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				break;
			}
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i]; 
			}
		}
		return null;
	}
	
	public static String readString(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String money = scanner.nextLine();
			try {
				result = Integer.parseInt(money);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}	
	
}
