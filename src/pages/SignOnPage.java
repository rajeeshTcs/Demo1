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
 *  Captured Environment : https://m12test-portal.auto.aws.infor.com/FSMMTQAT03_TST/fc7bc3b8-73e5-4874-a1ca-9bee07582215
 */


@CustomConfig("null")
public class SignOnPage extends BasePageObject<SignOnPage> {

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
 
 

/****** BUTTON Elements ******/
 /* lmPagesMenuBtn - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='lmPagesMenuBtn']") 
 @FindBy(how = How.ID , using = "lmPagesMenuBtn")
 public Button lmPagesMenuBtn;
 
 
 /* lmeditpagelayoutbtn - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Edit')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='lm-edit-page-layout-btn']") 
 @FindBy(how = How.ID , using = "lm-edit-page-layout-btn")
 public Button lmeditpagelayoutbtn;
 
 
 /* lmNavigationMenu - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Actions')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='lmNavigationMenu']") 
 @FindBy(how = How.ID , using = "lmNavigationMenu")
 public Button lmNavigationMenu;
 
 
 /* lmpnavexpandbtn - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[4]") 
 //@FindBy(how = How.XPATH , using="//button[@id='lm-pnav-expand-btn']") 
 @FindBy(how = How.ID , using = "lm-pnav-expand-btn")
 public Button lmpnavexpandbtn;
 
 
 /* lmpwladdbtn - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Create New Page')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='lm-pwl-add-btn']") 
 @FindBy(how = How.ID , using = "lm-pwl-add-btn")
 public Button lmpwladdbtn;
 
 
 /* lmpwlcatbtn - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Page Catalog')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='lm-pwl-cat-btn']") 
 @FindBy(how = How.ID , using = "lm-pwl-cat-btn")
 public Button lmpwlcatbtn;
 
 
 /* _1 - BUTTON */

 @IFrames({
  @IFrame(name="MingleOverlay" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=MingleOverlay", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/mingle/syndication?LogicalId=lid%3A%2F%2Finfor.social.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'OK')]") 
 //@FindBy(how = How.XPATH , using="//button[@name='1']") 
 //@FindBy(how = How.XPATH , using="//div[@id='confirmationModalDialogButtons']/button") 
 @FindBy(how = How.NAME , using = "1")
 public Button _1;
 
 
 /* _0 - BUTTON */

 @IFrames({
  @IFrame(name="MingleOverlay" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=MingleOverlay", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/mingle/syndication?LogicalId=lid%3A%2F%2Finfor.social.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Cancel')]") 
 //@FindBy(how = How.XPATH , using="//button[@name='0']") 
 //@FindBy(how = How.XPATH , using="//div[@id='confirmationModalDialogButtons']/button[2]") 
 @FindBy(how = How.NAME , using = "0")
 public Button _0;
 
 
/****** CHECKBOX Elements ******/
 /* chkbox - CHECKBOX */

 @IFrames({
  @IFrame(name="MingleOverlay" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=MingleOverlay", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/mingle/syndication?LogicalId=lid%3A%2F%2Finfor.social.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", }),
 })
 //@FindBy(how = How.XPATH , using="//input[@id='Chkbox']") 
 @FindBy(how = How.ID , using = "Chkbox")
 public CheckBox chkbox;
 
 
/****** LINK Elements ******/
 /* newPage - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'New Page...')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='#']") 
 //@FindBy(how = How.XPATH , using="//li[@id='lmNavNewPage']/a") 
 @FindBy(how = How.LINK_TEXT , using = "New Page...")
 public Link newPage;
 
 
 /* pageCatalog - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Page Catalog')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='lmNavPageCatalog']/a") 
 @FindBy(how = How.LINK_TEXT , using = "Page Catalog")
 public Link pageCatalog;
 
 
 /* about - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'About')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[3]") 
 //@FindBy(how = How.XPATH , using="//li[@id='xi-about-dialog-link']/a") 
 @FindBy(how = How.LINK_TEXT , using = "About")
 public Link about;
 
 
 /* advanced - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Advanced')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[4]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='lmNavigationMenuList']/li[6]/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Advanced']/ancestor::a")
 public Link advanced;
 
 
 /* refresh - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Refresh')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[5]") 
 //@FindBy(how = How.XPATH , using="//li[@id='lmNavRefreshPage']/a") 
 @FindBy(how = How.LINK_TEXT , using = "Refresh")
 public Link refresh;
 
 
 /* importPage - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Import Page...')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[6]") 
 //@FindBy(how = How.XPATH , using="//li[@id='lmNavImportPage']/a") 
 @FindBy(how = How.LINK_TEXT , using = "Import Page...")
 public Link importPage;
 
 
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