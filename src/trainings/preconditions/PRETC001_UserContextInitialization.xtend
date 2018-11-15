package trainings.preconditions
import com.gtnexus.testautomation.runtime.annotations.BusinessFunction
import com.gtnexus.testautomation.runtime.core.BusinessFunctions
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.core.api.Scriptlet
import com.gtnexus.testautomation.runtime.core.api.TestData
import com.gtnexus.testautomation.runtime.data.PropertiesDataFile
import trainings.contexts.UserContext

@BusinessFunction(
	id="N/A",
	type=BusinessFunctions.Precondition,
	author="sajitha.pathirana@infor.com",
	product=Products.UNDEFINED
)
class PRETC001_UserContextInitialization  implements Scriptlet<UserContext> {
	val propertyFile = "user.properties"
	var PropertiesDataFile dataFile

	new(Object script, String value) {
		dataFile = TestData.getPropertyFile(propertyFile)
	}

	override call() throws Exception {
		var user=new UserContext
		user.userName = dataFile.getAttribute("username")
		user.password = dataFile.getAttribute("password")
		return user
	}
}