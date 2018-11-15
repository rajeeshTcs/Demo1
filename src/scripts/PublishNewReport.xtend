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

import preconditions.CreatePublishNewReportContext
import contexts.PublishNewReportContext

import pages.InforBIforLawsonPage
import pages.ReportingServicesAdministrationPage

@GTAF(type = TestType.UNKNOWN, env = Envs.UNDEFINED, baseUrl="http://phmaw127.infor.com/" ,browser = Browsers.CHROME)
class PublishNewReport {

	val static DATA_FOLDER= "PublishNewReport"

	@Precondition(scriptlet=CreatePublishNewReportContext, value=DATA_FOLDER )
	PublishNewReportContext genContext //generated context

	@Test
	def void myTestCase() throws Exception {

						var inforBIforLawsonPage = goTo(InforBIforLawsonPage)
							 inforBIforLawsonPage.uid.type(genContext.InforBIforLawsonPageUid)
							 inforBIforLawsonPage.pass.type(genContext.InforBIforLawsonPagePass)
							 inforBIforLawsonPage.signIn.click()
							 inforBIforLawsonPage.tools.click()
							 inforBIforLawsonPage.eRSReportAdministration.click()
								handlePopUp([
								var reportingServicesAdministrationPage = initElements(ReportingServicesAdministrationPage)
								handlePopUp([
					}
}