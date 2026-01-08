package com.yedam.java.app;


import java.sql.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		// 전체조회
		int select = 0;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		EmpDAO dao = EmpDAO.getInstance();
		while (run) {
			
			System.out.println("============================================");
			System.out.println("1.등록 2.수정 3.삭제 4.사원조회 5.사원전체조회 9.종료");
			System.out.println("============================================");
			System.out.print("선택>> ");
			try {
				select = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("입력한 값이 숫자가 아닙니다.");
				scanner.next();
				continue;
			}
			if (select == 1) {
				Emp emp = new Emp();
				System.out.print("이름>> ");
				emp.setFirstName(scanner.next());
				System.out.print("성>>");
				emp.setLastName(scanner.next());
				System.out.print("이메일>> ");
				emp.setEmail(scanner.next());
				System.out.print("전화번호>> ");
				
				emp.setPhoneNumber(scanner.next());
				System.out.print("입사일>> ");
				//sql.date타입 > yyyy-MM-dd
				//util.date타입 > yy/MM/dd
				
				emp.setHireDate(Date.valueOf(scanner.next()));
				System.out.print("직무번호>> ");
				emp.setJobId(scanner.next());
				System.out.print("연봉>> ");
				emp.setSalary(scanner.nextDouble());
				System.out.print("커미션비율>> ");
				emp.setCommisionPct(scanner.nextDouble());
				System.out.print("상사사원번호>> ");
				emp.setManagerId(scanner.nextInt());
				System.out.print("부서번호>> ");
				emp.setDepartmentId(scanner.nextInt());
				
				
				dao.insertInfo(emp);
				}
			
			else if (select == 2) {
				Emp emp = new Emp();
				System.out.print("사원번호>> ");
				emp.setEmployeeId(scanner.nextInt());
				System.out.print("성>> ");
				emp.setLastName(scanner.next());
				dao.updateInfo(emp);
			}
			else if (select == 3) {
				System.out.print("사원번호>> ");
				int empId = scanner.nextInt();
				dao.deleteInfo(empId);
			}
			else if (select == 4) {
				System.out.print("사원번호>> ");
				int empId = scanner.nextInt();
				Emp emp = new Emp();
				emp.setEmployeeId(empId);
				Emp findEmp = dao.selectOne(emp);
				System.out.println(findEmp);
			}
			else if (select == 5) {
				List<Emp>list = dao.selectAll();
				for(Emp emp:list) {
					System.out.println(emp);
				}
			}
			else if (select == 9) {
				System.out.println("프로그램 종료");
				run = false;
				
			}else {
				System.out.println("잘못된 입력값.");
				System.out.println("메뉴 번호를 다시 입력해주세요");
			}
		}
		scanner.close();
	}
}
