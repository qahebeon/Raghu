package DataproviderAnnotation;

import org.testng.annotations.Test;

public class DataproviderDemo {
	
	@Test(dataProviderClass = DataproviderMultipledata.class , dataProvider = "gmaildata")
	public void readgmail(String s, int i){
		System.out.println(s);
		System.out.println(i);
		
	}

	@Test(dataProviderClass = DataproviderMultipledata.class , dataProvider = "yahoodata")
	public void readyahoo(String x,int y){
		System.out.println(x);
		System.out.println(y);
	}
}
