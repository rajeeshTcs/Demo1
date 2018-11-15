package scripts

import com.gtnexus.testautomation.runtime.annotations.GTAF;
import com.gtnexus.testautomation.runtime.core.TestType;
import com.gtnexus.testautomation.runtime.core.api.Browsers;
import com.gtnexus.testautomation.runtime.core.api.Envs;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import com.gtnexus.testautomation.runtime.annotations.Precondition;
import static com.gtnexus.testautomation.runtime.core.api.Actions.*;
import static org.assertj.core.api.Assertions.*;

import preconditions.CreateSampleTestcaseContext
import contexts.SampleTestcaseContext

import pages.WebExEnterpriseSitePage
import pages.SignOnPage
import pages.HomepagesPage
import pages.InforCloudSuiteFinancialsPage
import pages.SigningoffPage

@GTAF(type = TestType.UNKNOWN, env = Envs.UNDEFINED, baseUrl="https://m12test-portal.auto.aws.infor.com/" ,browser = Browsers.CHROME)
class SampleTestcase {

	val static DATA_FOLDER= "SampleTestcase"

	@Precondition(scriptlet=CreateSampleTestcaseContext, value=DATA_FOLDER )
	SampleTestcaseContext genContext //generated context

	@Test
	def void myTestCase() throws Exception {

						var webExEnterpriseSitePage = goTo(WebExEnterpriseSitePage)
							 webExEnterpriseSitePage.pfusername.sendKeys(Keys.chord(Keys.CONTROL , "v"))
								var signOnPage = initElements(SignOnPage)
							 signOnPage.pfpass.type(genContext.SignOnPagePfpass)
							 signOnPage.pfpass.sendKeys(Keys.chord(Keys.CONTROL , "v"))
							 signOnPage.signIn.click()
								var homepagesPage = initElements(HomepagesPage)
							 homepagesPage.mhdrAppBtn.click()
							 homepagesPage.inforCloudSuiteFinancials.click()
							 homepagesPage.mhdrAppBtn.click()
								handlePopUp([
								var inforCloudSuiteFinancialsPage = initElements(InforCloudSuiteFinancialsPage)
							 inforCloudSuiteFinancialsPage.homepages.click()
							 inforCloudSuiteFinancialsPage.myOpenRequisitions.click()
								])
							 homepagesPage.mhdrAppBtn.click()
							 homepagesPage.inforCloudSuiteFinancials.click()
							 inforCloudSuiteFinancialsPage.requester.click()
							 inforCloudSuiteFinancialsPage.purchasingManager.click()
							 inforCloudSuiteFinancialsPage.managePurchaseOrders.click()
							 inforCloudSuiteFinancialsPage.purchaseOrderProcessingPageUnreleased0UnreleasedPurchaseOrdersToolbarStandardOpen.click()
							 inforCloudSuiteFinancialsPage.rNavUsrBtn.click()
							 inforCloudSuiteFinancialsPage.signOut.click()
								var signingoffPage = initElements(SigningoffPage)
					}
}