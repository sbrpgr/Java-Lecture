package mysql.customer2;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import mysql.customer.Customer;

public class App2 {
	private static Scanner scan = new Scanner(System.in);
	private static DAO2 dao2 = new DAO2();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.선수목록 | 2.선수등록 | 3.선수수정 | 4.선수방출 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				listPeople(); break;
			case 2:
				registerPeople(); break;
			case 3:
				updatePeople(); break;
			case 4:
				deletePeople(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void listPeople() {
		List<People> list = dao2.getPeople();
		for (People c: list)
			System.out.println(c);
	}
	
	public static void registerPeople() {
		String uid = null;
		int bnumber;
		People c;
		while (true) {
			System.out.print("백넘버> ");
			bnumber = scan.nextInt();
			c = dao2.getPeople(bnumber);
			if (c.getBnumber() == 0);
				break;
		}
		System.out.println("이름> ");
		String bname = scan.nextLine();
		System.out.println("포지션> ");
		String bpos = scan.nextLine();
		System.out.print("등록일> ");
		String bir = scan.nextLine();
		System.out.println("키> ");
		int h = scan.nextInt();
		
		People nc = new People(bname, bnumber,bpos, LocalDate.parse(bir), h);
		dao2.insertPeople(nc);
		System.out.println("선수 등록을 마쳤습니다.");
	}
	
	public static void updatePeople() {
		System.out.print("백넘버> ");
		int bnumber = scan.nextInt();
		People c = dao2.getPeople(bnumber);
		
		
		System.out.println("이름> ");
		String bname = scan.nextLine();
		System.out.println("포지션> ");
		String bpos = scan.nextLine();
		System.out.print("등록일> ");
		String bir = scan.nextLine();
		System.out.println("키> ");
		int h = scan.nextInt();
		
		
		c = new People(bname, bnumber,bpos, LocalDate.parse(bir), h);
		dao2.updatePeople(c);
		System.out.println("선수정보 수정을 마쳤습니다.");
	}
	
	public static void deletePeople() {
		System.out.print("백넘버> ");
		String bnumber = scan.nextLine();
		dao2.deletePeople(bnumber);
		System.out.println("선수 탈퇴를 마쳤습니다.");
	}
}