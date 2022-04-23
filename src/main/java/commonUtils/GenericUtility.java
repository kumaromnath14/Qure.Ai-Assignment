package commonUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
	 * @author kumar
	 *
	 */
/**
 * This CommonUtilities class has all generic methods. We can use these methods
 * across the projects.
 * 
 */

public class GenericUtility extends BaseTest implements IConst {

	

	/**
	 * JSE click element
	 */
	public void JseClick(WebElement element) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * JSE Highlight element
	 */
	public void JseHighlightTheElement(WebElement header) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int iCnt = 0; iCnt < 2; iCnt++) {
			js.executeScript("arguments[0].style.border='5px dotted red';", header);

		}
	}

	/**
	 * User Get screenshot on page
	 */
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	/**
	 * visiblity of element
	 */

	public void WaitForTheVisibilityOfElement(WebElement Ele, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(Ele));

	}

	/**
	 * User Wait for some time
	 */
	public void wait(int object) throws InterruptedException {
		TimeUnit.SECONDS.sleep(object);
	}

	/**
	 * User enter text in to textField
	 * 
	 */
	public void sendToTextBox(WebElement element, String text) throws Exception {
		element.sendKeys(text);
	}

	
	/**
	 * User scroll to webelement
	 * 
	 */
	public void scrollToview(WebElement element) {
		System.out.println("Scrolling to the Eelement" + element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	/**
	 * click on element
	 */
	public void clickElement(WebElement object) {
		try {
			object.click();
		} catch (final Exception e) {
			e.getMessage();
		}
	}
	
	/**
	 * get text
	 */

	public String getText(WebElement string) throws Exception {
		String value = string.getText();
		return value;
	}
}