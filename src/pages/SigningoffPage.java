package pages;

import com.gtnexus.testautomation.runtime.core.BasePageObject;
import com.gtnexus.testautomation.runtime.core.api.FrameType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.gtnexus.testautomation.runtime.elements.*;
import com.gtnexus.krypton.elements.DefaultElement;
import com.gtnexus.testautomation.runtime.annotations.CustomConfig;
import com.gtnexus.testautomation.runtime.annotations.IFrame;
import com.gtnexus.testautomation.runtime.annotations.IFrames;
import static com.gtnexus.testautomation.runtime.core.api.Actions.*;

import custom_elements.*;

/**
 *  Auto Generated Code Using GTNexus Automation :: PageBot ::
 *  :: Java Driven PageObject Generator Beta ::
 *  Captured Environment : https://m12test-portal.auto.aws.infor.com/etc/signoutSuccess
 */


@CustomConfig("null")
public class SigningoffPage extends BasePageObject<SigningoffPage> {

public static final String PAGE_URL = "idp/startSLO.ping?TargetResource=https://m12test-sso.auto.aws.infor.com:443/sp/fhGTx/resume/sp/startSLO.ping";

public String relativePageUrl() {
    return this.PAGE_URL;
}

/**
 * Start Of Auto generated fields
 */
/****** IFRAMEELEMENT Elements ******/
 /* saml2SloIframe - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='saml2SloIframe']") 
 //@FindBy(how = How.XPATH , using="//div[@id='moduleArea']/iframe") 
 @FindBy(how = How.NAME , using = "saml2SloIframe")
 public IFrameElement saml2SloIframe;
 
 
/****** TEXTAREA Elements ******/
 /* codeblock - TEXTAREA */

 //@FindBy(how = How.XPATH , using="//textarea[@id='codeblock']") 
 @FindBy(how = How.ID , using = "codeblock")
 public TextArea codeblock;
 
 
/**
 * End Of Auto generated fields
 */
 
 /**
 *  Start of manually defined Fields 
 */
 
 /**
 *  End of manually defined Fields 
 */
}