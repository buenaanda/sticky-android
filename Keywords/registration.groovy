import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

public class registration {

	@Keyword
	def firstName(String firstName) {
		Mobile.setText(findTestObject("Registration/User Details/First Name field"), firstName, 0)
	}

	@Keyword
	def lastName(String lastName) {
		Mobile.setText(findTestObject("Registration/User Details/Last Name field"), lastName, 0)
	}
}
