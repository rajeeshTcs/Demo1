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
 *  Captured Environment : https://m12test-cloudidentities.auto.aws.infor.com/idp/SSO.saml2
 */


@CustomConfig("null")
public class WebExEnterpriseSitePage extends BasePageObject<WebExEnterpriseSitePage> {

public static final String PAGE_URL = "idp/SSO.saml2";

public String relativePageUrl() {
    return this.PAGE_URL;
}

/**
 * Start Of Auto generated fields
 */
/****** LINK Elements ******/
 /* forgotPassword - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Forgot password')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://m12test-ifs.auto.aws.infor.com/accounts/recoverpassword/FSMMTQAT03_TST']") 
 //@FindBy(how = How.XPATH , using="//div[@id='divMain']/div[5]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Forgot password")
 public Link forgotPassword;
 
 
 /* contactUs - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Contact Us')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://m12test-ifs.auto.aws.infor.com/accounts/contactus/FSMMTQAT03_TST']") 
 //@FindBy(how = How.XPATH , using="//div[@id='divMain']/div[5]/a[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Contact Us")
 public Link contactUs;
 
 
 /* inforPrivacyPolicy - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Infor Privacy Policy')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='javascript:void(0);']") 
 //@FindBy(how = How.XPATH , using="//div[@id='divMain']/div[6]/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Infor Privacy Policy']/ancestor::a")
 public Link inforPrivacyPolicy;
 
 
 /* inforTermsOfUse - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Infor Terms of Use')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0);'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='divMain']/div[6]/a[2]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Infor Terms of Use']/ancestor::a")
 public Link inforTermsOfUse;
 
 
/****** PASSWORD Elements ******/
 /* pfpass - PASSWORD */

 //@FindBy(how = How.NAME , using="pf.pass") 
 //@FindBy(how = How.XPATH , using="//input[@id='password']") 
 //@FindBy(how = How.XPATH , using="//input[@name='pf.pass']") 
 @FindBy(how = How.ID , using = "password")
 public Password pfpass;
 
 
/****** SUBMIT Elements ******/
 /* signIn - SUBMIT */

 //@FindBy(how = How.NAME , using="SignIn") 
 //@FindBy(how = How.XPATH , using="//input[@id='submit']") 
 //@FindBy(how = How.XPATH , using="//input[@name='SignIn']") 
 //@FindBy(how = How.XPATH , using="//input[@value='Sign In']") 
 @FindBy(how = How.ID , using = "submit")
 public Button signIn;
 
 
/****** TEXT Elements ******/
 /* pfusername - TEXT */

 //@FindBy(how = How.NAME , using="pf.username") 
 //@FindBy(how = How.XPATH , using="//input[@id='name']") 
 //@FindBy(how = How.XPATH , using="//input[@name='pf.username']") 
 @FindBy(how = How.ID , using = "name")
 public Text pfusername;
 
 
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