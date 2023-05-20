package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement CreateNewUserButton;
	@FindBy(xpath = "//*[@name='username']") private WebElement userNameTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']") private WebElement passwordTextRetypeTB;
	@FindBy(xpath = "//*[@name='firstName']") private WebElement FiRSTNameTB;
	@FindBy(xpath = "//*[@name='lastName']") private WebElement LastNameTB;
	@FindBy(xpath = "//input[@type='submit']") private WebElement CreateUserButton;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelButton;
    @FindBy(xpath = "(//a[contains(text(),'System,')]/ancestor::tbody/descendant::a)[1]") private WebElement userCreatedLink;
    @FindBy(xpath = "//input[@value='Delete This User']") private WebElement DeleteUserButton;
	
 
    
    //intialization
    public UserListPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //utilaization
    public WebElement getCreateNewUserButton() {
		return CreateNewUserButton;
	}
	public WebElement getUserNameTB() {
		return userNameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getPasswordTextRetypeTB() {
		return passwordTextRetypeTB;
	}
	public WebElement getFiRSTNameTB() {
		return FiRSTNameTB;
	}
	public WebElement getLastNameTB() {
		return LastNameTB;
	}
	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public WebElement getUserCreatedLink() {
		return userCreatedLink;
	}
	public WebElement getDeleteUserButton() {
		return DeleteUserButton;
	}
	
	// Operational Methods.
	
	
	public void createUserMethod(String usn,String pass,String Fn,String Ln) throws InterruptedException
	{
		CreateNewUserButton.click();
		Thread.sleep(1000);
		userNameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pass);
		passwordTextRetypeTB.sendKeys(pass);
		
		Thread.sleep(1000);
		FiRSTNameTB.sendKeys(Fn);
		Thread.sleep(1000);
		LastNameTB.sendKeys(Ln);
		
		Thread.sleep(1000);
		CreateUserButton.click();
	}
	
	 public void deleteUserMethod() throws InterruptedException
	 {
		 userCreatedLink.click();
		 Thread.sleep(1000);
		 DeleteUserButton.click();
	     WorkLib wl = new WorkLib();
	     wl.handleConfirmationPopup();
	 }
	
}
