package practice_maven;

import org.testng.annotations.Test;

public class UpdateTest {
	
	@Test(groups = {"smoke"})
	public void updateProject()
	{
		System.out.println("project updated");
	}
	
	@Test(groups = {"regression"})
	public void deleteProject()
	{
		System.out.println("delete project.");
	}
	

}
