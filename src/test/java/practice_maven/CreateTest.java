package practice_maven;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups = {"regression"})
	public void create()
	{
		System.out.println("Project successfully created");
	}
	
	@Test(groups = {"smoke"})
	public void validates()
	{
		System.out.println("Project successfully validated");
	}

}
