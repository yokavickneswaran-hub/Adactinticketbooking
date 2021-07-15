package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("User in Adactin login page")
	public void user_in_Adactin_login_page() {
		launchBrowser();
		launch("https://adactinhotelapp.com/index.php");

	}

	@When("User enter username and password")
	public void user_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		PojoClass p = new PojoClass();
		fill(p.getUsername(), "wizardian123");
		fill(p.getPassword(), "wizardian123");
	}

	@When("User click login button")
	public void user_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

	@When("User select Location,Hotels ,Room Type ,Select Rooms,Check In,Check Out,Adults ,Children,Click Search button,select Hotel,continue,fill FName,LName,Address,CC_no,CC_Type,Expdate,CVV")
	public void user_select_Location_Hotels_Room_Type_Select_Rooms_Check_In_Check_Out_Adults_Children_Click_Search_button_select_Hotel_continue_fill_FName_LName_Address_CC_no_CC_Type_Expdate_CVV()
			throws InterruptedException {
		PojoClass p2 = new PojoClass();
		p2.getLocation().sendKeys("sydney");
		p2.getHotels().sendKeys("Hotel Hervey");
		p2.getRoom_type().sendKeys("Double");
		p2.getRoom_nos().sendKeys("1 - One");
		p2.getDatepick_in().clear();
		p2.getDatepick_in().sendKeys("21/07/2021");
		p2.getDatepick_out().clear();
		p2.getDatepick_out().sendKeys("29/07/2021");
		p2.getAdult_room().sendKeys("adult_room");
		p2.getChild_room().sendKeys("0");
//driver.findElement(By.id("Submit")).click();
//driver.findElement(By.id("radiobutton_0")).click();
//driver.findElement(By.id("continue")).click();
		applyWaitToAllLocators();
		p2.getSubmit().click();
		applyWaitToAllLocators();

		p2.getRadiobutton_0().click();
		p2.getContinuee().click();
		applyWaitToAllLocators();
		p2.getFirst_name().sendKeys("wiki");
		p2.getLast_name().sendKeys("R");
		p2.getAddress().sendKeys("Chennai");
		p2.getCc_num().sendKeys("123456789123456789");
		p2.getCc_type().sendKeys("American Express");
		p2.getCc_exp_month().sendKeys("April");
		p2.getCc_exp_year().sendKeys("2025");
		p2.getCc_cvv().sendKeys("333");
//		p2.getBook_now().click();
//		Thread.sleep(10000);
//		p2.getOrder_no();

	}

	@Then("User click Booknow and copy Orderno to console")
	public void user_click_Booknow_and_copy_Orderno_to_console() throws InterruptedException {
		PojoClass p3 = new PojoClass();
		p3.getBook_now().click();
		Thread.sleep(10000);
		p3.getOrder_no();
	}

}
