import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

public class verify_element {

	@Keyword
	def visible(TestObject to) {
		Mobile.verifyElementExist(to, 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def text(TestObject to, String expectedText) {
		Mobile.verifyElementText(to, expectedText, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
