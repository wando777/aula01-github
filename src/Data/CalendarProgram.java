package Data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarProgram {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d = Date.from(Instant.parse("1993-06-15T12:30:30Z"));
	
//		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		int minutes = cal.get(Calendar.MINUTE);
		int mes = cal.get(Calendar.MONTH)+1;
		
		d = cal.getTime();
		System.out.println(d);
		System.out.println(minutes);
		System.out.println(mes);
	}
	
}
