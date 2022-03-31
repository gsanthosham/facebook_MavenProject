package com.facebook.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openUrl() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("httpt://www.facebook.com");
	}
	
	public void userName() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gomu.2008@gmail.com");
			
	}

	public void password() {
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("GomathyQt");
	
	}

	public void loginButton() {
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	public void verifyLogin() {
		
		System.out.println("Login successfully");
	
	}
	
	

}
