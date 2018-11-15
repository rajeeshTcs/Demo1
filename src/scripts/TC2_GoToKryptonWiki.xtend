//TAGS : PRODUCT_Krypton
package scripts

import com.gtnexus.testautomation.runtime.annotations.GTAF;
import com.gtnexus.testautomation.runtime.core.TestType;
import com.gtnexus.testautomation.runtime.core.api.Browsers;
import com.gtnexus.testautomation.runtime.core.api.Envs;
import org.testng.annotations.Test;
import static com.gtnexus.testautomation.runtime.core.api.Actions.*;
import static org.assertj.core.api.Assertions.*;
import pages.LogInInforWikiPage
import pages.KryptonTestAutomationInforWikiPage
import com.gtnexus.testautomation.runtime.annotations.TestCase
import com.gtnexus.testautomation.runtime.core.Products
import static com.gtnexus.testautomation.runtime.core.TestCaseCommons.*

@TestCase(
	id="TC-2",
	author="bathiya.ladduwahetty@gtnexus.com",
	product=Products.UNDEFINED,
	softDependencies=NoDependencies,
	hardDependencies=NoDependencies
)

@GTAF(type = TestType.UNKNOWN,env = Envs.UNDEFINED,baseUrl="https://wiki.infor.com",browser = Browsers.FIREFOX)
class TC2_GoToKryptonWiki {

	@Test
	def void myTestCase() throws Exception {
		goTo(baseUrl)
		// Provide your infor wiki Username and Password to below variable
		var userName = ""
		var pasword = ""
		
		//Assertions to verify username or password is not empty
		assertThat(userName).describedAs("Verify username is not empty").isNotEmpty
		assertThat(pasword).describedAs("Verify password is not empty").isNotEmpty
		
		// Login to wiki
		var logInInforWikiPage = goTo(LogInInforWikiPage)
		logInInforWikiPage.osusername.type(userName)
		logInInforWikiPage.ospassword.type(pasword)
		logInInforWikiPage.login.click

		// Navigate to Krypton wiki page
		goTo(KryptonTestAutomationInforWikiPage)		

	}
}
