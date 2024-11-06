package in.chaithanya.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao{
	
	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl  ::Constructor");
	}
	
	public String findData() {
		System.out.println("fetching data from Oracle DB.....");
		return "Report Data";
	}

}
