package Test_runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com_baseclass.Test_method;
import pom.Login;
import pom.Shoppage;

public class Login_page extends Test_method{
	public static WebDriver driver=Test_method.getbrowser("chrome");
	public static Login lp=new Login(driver);
	public static Shoppage sp=new Shoppage(driver);
	public static void main(String[] args) throws IOException, InterruptedException {
		
		geturl("http://automationpractice.com/");
		clickonelement(lp.getLogin());
		inputelement(lp.getEmail(),"mageshp84@gmail.com");
		inputelement(lp.getPassword(),"m@ge$hp84");
		clickonelement(lp.getSignin());
		maximize();
		screenshot("screenshot1");
		title();
		currenturl() ;
		clickonelement(sp.getDress());
		//jsexecuter();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.ScrollBy(0,4000)");
		clickonelement(sp.getAddcart());
	}

}
