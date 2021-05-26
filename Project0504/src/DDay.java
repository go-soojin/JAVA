import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DDay {
	Calendar dDay;
	int days;

	DDay(String dateString) {
		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = sdf1.parse(dateString);
			this.dDay = sdf1.getCalendar();
		} catch (ParseException e) {
		}
	}

	public void calculationDDay() {
		long now = Calendar.getInstance().getTimeInMillis();
		long ddayTime = this.dDay.getTimeInMillis();

		long diffTime = now - ddayTime;
		this.days = (int) Math.ceil((double) diffTime / 1000 / 60 / 60 / 24);

	}

	@Override
	public String toString() {
		return "D-day : " + this.days;
	}
}