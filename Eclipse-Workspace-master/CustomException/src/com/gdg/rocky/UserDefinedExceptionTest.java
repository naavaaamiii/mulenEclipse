package com.gdg.rocky;


class UserDefinedException extends Exception {
	 
    UserDefinedException(String s) {
           super(s);
    }
 
}

public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
             throw new UserDefinedException("user defined exception was thrown ");
      } catch (UserDefinedException e) {
             e.printStackTrace();
      }

	}

}
