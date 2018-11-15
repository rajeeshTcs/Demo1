package preconditions

import com.gtnexus.testautomation.runtime.annotations.BusinessFunction
import com.gtnexus.testautomation.runtime.core.BusinessFunctions
import com.gtnexus.testautomation.runtime.core.Products
import com.gtnexus.testautomation.runtime.core.api.Scriptlet
import com.gtnexus.testautomation.runtime.core.api.TestData
import contexts.SampleTestcaseContext

import static com.gtnexus.testautomation.runtime.core.api.Actions.*

@BusinessFunction(id="SampleTestcase", type=BusinessFunctions.
Precondition, author="krypton.recorder@infor.com", product=Products.UNDEFINED)
class CreateSampleTestcaseContext implements Scriptlet<SampleTestcaseContext> {

    new(Object script, String value) {
        dataFolder = value
    }

    override call() throws Exception {

        var sampleTestcaseContext = new SampleTestcaseContext
        var dataFile = TestData.getPropertyFile("SampleTestcaseContext.properties")


        sampleTestcaseContext.SignOnPagePfpass= dataFile.getAttribute("SignOnPagePfpass")
        return sampleTestcaseContext

    }

}