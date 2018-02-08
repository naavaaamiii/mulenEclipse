package com.gdg.rocky;

class AgeIllegalException extends Exception 
{
	public AgeIllegalException(String message)
	{
		super(message);
	}
}

public class StudentManager {
	
	static void validate(int age) throws AgeIllegalException
	{
		if(age < 18)
			throw new AgeIllegalException("not valid");
		else
		{
			System.out.println("Hi");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			validate(23);
		}
		catch(Exception e)
		{
			
		}
	}

}
