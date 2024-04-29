package AdditionalFunctions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampCreation {
	public static void main(String[] args) {
		String TimeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	System.out.println("Current Date " +TimeStamp+".html");
	
	}	

}
