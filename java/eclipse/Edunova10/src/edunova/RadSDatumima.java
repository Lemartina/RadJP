package edunova;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class RadSDatumima {

	public RadSDatumima() {
		Date d= new Date();
		
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		
		
		GregorianCalendar gc =(GregorianCalendar) Calendar.getInstance();
		gc.set(Calendar.YEAR, 2000);
		gc.set(Calendar.MONTH ,0);
		gc.set(Calendar.DAY_OF_MONTH, 1);
		gc.set(Calendar.SECOND, 1);
		
		System.out.println(gc.getTime());
		
		
		SimpleDateFormat df= 
				new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss");
		
		System.out.println(df.format(gc.getTime()));
	}
	
	public static void main(String[] args) {
		new RadSDatumima();
	}
}
