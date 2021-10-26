package TestNGdemo;

import org.testng.annotations.Test;

public class testng001 {

	
	@Test (groups = {"P1"})
	public void TS004()
	{
		System.out.println("TS004 Method...........");
	}
	
	@Test (enabled = false)
	public void Inbox()
	{
		System.out.println("Inbox Method...........");
	}
	
	
	@Test (groups = {"P2"})
	public void Oubox()
	{
		System.out.println("Outbox Method...........");
	}
	

}
