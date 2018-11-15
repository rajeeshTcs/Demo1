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
 *  Captured Environment : https://m12test-portal.auto.aws.infor.com/FSMMTQAT03_TST/98fab800-ec0e-48b0-af33-9c35aacf2e28
 */


@CustomConfig("null")
public class HomepagesPage extends BasePageObject<HomepagesPage> {

public static final String PAGE_URL = "FSMMTQAT03_TST/98fab800-ec0e-48b0-af33-9c35aacf2e28";

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

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'×')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='_pendo-close-guide_']") 
 @FindBy(how = How.ID , using = "_pendo-close-guide_")
 public Button pendocloseguide;
 
 
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
 
 
 /* pendocloseguide_2 - BUTTON */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'×')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='_pendo-close-guide_']") 
 @FindBy(how = How.ID , using = "_pendo-close-guide_")
 public Button pendocloseguide_2;
 
 
 /* button - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'')]")
 public Button button;
 
 
 /* button_2 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[2]")
 public Button button_2;
 
 
 /* showSearch - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='showSearch']") 
 @FindBy(how = How.ID , using = "showSearch")
 public Button showSearch;
 
 
 /* hideSearch - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[4]") 
 //@FindBy(how = How.XPATH , using="//button[@id='hideSearch']") 
 @FindBy(how = How.ID , using = "hideSearch")
 public Button hideSearch;
 
 
 /* downloadBtn - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[5]") 
 //@FindBy(how = How.XPATH , using="//button[@id='downloadBtn']") 
 @FindBy(how = How.ID , using = "downloadBtn")
 public Button downloadBtn;
 
 
 /* moreButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[6]") 
 //@FindBy(how = How.XPATH , using="//button[@id='moreButton']") 
 @FindBy(how = How.ID , using = "moreButton")
 public Button moreButton;
 
 
 /* myRequisitionsWidgetToolbarStandardCreate - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[7]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardCreate']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardCreate")
 public Button myRequisitionsWidgetToolbarStandardCreate;
 
 
 /* myRequisitionsWidgetToolbarStandardCreateMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[8]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardCreateMenuButton']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardCreateMenuButton")
 public Button myRequisitionsWidgetToolbarStandardCreateMenuButton;
 
 
 /* myRequisitionsWidgetToolbarStandardUpdate - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[9]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardUpdate']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardUpdate")
 public Button myRequisitionsWidgetToolbarStandardUpdate;
 
 
 /* myRequisitionsWidgetToolbarStandardDelete - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[10]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardDelete']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardDelete")
 public Button myRequisitionsWidgetToolbarStandardDelete;
 
 
 /* myRequisitionsWidgetToolbarStandardRefresh - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[11]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardRefresh']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardRefresh")
 public Button myRequisitionsWidgetToolbarStandardRefresh;
 
 
 /* myRequisitionsWidgetToolbarStandardActionsMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Actions')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardActionsMenuButton']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardActionsMenuButton")
 public Button myRequisitionsWidgetToolbarStandardActionsMenuButton;
 
 
 /* myRequisitionsWidgetToolbarStandardOptionsMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Options')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardOptionsMenuButton']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardOptionsMenuButton")
 public Button myRequisitionsWidgetToolbarStandardOptionsMenuButton;
 
 
 /* myRequisitionsWidgetToolbarStandardDrillAroundMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Drill Around®')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyRequisitionsWidget_Toolbar_StandardDrillAroundMenuButton']") 
 @FindBy(how = How.ID , using = "MyRequisitionsWidget_Toolbar_StandardDrillAroundMenuButton")
 public Button myRequisitionsWidgetToolbarStandardDrillAroundMenuButton;
 
 
 /* button_3 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid_DataGrid']/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[15]")
 public Button button_3;
 
 
 /* gridSettings - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid_DataGrid']/button[2]") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Grid Settings')]")
 public Button gridSettings;
 
 
 /* button_4 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[17]")
 public Button button_4;
 
 
 /* button_5 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span/button[2]") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[18]")
 public Button button_5;
 
 
 /* button_6 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[3]/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[19]")
 public Button button_6;
 
 
 /* button_7 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[3]/button[2]") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[20]")
 public Button button_7;
 
 
 /* myItemListWidgetToolbarStandardCreate - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[21]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardCreate']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardCreate")
 public Button myItemListWidgetToolbarStandardCreate;
 
 
 /* myItemListWidgetToolbarStandardCreateMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[22]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardCreateMenuButton']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardCreateMenuButton")
 public Button myItemListWidgetToolbarStandardCreateMenuButton;
 
 
 /* myItemListWidgetToolbarStandardDelete - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[23]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardDelete']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardDelete")
 public Button myItemListWidgetToolbarStandardDelete;
 
 
 /* myItemListWidgetToolbarStandardRefresh - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[24]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardRefresh']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardRefresh")
 public Button myItemListWidgetToolbarStandardRefresh;
 
 
 /* myItemListWidgetToolbarStandardActionsMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'Actions')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardActionsMenuButton']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardActionsMenuButton")
 public Button myItemListWidgetToolbarStandardActionsMenuButton;
 
 
 /* myItemListWidgetToolbarStandardOptionsMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'Options')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardOptionsMenuButton']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardOptionsMenuButton")
 public Button myItemListWidgetToolbarStandardOptionsMenuButton;
 
 
 /* myItemListWidgetToolbarStandardDrillAroundMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'Drill Around®')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='MyItemListWidget_Toolbar_StandardDrillAroundMenuButton']") 
 @FindBy(how = How.ID , using = "MyItemListWidget_Toolbar_StandardDrillAroundMenuButton")
 public Button myItemListWidgetToolbarStandardDrillAroundMenuButton;
 
 
 /* button_8 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid_DataGrid']/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[28]")
 public Button button_8;
 
 
 /* gridSettings_2 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid_DataGrid']/button[2]") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Grid Settings')]")
 public Button gridSettings_2;
 
 
 /* button_9 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[30]")
 public Button button_9;
 
 
 /* button_10 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span/button[2]") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[31]")
 public Button button_10;
 
 
 /* button_11 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[3]/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[32]")
 public Button button_11;
 
 
 /* button_12 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[3]/button[2]") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[33]")
 public Button button_12;
 
 
 /* punchoutVendorsWidgetToolbarStandardCreate - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[34]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardCreate']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardCreate")
 public Button punchoutVendorsWidgetToolbarStandardCreate;
 
 
 /* punchoutVendorsWidgetToolbarStandardCreateMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[35]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardCreateMenuButton']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardCreateMenuButton")
 public Button punchoutVendorsWidgetToolbarStandardCreateMenuButton;
 
 
 /* punchoutVendorsWidgetToolbarStandardUpdate - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[36]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardUpdate']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardUpdate")
 public Button punchoutVendorsWidgetToolbarStandardUpdate;
 
 
 /* punchoutVendorsWidgetToolbarStandardDelete - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[37]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardDelete']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardDelete")
 public Button punchoutVendorsWidgetToolbarStandardDelete;
 
 
 /* punchoutVendorsWidgetToolbarStandardRefresh - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[38]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardRefresh']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardRefresh")
 public Button punchoutVendorsWidgetToolbarStandardRefresh;
 
 
 /* punchoutVendorsWidgetToolbarStandardActionsMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'Actions')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardActionsMenuButton']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardActionsMenuButton")
 public Button punchoutVendorsWidgetToolbarStandardActionsMenuButton;
 
 
 /* punchoutVendorsWidgetToolbarStandardOptionsMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'Options')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardOptionsMenuButton']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardOptionsMenuButton")
 public Button punchoutVendorsWidgetToolbarStandardOptionsMenuButton;
 
 
 /* punchoutVendorsWidgetToolbarStandardDrillAroundMenuButton - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'Drill Around®')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='PunchoutVendorsWidget_Toolbar_StandardDrillAroundMenuButton']") 
 @FindBy(how = How.ID , using = "PunchoutVendorsWidget_Toolbar_StandardDrillAroundMenuButton")
 public Button punchoutVendorsWidgetToolbarStandardDrillAroundMenuButton;
 
 
 /* button_13 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid_DataGrid']/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[42]")
 public Button button_13;
 
 
 /* gridSettings_3 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid_DataGrid']/button[2]") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Grid Settings')]")
 public Button gridSettings_3;
 
 
 /* button_14 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[44]")
 public Button button_14;
 
 
 /* button_15 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span/button[2]") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[45]")
 public Button button_15;
 
 
 /* button_16 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[3]/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[46]")
 public Button button_16;
 
 
 /* button_17 - BUTTON */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[3]/button[2]") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[47]")
 public Button button_17;
 
 
 /* button_18 - BUTTON */

 @IFrames({
  @IFrame(name="generic_e3e437ef-4bad-499d-a388-1d4feded4ef7" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 390px;", "name=generic_e3e437ef-4bad-499d-a388-1d4feded4ef7", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/webpart/ionalerts?ContextAppInstanceId=e3e437ef-4bad-499d-a388-1d4feded4ef7", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/div[2]/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'')]")
 public Button button_18;
 
 
 /* expand - BUTTON */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='reqAccordion']/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Expand')]")
 public Button expand;
 
 
 /* expand_2 - BUTTON */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='poAccordion']/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Expand')]")
 public Button expand_2;
 
 
 /* expand_3 - BUTTON */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='recAccordion']/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Expand')]")
 public Button expand_3;
 
 
 /* expand_4 - BUTTON */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='invAccordion']/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Expand')]")
 public Button expand_4;
 
 
 /* expand_5 - BUTTON */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='payAccordion']/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Expand')]")
 public Button expand_5;
 
 
 /* expand_6 - BUTTON */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='bankAccordion']/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'Expand')]")
 public Button expand_6;
 
 
 /* icbiellipsisbutton - BUTTON */

 @IFrames({
  @IFrame(name="generic_99c2d518-b4d2-4c61-afdf-f8582610085f" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_99c2d518-b4d2-4c61-afdf-f8582610085f", "src=https://bi-integ.auto.aws.infor.com:443/BIFSM/ICBI?App=BIFSM&ContextAppInstanceId=99c2d518-b4d2-4c61-afdf-f8582610085f", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='icbi-ellipsis-button']") 
 @FindBy(how = How.ID , using = "icbi-ellipsis-button")
 public Button icbiellipsisbutton;
 
 
 /* _1_3 - BUTTON */

 @IFrames({
  @IFrame(name="MingleOverlay" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=MingleOverlay", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/mingle/syndication?LogicalId=lid%3A%2F%2Finfor.social.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'OK')]") 
 //@FindBy(how = How.XPATH , using="//button[@name='1']") 
 //@FindBy(how = How.XPATH , using="//div[@id='confirmationModalDialogButtons']/button") 
 @FindBy(how = How.NAME , using = "1")
 public Button _1_3;
 
 
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
 
 
/****** IFRAMEELEMENT Elements ******/
 /* iframe - IFRAMEELEMENT */

 @FindBy(how = How.XPATH , using = "//li[@id='mhdrApp']/iframe")
 public IFrameElement iframe;
 
 
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
 
 
 /* homepages - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='icdeskSClk']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Homepages']") 
 @FindBy(how = How.ID , using = "icdeskSClk")
 public Link homepages;
 
 
 /* inforCloudSuiteFinancials - LINK */

 //@FindBy(how = How.XPATH , using="(//a[@id='icdeskSClk'])[2]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Infor CloudSuite Financials']") 
 @FindBy(how = How.ID , using = "icdeskSClk")
 public Link inforCloudSuiteFinancials;
 
 
 /* inforMingle - LINK */

 //@FindBy(how = How.XPATH , using="(//a[@id='icdeskSClk'])[3]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Infor Ming.le™ ']") 
 @FindBy(how = How.ID , using = "icdeskSClk")
 public Link inforMingle;
 
 
 /* bIFSM - LINK */

 //@FindBy(how = How.XPATH , using="(//a[@id='icdeskSClk'])[4]") 
 //@FindBy(how = How.XPATH , using="//a[@title='BI FSM']") 
 @FindBy(how = How.ID , using = "icdeskSClk")
 public Link bIFSM;
 
 
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
 
 
 /* about_2 - LINK */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'About')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[3]") 
 //@FindBy(how = How.XPATH , using="//li[@id='xi-about-dialog-link']/a") 
 @FindBy(how = How.LINK_TEXT , using = "About")
 public Link about_2;
 
 
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
 
 
 /* requester - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Requester')]") 
 //@FindBy(how = How.ID , using="appNavA15270676779260") 
 //@FindBy(how = How.XPATH , using="//a[@id='appNavA15270676779260']") 
 //@FindBy(how = How.XPATH , using="//a[@href='javascript:void(0);']") 
 @FindBy(how = How.LINK_TEXT , using = "Requester")
 public Link requester;
 
 
 /* administrationConsole - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Administration Console')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/AdministratorConsole/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li/a") 
 @FindBy(how = How.LINK_TEXT , using = "Administration Console")
 public Link administrationConsole;
 
 
 /* applicationAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Application Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ApplicationAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Application Administrator")
 public Link applicationAdministrator;
 
 
 /* asyncAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Async Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/AsyncWebApp/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Async Administrator")
 public Link asyncAdministrator;
 
 
 /* billingAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Billing Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BillingAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[4]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Billing Administrator")
 public Link billingAdministrator;
 
 
 /* billingManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Billing Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BillingManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[5]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Billing Manager")
 public Link billingManager;
 
 
 /* budgetAnalyst - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Budget Analyst')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BudgetAnalyst/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[6]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Budget Analyst")
 public Link budgetAnalyst;
 
 
 /* budgetController - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Budget Controller')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BudgetController/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[7]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Budget Controller")
 public Link budgetController;
 
 
 /* buyer - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Buyer')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/Buyer/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[8]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Buyer")
 public Link buyer;
 
 
 /* cashAccountant - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Cash Accountant')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashAccountant/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[9]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Accountant")
 public Link cashAccountant;
 
 
 /* cashAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Cash Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[10]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Administrator")
 public Link cashAdministrator;
 
 
 /* cashAnalyst - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Cash Analyst')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashAnalyst/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[11]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Analyst")
 public Link cashAnalyst;
 
 
 /* cashManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Cash Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[12]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Manager")
 public Link cashManager;
 
 
 /* contractManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Contract Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ContractManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[13]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Contract Manager")
 public Link contractManager;
 
 
 /* contractTermsManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Contract Terms Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ContractTermsManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[14]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Contract Terms Manager")
 public Link contractTermsManager;
 
 
 /* financialBusinessAnalyst - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Financial Business Analyst')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/FinancialBusinessAnalyst/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[15]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Financial Business Analyst")
 public Link financialBusinessAnalyst;
 
 
 /* financialsViewer - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Financials Viewer')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/FinancialsViewer/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[16]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Financials Viewer")
 public Link financialsViewer;
 
 
 /* franchiseBillingAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Franchise Billing Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/FranchiseManagementAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[17]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Franchise Billing Administrator")
 public Link franchiseBillingAdministrator;
 
 
 /* inventoryManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Inventory Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/InventoryManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[18]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Inventory Manager")
 public Link inventoryManager;
 
 
 /* itemMasterSpecialist - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Item Master Specialist')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ItemMasterSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[19]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Item Master Specialist")
 public Link itemMasterSpecialist;
 
 
 /* jobConsole - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Job Console')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BatchTaskAdmin/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[20]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Job Console")
 public Link jobConsole;
 
 
 /* journalApprover - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Journal Approver')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/JournalApprover/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[21]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Journal Approver")
 public Link journalApprover;
 
 
 /* landingPageDesigner - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Landing Page Designer')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/LandingPageWebapp/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[22]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Landing Page Designer")
 public Link landingPageDesigner;
 
 
 /* matchSpecialist - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Match Specialist')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/MatchSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[23]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Match Specialist")
 public Link matchSpecialist;
 
 
 /* orderEntryManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Order Entry Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/OrderEntryManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[24]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Order Entry Manager")
 public Link orderEntryManager;
 
 
 /* parLevelSpecialist - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Par Level Specialist')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ParLevelSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[25]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Par Level Specialist")
 public Link parLevelSpecialist;
 
 
 /* payablesAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Payables Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PayablesAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[26]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Payables Administrator")
 public Link payablesAdministrator;
 
 
 /* payablesInvoiceProcessor - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Payables Invoice Processor')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PayablesProcessor/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[27]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Payables Invoice Processor")
 public Link payablesInvoiceProcessor;
 
 
 /* payablesManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Payables Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PayablesManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[28]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Payables Manager")
 public Link payablesManager;
 
 
 /* processDesigner - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Process Designer')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ProcessDesigner/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[29]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Process Designer")
 public Link processDesigner;
 
 
 /* processServer - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Process Server')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/Lpa/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[30]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Process Server")
 public Link processServer;
 
 
 /* processServerAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Process Server Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/LpaAdmin/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[31]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Process Server Administrator")
 public Link processServerAdministrator;
 
 
 /* projectAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Project Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ProjectAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[32]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Project Administrator")
 public Link projectAdministrator;
 
 
 /* projectCertifier - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Project Certifier')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ProjectCertifier/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[33]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Project Certifier")
 public Link projectCertifier;
 
 
 /* purchasingManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Purchasing Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PurchasingManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[34]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Purchasing Manager")
 public Link purchasingManager;
 
 
 /* purchasingReceiver - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Purchasing Receiver')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/Receiver/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[35]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Purchasing Receiver")
 public Link purchasingReceiver;
 
 
 /* recallAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Recall Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/RecallAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[36]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Recall Administrator")
 public Link recallAdministrator;
 
 
 /* recallCoordinator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Recall Coordinator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/RecallCoordinator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[37]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Recall Coordinator")
 public Link recallCoordinator;
 
 
 /* receivablesAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Receivables Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ReceivablesAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[38]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Receivables Administrator")
 public Link receivablesAdministrator;
 
 
 /* receivablesManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Receivables Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ReceivablesManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[39]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Receivables Manager")
 public Link receivablesManager;
 
 
 /* receivablesSpecialist - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Receivables Specialist')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ReceivablesSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[40]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Receivables Specialist")
 public Link receivablesSpecialist;
 
 
 /* supplyManagementAdministrator - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Supply Management Administrator')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/SupplyManagementAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[41]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Supply Management Administrator")
 public Link supplyManagementAdministrator;
 
 
 /* supplyManagementViewer - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Supply Management Viewer')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/SupplyManagementViewer/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[42]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Supply Management Viewer")
 public Link supplyManagementViewer;
 
 
 /* warehouseClerk - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Warehouse Clerk')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/WarehouseClerk/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[43]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Warehouse Clerk")
 public Link warehouseClerk;
 
 
 /* workOrderManager - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Work Order Manager')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/WorkOrderManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[2]/ul/li[44]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Work Order Manager")
 public Link workOrderManager;
 
 
 /* myRequisitions - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'My Requisitions')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.MyRequisitions?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requisitions")
 public Link myRequisitions;
 
 
 /* allRequisitions - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'All Requisitions')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.AllRequisitions?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[4]/a") 
 @FindBy(how = How.LINK_TEXT , using = "All Requisitions")
 public Link allRequisitions;
 
 
 /* myRequisitionStatuses - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'My Requisition Statuses')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.MyRequisitionStatuses?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[5]/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requisition Statuses")
 public Link myRequisitionStatuses;
 
 
 /* createRequisition - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Create Requisition')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.CreateRequisition?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[6]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Create Requisition")
 public Link createRequisition;
 
 
 /* procurementTemplates - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Procurement Templates')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ProcurementTemplates?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[7]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Procurement Templates")
 public Link procurementTemplates;
 
 
 /* itemSearch - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Item Search')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ItemSearch?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[8]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Item Search")
 public Link itemSearch;
 
 
 /* reportANotice - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Report A Notice')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ReportANotice?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[9]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Report A Notice")
 public Link reportANotice;
 
 
 /* viewMyRecallNotices - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'View My Recall Notices')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ViewMyRecallNotices?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[10]/a") 
 @FindBy(how = How.LINK_TEXT , using = "View My Recall Notices")
 public Link viewMyRecallNotices;
 
 
 /* myRequesterProfile - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'My Requester Profile')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.MyRequesterProfile?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[11]/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requester Profile")
 public Link myRequesterProfile;
 
 
 /* requisitionSelfService - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Requisition Self Service')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.RequisitionSelfService?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[12]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Requisition Self Service")
 public Link requisitionSelfService;
 
 
 /* requestNewItem - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Request New Item')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0);'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[13]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Request New Item")
 public Link requestNewItem;
 
 
 /* refreshRequisitionCubes - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Refresh Requisition Cubes')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0);'])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='RequesterMenuMenuBar']/ul/li[14]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Refresh Requisition Cubes")
 public Link refreshRequisitionCubes;
 
 
 /* more - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'More...')]") 
 //@FindBy(how = How.ID , using="appNavA15270676779261") 
 //@FindBy(how = How.XPATH , using="//a[@id='appNavA15270676779261']") 
 //@FindBy(how = How.XPATH , using="//a[@href='#']") 
 @FindBy(how = How.LINK_TEXT , using = "More...")
 public Link more;
 
 
 /* requester_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Requester')])[3]") 
 //@FindBy(how = How.ID , using="appNavA15270676779260") 
 //@FindBy(how = How.XPATH , using="(//a[@id='appNavA15270676779260'])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0);'])[4]") 
 @FindBy(how = How.LINK_TEXT , using = "Requester")
 public Link requester_2;
 
 
 /* administrationConsole_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Administration Console')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/AdministratorConsole/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li/a") 
 @FindBy(how = How.LINK_TEXT , using = "Administration Console")
 public Link administrationConsole_2;
 
 
 /* applicationAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Application Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ApplicationAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Application Administrator")
 public Link applicationAdministrator_2;
 
 
 /* asyncAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Async Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/AsyncWebApp/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Async Administrator")
 public Link asyncAdministrator_2;
 
 
 /* billingAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Billing Administrator')])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BillingAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[4]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Billing Administrator")
 public Link billingAdministrator_2;
 
 
 /* billingManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Billing Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BillingManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[5]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Billing Manager")
 public Link billingManager_2;
 
 
 /* budgetAnalyst_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Budget Analyst')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BudgetAnalyst/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[6]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Budget Analyst")
 public Link budgetAnalyst_2;
 
 
 /* budgetController_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Budget Controller')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BudgetController/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[7]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Budget Controller")
 public Link budgetController_2;
 
 
 /* buyer_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Buyer')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/Buyer/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[8]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Buyer")
 public Link buyer_2;
 
 
 /* cashAccountant_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Cash Accountant')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashAccountant/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[9]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Accountant")
 public Link cashAccountant_2;
 
 
 /* cashAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Cash Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[10]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Administrator")
 public Link cashAdministrator_2;
 
 
 /* cashAnalyst_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Cash Analyst')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashAnalyst/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[11]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Analyst")
 public Link cashAnalyst_2;
 
 
 /* cashManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Cash Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/CashManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[12]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Cash Manager")
 public Link cashManager_2;
 
 
 /* contractManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Contract Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ContractManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[13]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Contract Manager")
 public Link contractManager_2;
 
 
 /* contractTermsManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Contract Terms Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ContractTermsManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[14]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Contract Terms Manager")
 public Link contractTermsManager_2;
 
 
 /* financialBusinessAnalyst_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Financial Business Analyst')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/FinancialBusinessAnalyst/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[15]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Financial Business Analyst")
 public Link financialBusinessAnalyst_2;
 
 
 /* financialsViewer_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Financials Viewer')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/FinancialsViewer/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[16]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Financials Viewer")
 public Link financialsViewer_2;
 
 
 /* franchiseBillingAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Franchise Billing Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/FranchiseManagementAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[17]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Franchise Billing Administrator")
 public Link franchiseBillingAdministrator_2;
 
 
 /* inventoryManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Inventory Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/InventoryManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[18]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Inventory Manager")
 public Link inventoryManager_2;
 
 
 /* itemMasterSpecialist_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Item Master Specialist')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ItemMasterSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[19]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Item Master Specialist")
 public Link itemMasterSpecialist_2;
 
 
 /* jobConsole_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Job Console')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/BatchTaskAdmin/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[20]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Job Console")
 public Link jobConsole_2;
 
 
 /* journalApprover_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Journal Approver')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/JournalApprover/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[21]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Journal Approver")
 public Link journalApprover_2;
 
 
 /* landingPageDesigner_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Landing Page Designer')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/LandingPageWebapp/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[22]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Landing Page Designer")
 public Link landingPageDesigner_2;
 
 
 /* matchSpecialist_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Match Specialist')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/MatchSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[23]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Match Specialist")
 public Link matchSpecialist_2;
 
 
 /* orderEntryManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Order Entry Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/OrderEntryManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[24]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Order Entry Manager")
 public Link orderEntryManager_2;
 
 
 /* parLevelSpecialist_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Par Level Specialist')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ParLevelSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[25]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Par Level Specialist")
 public Link parLevelSpecialist_2;
 
 
 /* payablesAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Payables Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PayablesAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[26]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Payables Administrator")
 public Link payablesAdministrator_2;
 
 
 /* payablesInvoiceProcessor_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Payables Invoice Processor')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PayablesProcessor/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[27]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Payables Invoice Processor")
 public Link payablesInvoiceProcessor_2;
 
 
 /* payablesManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Payables Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PayablesManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[28]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Payables Manager")
 public Link payablesManager_2;
 
 
 /* processDesigner_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Process Designer')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ProcessDesigner/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[29]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Process Designer")
 public Link processDesigner_2;
 
 
 /* processServer_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Process Server')])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/Lpa/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[30]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Process Server")
 public Link processServer_2;
 
 
 /* processServerAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Process Server Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/LpaAdmin/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[31]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Process Server Administrator")
 public Link processServerAdministrator_2;
 
 
 /* projectAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Project Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ProjectAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[32]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Project Administrator")
 public Link projectAdministrator_2;
 
 
 /* projectCertifier_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Project Certifier')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ProjectCertifier/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[33]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Project Certifier")
 public Link projectCertifier_2;
 
 
 /* purchasingManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Purchasing Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/PurchasingManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[34]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Purchasing Manager")
 public Link purchasingManager_2;
 
 
 /* purchasingReceiver_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Purchasing Receiver')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/Receiver/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[35]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Purchasing Receiver")
 public Link purchasingReceiver_2;
 
 
 /* recallAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Recall Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/RecallAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[36]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Recall Administrator")
 public Link recallAdministrator_2;
 
 
 /* recallCoordinator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Recall Coordinator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/RecallCoordinator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[37]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Recall Coordinator")
 public Link recallCoordinator_2;
 
 
 /* receivablesAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Receivables Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ReceivablesAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[38]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Receivables Administrator")
 public Link receivablesAdministrator_2;
 
 
 /* receivablesManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Receivables Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ReceivablesManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[39]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Receivables Manager")
 public Link receivablesManager_2;
 
 
 /* receivablesSpecialist_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Receivables Specialist')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/ReceivablesSpecialist/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[40]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Receivables Specialist")
 public Link receivablesSpecialist_2;
 
 
 /* supplyManagementAdministrator_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Supply Management Administrator')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/SupplyManagementAdministrator/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[41]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Supply Management Administrator")
 public Link supplyManagementAdministrator_2;
 
 
 /* supplyManagementViewer_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Supply Management Viewer')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/SupplyManagementViewer/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[42]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Supply Management Viewer")
 public Link supplyManagementViewer_2;
 
 
 /* warehouseClerk_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Warehouse Clerk')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/WarehouseClerk/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[43]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Warehouse Clerk")
 public Link warehouseClerk_2;
 
 
 /* workOrderManager_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Work Order Manager')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/WorkOrderManager/home?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[2]/ul/li[44]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Work Order Manager")
 public Link workOrderManager_2;
 
 
 /* myRequisitions_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'My Requisitions')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.MyRequisitions?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requisitions")
 public Link myRequisitions_2;
 
 
 /* allRequisitions_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'All Requisitions')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.AllRequisitions?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[4]/a") 
 @FindBy(how = How.LINK_TEXT , using = "All Requisitions")
 public Link allRequisitions_2;
 
 
 /* myRequisitionStatuses_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'My Requisition Statuses')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.MyRequisitionStatuses?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[5]/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requisition Statuses")
 public Link myRequisitionStatuses_2;
 
 
 /* createRequisition_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Create Requisition')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.CreateRequisition?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[6]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Create Requisition")
 public Link createRequisition_2;
 
 
 /* procurementTemplates_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Procurement Templates')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ProcurementTemplates?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[7]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Procurement Templates")
 public Link procurementTemplates_2;
 
 
 /* itemSearch_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Item Search')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ItemSearch?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[8]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Item Search")
 public Link itemSearch_2;
 
 
 /* reportANotice_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Report A Notice')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ReportANotice?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[9]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Report A Notice")
 public Link reportANotice_2;
 
 
 /* viewMyRecallNotices_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'View My Recall Notices')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.ViewMyRecallNotices?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[10]/a") 
 @FindBy(how = How.LINK_TEXT , using = "View My Recall Notices")
 public Link viewMyRecallNotices_2;
 
 
 /* myRequesterProfile_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'My Requester Profile')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.MyRequesterProfile?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[11]/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requester Profile")
 public Link myRequesterProfile_2;
 
 
 /* requisitionSelfService_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Requisition Self Service')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/menu/RequesterMenu.RequisitionSelfService?csk.LogicalId=lid://infor.fsm.auto&csk.hidetitlebar=true'])[2]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[12]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Requisition Self Service")
 public Link requisitionSelfService_2;
 
 
 /* requestNewItem_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Request New Item')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0);'])[5]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[13]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Request New Item")
 public Link requestNewItem_2;
 
 
 /* refreshRequisitionCubes_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Refresh Requisition Cubes')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='javascript:void(0);'])[6]") 
 //@FindBy(how = How.XPATH , using="//li[@id='overFlowMenu']/ul/li[14]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Refresh Requisition Cubes")
 public Link refreshRequisitionCubes_2;
 
 
 /* myOpenRequisitions - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'My Open Requisitions')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/list/Requisition.MyRequisitionsWidget?&csk.LogicalId=lid%3A%2F%2Finfor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Open Requisitions")
 public Link myOpenRequisitions;
 
 
 /* searchMyOrderedItems - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Search My Ordered Items')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/list/RequesterItemCount.MyItemListWidget?&csk.LogicalId=lid%3A%2F%2Finfor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[2]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "Search My Ordered Items")
 public Link searchMyOrderedItems;
 
 
 /* punchoutVendors - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Punchout Vendors')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://fin-fsmmtqat03-tst.auto.aws.infor.com/fsm/Requester/list/RequesterPunchoutVendor.PunchoutVendorsWidget?&csk.LogicalId=lid%3A%2F%2Finfor.fsm.auto&csk.hidetitlebar=true']") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[3]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "Punchout Vendors")
 public Link punchoutVendors;
 
 
 /* myRequisitions_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'My Requisitions')])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[4]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Requisitions")
 public Link myRequisitions_3;
 
 
 /* requisitionsNeedingApproval - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Requisitions Needing Approval')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[5]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "Requisitions Needing Approval")
 public Link requisitionsNeedingApproval;
 
 
 /* myClosedRequisitions - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'My Closed Requisitions')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[6]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "My Closed Requisitions")
 public Link myClosedRequisitions;
 
 
 /* requestNewItem_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Request New Item')])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[7]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "Request New Item")
 public Link requestNewItem_3;
 
 
 /* orderSpecialItems - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Order Special Items')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[8]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "Order Special Items")
 public Link orderSpecialItems;
 
 
 /* viewPurchaseOrderReceipts - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'View Purchase Order Receipts')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='Requester_LandingPage']/div/div/ul/li[9]/div/div/div/div/div/a") 
 @FindBy(how = How.LINK_TEXT , using = "View Purchase Order Receipts")
 public Link viewPurchaseOrderReceipts;
 
 
 /* showFilterRow - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Show Filter Row')]") 
 //@FindBy(how = How.ID , using="showFilter") 
 //@FindBy(how = How.XPATH , using="//a[@id='showFilter']") 
 //@FindBy(how = How.XPATH , using="//a[@href='#sfr']") 
 @FindBy(how = How.LINK_TEXT , using = "Show Filter Row")
 public Link showFilterRow;
 
 
 /* columnPersonalization - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Column Personalization')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='#cp']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridSettingsMenu579348']/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Column Personalization")
 public Link columnPersonalization;
 
 
 /* resetToDefaultLayout - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Reset to Default Layout')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='#re']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridSettingsMenu579348']/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Reset to Default Layout")
 public Link resetToDefaultLayout;
 
 
 /* runFilter - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Run Filter')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='#rf']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridFilterMenu579348']/li/a") 
 @FindBy(how = How.LINK_TEXT , using = "Run Filter")
 public Link runFilter;
 
 
 /* clearFilter - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Clear Filter')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='#cf']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridFilterMenu579348']/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Clear Filter")
 public Link clearFilter;
 
 
 /* showFilterRow_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Show Filter Row')])[2]") 
 //@FindBy(how = How.ID , using="showFilter") 
 //@FindBy(how = How.XPATH , using="(//a[@id='showFilter'])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#sfr'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Show Filter Row")
 public Link showFilterRow_2;
 
 
 /* columnPersonalization_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Column Personalization')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#cp'])[2]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridSettingsMenu425244']/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Column Personalization")
 public Link columnPersonalization_2;
 
 
 /* resetToDefaultLayout_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Reset to Default Layout')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#re'])[2]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridSettingsMenu425244']/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Reset to Default Layout")
 public Link resetToDefaultLayout_2;
 
 
 /* runFilter_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Run Filter')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#rf'])[2]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridFilterMenu425244']/li/a") 
 @FindBy(how = How.LINK_TEXT , using = "Run Filter")
 public Link runFilter_2;
 
 
 /* clearFilter_2 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Clear Filter')])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#cf'])[2]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridFilterMenu425244']/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Clear Filter")
 public Link clearFilter_2;
 
 
 /* showFilterRow_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Show Filter Row')])[3]") 
 //@FindBy(how = How.ID , using="showFilter") 
 //@FindBy(how = How.XPATH , using="(//a[@id='showFilter'])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#sfr'])[3]") 
 @FindBy(how = How.LINK_TEXT , using = "Show Filter Row")
 public Link showFilterRow_3;
 
 
 /* columnPersonalization_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Column Personalization')])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#cp'])[3]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridSettingsMenu734349']/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Column Personalization")
 public Link columnPersonalization_3;
 
 
 /* resetToDefaultLayout_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Reset to Default Layout')])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#re'])[3]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridSettingsMenu734349']/li[3]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Reset to Default Layout")
 public Link resetToDefaultLayout_3;
 
 
 /* runFilter_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Run Filter')])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#rf'])[3]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridFilterMenu734349']/li/a") 
 @FindBy(how = How.LINK_TEXT , using = "Run Filter")
 public Link runFilter_3;
 
 
 /* clearFilter_3 - LINK */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Clear Filter')])[3]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#cf'])[3]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='inforGridFilterMenu734349']/li[2]/a") 
 @FindBy(how = How.LINK_TEXT , using = "Clear Filter")
 public Link clearFilter_3;
 
 
 /* subscribe - LINK */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 //@FindBy(how = How.XPATH , using="//a[@title='Subscribe']") 
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/div/div[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[@href='#']")
 public Link subscribe;
 
 
 /* edit - LINK */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 //@FindBy(how = How.XPATH , using="//a[@title='Edit']") 
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/div/div[2]/a[2]") 
 @FindBy(how = How.XPATH , using = "(//a[@href='#'])[2]")
 public Link edit;
 
 
 /* cancel - LINK */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 //@FindBy(how = How.XPATH , using="//a[@title='Cancel']") 
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/div/div[2]/a[3]") 
 @FindBy(how = How.XPATH , using = "(//a[@href='#'])[3]")
 public Link cancel;
 
 
 /* pREV - LINK */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'PREV')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[4]") 
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/nav/a") 
 @FindBy(how = How.LINK_TEXT , using = "PREV")
 public Link pREV;
 
 
 /* nEXT - LINK */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'NEXT')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[5]") 
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/nav/a[2]") 
 @FindBy(how = How.LINK_TEXT , using = "NEXT")
 public Link nEXT;
 
 
 /* requisition - LINK */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Requisition')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='#']") 
 //@FindBy(how = How.XPATH , using="//div[@id='reqAccordion']/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Requisition']/ancestor::a")
 public Link requisition;
 
 
 /* purchaseOrder - LINK */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Purchase Order')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='poAccordion']/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Purchase Order']/ancestor::a")
 public Link purchaseOrder;
 
 
 /* receiving - LINK */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Receiving')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='recAccordion']/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Receiving']/ancestor::a")
 public Link receiving;
 
 
 /* invoice - LINK */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Invoice')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[4]") 
 //@FindBy(how = How.XPATH , using="//div[@id='invAccordion']/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Invoice']/ancestor::a")
 public Link invoice;
 
 
 /* payment - LINK */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Payment')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[5]") 
 //@FindBy(how = How.XPATH , using="//div[@id='payAccordion']/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Payment']/ancestor::a")
 public Link payment;
 
 
 /* bankTransaction - LINK */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Bank Transaction')]") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[6]") 
 //@FindBy(how = How.XPATH , using="//div[@id='bankAccordion']/a") 
 @FindBy(how = How.XPATH , using = "//span[text()='Bank Transaction']/ancestor::a")
 public Link bankTransaction;
 
 
/****** SELECT Elements ******/
 /* select - SELECT */

 @IFrames({
  @IFrame(name="generic_e3e437ef-4bad-499d-a388-1d4feded4ef7" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 390px;", "name=generic_e3e437ef-4bad-499d-a388-1d4feded4ef7", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/webpart/ionalerts?ContextAppInstanceId=e3e437ef-4bad-499d-a388-1d4feded4ef7", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/div[4]/select") 
 @FindBy(how = How.XPATH , using = "//select[@title='Filter by Category']")
 public Combo select;
 
 
 /* select_2 - SELECT */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='body']/div/div[2]/div[2]/select")
 public Combo select_2;
 
 
/****** TEXT Elements ******/
 /* searchInput - TEXT */

 //@FindBy(how = How.XPATH , using="//input[@id='searchInput']") 
 @FindBy(how = How.ID , using = "searchInput")
 public Text searchInput;
 
 
 /* input - TEXT */

 @FindBy(how = How.XPATH , using = "/html/body/div[5]/div/div/div/div/div[2]/input")
 public Text input;
 
 
 /* input_2 - TEXT */

 @IFrames({
  @IFrame(name="homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=homepages_fc7bc3b8-73e5-4874-a1ca-9bee07582215", "src=https://m12test-extensions.auto.aws.infor.com/lime/?customloading=true&HybridCertified=0&Responsive=mobile&xfo=https%3a%2f%2fm12test-portal.auto.aws.infor.com&LogicalId=lid%3A%2F%2Finfor.homepages.1&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 @FindBy(how = How.XPATH , using = "/html/body/div[2]/div/div/div/div/div[2]/input")
 public Text input_2;
 
 
 /* productSearch - TEXT */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//input[@id='productSearch']") 
 @FindBy(how = How.ID , using = "productSearch")
 public Text productSearch;
 
 
 /* _1 - TEXT */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[2]/input") 
 @FindBy(how = How.XPATH , using = "//input[@value='1']")
 public Text _1;
 
 
 /* input_3 - TEXT */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='MyRequisitionsWidget_LandmarkList_ListContent_ListGrid']/div[2]/span[3]/input")
 public Text input_3;
 
 
 /* _1_2 - TEXT */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid']/div[2]/div/span[2]/input") 
 @FindBy(how = How.XPATH , using = "(//input[@value='1'])[2]")
 public Text _1_2;
 
 
 /* input_4 - TEXT */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='MyItemListWidget_LandmarkList_ListContent_ListGrid']/div[2]/span[3]/input")
 public Text input_4;
 
 
 /* input_5 - TEXT */

 @IFrames({
  @IFrame(name="fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28" , frameType=FrameType.IFRAME  , attributes={"class=m-app-frame", "name=fsm_98fab800-ec0e-48b0-af33-9c35aacf2e28", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home?csk.hidetitlebar=true&HybridCertified=1&Responsive=notresponsive&LogicalId=lid%3A%2F%2Finfor.fsm.auto&inforThemeName=InforBlue&inforCurrentLocale=en-US&inforCurrentLanguage=en-US&infor10WorkspaceShell=1&inforWorkspaceVersion=12.0.23&inforStyle=3.0&inforTimeZone=(UTC%2B05%3A30)%20Chennai%2C%20Kolkata%2C%20Mumbai%2C%20New%20Delhi&inforStdTimeZone=Asia%2FKolkata", "onload=onAppFrameLoad(this)", "onerror=onAppFrameError(e);", "allow=geolocation", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='PunchoutVendorsWidget_LandmarkList_ListContent_ListGrid']/div[2]/span[3]/input")
 public Text input_5;
 
 
 /* msgTypeTxt - TEXT */

 @IFrames({
  @IFrame(name="generic_dd703474-86fa-4152-8719-5406c8447286" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border: none; width: 100%; height: 419px;", "name=generic_dd703474-86fa-4152-8719-5406c8447286", "src=https://m12test-collaboration.auto.aws.infor.com/FSMMTQAT03_TST/contextapps/contextreceiver?ContextAppInstanceId=dd703474-86fa-4152-8719-5406c8447286", }),
 })
 //@FindBy(how = How.XPATH , using="//input[@name='msgTypeTxt']") 
 //@FindBy(how = How.XPATH , using="//div[@id='body']/div/div/div[2]/input") 
 @FindBy(how = How.NAME , using = "msgTypeTxt")
 public Text msgTypeTxt;
 
 
 /* company - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="company") 
 //@FindBy(how = How.XPATH , using="//input[@id='company']") 
 //@FindBy(how = How.XPATH , using="//input[@name='company']") 
 @FindBy(how = How.ID , using = "company")
 public Text company;
 
 
 /* requester_3 - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="requester") 
 //@FindBy(how = How.XPATH , using="//input[@id='requester']") 
 //@FindBy(how = How.XPATH , using="//input[@name='requester']") 
 @FindBy(how = How.ID , using = "requester")
 public Text requester_3;
 
 
 /* reqnbr - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="req-nbr") 
 //@FindBy(how = How.XPATH , using="//input[@id='req-nbr']") 
 //@FindBy(how = How.XPATH , using="//input[@name='req-nbr']") 
 @FindBy(how = How.ID , using = "req-nbr")
 public Text reqnbr;
 
 
 /* reqstatus - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="req-status") 
 //@FindBy(how = How.XPATH , using="//input[@id='req-status']") 
 //@FindBy(how = How.XPATH , using="//input[@name='req-status']") 
 @FindBy(how = How.ID , using = "req-status")
 public Text reqstatus;
 
 
 /* ponbr - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="po-nbr") 
 //@FindBy(how = How.XPATH , using="//input[@id='po-nbr']") 
 //@FindBy(how = How.XPATH , using="//input[@name='po-nbr']") 
 @FindBy(how = How.ID , using = "po-nbr")
 public Text ponbr;
 
 
 /* povendor - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="po-vendor") 
 //@FindBy(how = How.XPATH , using="//input[@id='po-vendor']") 
 //@FindBy(how = How.XPATH , using="//input[@name='po-vendor']") 
 @FindBy(how = How.ID , using = "po-vendor")
 public Text povendor;
 
 
 /* vendorname - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="vendor-name") 
 //@FindBy(how = How.XPATH , using="//input[@id='vendor-name']") 
 //@FindBy(how = How.XPATH , using="//input[@name='vendor-name']") 
 @FindBy(how = How.ID , using = "vendor-name")
 public Text vendorname;
 
 
 /* vendorname2 - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="vendor-name2") 
 //@FindBy(how = How.XPATH , using="//input[@id='vendor-name2']") 
 //@FindBy(how = How.XPATH , using="//input[@name='vendor-name2']") 
 @FindBy(how = How.ID , using = "vendor-name2")
 public Text vendorname2;
 
 
 /* pobuyer - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="po-buyer") 
 //@FindBy(how = How.XPATH , using="//input[@id='po-buyer']") 
 //@FindBy(how = How.XPATH , using="//input[@name='po-buyer']") 
 @FindBy(how = How.ID , using = "po-buyer")
 public Text pobuyer;
 
 
 /* buyername - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="buyer-name") 
 //@FindBy(how = How.XPATH , using="//input[@id='buyer-name']") 
 //@FindBy(how = How.XPATH , using="//input[@name='buyer-name']") 
 @FindBy(how = How.ID , using = "buyer-name")
 public Text buyername;
 
 
 /* buyername2 - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="buyer-name2") 
 //@FindBy(how = How.XPATH , using="//input[@id='buyer-name2']") 
 //@FindBy(how = How.XPATH , using="//input[@name='buyer-name2']") 
 @FindBy(how = How.ID , using = "buyer-name2")
 public Text buyername2;
 
 
 /* podate - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="po-date") 
 //@FindBy(how = How.XPATH , using="//input[@id='po-date']") 
 //@FindBy(how = How.XPATH , using="//input[@name='po-date']") 
 @FindBy(how = How.ID , using = "po-date")
 public Text podate;
 
 
 /* recnbr - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="rec-nbr") 
 //@FindBy(how = How.XPATH , using="//input[@id='rec-nbr']") 
 //@FindBy(how = How.XPATH , using="//input[@name='rec-nbr']") 
 @FindBy(how = How.ID , using = "rec-nbr")
 public Text recnbr;
 
 
 /* recstatus - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="rec-status") 
 //@FindBy(how = How.XPATH , using="//input[@id='rec-status']") 
 //@FindBy(how = How.XPATH , using="//input[@name='rec-status']") 
 @FindBy(how = How.ID , using = "rec-status")
 public Text recstatus;
 
 
 /* recdate - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="rec-date") 
 //@FindBy(how = How.XPATH , using="//input[@id='rec-date']") 
 //@FindBy(how = How.XPATH , using="//input[@name='rec-date']") 
 @FindBy(how = How.ID , using = "rec-date")
 public Text recdate;
 
 
 /* invoice_2 - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="invoice") 
 //@FindBy(how = How.XPATH , using="//input[@id='invoice']") 
 //@FindBy(how = How.XPATH , using="//input[@name='invoice']") 
 @FindBy(how = How.ID , using = "invoice")
 public Text invoice_2;
 
 
 /* vouchernbr - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="voucher-nbr") 
 //@FindBy(how = How.XPATH , using="//input[@id='voucher-nbr']") 
 //@FindBy(how = How.XPATH , using="//input[@name='voucher-nbr']") 
 @FindBy(how = How.ID , using = "voucher-nbr")
 public Text vouchernbr;
 
 
 /* voichernbr - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="voicher-nbr") 
 //@FindBy(how = How.XPATH , using="//input[@id='invoice-amount']") 
 //@FindBy(how = How.XPATH , using="//input[@name='voicher-nbr']") 
 @FindBy(how = How.ID , using = "invoice-amount")
 public Text voichernbr;
 
 
 /* currency - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="currency") 
 //@FindBy(how = How.XPATH , using="//input[@id='currency']") 
 //@FindBy(how = How.XPATH , using="//input[@name='currency']") 
 @FindBy(how = How.ID , using = "currency")
 public Text currency;
 
 
 /* invoicetype - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="invoice-type") 
 //@FindBy(how = How.XPATH , using="//input[@id='invoice-type']") 
 //@FindBy(how = How.XPATH , using="//input[@name='invoice-type']") 
 @FindBy(how = How.ID , using = "invoice-type")
 public Text invoicetype;
 
 
 /* invoicestatus - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="invoice-status") 
 //@FindBy(how = How.XPATH , using="//input[@id='invoice-status']") 
 //@FindBy(how = How.XPATH , using="//input[@name='invoice-status']") 
 @FindBy(how = How.ID , using = "invoice-status")
 public Text invoicestatus;
 
 
 /* paymentnbr - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="payment-nbr") 
 //@FindBy(how = How.XPATH , using="//input[@id='payment-nbr']") 
 //@FindBy(how = How.XPATH , using="//input[@name='payment-nbr']") 
 @FindBy(how = How.ID , using = "payment-nbr")
 public Text paymentnbr;
 
 
 /* cashcode - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="cash-code") 
 //@FindBy(how = How.XPATH , using="//input[@id='cash-code']") 
 //@FindBy(how = How.XPATH , using="//input[@name='cash-code']") 
 @FindBy(how = How.ID , using = "cash-code")
 public Text cashcode;
 
 
 /* checkdate - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="check-date") 
 //@FindBy(how = How.XPATH , using="//input[@id='check-date']") 
 //@FindBy(how = How.XPATH , using="//input[@name='check-date']") 
 @FindBy(how = How.ID , using = "check-date")
 public Text checkdate;
 
 
 /* paymentstatus - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="payment-status") 
 //@FindBy(how = How.XPATH , using="//input[@id='payment-status']") 
 //@FindBy(how = How.XPATH , using="//input[@name='payment-status']") 
 @FindBy(how = How.ID , using = "payment-status")
 public Text paymentstatus;
 
 
 /* transtype - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="trans-type") 
 //@FindBy(how = How.XPATH , using="//input[@id='trans-type']") 
 //@FindBy(how = How.XPATH , using="//input[@name='trans-type']") 
 @FindBy(how = How.ID , using = "trans-type")
 public Text transtype;
 
 
 /* transdate - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="trans-date") 
 //@FindBy(how = How.XPATH , using="//input[@id='trans-date']") 
 //@FindBy(how = How.XPATH , using="//input[@name='trans-date']") 
 @FindBy(how = How.ID , using = "trans-date")
 public Text transdate;
 
 
 /* recondate - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="recon-date") 
 //@FindBy(how = How.XPATH , using="//input[@id='recon-date']") 
 //@FindBy(how = How.XPATH , using="//input[@name='recon-date']") 
 @FindBy(how = How.ID , using = "recon-date")
 public Text recondate;
 
 
 /* transstatus - TEXT */

 @IFrames({
  @IFrame(name="generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9" , frameType=FrameType.IFRAME  , attributes={"data-contextapp=true", "style=border:none;width:100%;height:300px;", "name=generic_7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", "src=https://gen-fsmmtqat03-tst.auto.aws.infor.com:443/fsm/web/home/../../Requester/RequisitionToInvoicePayment.html?ContextAppInstanceId=7d000cb6-3fd5-4a2f-a6b5-02a0b4a771e9", }),
 })
 //@FindBy(how = How.NAME , using="trans-status") 
 //@FindBy(how = How.XPATH , using="//input[@id='trans-status']") 
 //@FindBy(how = How.XPATH , using="//input[@name='trans-status']") 
 @FindBy(how = How.ID , using = "trans-status")
 public Text transstatus;
 
 
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