package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J20210427_01_empList {

	public static void main(String[] args) {
		//사원테이블에서 연봉이 10000 이상인 사원 조회
		//연봉의 내림차순으로 정렬
		//EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, SALARY 조회
		Connection con=DBConn.getConn();
		List<EmployeesDTO> elist=new ArrayList<>();
		try {
			Statement st=con.createStatement();
			String sql="SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, SALARY\r\n" + 
					"FROM EMPLOYEES WHERE SALARY>=10000 ORDER BY SALARY DESC";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int employee_id=rs.getInt("employee_id");
				String first_name=rs.getString("first_name");
				Date hire_date=rs.getDate(3);
				//String hire_date=rs.getString(3);
				int salary=rs.getInt(4);
				EmployeesDTO emp=new EmployeesDTO(employee_id, first_name, hire_date, salary);
				elist.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("SQL문 예외");
			e.printStackTrace();
		}
		//출력
		for(EmployeesDTO e:elist) {
			System.out.println(e.getEmployee_id()+" "+e.getFirst_name()+" "+e.getHire_date()+" "+e.getSalary());
		}
		
	}

}
