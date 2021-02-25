package historydata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	private Date date;
	private SimpleDateFormat previousFormat, currentFormat;
	
	public DateConverter() {
		previousFormat = new SimpleDateFormat("dd-MMM-yy");
		currentFormat = new SimpleDateFormat("dd-MMM-yyyy");
	}
	
	public String convertString(String input) {
		try {
			date = (Date) previousFormat.parse(input);
			System.out.println(currentFormat.format(date));
			input = currentFormat.format(date).toString();
			
			return input;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
