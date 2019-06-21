import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'app.start'()

CustomKeywords.'login.tapRegisterNow'()

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/First Name field'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Last Name field'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Email Address field'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Date of Birth field'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Gender dropdown'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Mobile Number field'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Referral Code field'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Facebook button'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Google button'))

CustomKeywords.'verify_element.visible'(findTestObject('Registration/User Details/Next button'))

