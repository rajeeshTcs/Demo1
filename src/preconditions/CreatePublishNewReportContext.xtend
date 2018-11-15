package preconditions

import com.gtnexus.testautomation.runtime.annotations.BusinessFunction
import com.gtnexus.testautomation.runtime.core.BusinessFunctions
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.core.api.Scriptlet
import com.gtnexus.testautomation.runtime.core.api.TestData
import contexts.PublishNewReportContext

import static com.gtnexus.testautomation.runtime.core.api.Actions.*

@BusinessFunction(id="PublishNewReport", type=BusinessFunctions.
Precondition, author="krypton.recorder@infor.com", product=Products.UNDEFINED)
class CreatePublishNewReportContext implements Scriptlet<PublishNewReportContext> {

    new(Object script, String value) {
        dataFolder = value
    }

    override call() throws Exception {

        var publishNewReportContext = new PublishNewReportContext
        var dataFile = TestData.getPropertyFile("PublishNewReportContext.properties")


        publishNewReportContext.InforBIforLawsonPageUid= dataFile.getAttribute("InforBIforLawsonPageUid")
        publishNewReportContext.InforBIforLawsonPagePass= dataFile.getAttribute("InforBIforLawsonPagePass")
        return publishNewReportContext

    }

}