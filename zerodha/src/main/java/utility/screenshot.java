package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void takess(WebDriver driver,String name) throws IOException {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("__ddMMyyyy_HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String date=dtf.format(now);	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination =new File("\"D:\\Software testing\\selenium\\zerodha\\screenshot\""+name+date+"jpg");
	
	FileHandler.copy(source, destination);
	
}
}
