package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenioum\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
}
