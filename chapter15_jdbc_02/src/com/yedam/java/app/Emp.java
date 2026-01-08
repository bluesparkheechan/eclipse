package com.yedam.java.app;

import java.sql.Date;

//DTO (DATA TRANSFER OBJECT)
public class Emp {
	// 필드 >> 주의사항 : DB의 데이터타입을 기반으로 어떤 데이터 타입으로 지정할지 생각해야함. 필드명을 JAVA식으로 무조건 바꾸어야함.
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double salary;
	private double commisionPct;
	private int managerId;
	private int departmentId;

	// 생성자
	public Emp() {
	};

	public Emp(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
			String jobId, double salary, double commisionPct, int managerId, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commisionPct = commisionPct;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}

	// 메소드
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommisionPct() {
		return commisionPct;
	}

	public void setCommisionPct(double commisionPct) {
		this.commisionPct = commisionPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary="
				+ salary + ", commisionPct=" + commisionPct + ", managerId=" + managerId + ", departmentId="
				+ departmentId + "]";
	}

}
