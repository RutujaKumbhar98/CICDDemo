package QKTraining.CalcilatorAPIDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestMultiplication 
{
	Calculator cal;
	int result;
	@BeforeClass
	public void Init()
	{
		cal=new Calculator();
	}
	@BeforeMethod
	public void ReInitialiseResult()
	{
		result=0;
	}
	@Test(priority=1,dataProvider="ProvidePositiveValues",groups= {"RegressionTest"})
	public void TestMultiplicationWithPositiveValues(int num1,int num2,int expectedResult)
	{
		result=cal.Multiplication(num1,num2);
		Assert.assertEquals(result, expectedResult,"Multiplication does not work with positive numbers");
	}
	
	@DataProvider
	public Object[][] ProvidePositiveValues()
	{
		/*
		 * 1.SET1:	1,2,2 
		 * 2.SET2:	10,20,200
		 * 3.SET3:	1000 2000 2000000
		 */
		Object[][] SetOfValues=new Object[4][3];
		
		//SET1:
		SetOfValues[0][0]=1;
		SetOfValues[0][1]=2;
		SetOfValues[0][2]=2;
		
		//SET2
		SetOfValues[1][0]=10;
		SetOfValues[1][1]=20;
		SetOfValues[1][2]=200;
		
		//SET3
		SetOfValues[2][0]=1000;
		SetOfValues[2][1]=2000;
		SetOfValues[2][2]=2000000;
		
		//SET4
		SetOfValues[3][0]=100;
		SetOfValues[3][1]=200;
		SetOfValues[3][2]=20000;
		
		return SetOfValues;
	}
	

}
