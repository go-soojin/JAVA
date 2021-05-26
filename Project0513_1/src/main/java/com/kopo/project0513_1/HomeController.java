package com.kopo.project0513_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kopo.project0513_1.DBCommon;
import com.kopo.project0513_1.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat_sj\\project0513_1.db", "student");
		db.createTable(new Student());
		model.addAttribute("message", "테이블이 생성되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("name") String name
			, @RequestParam("middle") String middle
			, @RequestParam("final") String finalString) {
		int middleNumber = Integer.parseInt(middle);
		int finalNumber = Integer.parseInt(finalString);
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat_sj\\project0513_1.db", "student");
		db.insertData(new Student(name, middleNumber, finalNumber));
		model.addAttribute("message", "데이터가 삽입되었습니다.");
		return "message";
	}

	
}
