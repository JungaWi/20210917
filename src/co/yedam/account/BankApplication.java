package co.yedam.account;

import java.util.Scanner;

public class BankApplication {
	private static Account [] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. ���� ���� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.println("���� >> ");
			
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
				System.out.println("����.");
				run = false;
			} else {
				System.out.println("�߸��� ���� �Է��߽��ϴ�.");				
			}			
		}
		
		
	}
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���� ����");
		System.out.println("-------");
		
		String ano = readString("���¹�ȣ : ");
		String owner = readString("������ : ");
		int balance = readInt("�ʱ� �Աݾ� : ");
				
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i = 0; i <accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				break;
			}
		}
		System.out.println("���°� �����Ǿ����ϴ�.");
		
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
		System.out.println("����");
		System.out.println("-------");
		
		String ano = readString("���¹�ȣ : ");
		if (findAccount(ano) !=null) {
			int balance = readInt("�Աݾ� : ");
			findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
			System.out.println("���� �Ϸ�.");
		}	
	}
	
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		
		String ano = readString("���¹�ȣ : ");
		if (findAccount(ano) !=null) {
			int balance = readInt("��ݾ� : ");
			if (balance > findAccount(ano).getBalance()) {
				System.out.println("�ܰ� ����.");			
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
				System.out.println("��� �Ϸ�.");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}	
	
}
