package QKTraining.CalcilatorAPIDemo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
//import junit.framework.Assert;

public class AdditionTestCases 
{
	Calculator obj;
	int result;
	
	@BeforeGroups("RegressionTest")
	public void InitGroup()
	{
		 System.out.println("I am in Before Group");
		 obj=new Calculator();
	}	
	
	@BeforeClass
	public void Init()
	{
		 System.out.println("I am in Before class");
		 obj=new Calculator();
	}
	
	@BeforeMethod
	public void ReInitialiseResultVar()
	{
		System.out.println("I am in Before Method");
		result=0;
	}
	
	@Test(priority=1,groups= {"RegressionTest"})
	public void TestAdditionWithPositiveNumbers()
	{

		System.out.println("First test case");
	    result=obj.Addition(10,20);
		Assert.assertEquals(result, 30,"Addiion does not work with positive numbers");	
	}
	@Test(priority=2,groups= {"RegressionTest"})
	public void TestAdditionWithZeros()
	{
		System.out.println("Second Test Case");
	    result=obj.Addition(0,0);
		Assert.assertEquals(result, 0,"Addiion does not work with Zeros");	
	}
//	@Test(priority=3)
//	public void TestAdditionWithOnePositiveOneNegative()
//	{
//		System.out.println("Third Test case");
//	    result=obj.Addition(10, -8);
//		Assert.assertEquals(result, 2,"Addition does not work with 1 positive and 1 negative number");
//	}
	
	@AfterClass
	public void TearDown()
	{
		System.out.println("I am in after class");
		obj=null;
		
	}

}
