package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

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
    @FindBy(xpath = "//*[@id='right12']") private WebElement ModifyTimeTrack;
	@FindBy(xpath = "//*[@id='right2']") private WebElement manageCust;
	@FindBy(xpath = "//*[@id='right1']") private WebElement manageReport;
	@FindBy(xpath = "//*[@id='right5']") private WebElement manageUsers;
	@FindBy(xpath = "//*[@id='right7']") private WebElement manageBilling;


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
	public WebElement getModifyTimeTrack() {
		return ModifyTimeTrack;
	}

	public WebElement getManageCust() {
		return manageCust;
	}

	public WebElement getManageReport() {
		return manageReport;
	}

	public WebElement getManageUsers() {
		return manageUsers;
	}

	public WebElement getManageBilling() {
		return manageBilling;
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

	}

	 public void deleteUserMethod() throws InterruptedException
	 {
		 userCreatedLink.click();
		 Thread.sleep(1000);
		 DeleteUserButton.click();
	     Worklib wl = new Worklib();
	     wl.acceptConfirmation();
	 }

	 public void selectCheckBox()
	 {
		 ModifyTimeTrack.click();
		 manageCust.click();
		 manageReport.click();
		 manageUsers.click();
		 manageBilling.click();
	 }

	 public void managerCreateMethod()
	 {
			CreateUserButton.click();
	 }
}

