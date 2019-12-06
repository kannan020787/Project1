import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anisha k\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.toolsqa.com/automation-practice-form/");
//	 WebElement m = driver.findElement(By.id("month"));
//	 Select s = new Select(m);
//	 boolean multiple = s.isMultiple();
//	 System.out.println(multiple);
//	 
	 WebElement s = driver.findElement(By.id("selenium_commands"));
	 Select d = new Select(s);
	 List<WebElement> l = d.getOptions();
	 for (int i = 0; i < l.size(); i++)
	if(i%2==1) {
		 
		WebElement b = l.get(i);
		String g = b.getText();
		//d.selectByVisibleText(g);
		System.out.println(g);
		
	}
	}
	 
	 
}


