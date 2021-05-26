import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCalendar {
	public static void main(String[] args) throws ParseException {
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		System.out.println(timeStamp);
		
		System.out.println(Calendar.getInstance().getTime());
		
		// 문자로 된 날짜를 원하는 형식으로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = sdf.parse("2020-10-01");
		Calendar cal = sdf.getCalendar();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date2 = sdf2.parse("2020-11-21");
		Calendar cal2 = sdf2.getCalendar();
		
		System.out.println(cal.getTime());
		System.out.println(cal2.getTime());
		
		long time1 = cal.getTimeInMillis();
		long time2 = cal2.getTimeInMillis();
		
		long diffTime = time1-time2;
		long days = diffTime / 1000 / 60 / 60/ 24;
		System.out.println(days);
		
		
		
		
		
		
	}
}
