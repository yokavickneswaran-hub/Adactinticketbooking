package org.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

//	public WebElement getTxtEmail() {
//		return txtEmail;
//	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	@CacheLookup
	@FindBy(id = "email")
	private WebElement txtEradiobutton_0mail;
	@FindBy(id = "pass")
	private WebElement txtpass;
	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(name = "location")
	private WebElement location;
	@FindBy(name = "hotels")
	private WebElement hotels;
	@FindBy(name = "room_type")
	private WebElement room_type;
	@FindBy(name = "room_nos")
	private WebElement room_nos;

	@FindBy(name = "adult_room")
	private WebElement adult_room;
	@FindBy(name = "child_room")
	private WebElement child_room;

	@FindBy(name = "first_name")
	private WebElement first_name;
	@FindBy(name = "last_name")
	private WebElement last_name;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement cc_num;
	@FindBy(name = "cc_type")
	private WebElement cc_type;
	@FindBy(name = "cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(name = "cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(name = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	
	@FindBy(id="datepick_out")
	private WebElement datepick_out;

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}
	@FindBy(id="Submit")
	private WebElement Submit;
	
	
	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement continuee;

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuee() {
		return continuee;
	}
	
//String s=s.replace(applyWaitToAllLocators(), wait());

	public static void applyWaitToAllLocators() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	public WebElement getBook_now() {
		return book_now;
	}

	@FindBy(id="book_now")
	private WebElement book_now;
	@FindBy(id="order_no")
	private WebElement order_no;

	

	public WebElement getOrder_no() {
		System.out.println(order_no.getAttribute("value"));
		return order_no;
	}
	
	
	
	
	
}