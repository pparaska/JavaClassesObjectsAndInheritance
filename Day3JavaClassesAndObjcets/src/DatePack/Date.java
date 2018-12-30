package DatePack;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.text.SimpleDateFormat;

public class Date {
	int date;
	int month;
	int year;

	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "["+date + "/" + month + "/" + year+"]";
	}

	public boolean isSmaller(Date date) {
		Date date1 = new Date(31, 12, 2018);
		if (date.date < date1.date)
			return true;
		return false;
	}

	public int[] difference(Date date) {

		Date date1 = new Date(31, 12, 2018);
		int newDate = date1.date - date.date;
		int newMonth = date1.month - date.month;
		int newYear = date1.year - date.year;
		int differenc[] = { newDate, newMonth, newYear };
		return differenc;
	}
}