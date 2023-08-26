package java.csse.models;

public class Employee {

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String employeeID;
	public String fullName;
	public String address;
	public String facultyName;
	public String department;
	public String designation;

	public String e1() {
		return employeeID;
	}

	public void e1(String employeeID) {
		this.employeeID = employeeID;
	}

	public String e2() {
		return fullName;
	}

	public void e2(String fullName) {
		this.fullName = fullName;
	}

	public String e3() {
		return address;
	}

	public void e3(String address) {
		this.address = address;
	}

	public String e4() {
		return facultyName;
	}

	public void e4(String facultyName) {
		this.facultyName = facultyName;
	}

	public String e5() {
		return department;
	}

	public void e5(String department) {
		this.department = department;
	}

	public String e6() {
		return designation;
	}

	public void e6(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {

		return "Employee ID = " + employeeID + "\n" + "FullName = " + fullName + "\n" + "Address = " + address + "\n"
				+ "Faculty Name = " + facultyName + "\n" + "department = " + department + "\n" + "designation = "
				+ designation;
	}
}
