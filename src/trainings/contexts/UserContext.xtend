package trainings.contexts

import com.gtnexus.testautomation.runtime.core.api.Context
import org.eclipse.xtend.lib.annotations.Accessors
import com.gtnexus.testautomation.runtime.annotations.BusinessFunction
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.core.BusinessFunctions

@BusinessFunction(
    id="N/A",
    type=BusinessFunctions.Context,
    author="sajitha.pathirana@infor.com",
    product=Products.UNDEFINED
    )

@Accessors
class UserContext implements Context{
	var String userName
	var String password
}