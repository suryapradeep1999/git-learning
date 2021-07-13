package JavaA3;
import java.util.Objects;
public class Dates {
	int day;
	int month;
	int year;
	
	public int hashCode() {
		return Objects.hash(day,month);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dates other = (Dates) obj;
		return day == other.day && month == other.month;
	}

	public Dates(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return  day + "-" + month + "-" + year;
	}
}
