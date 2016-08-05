package com.bitwise.assign2;


import java.util.HashMap;

public class UserData 
{
	HashMap<String,String> pq = new HashMap<String, String>();
	
	public  UserData()
	{
		pq.put("surabhi", "asd123");
		pq.put("devyani", "dev32");
		pq.put("kalpana", "pOss55");
		pq.put("mayank", "mew23");
		pq.put("akshay", "akii90");
		pq.put("danny", "dc@34");
		
		
	}
	

	    
	public boolean returnKeyValue(String key,String value)
	{
		if(pq.containsKey(key)&& pq.containsValue(value))
			return true;
		else
			return false;
	}
	
	    
	    
	
	public static void main(String[] args)
	{
		UserData ud = new UserData();
		
		
	}

	

}
