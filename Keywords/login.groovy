import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

public class login {

	@Keyword
	def tapRegisterNow() {
		Mobile.tap(findTestObject("Login/Register now button"), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
