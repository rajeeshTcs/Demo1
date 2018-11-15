package trainings.contexts

import org.eclipse.xtend.lib.annotations.Accessors
import com.gtnexus.testautomation.runtime.core.api.Context

@Accessors
class PurchaseOrderContext implements Context {
	var public String orderNumber
	var public String buyer
	var public String seller
	var public String currency
	var public String paymetInitiationType
	var public String buyerItemNumber
	var public String lineItemNumber
	var public String quantity
	var public String pricePerUnit
	var public String unitOfMeasure
	var public String upcNumber
	var public String weightUnit
}
