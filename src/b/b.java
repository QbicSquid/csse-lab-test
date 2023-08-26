package b;

public class b {

	public String iDeMPLOYEE;
	public String nAMEfULL;
	public String aDDRESS;
	public String fACULTYnAME;
	public String dEPARTMENT;
	public String dESIGNATION;
	public String e1() {
		return iDeMPLOYEE;
	}
	public void e1(String employeeID) {
		iDeMPLOYEE = employeeID;
	}
	public String e2() {
		return nAMEfULL;
	}
	public void e2(String fullName) {
		nAMEfULL = fullName;
	}
	public String e3() {
		return aDDRESS;
	}
	public void e3(String address) {
		aDDRESS = address;
	}
	public String e4() {
		return fACULTYnAME;
	}
	public void e4(String facultyName) {
		fACULTYnAME = facultyName;
	}
	public String e5() {
		return dEPARTMENT;
	}
	public void e5(String department) {
		dEPARTMENT = department;
	}
	public String e6() {
		return dESIGNATION;
	}
	public void e6(String designation) {
		dESIGNATION = designation;
	}
	@Override
	public String toString() {
		
		return "Employee ID = " + iDeMPLOYEE + "\n" + "FullName = " + nAMEfULL + "\n" + "Address = " + aDDRESS + "\n"
				+ "Faculty Name = " + fACULTYnAME + "\n" + "Department = " + dEPARTMENT + "\n" + "Designation = "
				+ dESIGNATION;
	}
}
