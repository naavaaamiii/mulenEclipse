package com.gdg.rocky;


class UserDefinedUnchecked extends RuntimeException {
	 
    public UserDefinedUnchecked(String s) {
		// TODO Auto-generated constructor stub
    	super(s);
	}
    
 
}

public class UserDefinedUncheckedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throw new UserDefinedUnchecked("user unchecked");

	}

}
