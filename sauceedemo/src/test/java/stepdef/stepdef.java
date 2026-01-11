package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import baseclass.browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.cartandcheckout;
import pom.login;
import pom.productpage;

public class stepdef{
	String prodname;
	login lp = new login(browser.dr);;
	productpage pp = new productpage(browser.dr);
	cartandcheckout cc = new cartandcheckout(browser.dr);
	
	@Given("site launched successfully")
	public void browser_launch() {
		browser.dr.get("https://www.saucedemo.com/");
	}
	
	@When("user enter valid credentials")
	public void user_Details() {
		lp.username("standard_user");
		lp.password("secret_sauce");
		lp.loginbtn();
	}
	
	@Then("user must logged in successfully")
	public void verify_login() {
		String expected = browser.dr.getTitle();
		Assert.assertEquals(expected, "Swag Labs");
	}
	
	@Given("product page opens")
	public void validateproductpage() {
		String expected = browser.dr.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		Assert.assertEquals(expected, "Products");
	}
	
	@When("user filter the products")
	public void dropdown_filter() {
		pp.dropdown();
	}
	
	@When("user add the first product")
	public void addfirstprod() {
		pp.addfirstprod();
		prodname = pp.firstprodname();
	}
	
	@When("user clicks on the cart button")
	public void cartbtn() {
		pp.movetocart();
	}
	
	@Then("user is on product cart page")
	public void prodcartpage() {
		Assert.assertEquals(pp.cartpagetitle(), "Your Cart");
	}
	
	@And("product added successfully")
	public void verifyproduct() {
		Assert.assertEquals(prodname, "Test.allTheThings() T-Shirt (Red)");
		
	}
	
	@Given("user is on cart page")
	public void cartpage() {
		Assert.assertEquals(cc.cartpagetitle(), "Your Cart");
	}
	
	@When("user clicks on checkout button")
	public void checkout() {
		cc.checkout();
	}
	
	@When("user enter shipping details")
	public void shipping_Details() {
		cc.shipping_Details("alex", "brawn", "101010");
	}
	
	@When("user clicks on continue button")
	public void continuebtn() {
		cc.continuebtn();
	}
	
	@When("user click on finish button")
	public void finish() {
		cc.finish();
	}
	
	@Then("item checked out successfully")
	public void ordersuccess() {
		Assert.assertEquals("Thank you for your order!", cc.successmsg());
	}
}