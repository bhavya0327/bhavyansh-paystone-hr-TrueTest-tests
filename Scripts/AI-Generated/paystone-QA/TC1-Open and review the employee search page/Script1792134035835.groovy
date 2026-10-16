import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.paystone_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1118, 198)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-paystone-hr.vercel.app/"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to https://bhavyansh-paystone-hr.vercel.app/employees with params (q)"

TrueTestScripts.navigate("/employees", ["q": employees_q])

"Step 4: Click on button userMenu"

// Bind values to the variables in the locators of "AI-Generated/paystone-QA/Page_employees/button_userMenu"
TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/button_userMenu', ['button_userMenu_passwordRedacted': button_userMenu_passwordRedacted]))

"Step 5: Click on main employeeList"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/main_employeeList'))

"Step 6: Click on link dashboard -> Navigate to page '/dashboard'"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/link_dashboard'))

"Step 7: Click on input searchEmployees"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_dashboard/input_searchEmployees2'))

"Step 8: Enter input value in input searchEmployees -> Navigate to page ''"

TrueTestScripts.setText(findTestObject('AI-Generated/paystone-QA/Page_dashboard/input_searchEmployees2'), input_searchEmployees)

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Open and review the employee search page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}