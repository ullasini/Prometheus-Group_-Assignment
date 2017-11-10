package com.wekpedia.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageelementlists {

	 WebDriver driver;
	 
	 By Search = By.xpath("//*[@id=\"searchInput\"]");
	 By clicksearch = By.xpath("//*[@id=\"search-form\"]/fieldset/button/i");
	 By HideButton  = By.xpath("//*[@id=\"toc\"]/div/span/a");
	 By Pup_Search  = By.name("search");

	 public Pageelementlists (WebDriver driver) {
		this.driver = driver;
	}

	   public void search(String k){
		  driver.findElement(Search).sendKeys(k);
		  
	   }

	public void click_search() {
		driver.findElement(clicksearch).click();
	}
	 
	public void Hide_Button() {
		 driver.findElement(HideButton).click();
	 }

	public void Pup_Search(String s) {
		driver.findElement(Pup_Search).sendKeys(s);
	}

}
