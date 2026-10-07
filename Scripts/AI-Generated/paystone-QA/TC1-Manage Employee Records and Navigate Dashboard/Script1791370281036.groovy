import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.paystone_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(787, 719)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-paystone-hr.vercel.app/login with params (next)"

TrueTestScripts.navigate("/login", ["next": login_next])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to https://bhavyansh-paystone-hr.vercel.app/dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 4: Click on input searchEmployees"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_dashboard/input_searchEmployees'))

"Step 5: Enter input value in input searchEmployees"

TrueTestScripts.setText(findTestObject('AI-Generated/paystone-QA/Page_dashboard/input_searchEmployees'), input_searchEmployees)

"Step 6: Press key Enter on input searchEmployees2 -> Navigate to page '/employees'"

WebUI.sendKeys(findTestObject('AI-Generated/paystone-QA/Page_dashboard/input_searchEmployees2'), Keys.chord(Keys.ENTER))

"Step 7: Enter input value in input searchEmployees"

TrueTestScripts.setText(findTestObject('AI-Generated/paystone-QA/Page_employees/input_searchEmployees'), input_searchEmployees_1)

"Step 8: Click on div employeesHeader"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/div_employeesHeader'))

"Step 9: Click on input searchEmployees2"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/input_searchEmployees2'))

"Step 10: Press key Enter on input searchEmployees2"

WebUI.sendKeys(findTestObject('AI-Generated/paystone-QA/Page_employees/input_searchEmployees2'), Keys.chord(Keys.ENTER))

"Step 11: Click on link employee -> Navigate to page '/employees/*'"

// Bind values to the variables in the locators of "AI-Generated/paystone-QA/Page_employees/link_employee"
TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/link_employee', ['link_employee_nameRedacted': link_employee_nameRedacted]))

"Step 12: Click on button employeeTabs (compensationTab)"

// Bind values to the variables in the locators of "AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs"
TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs', ['button_employeeTabs_DataTestid_1': button_employeeTabs_DataTestid, 'button_employeeTabs_css_value_1': button_employeeTabs_css_value]))

"Step 13: Click on button employeeTabs (leaveTab)"

// Bind values to the variables in the locators of "AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs"
TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs', ['button_employeeTabs_DataTestid_1': button_employeeTabs_DataTestid_1, 'button_employeeTabs_css_value_1': button_employeeTabs_css_value_1]))

"Step 14: Click on span approved"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/span_approved'))

"Step 15: Click on button editEmployee"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/button_editEmployee'))

"Step 16: Select option with input value from select employeeFilters (department)"

// Bind values to the variables in the locators of "AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs"
TrueTestScripts.selectOption(findTestObject('AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs', ['button_employeeTabs_DataTestid_1': button_employeeTabs_DataTestid_2, 'button_employeeTabs_css_value_1': button_employeeTabs_css_value_2]), select_employeeFilters, "label", true)

"Step 17: Select option with input value from select employeeFilters (status)"

// Bind values to the variables in the locators of "AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs"
TrueTestScripts.selectOption(findTestObject('AI-Generated/paystone-QA/Dynamic Objects/Page_employees/button_employeeTabs', ['button_employeeTabs_DataTestid_1': button_employeeTabs_DataTestid_3, 'button_employeeTabs_css_value_1': button_employeeTabs_css_value_3]), select_employeeFilters_1, "label", true)

"Step 18: Click on button saveChanges"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/button_saveChanges'))

"Step 19: Click on button openMenu"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/button_openMenu'))

"Step 20: Click on link payrollRuns -> Navigate to page '/payroll'"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_employees/link_payrollRuns'))

"Step 21: Click on button openMenu"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_payroll/button_openMenu'))

"Step 22: Click on aside dashboard"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_payroll/aside_dashboard'))

"Step 23: Click on link leaveRequests -> Navigate to page '/settings'"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_payroll/link_leaveRequests'))

"Step 24: Click on button openMenu"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_settings/button_openMenu'))

"Step 25: Click on link dashboard -> Navigate to page '/dashboard'"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_settings/link_dashboard'))

"Step 26: Click on button userMenu"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_dashboard/button_userMenu'))

"Step 27: Click on button userMenuSettings -> Navigate to page '/settings'"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_dashboard/button_userMenuSettings'))

"Step 28: Click on button userMenu"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_settings/button_userMenu'))

"Step 29: Click on button logout -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/paystone-QA/Page_settings/button_logout'))

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Manage Employee Records and Navigate Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}