package packageJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class userDefineException extends Exception{//user define exception 
	userDefineException(String message){//constructor
		super(message);//call parent class constructor which accept string as argument
	}
}

public class ExceptionTest {
	public static void main(String[] args) throws Exception {
		int a=10;
		int b=2;
		String s="deepak";
		int arr[]= {4,5,4,6,4};
		int age=16;
		System.out.println("before exception");
		System.out.println(System.getProperty("user.dir"));
		FileInputStream inf=new FileInputStream(System.getProperty("user.dir")+"\\src\\packageJava\\Constructor.java");
//		if(age<18) {
//			throw new userDefineException("age is less than 18");
		//}
		try{
			System.out.println("try block before exception");
		    System.out.println(a/b);
		    System.out.println(s.charAt(1));
		    System.out.println(arr[3]);
		    FileInputStream in=new FileInputStream(System.getProperty("user.dir")+"\\src\\packageJava\\Overriding.java");
		    if(age<18) 
				throw new userDefineException("age is less than 18");
		    System.out.println("try block after exception");
		}
	catch(ArithmeticException e){
		     System.out.println("divided by zero not possible ");
		     System.out.println(e.getMessage());
		     e.printStackTrace();
	    }
		catch(NullPointerException e) {
			System.out.println("String value is null");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("searching outside of array lenth");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(userDefineException e) {//handle the user define exception/custom exception
			System.out.println("age is less than 18");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("please check the code");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block executed");
			
		}
		    System.out.println("last line code");
	}

}
