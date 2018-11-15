//TAGS : PRODUCT_Krypton
package scripts

import com.gtnexus.testautomation.runtime.annotations.GTAF
import com.gtnexus.testautomation.runtime.core.TestType
import com.gtnexus.testautomation.runtime.core.api.Browsers
import com.gtnexus.testautomation.runtime.core.api.Envs
import org.testng.annotations.Test

import static com.gtnexus.testautomation.runtime.core.api.Actions.*
import com.gtnexus.testautomation.runtime.annotations.TestCase
import com.gtnexus.testautomation.runtime.core.Products
import static com.gtnexus.testautomation.runtime.core.TestCaseCommons.*
@TestCase(
	id="TC-1",
	author="bathiya.ladduwahetty@gtnexus.com",
	product=Products.UNDEFINED,
	softDependencies=NoDependencies,
	hardDependencies=NoDependencies
)

@GTAF(type=TestType.UNKNOWN, env=Envs.UNDEFINED, baseUrl="http://www.infor.com", browser=Browsers.CHROME)
class TC1_HelloWorld {

	@Test
	def void myTestCase() throws Exception {
		goTo("http://www.infor.com/")
	}
}
