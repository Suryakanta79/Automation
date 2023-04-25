package Pom;

import java.io.File;
import java.util.Date;
import java.util.Random;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class WebDriverUtility {


	 public String screenshot(WebDriver driver ,String Screenshots) throws Exception
	 {
		 TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\src\\main\\resources\\Screenhots"+Screenshots+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();
	 }
	 
	 public int getRandomNum()
		{
			Random r=new Random();
			int num = r.nextInt();
			return num;
		}
	 
	 public String getsystemDateFormat()
		{
			Date d=new Date();
			String[] da = d.toString().split(" ");
			String date=da[2];
			String month=da[1];
			String year=da[5];
			String time=da[3].replace(":", "-");
			String dateFormat=date+"_"+month+"_"+year+"_"+time;
			return dateFormat;
		}
	 
}
