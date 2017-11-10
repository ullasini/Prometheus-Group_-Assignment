package Prometheus.assignment;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.wekpedia.page.Pageelementlists;
public class Wekpedia {

	@Test
	public void Test1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		Pageelementlists e = new Pageelementlists(driver);
		e.search("Puppies");
	    e.click_search();
		String actualTitle = driver.getTitle();
	    String expectedTitle = "Puppy - Wikipedia";
	    Assert.assertEquals(actualTitle, expectedTitle); 
	    driver.close();
	}

	@Test
	public void Test2() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		Pageelementlists e = new Pageelementlists(driver);
		e.search("Puppies");
	    e.click_search();
	    e.Hide_Button();
	    String actualTitle = driver.findElement(By.xpath("//*[@id=\"toc\"]/div/span/a")).getText();
	    String expectedTitle = "show";
	    Assert.assertEquals(actualTitle, expectedTitle); 
	    driver.close();
	}
	     

	@Test
	 public void Test3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		Pageelementlists e = new Pageelementlists(driver);
	    e.search("Puppies");
	    e.click_search();
	    e.Pup_Search("Franc");
	    //Auto Select
	    
	    /*List<WebElement> lst=driver.findElements(By.xpath("/html/body/div[6]/div/a[1]/div"));
        for(int i=0;i<lst.size();i++){
        String K = lst.get(i).getText();
        if (K == "France") {
        driver.findElement(By.xpath("/html/body/div[6]/div/a[1]/div")).click();	
        	
        }
	 }
        String actualTitle = driver.getTitle();
	    String expectedTitle = "France - Wikipedia";
	    Assert.assertEquals(actualTitle, expectedTitle); */
	}
}






