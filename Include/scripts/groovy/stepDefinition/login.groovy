package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.im.InputContext

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is in Magento Login Page")
	public void userIsInMagentoPage() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Sign In from HomePage'), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input email {string}")
	public void userInputEmail(String username) {
		WebUI.callTestCase(findTestCase('Pages/Login/Input Username'), [('username') : username],FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input password {string}")
	public void userInputPassword(String password) {
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : password],FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click Sign in Button")
	public void userClickSignInButton() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Sign In from HomePage'), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User will be directed to Home Page")
	public void userWillBeDirectedToHomePage() {
		WebUI.callTestCase(findTestCase('Pages/Login/Verify Login Success'), [:],FailureHandling.STOP_ON_FAILURE)
	}
}