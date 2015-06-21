package Task5;
/**
 * Class for date including day month and year by default year and month are 1
 * @author Dado
 *
 */
public class Date {

	protected int day;
	protected int month;
	protected int year;
	/**
	 * Date with given day, month and year
	 * @param day - from 1 to 31
	 * @param month - from 1 to 12
	 * @param year - anything above 0 
	 */
	public Date(int day, int month, int year) {

		if (day < 1 || month < 1 || year < 1) {
			System.out.println("No such date !");
		}
		if (day > 31
				&& (month == 1 || month == 3 || month == 5 || month == 7
						|| month == 8 || month == 10 || month == 12)) {
			System.out.println("Wrong day for given month !");
		} else if (day > 28 && month == 2) {
			System.out.println("February wrong day !!");
		} else if (day > 30
				&& (month == 4 || month == 6 || month == 9 || month == 11)) {

			System.out.println("Wrong day for given month !");
		}
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * creating a date with default month and year
	 * @param day - day in default month and year format
	 */
	public Date(int day) {
		this(day, 1, 1);
	}
	/**
	 * creating date with given day and month but default year
	 * @param day - given day 
	 * @param month - given month
	 */
	public Date(int day, int month) {
		this(day, month, 1);
	}

	public int getDay() {
		return day;
	}
	/**
	 * method to set a day
	 * @param day - day you would like to set in date 
	 */
	public void setDay(int day) {
		if (day < 1 || day > 31) {
			System.out.println("Wrong day");
		} else if (day > 31
				&& (month == 1 || month == 3 || month == 5 || month == 7
						|| month == 8 || month == 10 || month == 12)) {
			System.out.println("Wrong day for given month");
		} else if (day > 30
				&& (month == 4 || month == 6 || month == 9 || month == 11)) {
			System.out.println("Wrong day for given month");
		} else if (day > 28 && month == 2) {
			System.out.println("February");
		}
		this.day = day;

	}

	public int getMonth() {
		return month;
	}
	/**
	 * method to set month
	 * @param month - given month from 1 to 12
	 */
	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}
	/**
	 * method to set a year 
	 * @param year - given year have to be above 0
	 */
	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
		}
	}
	/**
	 * Method for day passed and if day goes above 31 day is 1 and month goes + 1
	 */
	public void dayPassed() {
		this.day += 1;
		if (day > 31) {
			this.day = 1;
			monthPassed();
		}
	}
	/**
	 * Method for month passed if goes above 12 year goes + 1
	 */
	public void monthPassed() {
		this.month += 1;
		if (month > 12) {
			this.month = 1;
			this.year += 1;
		}
	}
	// to string in format 00. 00. 0000.
	public String toString() {
		return String.format("%02d. %02d. %04d.", day, month, year);
	}

}
