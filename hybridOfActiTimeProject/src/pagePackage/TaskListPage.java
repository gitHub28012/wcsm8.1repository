package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class TaskListPage {

	@FindBy(xpath = "//a[.='Open Tasks']") private WebElement OpenTaskModule;
	@FindBy(xpath = "//a[.='Completed Tasks']") private WebElement CompletedTaskModule;
	@FindBy(xpath = "//a[.='Projects & Customers']") private WebElement Projects_CustomersModule;
	@FindBy(xpath = "//a[.='Archives']") private WebElement ArchivesModule;
	@FindBy(xpath = "//input[@value='Create New Customer']")private WebElement CNcustomer;
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement CNproject;
	@FindBy(xpath = "//*[@name='name']")private WebElement customerNameTB;
	@FindBy(xpath = "//input[@type='submit']")private WebElement createCustomerButton;
	@FindBy(xpath = "//input[@onclick='cancelCustomerCreation();']")private WebElement cancelCustomerButton;
	@FindBy(xpath = "//*[@name='customerId']")private WebElement dropDownElement;
	@FindBy(xpath = "//*[@name='name']")private WebElement projectNameTB;
	@FindBy(xpath = "//input[@value='Create Project']")private WebElement createProjectButton;
	@FindBy(xpath = "//input[@onclick='cancelProjectCreation();']")private WebElement cancelButton;


	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getOpenTaskModule() {
		return OpenTaskModule;
	}


	public WebElement getCompletedTaskModule() {
		return CompletedTaskModule;
	}


	public WebElement getProjects_CustomersModule() {
		return Projects_CustomersModule;
	}


	public WebElement getArchivesModule() {
		return ArchivesModule;
	}


	public WebElement getCNcustomer() {
		return CNcustomer;
	}


	public WebElement getCNproject() {
		return CNproject;
	}


	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}


	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}


	public WebElement getCancelCustomerButton() {
		return cancelCustomerButton;
	}


	public WebElement getDropDownElement() {
		return dropDownElement;
	}


	public WebElement getProjectNameTB() {
		return projectNameTB;
	}


	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}


	// operational Methods

	public void createNewCustomerMethod(String custName) throws InterruptedException
	{
		Projects_CustomersModule.click();
		CNcustomer.click();
		customerNameTB.sendKeys(custName);
		Thread.sleep(2000);
		createCustomerButton.click();
	}


	public void createProjectMethod(int index,String proName) throws InterruptedException
	{
		CNproject.click();
		Worklib wb = new Worklib();
		wb.dropDownSelect(dropDownElement,index);
		projectNameTB.sendKeys(proName);
		Thread.sleep(2000);
		createProjectButton.click();
	}


}
