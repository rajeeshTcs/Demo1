//TAGS : PRODUCT_Krypton
package scripts

import com.gtnexus.testautomation.runtime.annotations.GTAF;
import com.gtnexus.testautomation.runtime.core.TestType;
import com.gtnexus.testautomation.runtime.core.api.Browsers;
import com.gtnexus.testautomation.runtime.core.api.Envs;
import org.testng.annotations.Test;
import static com.gtnexus.testautomation.runtime.core.api.Actions.*;
import static org.assertj.core.api.Assertions.*;
import com.gtnexus.testautomation.runtime.annotations.TestCase;
import com.gtnexus.testautomation.runtime.core.Products;
import static com.gtnexus.testautomation.runtime.core.TestCaseCommons.*

@TestCase(
	product=Products.Krypton,
	id="TC-3",
	author="sajitha.pathirana@infor.com",
	softDependencies=NoDependencies,
	hardDependencies=NoDependencies
)

@GTAF(type=TestType.UNKNOWN, env=Envs.UNDEFINED, baseUrl="https://krypton.gtnexus.info/", browser=Browsers.CHROME)
class TC3_GoToKryptonManager {
	val static String EXPECTED_TITLE="Welcome To Krypton Your Testing Just Got Better !"
	
	@Test
	def void TC03() throws Exception {
		goTo(baseUrl)
		var actualTitle=title		
		assertThat(actualTitle).describedAs("Verify the Title").isEqualTo(EXPECTED_TITLE)
		log("====== Validated Title Successfully ======")
	}
}
