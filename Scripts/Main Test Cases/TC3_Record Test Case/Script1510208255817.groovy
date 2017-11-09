import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoqa.com/registration/')

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_first_name'), 'Jeny')

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_last_name'), 'Dinh')

WebUI.click(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_radio_4'))

WebUI.click(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_checkbox_5'))

WebUI.click(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_checkbox_5'))

WebUI.click(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_checkbox_5'))

WebUI.selectOptionByValue(findTestObject('demoqa_registration/Page_Registration  Demoqa/select_dropdown_7'), 'Vietnam', 
    true)

WebUI.selectOptionByValue(findTestObject('demoqa_registration/Page_Registration  Demoqa/select_date_8datemm'), '1', true)

WebUI.selectOptionByValue(findTestObject('demoqa_registration/Page_Registration  Demoqa/select_date_8datedd'), '5', true)

WebUI.selectOptionByValue(findTestObject('demoqa_registration/Page_Registration  Demoqa/select_date_8dateyy'), '2003', true)

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_phone_9'), '01111456899')

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_username'), 'jenydinh')

WebUI.click(findTestObject('demoqa_registration/Page_Registration  Demoqa/div_fieldset'))

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_e_mail'), 'humorcake@gmail.com')

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/textarea_description'), 'Tesst')

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_password'), '123456789')

WebUI.setText(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_confirm_password_password'), '123456789')

WebUI.rightClick(findTestObject('demoqa_registration/Page_Registration  Demoqa/input_pie_submit'))

WebUI.click(findTestObject('demoqa_registration/Page_Registration  Demoqa/footer_colophon'))

WebUI.takeScreenshot()

WebUI.closeBrowser()


WebUI.verifyImagePresent(findTestObject('Informacije o komp verifikacija/Page_Informacije o kompaniji/online prodaja, logo, gradovi saobracaj se obavlja/Page_Informacije o kompaniji/img_print_image_src'),
	FailureHandling.STOP_ON_FAILURE)

