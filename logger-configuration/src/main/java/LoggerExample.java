import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import org.apache.log4j.Logger;

//import org.slf4j.Logger;
//import java.util.logging.Logger;
//import org.slf4j.LoggerFactory;

public class LoggerExample {
	public static void main(String[] args) throws Exception {
	Locale locale = new Locale("en","IN");
	
	// Logger logger = Logger.getLogger(LoggerExample.class.getName());
	//Logger logger = LoggerFactory.getLogger(DisplayCurrencyExample.class);
 Logger logger = Logger.getLogger(LoggerExample.class);
	  NumberFormat u= NumberFormat.getCurrencyInstance(locale);
	
	  logger.debug("debug");
	  logger.info("info");
	  logger.error("error");
	  logger.warn("warn");
			
	

	}
}
