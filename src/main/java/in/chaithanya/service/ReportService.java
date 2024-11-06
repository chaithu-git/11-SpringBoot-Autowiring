package in.chaithanya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.chaithanya.dao.ReportDao;

@Service
public class ReportService {
	
	private ReportDao reportDao;
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("oracle") 
	 * public void setReportDao(ReportDao reportDao) {
	 * System.out.println("setReportDao() method call.....");
	 * this.reportDao=reportDao; }
	 */
	
	/*
	 * // public ReportService() { //
	 * System.out.println("ReportService :: 0-param Constructor called"); // }
	 */	
	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: Param Constructor called...");
		this.reportDao=reportDao;	
	}
	public void genarateReport() {
		String findData=reportDao.findData();
		 System.out.println("genarating report..........");
		
	}
	

}

