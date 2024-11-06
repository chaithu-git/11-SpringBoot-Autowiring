package in.chaithanya.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MySqlReportDaoImpl implements ReportDao{
	
	public MySqlReportDaoImpl() {
		System.out.println("MySqlReportDaoImpl :: Constructor");
	}
	public String findData() {
		System.out.println("fetching report data from mysql DB..........");
		return "Report Data";
		
	}
	

}
