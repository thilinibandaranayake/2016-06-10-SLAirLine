package com.vikas.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver webDriver;
	
	public Home(WebDriver webDriver){
		this.webDriver=webDriver;
	}
	
	public By from = By.xpath("..//*[@id='suggest1']");
	public By to = By.xpath(".//*[@id='suggest2']");		
	public By Col = By.xpath("html/body/div[8]/ul/li[22]");
	public By Che = By.xpath("html/body/div[9]/ul']");
	public By searchbtn = By.xpath(".//*[@id='btnSearch']");
}
