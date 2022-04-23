package com.qureai.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonUtils.BaseTest;
import commonUtils.GenericUtility;

/**
 * @author kumar
 *
 */
public class QureLoginPage extends BaseTest {

	GenericUtility common = new GenericUtility();

	@FindBy(xpath = "//a[.='Sign up']")
	private WebElement signUpLink;

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement usernameField;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[.='Sign up']")
	private WebElement signupButton;

	@FindBy(xpath = "//a[contains(.,'Settings')]")
	private WebElement settingLink;

	@FindBy(xpath = "//button[@class='btn btn-outline-danger']")
	private WebElement logOutButton;

	@FindBy(xpath = "//a[.='Sign in']")
	private WebElement signinLink;

	@FindBy(xpath = "//button[.='Sign in']")
	private WebElement signinButton;

	@FindBy(xpath = "(//*[.='Home'])[2]")
	private WebElement homeLink;

	@FindBy(xpath = "//input[@placeholder='Article Title']")
	private WebElement articleTittle;

	@FindBy(xpath = "//a[contains(.,'New Article')]")
	private WebElement articleLink;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement aboutArticle;

	@FindBy(xpath = "//*[@placeholder='Write your article (in markdown)']")
	private WebElement writeArticle;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement publishArticleLink;

	@FindBy(xpath = "//*[@placeholder='Write a comment...']")
	private WebElement commentArticle;

	@FindBy(xpath = "//*[.='Popular Tags']//following-sibling::div/a[1]")
	private WebElement filterPost;

	@FindBy(xpath = "//*[.='Read more...']")
	private WebElement selectPost;

	@FindBy(xpath = "(//i[@class='ion-heart'])[1]/..")
	private WebElement favourite;

	@FindBy(xpath = "(//i[@class='ion-plus-round'])[1]/..")
	private WebElement follow;

	@FindBy(xpath = "//button[.='Post Comment']")
	private WebElement postButton;

	public WebElement getSignUpLink() {
		return signUpLink;
	}

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

	public WebElement getSettingLink() {
		return settingLink;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public WebElement getSigninLink() {
		return signinLink;
	}

	public WebElement getSigninButton() {
		return signinButton;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getArticleTittle() {
		return articleTittle;
	}

	public WebElement getArticleLink() {
		return articleLink;
	}

	public WebElement getAboutArticle() {
		return aboutArticle;
	}

	public WebElement getWriteArticle() {
		return writeArticle;
	}

	public WebElement getPublishArticleLink() {
		return publishArticleLink;
	}

	public WebElement getCommentArticle() {
		return commentArticle;
	}

	public WebElement getFilterPost() {
		return filterPost;
	}

	public WebElement getSelectPost() {
		return selectPost;
	}

	public WebElement getFavourite() {
		return favourite;
	}

	public WebElement getFollow() {
		return follow;
	}

	public WebElement getPostButton() {
		return postButton;
	}

	// **********Intilize the page**********
	public QureLoginPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @verify clicksignUp
	 */

	public void clicksignUp() throws Exception {
		common.JseHighlightTheElement(getSignUpLink());
		common.JseClick(getSignUpLink());

	}

	/**
	 * @verify enterUsername
	 */

	public void enterUsername(String username) throws Exception {
		common.WaitForTheVisibilityOfElement(getUsernameField(), 20);
		common.JseHighlightTheElement(getUsernameField());
		common.sendToTextBox(getUsernameField(), username);

	}

	/**
	 * @verify enterEmil
	 */
	public void enterEmil(String email) throws Exception {
		common.WaitForTheVisibilityOfElement(getEmailField(), 20);
		common.JseHighlightTheElement(getEmailField());
		common.sendToTextBox(getEmailField(), email);

	}

	/**
	 * @verify enterPassword
	 */

	public void enterPassword(String password) throws Exception {
		common.WaitForTheVisibilityOfElement(getPasswordField(), 20);
		common.JseHighlightTheElement(getPasswordField());
		common.sendToTextBox(getPasswordField(), password);

	}

	/**
	 * @verify clicksignUpButton
	 */

	public void clicksignUpButton() throws Exception {
		common.JseHighlightTheElement(getSignupButton());
		common.JseClick(getSignupButton());
		common.wait(4);

	}

	/**
	 * @verify clickSetting
	 */

	public void clickSetting() throws Exception {

		common.WaitForTheVisibilityOfElement(getSettingLink(), 20);
		common.JseHighlightTheElement(getSettingLink());
		common.JseClick(getSettingLink());
		common.wait(4);

	}

	/**
	 * @verify clickLogoutButton
	 */

	public void clickLogoutButton() throws Exception {
		common.scrollToview(getLogOutButton());
		common.WaitForTheVisibilityOfElement(getLogOutButton(), 20);
		common.JseHighlightTheElement(getLogOutButton());
		common.JseClick(getLogOutButton());

	}

	/**
	 * @verify clicksigninLink
	 */

	public void clicksigninLink() throws Exception {
		common.WaitForTheVisibilityOfElement(getSigninLink(), 20);
		common.JseHighlightTheElement(getSigninLink());
		common.clickElement(getSigninLink());
		common.wait(4);

	}

	/**
	 * @verify clicksigninButton
	 */

	public void clicksigninButton() throws Exception {
		common.JseClick(getSigninButton());
		common.wait(4);

	}

	/**
	 * @verify clicknewArticle
	 */

	public void clicknewArticle() throws Exception {
		common.JseClick(getArticleLink());

	}

	/**
	 * @verify enterArticleTitle
	 */
	public void enterArticleTitle(String artileTittle) throws Exception {
		common.WaitForTheVisibilityOfElement(getArticleTittle(), 20);
		common.JseHighlightTheElement(getArticleTittle());
		common.sendToTextBox(getArticleTittle(), artileTittle);
	}

	/**
	 * @verify aboutArticle
	 */

	public void aboutArticle(String aboutArticle) throws Exception {
		common.WaitForTheVisibilityOfElement(getAboutArticle(), 20);
		common.JseHighlightTheElement(getAboutArticle());
		common.sendToTextBox(getAboutArticle(), aboutArticle);
	}

	/**
	 * @verify yourArticle
	 */

	public void yourArticle(String yourArticle) throws Exception {
		common.WaitForTheVisibilityOfElement(getWriteArticle(), 20);
		common.JseHighlightTheElement(getWriteArticle());
		common.sendToTextBox(getWriteArticle(), yourArticle);
		common.wait(4);
	}

	/**
	 * @verify clickpublishArticle
	 */
	public void clickpublishArticle() throws Exception {
		common.JseClick(getPublishArticleLink());

	}

	/**
	 * @verify clickHomeLink
	 */
	public void clickHomeLink() throws Exception {
		common.wait(8);
		common.clickElement(getHomeLink());
		common.wait(8);
		common.WaitForTheVisibilityOfElement(getFilterPost(), 40);
		common.JseHighlightTheElement(getFilterPost());
		common.JseClick(getFilterPost());
		common.WaitForTheVisibilityOfElement(getSelectPost(), 40);
		common.JseClick(getSelectPost());
		common.wait(4);
	}

	/**
	 * @verify addComment
	 */
	public void addComment(String addComment) throws Exception {
		common.WaitForTheVisibilityOfElement(getCommentArticle(), 40);
		common.JseHighlightTheElement(getCommentArticle());
		common.sendToTextBox(getCommentArticle(), addComment);
		common.scrollToview(getPostButton());
		common.JseClick(getPostButton());

	}

	/**
	 * @verify favouritePost
	 */
	public void favouritePost() throws Exception {
		common.JseHighlightTheElement(getFavourite());
		common.scrollToview(getHomeLink());
		String select = common.getText(getFavourite());
		System.out.println("select" + select);
		if (select.equalsIgnoreCase("Favorite Article")) {
			common.JseClick(getFavourite());
		} else {
			String unselect = common.getText(getFavourite());
			System.out.println("unselect" + unselect);
			unselect.equalsIgnoreCase(" Unfavorite Article ");
			common.JseClick(getFavourite());
		}

	}

	/**
	 * @verify followPost
	 */
	public void followPost() throws Exception {
		common.JseHighlightTheElement(getFollow());
		String selectFollow = common.getText(getFollow());
		System.out.println("selectFollow" + selectFollow);
		if (selectFollow.equalsIgnoreCase("Follow")) {
			common.JseClick(getFollow());
		} else {
			String selectFollow1 = common.getText(getFollow());
			System.out.println("selectFollow1" + selectFollow1);
			selectFollow1.equalsIgnoreCase("Unfollow");
			common.JseClick(getFollow());
			common.wait(4);

		}

	}
}