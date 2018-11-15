package functions
import static com.gtnexus.testautomation.runtime.core.api.Actions.*
import pages.LogInInforWikiPage
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.annotations.BusinessFunction
import com.gtnexus.testautomation.runtime.core.BusinessFunctions

@BusinessFunction(
	id="TC-999",
	type=BusinessFunctions.Function,
	author="bathiya.ladduwahetty@gtnexus.com",
	product=Products.UNDEFINED
)
class Logins {
	
	// Sample funciton
	def KryptonWikiLogin(String userName, String pasword){
		var logInInforWikiPage = goTo(LogInInforWikiPage)
		logInInforWikiPage.osusername.type(userName)
		logInInforWikiPage.ospassword.type(pasword)
		logInInforWikiPage.login.click
	}
}