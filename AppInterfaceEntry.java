package Assignments;

import java.util.ArrayList;
import java.util.List;

public class AppInterfaceEntry {
	
	public static Logger Logger;

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); //Interface on the left side and class name on the right.
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("This is an error");
		logger.fatal("fatal error");
		
		logger.close();
		
		setLogger(new FileLogger());
		setLogger(new ConsoleLogger());
		
		
	}// End of Main
	
	private static void setLogger(Logger l) {
		
		Logger = l;
		
	}

} // End of AppInterfaceEntry Class
