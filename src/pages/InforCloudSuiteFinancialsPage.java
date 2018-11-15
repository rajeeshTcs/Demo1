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

//import custom_elements.*;

/**
 *  Auto Generated Code Using GTNexus Automation :: PageBot ::
 *  :: Java Driven PageObject Generator Beta ::
 *  Captured Environment : https://m12test-sso.auto.aws.infor.com/idp/startSLO.ping?TargetResource=https://m12test-sso.auto.aws.infor.com:443/sp/fhGTx/resume/sp/startSLO.ping
 */


@CustomConfig("null")
public class InforCloudSuiteFinancialsPage extends BasePageObject<InforCloudSuiteFinancialsPage> {

public static final String PAGE_URL = "idp/startSLO.ping?TargetResource=https://m12test-sso.auto.aws.infor.com:443/sp/fhGTx/resume/sp/startSLO.ping";

public String relativePageUrl() {
    return this.PAGE_URL;
}

/**
 * Start Of Auto generated fields
 */


/****** BUTTON Elements ******/
 /* mhdrAppBtn - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='mhdrAppBtn']") 
 //@FindBy(how = How.XPATH , using="//button[@title='App Menu']") 
 @FindBy(how = How.ID , using = "mhdrAppBtn")
 public Button mhdrAppBtn;
 
 
 /* mSrchShw - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='mSrchShw']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Search']") 
 @FindBy(how = How.ID , using = "mSrchShw")
 public Button mSrchShw;
 
 
 /* rNavUsrBtn - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rNavUsrBtn']") 
 //@FindBy(how = How.XPATH , using="//button[@title='User Menu']") 
 @FindBy(how = How.ID , using = "rNavUsrBtn")
 public Button rNavUsrBtn;
 
 
 /* rNavSNewBtn - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[4]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rNavSNewBtn']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Share']") 
 @FindBy(how = How.ID , using = "rNavSNewBtn")
 public Button rNavSNewBtn;
 
 
 /* rNavBMKBtn - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[5]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rNavBMKBtn']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Bookmarks']") 
 @FindBy(how = How.ID , using = "rNavBMKBtn")
 public Button rNavBMKBtn;
 
 
 /* rNavECT - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[6]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rNavECT']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Context Apps']") 
 @FindBy(how = How.ID , using = "rNavECT")
 public Button rNavECT;
 
 
 /* genDisplay - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[7]") 
 //@FindBy(how = How.XPATH , using="//button[@id='genDisplay']") 
 @FindBy(how = How.ID , using = "genDisplay")
 public Button genDisplay;
 
 
 /* genDisplay_2 - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[8]") 
 //@FindBy(how = How.XPATH , using="(//button[@id='genDisplay'])[2]") 
 @FindBy(how = How.ID , using = "genDisplay")
 public Button genDisplay_2;
 
 
 /* genDisplay_3 - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[9]") 
 //@FindBy(how = How.XPATH , using="(//button[@id='genDisplay'])[3]") 
 @FindBy(how = How.ID , using = "genDisplay")
 public Button genDisplay_3;
 
 
 /* genDisplay_4 - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[10]") 
 //@FindBy(how = How.XPATH , using="(//button[@id='genDisplay'])[4]") 
 @FindBy(how = How.ID , using = "genDisplay")
 public Button genDisplay_4;
 
 
 /* pendocloseguide - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'�')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='_pendo-close-guide_']") 
 @FindBy(how = How.ID , using = "_pendo-close-guide_")
 public Button pendocloseguide;
 
 
/****** IFRAMEELEMENT Elements ******/
 /* homepagesfc7bc3b873e54874a1ca9bee07582215 - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215']") 
 //@FindBy(how = How.XPATH , using="//div[@id='appHolder0']/iframe") 
 @FindBy(how = How.NAME , using = "homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215")
 public IFrameElement homepagesfc7bc3b873e54874a1ca9bee07582215;
 
 
 /* fsm98fab800ec0e48b0af339c35aacf2e28 - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28']") 
 //@FindBy(how = How.XPATH , using="//div[@id='appPageKey1']/iframe") 
 @FindBy(how = How.NAME , using = "fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28")
 public IFrameElement fsm98fab800ec0e48b0af339c35aacf2e28;
 
 
 /* generice3e437ef4bad499da3881d4feded4ef7 - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='generic_e3e437ef-4bad-499d-a388-1d4feded4ef7']") 
 //@FindBy(how = How.XPATH , using="//div[@id='genCtxDiv']/iframe") 
 @FindBy(how = How.NAME , using = "generic_e3e437ef-4bad-499d-a388-1d4feded4ef7")
 public IFrameElement generice3e437ef4bad499da3881d4feded4ef7;
 
 
 /* genericdd70347486fa415287195406c8447286 - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='generic_dd703474-86fa-4152-8719-5406c8447286']") 
 //@FindBy(how = How.XPATH , using="(//div[@id='genCtxDiv'])[2]/iframe") 
 @FindBy(how = How.NAME , using = "generic_dd703474-86fa-4152-8719-5406c8447286")
 public IFrameElement genericdd70347486fa415287195406c8447286;
 
 
 /* generic7d000cb63fd54a2fa6b502a0b4a771e9 - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9']") 
 //@FindBy(how = How.XPATH , using="(//div[@id='genCtxDiv'])[3]/iframe") 
 @FindBy(how = How.NAME , using = "generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9")
 public IFrameElement generic7d000cb63fd54a2fa6b502a0b4a771e9;
 
 
 /* generic99c2d518b4d24c61afdff8582610085f - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='generic_99c2d518-b4d2-4c61-afdf-f8582610085f']") 
 //@FindBy(how = How.XPATH , using="(//div[@id='genCtxDiv'])[4]/iframe") 
 @FindBy(how = How.NAME , using = "generic_99c2d518-b4d2-4c61-afdf-f8582610085f")
 public IFrameElement generic99c2d518b4d24c61afdff8582610085f;
 
 
 /* mingleOverlay - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@name='MingleOverlay']") 
 //@FindBy(how = How.XPATH , using="//div[@id='synOlayfrm']/iframe") 
 @FindBy(how = How.NAME , using = "MingleOverlay")
 public IFrameElement mingleOverlay;
 
 
/****** LINK Elements ******/
 /* mhdrOpen - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='mhdrOpen']") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://www.infor.com/']") 
 @FindBy(how = How.ID , using = "mhdrOpen")
 public Link mhdrOpen;
 
 
 /* i7emp01Fsm - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'i7emp01 fsm')]") 
 //@FindBy(how = How.ID , using="usrNameLnk") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrNameLnk']") 
 //@FindBy(how = How.XPATH , using="//a[@href='javascript:void(0)']") 
 @FindBy(how = How.XPATH , using = "//span[text()='i7emp01 fsm']/ancestor::a")
 public Link i7emp01Fsm;
 
 
 /* alerts - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Alerts')]") 
 //@FindBy(how = How.ID , using="usrObjsLnk0") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrObjsLnk0']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[2]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Alerts']/ancestor::a")
 public Link alerts;
 
 
 /* tasks - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Tasks')]") 
 //@FindBy(how = How.ID , using="usrObjsLnk1") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrObjsLnk1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[3]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Tasks']/ancestor::a")
 public Link tasks;
 
 
 /* notifications - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Notifications')]") 
 //@FindBy(how = How.ID , using="usrObjsLnk2") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrObjsLnk2']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[4]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Notifications']/ancestor::a")
 public Link notifications;
 
 
 /* pendingRequests - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Pending Requests')]") 
 //@FindBy(how = How.ID , using="usrObjsLnk3") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrObjsLnk3']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[5]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Pending Requests']/ancestor::a")
 public Link pendingRequests;
 
 
 /* posts - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Posts')]") 
 //@FindBy(how = How.ID , using="usrObjsLnk4") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrObjsLnk4']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[6]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Posts']/ancestor::a")
 public Link posts;
 
 
 /* userSettings - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'User Settings')]") 
 //@FindBy(how = How.ID , using="usrSetting") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrSetting']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[7]") 
 @FindBy(how = How.XPATH , using = "//span[text()='User Settings']/ancestor::a")
 public Link userSettings;
 
 
 /* mobileApps - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Mobile Apps')]") 
 //@FindBy(how = How.ID , using="usrShwMob") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrShwMob']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[8]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Mobile Apps']/ancestor::a")
 public Link mobileApps;
 
 
 /* help - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Help')]") 
 //@FindBy(how = How.ID , using="usrHelpLnk") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrHelpLnk']") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://docs.infor.com/mingle/12.0.x/en-us/minceolh/default.html']") 
 @FindBy(how = How.XPATH , using = "//span[text()='Help']/ancestor::a")
 public Link help;
 
 
 /* about - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'About')]") 
 //@FindBy(how = How.ID , using="usrAbtShw") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrAbtShw']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[9]") 
 @FindBy(how = How.XPATH , using = "//span[text()='About']/ancestor::a")
 public Link about;
 
 
 /* signOut - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Sign out')]") 
 //@FindBy(how = How.ID , using="usrSignOut") 
 //@FindBy(how = How.XPATH , using="//a[@id='usrSignOut']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0)'])[10]") 
 @FindBy(how = How.XPATH , using = "//span[text()='Sign out']/ancestor::a")
 public Link signOut;
 
 
/****** TEXT Elements ******/
 /* searchInput - TEXT */

 //@FindBy(how = How.XPATH , using="//input[@id='searchInput']") 
 @FindBy(how = How.ID , using = "searchInput")
 public Text searchInput;
 
 
 /* input - TEXT */

 @FindBy(how = How.XPATH , using = "/html/body/div[5]/div/div/div/div/div[2]/input")
 public Text input;
 
 
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