package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Application_Page extends TestBase {

	By username1 = By.xpath("//input[@name='uname']");
	By password1 = By.xpath("//input[@name='psw']");
	By loginbutton = By.xpath("//button[@type='submit']");
	By senderr = By.xpath("//input[@id='sender']");
	By to = By.xpath("//input[@id='receiver']");
	By sub = By.xpath("//input[@id='subject']");
	By msg = By.xpath("/html/body/div/form/div[2]/div[4]/label[2]/textarea");
	By submit = By.cssSelector("button.btn");
	By confirmmsg = By.xpath("/html/body");

	public Application_Page(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void mailtest(String user, String pass, String sender, String receiver, String subject, String message)
			throws InterruptedException {

		WebElement u = driver.findElement(username1);
		u.click();
		u.clear();
		u.sendKeys(user);
		Thread.sleep(1000); // for user to view
		WebElement p = driver.findElement(password1);
		p.clear();
		p.sendKeys(pass);
		Thread.sleep(1000); // for user to view
		driver.findElement(loginbutton).click();

		Thread.sleep(1000); // for user to view

		WebElement s = driver.findElement(senderr);
		s.clear();
		s.sendKeys(sender);
		Thread.sleep(1000); // for user to view
		WebElement t = driver.findElement(to);
		t.clear();
		t.sendKeys(receiver);
		Thread.sleep(1000); // for user to view
		WebElement subb = driver.findElement(sub);
		subb.clear();
		subb.sendKeys(subject);
		Thread.sleep(1000);
		
			WebElement m = driver.findElement(msg);
			m.clear();
			m.sendKeys(message);
		
		Thread.sleep(1000);

		driver.findElement(submit).click();
		Thread.sleep(1000);

		String done = driver.findElement(confirmmsg).getText();
		System.out.println(done);

		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);

	}

}
