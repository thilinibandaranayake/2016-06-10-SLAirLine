package com.vikas.util;

//import java.security.PublicKey;
//import java.sql.Driver;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vikas.objects.Home;

public class base {

	public static WebDriver webDriver;
	public static common common;
	public static Home homepgobj;
	
	@ BeforeClass
	
	public static void setup() {
		webDriver = new FirefoxDriver();
		webDriver.get("http://www.srilankan.com/ws/lk");
		homepgobj = new Home(webDriver);
		common = new common();
	}

}
