import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

public class app {

	@Keyword
	def start() {
		Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)
	}

	def start(boolean freshApp) {
		Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, freshApp)
	}

	def close() {
		Mobile.closeApplication()
	}
}
