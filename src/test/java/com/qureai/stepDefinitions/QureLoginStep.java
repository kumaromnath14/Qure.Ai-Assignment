package com.qureai.stepDefinitions;

import java.io.FileOutputStream;
import java.io.PrintStream;

import com.qureai.pages.QureLoginPage;

import commonUtils.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QureLoginStep {

	QureLoginPage qureLoginPage;

	@Given("^Load the browser and Navigate to Pocker URL$")
	public void load_the_browser_and_Navigate_to_Pocker_URL() throws Throwable {
		PrintStream logs = new PrintStream(new FileOutputStream("AllLogs.txt"));
		System.setOut(logs);
		BaseTest.initialization();
	}

	@When("^User click on  SIGNUP link$")
	public void user_click_on_SIGNUP_link() throws Throwable {
		qureLoginPage = new QureLoginPage();
		qureLoginPage.clicksignUp();
	}

	@When("^User click & enter Username as \"([^\"]*)\" in usename field$")
	public void user_click_enter_Username_as_in_usename_field(String Username) throws Throwable {
		qureLoginPage.enterUsername(Username);
	}

	@When("^user enter  Email as \"([^\"]*)\" in email field$")
	public void user_enter_Username_as_in_usename_field(String email) throws Throwable {
		qureLoginPage.enterEmil(email);
	}

	@When("^user enter password as \"([^\"]*)\" in password field$")
	public void user_enter_password_as_in_password_field(String password) throws Throwable {
		qureLoginPage.enterPassword(password);
	}

	@When("^User Click on signup button$")
	public void user_Click_on_signup_button() throws Throwable {
		qureLoginPage.clicksignUpButton();
	}

	@Then("^Than user Click on setting & click on logout button$")
	public void than_user_Click_on_setting_click_on_logout_button() throws Throwable {
		qureLoginPage.clickSetting();
		qureLoginPage.clickLogoutButton();
	}

	@When("^user click on  signin link$")
	public void user_click_on_signin_link() throws Throwable {
		qureLoginPage = new QureLoginPage();
		qureLoginPage.clicksigninLink();
	}

	@When("^User Click on signin button$")
	public void user_Click_on_signin_button() throws Throwable {
		qureLoginPage.clicksigninButton();
	}

	@When("^user clcik on new Article link$")
	public void user_clcik_on_new_Article_link() throws Throwable {
		qureLoginPage.clicknewArticle();
	}

	@When("^user enter article Tittle as \"([^\"]*)\" in article tittle field$")
	public void user_enter_article_Tittle_as_in_article_tittle_field(String ArticleTittle) throws Throwable {
		qureLoginPage.enterArticleTitle(ArticleTittle);
	}

	@When("^user enter about article  as \"([^\"]*)\" in  about article  field$")
	public void user_enter_about_article_as_in_about_article_field(String AboutArticle) throws Throwable {
		qureLoginPage.aboutArticle(AboutArticle);
	}

	@When("^user enter details of  article  as \"([^\"]*)\" in  article details field$")
	public void user_enter_details_of_article_as_in_article_details_field(String Articledetails) throws Throwable {
		qureLoginPage.yourArticle(Articledetails);
	}

	@When("^User Click on publish article button button$")
	public void user_Click_on_publish_article_button_button() throws Throwable {

		qureLoginPage.clickpublishArticle();
	}

	@When("^User Click on home button & filter from popular tags$")
	public void user_Click_on_home_button_filter_from_popular_tags() throws Throwable {
		qureLoginPage = new QureLoginPage();
		qureLoginPage.clickHomeLink();
	}

	@When("^user add comment as \"([^\"]*)\" in article field$")
	public void user_add_comment_as_in_article_field(String comment) throws Throwable {
    qureLoginPage.addComment(comment);
	}

	@When("^user able to follow the post$")
	public void user_able_to_follow_the_post() throws Throwable {
		qureLoginPage.followPost();
	}

	@When("^user able to favorite the post$")
	public void user_able_to_favorite_the_post() throws Throwable {
      qureLoginPage.favouritePost();
	}

	
}
