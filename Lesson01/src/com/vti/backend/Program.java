package com.vti.backend;

import java.util.Date;

public class Program {
	public static void main(String[] args) {
		
		// đối  tượng 1
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phòng HR";
		
		// đối tượng 2
		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phòng R&D";
		
		// đối tượng 3
		
		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "Phòng IT";
		
		// position 1
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = "Research";
		// position 2
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = "DEV";
		// position 3
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = "PM";
		
		// khởi tạo giá trị User1
		User user1 = new User();
		user1.Id = 1;
		user1.userName = "Lê Đức Thịnh";
		user1.passWord = "124444";
		user1.department = department1;
		user1.gender = Gender.MALE;
		user1.dateOfBirth = new Date("1999/02/01");
			
		// user 2
		User user2 = new User();
		user2.Id = 2;
		user2.userName = "Lê Quốc Đông";
		user2.passWord = "123123";
		user2.department = department2;
		user2.gender = Gender.FEMALE;
		user2.dateOfBirth = new Date("2000/01/22");
		
		// user 3		
		User user3 = new User();
		user3.Id = 3;
		user3.userName = "Lê Quốc Đông1";
		user3.passWord = "123123";
		user3.department = department3;
		user3.gender = Gender.FEMALE;
		user3.dateOfBirth = new Date("2000/06/10");
		
		// cách in ra
		System.out.println("Thông tin của department1");
		System.out.println("Id:" + department1.id);
		System.out.println("Name:" + department1.departmentName);
		
		// in ra user 1
		System.out.println("*****Thông Tin User 1");
		System.out.println("Id:" + user1.Id);
		System.out.println("Name:" + user1.userName);
		
		
		
		
		
		
		
		
		
		
	}
}
