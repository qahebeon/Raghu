package DataproviderAnnotation;

import org.testng.annotations.DataProvider;

public class DataproviderMultipledata {

	@DataProvider
	public Object[][] gmaildata()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "raghusiddi";
		data[0][1] = 12345678;
		data[1][0] = "saisathvik";
		data[1][1] = 87654321;
		return data;

	}

	@DataProvider
	public Object[][] yahoodata()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "raghu_siddi";
		data[0][1] = 12345678;
		data[1][0] = "sairithvik";
		data[1][1] = 87654321;
		return data;
	}
	
	@DataProvider
	public Object[][] hebeondata()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "hebeonstudent";
		data[0][1] = "Hb123!@#";
		data[1][0] = "shalini";
		data[1][1] = "medha";
		return data;
		
	}

}

