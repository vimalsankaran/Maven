package automation_reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
	
public static Properties p;
	
	public  Config_Reader() throws Throwable {
		File f = new File("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\src\\main\\java\\propertyfile\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	 
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getmsg() {
		String msg = p.getProperty("msg");
		return msg;
	}

}
