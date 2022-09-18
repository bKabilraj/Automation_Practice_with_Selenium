package testNGPractice;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	@Test(enabled=true)
	public void primarySchool() {
		System.out.println("Primary");
	}
	@Test(dependsOnMethods = "primarySchool")
	public void secondarySchool() {
		System.out.println("Secondary");
	}
	@Test(dependsOnMethods = "secondarySchool")
	public void advanceLevel() {
		System.out.println("Advance Level");
	}
	@Test(dependsOnMethods = "advanceLevel")
	public void undergraduate() {
		System.out.println("Degree");
	}
	@Test(dependsOnMethods = "undergraduate")
	public void postgraduate() {
		System.out.println("Master Degree");
	}

}
