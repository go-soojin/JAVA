import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExecClass {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf1.parse("2021-05-06");
		Calendar cal1 = sdf1.getCalendar();

		long time = Calendar.getInstance().getTimeInMillis();
		long time1 = cal1.getTimeInMillis();

		long diffTime = time1 - time;
		long days = diffTime / 1000 / 60 / 60 / 24;
		
		System.out.println(days);

	}
}
