package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='searchbar-view']//input")).sendKeys("Bags",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		
		String totalItems = driver.findElement(By.className("length")).getText();
		
		System.out.println("Total number of items : " + totalItems);
		
		System.out.println("List of items ");
		
		
        List<WebElement> bagBrandList = driver.findElements(By.className("brand"));

		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		List<WebElement> bagNameList = driver.findElements(By.className("nameCIs"));
		
		System.out.println(" Size :" + bagNameList.size());
		
		System.out.println(" Names of the Bags");
		
		for (WebElement webElement : bagNameList) {
		
			String text = webElement.getText();
			
			System.out.println(text);
		}		
	}

	}


