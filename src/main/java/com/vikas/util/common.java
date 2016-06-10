package com.vikas.util;

//import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class common {
	WebDriver webDriver;
	WebElement webElement;
	
public void Common(WebDriver webDriver) {
		this.webDriver=webDriver;
}
	
public void click(By element){
			webElement= webDriver.findElement(element);
			webElement.click();
}
		
public void Select(String msg,By element) {
	webElement= webDriver.findElement(element);
	webElement.sendKeys(msg);	
    }
}
	


