package Assignments;

public interface Logger {
	
	/*
	 * Create an interface when you know "What" you want to happen, but not "How" that thing will be
	 * implemented.
	 * 
	 * An interface is like a contract.
	 * 
	 * When a Class implements an interface it has to create a concrete implementation of each
	 * of the methods defined in the interface.
	 * 
	 * Industry Common Rule: Always code to interfaces first then code the implementing class.
	 * 
	 */
	
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();

}
