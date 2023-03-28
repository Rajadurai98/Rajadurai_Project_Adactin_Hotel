package org.Auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Project_Auto {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		// username
		WebElement usernametxt = driver.findElement(By.id("username"));
		usernametxt.sendKeys("Rajadurai24");
		// password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Rajdura1998$");
		// login button
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		// location dropdown
		WebElement locadd = driver.findElement(By.id("location"));
		Select locationdd = new Select(locadd);
		locationdd.selectByVisibleText("Sydney");

		// Hotels dropdown
		WebElement hoteldd = driver.findElement(By.id("hotels"));
		Select hotelsdd = new Select(hoteldd);
		hotelsdd.selectByIndex(1);

		// hotel roomtype
		WebElement roomtypedd = driver.findElement(By.id("room_type"));
		Select roomtydd = new Select(roomtypedd);
		roomtydd.selectByIndex(1);

		// number of room dropdown
		WebElement numodd = driver.findElement(By.id("room_nos"));
		Select numsdd = new Select(numodd);
		numsdd.selectByIndex(1);

		// Check in date
		WebElement cid = driver.findElement(By.id("datepick_in"));
		cid.sendKeys("03/09/2002");

		// check out date
		WebElement cod = driver.findElement(By.id("datepick_out"));
		cod.sendKeys("04/09/2002");

		// Aduts per room
		WebElement apr = driver.findElement(By.id("adult_room"));
		Select aprdd = new Select(apr);
		aprdd.selectByIndex(2);

		// Childs per room
		WebElement cpr = driver.findElement(By.id("child_room"));
		Select cprdd = new Select(cpr);
		cprdd.selectByIndex(2);

		// Search button
		WebElement searchdd = driver.findElement(By.id("Submit"));
		searchdd.click();

		// radio btn
		WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
		radioBtn.click();

		// searchBtn
		WebElement searchbtn = driver.findElement(By.id("continue"));
		searchbtn.click();

		// Firstname txt
		WebElement firstNameTxt = driver.findElement(By.id("first_name"));
		firstNameTxt.sendKeys("Rajadurai");

		// Lastname txt
		WebElement lastNameTxt = driver.findElement(By.id("last_name"));
		lastNameTxt.sendKeys("Selvaraj");

		WebElement billaddtxt = driver.findElement(By.id("address"));
		billaddtxt.sendKeys("No-48 Brindavan Garden 3rd Steert");

		// Credit Card no
		WebElement ccn = driver.findElement(By.id("cc_num"));
		ccn.sendKeys("0111444422223333");

		// Credit Card type
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select cctdd = new Select(cct);
		cctdd.selectByIndex(1);

		// Expiry date
		WebElement ed = driver.findElement(By.id("cc_exp_month"));
		Select eddd = new Select(ed);
		eddd.selectByIndex(2);

		// Expiry month
		WebElement Em = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select emdd = new Select(Em);
		emdd.selectByIndex(2);

		// cvv number
		WebElement cvnum = driver.findElement(By.id("cc_cvv"));
		cvnum.sendKeys("123");

		// book now btn
		WebElement bookNowBtn = driver.findElement(By.xpath("//*[@id=\"book_now\"]"));
		bookNowBtn.click();
//
//		// my_itinerary
		WebElement my_itinerarybtn = driver.findElement(By.xpath("//input[@type='button'][2]"));
		my_itinerarybtn.click();

		/*
		 * // //Select Hotel WebElement selectRadiobtn =
		 * driver.findElement(By.xpath("//*[@id=\"radiobutton_1\"]"));
		 * selectRadiobtn.click();
		 * 
		 * // Continue button WebElement continebtn =
		 * driver.findElement(By.xpath("//*[@id=\"continue\"]")); continebtn.click();
		 */
		
		//Booked itineray
		WebElement bookeditenery=driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		bookeditenery.click();
		
		//ScreenShot of Booked Itinerary
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\User\\eclipse-workspace\\Project_Adactin\\pic\\booked_itinerary.png");
		FileHandler.copy(src, des);

	}

}
