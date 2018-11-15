package trainings.preconditions

import com.gtnexus.testautomation.runtime.annotations.BusinessFunction
import com.gtnexus.testautomation.runtime.core.BusinessFunctions
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.core.api.Scriptlet
import com.gtnexus.testautomation.runtime.core.api.TestData
import com.gtnexus.testautomation.runtime.data.PropertiesDataFile

import static com.gtnexus.testautomation.runtime.core.api.Actions.*
import trainings.contexts.PurchaseOrderContext
import com.gtnexus.testautomation.runtime.data.RuntimeData

@BusinessFunction(
	id="N/A",
	type=BusinessFunctions.Precondition,
	author="sajitha.pathirana@infor.com",
	product=Products.UNDEFINED
)
class PRETC001_SamplePrecondition implements Scriptlet<PurchaseOrderContext> {
	val propertyFile = "TC-01.properties"
	var PropertiesDataFile dataFile

	new(Object script, String value) {
		setDataFolder(value)
		dataFile = TestData.getPropertyFile(propertyFile)
	}

	override call() throws Exception {
		var PurchaseOrderContext context=new PurchaseOrderContext
		context.orderNumber=RuntimeData.documentNumber
		context.buyer="KR-buyer"
		context.seller="KR-seller"
		context.currency="USD"
		context.paymetInitiationType="Buyer Approved Payment"
		context.buyerItemNumber="B-001"
		context.lineItemNumber="L-001"
		context.quantity="10"
		context.pricePerUnit="12"
		context.unitOfMeasure="Each"
		context.upcNumber="648920"
		context.weightUnit="Kg"
		context
	}
}
