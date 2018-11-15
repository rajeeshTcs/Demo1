/**
 * @author bladduwahetty
 *
 * @tags 
 */
package functions
import com.gtnexus.testautomation.runtime.annotations.GTAF;
import com.gtnexus.testautomation.runtime.core.TestType;
import com.gtnexus.testautomation.runtime.core.api.Browsers;
import com.gtnexus.testautomation.runtime.core.api.Envs;

import static com.gtnexus.testautomation.runtime.core.api.Actions.*;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By
import com.gtnexus.testautomation.runtime.core.api.TestData

/**
 * @author bladduwahetty
 *
 */

class PopUp {
	def static kryptonPopup(){
		handlePopUp([				
				findText(By.id("email")).type("bathiya123123@krypton.com")
				findText(By.id("password")).type("bathiya1234@krypton.com")
				findButton(By.id("done")).click
			])
	}
	
	def static fileAttatchPopup(String fileName){
		var message= ""
		handlePopUp([
			val filePath = TestData.getFilePath(fileName)
			findText(By.id("file")).typeAppend(filePath.toString)
			findButton(By.xpath("//input[@value='Upload']")).click
			var uploadMessage = findText(By.id("selectedFile")).text
			setCache("FILE_ATTATCH_CACHE_TAG",uploadMessage)
			findButton(By.id("done")).click
		// pause(5)
		])
	}
}