package com.yedam.java.app;

import java.sql.*;

public class SelectExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver"); // OJDBC에서 제공하는 드라이버를 메모리에 로드함.
		
		
		
		// 2. DB 접속 : 연결할 DB 정보가 필요함.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "HR";
		String password = "HR";
		
		//sql을 실행함으로 발생하는 예외에 대한 처리
		Connection conn = DriverManager.getConnection(url, username, password);
		
		// 3. SQL 실행
		// 3-1 Statement or PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		// 3-2 SQL 전달 및 실행
		String sql = "SELECT * FROM employees";
		ResultSet rs = stmt.executeQuery(sql); //ResultSet은 컬럼 정보도 가지고 있음
		
		
		// 3-3 반환 결과 처리
		while(rs.next()) { //next()메서드는 커서가 한 줄씩 이동하면서 값의 여부에 따라 true/false 반환하는 메소드임.
						   //데이터 한 줄에 대하여 getter를 사용하는것과 같은 효과임.
			//컬럼명으로 정보를 가져옴.
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.printf("이름 : %s, %s\n", lastName, firstName);
		}
		
		// 4. 자원 해제
		//해제는 실행의 역순.
		if(rs != null) {
			rs.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
}
