package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MagentoLoginDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\ABC FOR JAVA TESTING\\Desktop\\NovemberBatch1\\HybridDrivenframework\\src\\com\\abc\\utilities\\hybriddrivenframework.properties");
		Properties p = new Properties();
		p.load(fis);
		
	/* for loading the Data */
	   String urlData = p.getProperty("url");
	String usernameData = p.getProperty("username1");
	 String passwordData = p.getProperty("password1");
	
	 /* for loading the Keywords */
		String myacctKey = p.getProperty("myacct");
		String usernameKey = p.getProperty("username");
	String passwordKey = p.getProperty("password");
	String loginKey = p.getProperty("login");
	String logoutKey = p.getProperty("logout");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get(urlData);
	driver.findElement(By.xpath(myacctKey)).click();
	driver.findElement(By.xpath(usernameKey)).sendKeys(usernameData);
	driver.findElement(By.xpath(passwordKey)).sendKeys(passwordData);
	driver.findElement(By.xpath(loginKey)).click();
	driver.findElement(By.xpath(logoutKey)).click();
	driver.quit();
	}

}
