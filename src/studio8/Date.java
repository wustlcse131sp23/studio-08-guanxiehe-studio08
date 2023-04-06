package studio8;

import java.util.Objects;

public class Date {
private int year;
private int month;
private int day;
private boolean holiday;


public Date(int year, int month, int day, boolean holiday)
{
	this.year = year;
	this.month = month;
	this.day = day;
	this.holiday = holiday;
}

public static String date(int year, int month, int day, boolean holiday)
{
	return year + " " + month + " " + day;
}
	@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
}

	public static void main(String[] args) {
date(2023, 3, 21, false);
    }

}
