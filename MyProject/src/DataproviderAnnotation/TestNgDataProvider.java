package DataproviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {

	@Test(dataProvider = "getdata")
	public void readData(String s , int i) {
		System.out.println(s);
		System.out.println(i);
		

	}
	
	@Test(dataProvider = "testdata")
	public void testdata(String str, int x,int y){
		System.out.println(str);
		System.out.println(x);
		System.out.println(y);

	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "raghu";
		data[0][1]= 111;
		data[1][0]= "siddi";
		data[1][1]= 222;

		return data; 
	}

	@DataProvider
	public Object[][] testdata()
	{
		Object[][] data = new Object[3][3];
		data[0][0]= "sathvik";
		data[0][1]= 1;
		data[0][2]= 111;
		data[1][0]= "rithvik";
		data[1][1]= 2;
		data[1][2]= 222;
		data[2][0]= "santhu";
		data[2][1]= 3;
		data[2][2]= 333;

		return data;

	}

}

