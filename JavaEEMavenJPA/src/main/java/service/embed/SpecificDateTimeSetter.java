package service.embed;
import java.util.Calendar;
import java.util.Date;

public class SpecificDateTimeSetter {
   
	private Date specificDateTime;

    public void setSpecificDateTime(int year, int month, int day, int hour, int minute, int second, int milliseconds) {
        // Create a Calendar instance and set the specific date and time
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, second);
        calendar.set(Calendar.MILLISECOND, milliseconds); // Set the milliseconds part
        
        // Convert the Calendar date and time to a Date
        specificDateTime = calendar.getTime();
    }

    public Date getSpecificDateTime() {
        return specificDateTime;
    }
}
