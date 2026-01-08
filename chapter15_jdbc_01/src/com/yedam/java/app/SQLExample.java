package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver");
		// 2. DB접속
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "HR";
		String password = "HR";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		/******************************** INSERT *******************************/
		// 3. SQL 실행

		// 3-1 PreparedStatement 실행// ? 방식.
		String insert = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(insert);
		//물음표의 개수만큼 setter실행해야함.
		ps.setInt(1,1000); // 1은 물음표의 순서
		ps.setString(2, "Kil-Dong");
		ps.setString(3, "Hong");
		ps.setString(4, "kdhong@google.com");
		ps.setString(5, "82.10.1234.1234");
		ps.setString(6, "21/11/05"); //java에서 사용하는 date타입과 oracle에서 사용하는 date타입은 전혀 다르다.//YY/MM/DD 포맷으로 사용하는 이유는 문자열로 넘기지만 오라클에서는 날짜라고 인식시키도록 하기 위해서임.(오라클 기본 날짜 포맷)
		ps.setString(7, "SA_REP");
		ps.setDouble(8, 6000);
		ps.setDouble(9, 0.15);
		ps.setInt(10, 149);
		ps.setInt(11, 80);
		
		// 3-2 SQL 전달 및 실행
		int result = ps.executeUpdate();
		
		// 3-3 반환 결과 처리
		System.out.println("insert 결과 : " + result);
		
		/******************************** UPDATE *******************************/
		// 3. SQL 실행

		// 3-1 PreparedStatement 실행// ? 방식.
		String update = """
				UPDATE employees
				SET last_name = ?
				WHERE employee_id = ?
				"""; //JS의 백틱문법과 같은것임. 
		ps = conn.prepareStatement(update);
		ps.setString(1, "Kang");
		ps.setInt(2, 1000);

		// 3-2 SQL 전달 및 실행
		result = ps.executeUpdate();
		// 3-3 반환 결과 처리
		System.out.println("update 결과 : " + result);
		/******************************** SELECT *******************************/
		// 3. SQL 실행
		
		// 3-1 PreparedStatement 실행// ? 방식.
		String select = """
				SELECT *
				FROM employees
				ORDER BY employee_id
				""";
		ps = conn.prepareStatement(select);
		// 3-2 SQL 전달 및 실행
		ResultSet rs = ps.executeQuery();
		// 3-3 반환 결과 처리
		while(rs.next()) {
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.println(firstName + " " + lastName);
		}
		result = ps.executeUpdate();
		System.out.println("select 결과 : " + result);
		/******************************** DELETE *******************************/
		// 3. SQL 실행
		
		// 3-1 PreparedStatement 실행// ? 방식.
		String delete = """
				DELETE FROM employees
				WHERE employee_id = ?
				""";
		// 3-2 SQL 전달 및 실행
		ps = conn.prepareStatement(delete);
		ps.setInt(1,1000);
		result = ps.executeUpdate();
		// 3-3 반환 결과 처리
		System.out.println("Delete결과 : "+ result);
		// 4. 자원 해제
		// 해제는 실행의 역순.
		if(rs != null)rs.close();
		if(ps != null)ps.close();
		if(conn != null)conn.close();
		
	}
}
