package week5.day1;

import org.testng.annotations.Test;

public class PriorityTestNg {

	@Test (priority=1)
	public void createleadsMethod() {
		// TODO Auto-generated method stub
System.out.println("1");
	}
	@Test (priority=3)
	public void deleteleadsmethod() {
		System.out.println("3");
	}

	@Test (priority=2)
	public void editleadsmethod() {
		System.out.println("2");
	}
	
}
