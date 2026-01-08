package com.yedam.java.app;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//실제론 connect, disconnect 부분을 따로 클래스로 분리(추상클래스)
//DAO (Data Access Object)
public class EmpDAO {
	// 오라클 연결정보
	private final String driver;
	private final String url;
	private final String username;
	private final String password;
	// 각 메소드에서 공통적으로 사용하는 필드
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	// 싱글톤
	private static EmpDAO empDAO = null;

	private EmpDAO() {
		// 파일경로
		String resourcePath = "config/db.properties";
		Properties properties = new Properties();

		InputStream is = EmpDAO.class.getClassLoader().getResourceAsStream(resourcePath);

		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = properties.getProperty("jdbc_driver");
		url = properties.getProperty("db_url");
		username = properties.getProperty("db_username");
		password = properties.getProperty("db_password");
	}

	public static EmpDAO getInstance() {
		if (empDAO == null) {
			empDAO = new EmpDAO();
		}
		return empDAO;
	}

	// 메소드
	private void connect() {
		try {
			// 1. JDBC Driver Load
			Class.forName(driver);
			// 2. DB접속
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void disconnect() {
		try {
			// DB와 연결 해제 메소드
			// 4. 자원해제

			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 실제로는 기능적인 부분들을 자식 클래스로 관리
	// 전체조회 = SELECT
	public List<Emp> selectAll() {
		List<Emp> list = new ArrayList<>();
		try {
			// DB연결 메소드
			connect();
			// SQL실행 메소드
			// 3-1. Statement or PreparedStatement 실행
			String select = """
					SELECT *
					FROM employees
					ORDER BY employee_id
					""";
			ps = conn.prepareStatement(select);

			// 3-2. SQL 전달 및 실행
			rs = ps.executeQuery();
			// 3-3. 반환 결과 처리
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommisionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결해제
			disconnect();
		}
		return list;

	}

	// 단건조회 => SELECT
	public Emp selectOne(Emp emp) {
		Emp findEmp = null;
		try {
			// DB연결 메소드
			connect();

			// 3. SQL 실행

			// 3-1 PreparedStatement 실행// ? 방식.
			String select = """
					SELECT *
					FROM employees
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(select);
			ps.setInt(1, emp.getEmployeeId());
			// 3-2 SQL 전달 및 실행
			rs = ps.executeQuery();
			// 3-3 반환 결과 처리
			if (rs.next()) {
				findEmp = new Emp();
				findEmp.setEmployeeId(rs.getInt("employee_id"));
				findEmp.setFirstName(rs.getString("first_name"));
				findEmp.setLastName(rs.getString("last_name"));
				findEmp.setEmail(rs.getString("email"));
				findEmp.setPhoneNumber(rs.getString("phone_number"));
				findEmp.setHireDate(rs.getDate("hire_date"));
				findEmp.setJobId(rs.getString("job_id"));
				findEmp.setSalary(rs.getDouble("salary"));
				findEmp.setCommisionPct(rs.getDouble("commission_pct"));
				findEmp.setManagerId(rs.getInt("manager_id"));
				findEmp.setDepartmentId(rs.getInt("department_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결해제
			disconnect();
		}
		return findEmp;
	}

	// 등록
	public int insertInfo(Emp emp) {
		int result = 0;
		try {
			connect();
			String insert = """
					INSERT INTO employees
					VALUES (EMPLOYEES_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)
					""";
			ps = conn.prepareStatement(insert);

			// ps.setInt(1, emp.getEmployeeId()); // 1은 물음표의 순서
			ps.setString(1, emp.getFirstName());
			ps.setString(2, emp.getLastName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getPhoneNumber());
			ps.setDate(5, emp.getHireDate()); // java에서 사용하는 date타입과 oracle에서 사용하는 date타입은 전혀 다르다.//YY/MM/DD 포맷으로 사용하는
												// 이유는 문자열로 넘기지만 오라클에서는 날짜라고 인식시키도록 하기 위해서임.(오라클 기본 날짜 포맷)
			ps.setString(6, emp.getJobId());
			ps.setDouble(7, emp.getSalary());
			ps.setDouble(8, emp.getCommisionPct());
			ps.setInt(9, emp.getManagerId());
			ps.setInt(10, emp.getDepartmentId());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 수정
	public int updateInfo(Emp emp) {
		int result = 0;
		try {
			connect();
			String update = """
					UPDATE employees
					SET last_name = ?
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(update);
			ps.setString(1, emp.getLastName());
			ps.setInt(2, emp.getEmployeeId());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 삭제
	public int deleteInfo(int empId) {
		int result = 0;
		try {
			connect();
			String delete = """
					DELETE FROM employees
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(delete);
			ps.setInt(1, empId);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
}