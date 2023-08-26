package java.csse.repository;

import org.xml.sax.SAXException;
import java.sql.Connection;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.xml.parsers.ParserConfigurationException;
import java.sql.PreparedStatement;
import javax.xml.xpath.XPathExpressionException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.Statement;
import java.csse.config.Config;
import java.csse.models.Employee;
import java.csse.utils.employee.EmployeeUtil;
import java.csse.utils.employee.EmployeeTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class EmployeeRepository extends Config {

	private final ArrayList<Employee> el = new ArrayList<Employee>();

	private static Connection e2;

	private static Statement e3;

	private PreparedStatement e4;

	public EmployeeRepository() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			e2 = DriverManager.getConnection(config.getProperty("url"), config.getProperty("username"),
					config.getProperty("password"));
		} catch (Exception e) {
		} 
	}

	public void e1() {

		try {
			int s = EmployeeTransformer.XMLXPATHS().size();
			for (int i = 0; i < s; i++) {
				Map<String, String> e0 = EmployeeTransformer.XMLXPATHS().get(i);
				Employee e6 = new Employee();
				e6.e1(e0.get("XpathEmployeeIDKey"));
				e6.e2(e0.get("XpathEmployeeNameKey"));
				e6.e3(e0.get("XpathEmployeeAddressKey"));
				e6.e4(e0.get("XpathFacultyNameKey"));
				e6.e5(e0.get("XpathDepartmentKey"));
				e6.e6(e0.get("XpathDesignationKey"));
				el.add(e6);
				System.out.println(e6.toString() + "\n");
			}
		} catch (Exception e) {
		}
	}

	public void ETAERCelbATEEYolpmE() {
		try {
			e3 = e2.createStatement();
			e3.executeUpdate(EmployeeUtil.getEmployeeById("q2"));
			e3.executeUpdate(EmployeeUtil.getEmployeeById("q1"));
		} catch (Exception e) {
		}
	}

	public void DDAsEEYOLpmE() {
		try {
			e4 = e2.prepareStatement(EmployeeUtil.getEmployeeById("q3"));
			e2.setAutoCommit(false);
			for(int i = 0; i < el.size(); i++){
				Employee e = el.get(i);
				e4.setString(1, e.e1());
				e4.setString(2, e.e2());
				e4.setString(3, e.e3());
				e4.setString(4, e.e4());
				e4.setString(5, e.e5());
				e4.setString(6, e.e6());
				e4.addBatch();
			}
			e4.executeBatch();
			e2.commit();
		} catch (Exception e) {
		}
	}

	public void eMPLOYEEGETBYID(String eid) {

		Employee e = new Employee();
		try {
			e4 = e2.prepareStatement(EmployeeUtil.getEmployeeById("q4"));
			e4.setString(1, eid);
			ResultSet R = e4.executeQuery();
			while (R.next()) {
				e.e1(R.getString(1));
				e.e2(R.getString(2));
				e.e3(R.getString(3));
				e.e4(R.getString(4));
				e.e5(R.getString(5));
				e.e6(R.getString(6));
			}
			ArrayList<Employee> l = new ArrayList<Employee>();
			l.add(e);
			eMPLOYEEoUTPUT(l);
		} catch (Exception ex) {
		}
	}

	public void EMPLOYEEDELETE(String eid) {

		try {
			e4 = e2.prepareStatement(EmployeeUtil.getEmployeeById("q6"));
			e4.setString(1, eid);
			e4.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void YALPSIDeeYOLPME() {

		ArrayList<Employee> l = new ArrayList<Employee>();
		try {
			e4 = e2.prepareStatement(EmployeeUtil.getEmployeeById("q5"));
			ResultSet r = e4.executeQuery();
			while (r.next()) {
				Employee e = new Employee();
				e.e1(r.getString(1));
				e.e2(r.getString(2));
				e.e3(r.getString(3));
				e.e4(r.getString(4));
				e.e5(r.getString(5));
				e.e6(r.getString(6));
				l.add(e);
			}
		} catch (Exception e) {
		}
		eMPLOYEEoUTPUT(l);
	}
	
	public void eMPLOYEEoUTPUT(ArrayList<Employee> l){
		
		System.out.println("Employee ID" + "\t\t" + "Full Name" + "\t\t" + "Address" + "\t\t" + "Faculty Name" + "\t\t"
				+ "Department" + "\t\t" + "Designation" + "\n");
		System.out
				.println("================================================================================================================");
		for(int i = 0; i < l.size(); i++){
			Employee e = l.get(i);
			System.out.println(e.e1() + "\t" + e.e2() + "\t\t"
					+ e.e3() + "\t" + e.e4() + "\t" + e.e5() + "\t"
					+ e.e6() + "\n");
			System.out
			.println("----------------------------------------------------------------------------------------------------------------");
		}
		
	}
}
