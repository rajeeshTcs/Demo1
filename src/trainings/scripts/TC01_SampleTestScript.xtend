package trainings.scripts

import com.gtnexus.testautomation.runtime.annotations.GTAF
import com.gtnexus.testautomation.runtime.annotations.Precondition
import com.gtnexus.testautomation.runtime.annotations.TestCase
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.core.TestType
import com.gtnexus.testautomation.runtime.core.api.Browsers
import com.gtnexus.testautomation.runtime.core.api.Envs
import org.testng.annotations.Test
import trainings.contexts.PurchaseOrderContext
import trainings.contexts.UserContext
import trainings.preconditions.PRETC001_SamplePrecondition
import trainings.preconditions.PRETC001_UserContextInitialization

import static com.gtnexus.testautomation.runtime.core.api.Actions.*
import static org.assertj.core.api.Assertions.*

@TestCase(
	product=Products.UNDEFINED,
	id="TC-01",
	author="sajitha.pathirana@infor.com",
	softDependencies="",
	hardDependencies=""
)
@GTAF(type = TestType.UNKNOWN,env = Envs.DEV,browser = Browsers.CHROME)
class TC01_SampleTestScript {
	val static String EXPECTED_TITLE="Welcome To Krypton Your Testing Just Got Better !"
	
	@Precondition(scriptlet=PRETC001_SamplePrecondition,value ='TC-01')
	var PurchaseOrderContext key
	
	@Precondition(scriptlet=PRETC001_UserContextInitialization,value ='TC-01')
	var UserContext user
	
	
	@Test
	def void TC01() throws Exception {
		goTo(baseUrl)
		var actualTitle=title		
		assertThat(actualTitle).describedAs("Verify the Title").isEqualTo(EXPECTED_TITLE)
	}
}