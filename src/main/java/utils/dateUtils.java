package utils;

import java.util.Calendar;
import java.util.Date;

public class dateUtils {
	
	public static Date obterDataDiferenca(int dias) {
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, dias);
	    
	    return cal.getTime();
	    
	}

}
