import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneXR {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.141.59\\libs");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement wb=driver.findElement(By.xpath("//input[@type='text']"));
		wb.sendKeys("iphone");
		WebElement wb1=driver.findElement(By.xpath("//input[\"@type=submit\"]/following-sibling::i[\"@class=nav-icon nav-sprite\"]"));
		wb1.click();

	}

}
