package QKTraining.CalcilatorAPIDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingSubtractionTestCases 
{
	Calculator cal;
	int result;
	
	@BeforeGroups("RegressionTest")
	public void InitGroup()
	{
		 System.out.println("I am in Before Group");
		 cal=new Calculator();
	}	 
	
	@BeforeClass
	public void Init()
	{
		cal=new Calculator();
	}
	
	@BeforeMethod
	public void ReInitialise()
	{
		result=0;
	}
	@Test(priority=1,groups= {"RegressionTest"})
	public void TestSubtractionWithPositiveNumbers()
	{
	    result=cal.Subtraction(50, 10);
		Assert.assertEquals(result, 40,"Subtraction does not work with positive numbers");
	}
	
	@Test(priority=2)
	public void TestSubtractionWith1Positive1NegativeNumber()
	{
	    result=cal.Subtraction(50, -10);
		Assert.assertEquals(result, 60,"Subtraction does not work with 1 positive and 1 negative number");
	}
	
	@AfterClass
	public void TearDown()
	{
		cal=null;
	}
		

}






