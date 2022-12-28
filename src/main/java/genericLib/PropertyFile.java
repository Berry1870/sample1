package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String getPropertydata (String key) throws IOException
	{
		//create object for inbuilt Properties class
		Properties p = new Properties();
		//create object for inbuilt FileInputStream class
		FileInputStream fis = new FileInputStream (AutoConstant.propertyfilePath);
		
		p.load(fis);
		//return key
		return p.getProperty(key);
		
		
	}
	

}
