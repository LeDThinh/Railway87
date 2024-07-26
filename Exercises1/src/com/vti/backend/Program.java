package com.vti.backend;

import java.util.Scanner;
import java.util.ArrayList;
public class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accounts = new ArrayList<>();
		createAccount(scanner, accounts);
		
		 // Question1: nhập 3 số nguyên System.out.printf("Nhập số nguyên thứ nhất:");
		 int num1 = scanner.nextInt(); scanner.nextLine();
		 
		 System.out.printf("Nhập số nguyên thứ hai:"); int num2 = scanner.nextInt();
		 scanner.nextLine();
		 
		 System.out.printf("Nhập số nguyên thứ 3:"); int num3 = scanner.nextInt();
		 scanner.nextLine();
		 
		 System.out.println("Ba số nguyên bạn vừa nhập là:" +num1+ ", "+num2
		 +", "+num3);
		 
		 // Question2: Nhập 2 số thực
		 
		 System.out.printf("Nhập số thực thứ nhất:"); double num21 =
		 scanner.nextDouble(); scanner.nextLine();
		 System.out.printf("Nhập số thực thứ hai:"); double num22 =
		 scanner.nextDouble(); scanner.nextLine();
		 
		
		System.out.println("Hai số thực bạn vừa nhập vào:"+num21+", "+num22);
		// Question3: Nhập họ và tên
		
		 System.out.println("Nhập Họ và Tên:"); String fullName = scanner.nextLine();
		 
		 System.out.println("Họ và tên bạn vùa nhập là:" + fullName);
		  
		 // Question4: Nhập ngày sinh nhật
		 System.out.print("Nhập ngàu sinh nhật của bạn (dd/MM/yyyy):"); String
		 birthDay = scanner.nextLine();
		 
		 System.out.println("Ngày sinh nhật của bạn:"+ birthDay);
		
	}
	
	// Question5: Tạo Account
    public static void createAccount(Scanner scanner, ArrayList<Account> accounts) {
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập ngày sinh nhật (dd/MM/yyyy): ");
        String birthday = scanner.nextLine();
        System.out.print("Nhập Position (1: Dev, 2: Test, 3: ScrumMaster, 4: PM): ");
        int position = scanner.nextInt();
        scanner.nextLine(); // Xóa ký tự xuống dòng

        Position positionName = null;
        switch (position) {
            case 1:
            	positionName = Position.Dev;
                System.out.println("Position: Dev");
                break;
            case 2:
            	positionName = Position.Test;
                System.out.println("Position: Test");
                break;
            case 3:
            	positionName = Position.ScrumMaster;
                System.out.println("Position: ScrumMaster");
                break;
            case 4:
            	positionName = Position.PM;
                System.out.println("Position: PM");
                break;
            default:
                System.out.println("Position không hợp lệ");
                return;
        }

        Account account = new Account(username, password, fullName, birthday, positionName);
        accounts.add(account);
        System.out.println("Tạo Account thành công!");
    }
}
