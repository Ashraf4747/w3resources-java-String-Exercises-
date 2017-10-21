package String;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateAndTime {

	public static void date () {
		//set the formating for the date and the time like that YYYY/MM/dd not DD 
		// set The time formating like that hh not HH ss NOT SS and millisecond SSS
		
		
		//String to set the formation 
		String dateFormat = "YYYY/MM/dd  hh:mm:ss:SSS";
		// to format the date using the dateFomat Variable , can set the formation as A parameter in new SimpleFormat ()
		SimpleDateFormat SDF = new SimpleDateFormat (dateFormat);
		// get the local or the current date from yout device
		Date date = new Date ();
		// get .format from simpledateformat object and put the date from Date object to format it as the formation from
		// dateFormat Stirng vaiable
		String format = SDF.format(date);
		// output the formation from format variable 
		System.out.println(format);
	}

public static void main (String [] args) {
	//call function
	date();
}



}
