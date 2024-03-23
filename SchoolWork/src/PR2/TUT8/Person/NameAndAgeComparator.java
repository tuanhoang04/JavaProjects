package PR2.TUT8.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;


public class NameAndAgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        int nameComparison = p1.name.compareTo(p2.name);
        if (nameComparison != 0) {
            return nameComparison; // If names are not equal, return name comparison result
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            // If names are equal, compare by age
            Date dob1 = null;
            try {
                dob1 = sdf.parse(p1.dateOfBirth);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            LocalDate d1 = dob1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Date dob2 = null;
            try {
                dob2 = sdf.parse(p2.dateOfBirth);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            LocalDate d2 = dob2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Compare years
            int yearComparison = Integer.compare(d1.getYear(), d2.getYear());
            if (yearComparison != 0) {
                return yearComparison;
            }

            // Compare months
            int monthComparison = Integer.compare(d1.getMonthValue(),d2.getMonthValue());
            if (monthComparison != 0) {
                return monthComparison;
            }

            // Compare days
            return Integer.compare(d1.getDayOfMonth(), d2.getDayOfMonth());
        }
    }
}
