package com.jspider.sample;

import java.util.ArrayList;

public class Collections { 
	
	static ArrayList l=new ArrayList();
	public static void main(String[] args)
	{
		l.add("monika");
		l.add("mahadevu");
		//System.out.println(l);
		Collections c=new Collections();
		//c.display();
		c.remove("mahadevu");
		c.display();
		
	}
	public static void display()
	{
		for(Object name:l) {
			System.out.println(name);
		}
	}

	public static  void remove(String name)
	{
		l.remove(name);
	}
}
