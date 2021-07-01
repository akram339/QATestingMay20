package com.qa.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void testaddressbook() throws InterruptedException
	{
		 //WebDriver driver    = new ChromeDriver();
		 WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		 driver.get("http://18.216.38.119:49153/addressbook/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("Tom");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Mathews");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]/input")).sendKeys("991239");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/input")).sendKeys("abc@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[6]/td[3]/div/input")).sendKeys("5/9/21,");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
		 Thread.sleep(3000);
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 driver.close();
	}
}
