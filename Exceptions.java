package Assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		System.out.println("Hi!");
		
		if (numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		System.out.println("Bye!");
		
		/*
		 * Checked Exception - explicitly check for in our code.
		 * Try-Catch block - Handles checked exceptions.
		 * 
		 * 
		 * Unchecked Exception - Something we have control over and only occurs if we make,
		 * mistakes in coding. 
		 * 
		 * 
		 * 
		 */
		
		try {
			System.out.println(numbers[3]);
			System.out.println("In the try.");
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
			
		}
		//Avoid array exception try-catch
		
		
		try {
			FileReader fileReader = new FileReader("something.txt");
		} catch (FileNotFoundException e) { //When handling exceptions, move from specific to general class.
			e.printStackTrace();
		}catch(Exception e){
			
		}
		finally {
			System.out.println("In the finally.");
		}
		
		
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	} //End Main
	
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		
		System.out.println("In the 'openFile' method");	
		return new FileReader(fileName);
			
	}

} //End Exceptions Class
