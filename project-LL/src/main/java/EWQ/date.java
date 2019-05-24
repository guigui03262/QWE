package EWQ;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class date {

	private String getDateTime() {
		
	    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    return dateFormat.format(date);
	}
}
