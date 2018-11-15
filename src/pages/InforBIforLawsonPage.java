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
 *  Captured Environment : http://phmaw127.infor.com:9081/ers/ersAdministration.jsp?lsr=false&remtype=redirect&stylesheet=ersAdminHome.xsl&cmd=ADMINHOME#
 */


@CustomConfig("null")
public class InforBIforLawsonPage extends BasePageObject<InforBIforLawsonPage> {

public static final String PAGE_URL = "efs/go";

public String relativePageUrl() {
    return this.PAGE_URL;
}

/**
 * Start Of Auto generated fields
 */





/****** BUTTON Elements ******/
 /* tabFocusField - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='tabFocusField']") 
 @FindBy(how = How.ID , using = "tabFocusField")
 public Button tabFocusField;
 
 
 /* cancel - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[@title='Cancel']") 
 //@FindBy(how = How.XPATH , using="//div[@id='inforSignInDialog']/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[2]")
 public Button cancel;
 
 
 /* signIn - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[@title='Sign In']") 
 //@FindBy(how = How.XPATH , using="//form[@id='loginform']/div/div/button") 
 @FindBy(how = How.XPATH , using = "(//button[contains(text(),'')])[3]")
 public Button signIn;
 
 
/****** LINK Elements ******/
 /* wwwinforcom - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'www.infor.com')]") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://www.infor.com/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='lwsnCpyDiv']/a") 
 @FindBy(how = How.LINK_TEXT , using = "www.infor.com")
 public Link wwwinforcom;
 
 
/****** PASSWORD Elements ******/
 /* pass - PASSWORD */

 //@FindBy(how = How.NAME , using="pass") 
 //@FindBy(how = How.XPATH , using="//input[@id='pass']") 
 //@FindBy(how = How.XPATH , using="//input[@name='pass']") 
 //@FindBy(how = How.XPATH , using="//input[@title='Password']") 
 @FindBy(how = How.ID , using = "pass")
 public Password pass;
 
 
/****** TEXT Elements ******/
 /* uid - TEXT */

 //@FindBy(how = How.NAME , using="uid") 
 //@FindBy(how = How.XPATH , using="//input[@id='uid']") 
 //@FindBy(how = How.XPATH , using="//input[@name='uid']") 
 //@FindBy(how = How.XPATH , using="//input[@title='User name']") 
 @FindBy(how = How.ID , using = "uid")
 public Text uid;
 
 
/****** TEXTAREA Elements ******/
 /* codeblock - TEXTAREA */

 //@FindBy(how = How.XPATH , using="//textarea[@id='codeblock']") 
 @FindBy(how = How.ID , using = "codeblock")
 public TextArea codeblock;
 
 



/****** BUTTON Elements ******/
 /* signout - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[@title='Signout']") 
 //@FindBy(how = How.XPATH , using="//div[@id='rightBanner']/div/button") 
 @FindBy(how = How.XPATH , using = "//button[contains(text(),'')]")
 public Button signout;
 
 
 /* settingsNormal - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='settingsNormal']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Settings ']") 
 @FindBy(how = How.ID , using = "settingsNormal")
 public Button settingsNormal;
 
 
 /* expImgid69 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgid69']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Salary Register']") 
 @FindBy(how = How.ID , using = "expImgid69")
 public Button expImgid69;
 
 
 /* id69 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='id69']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary Register'])[2]") 
 @FindBy(how = How.ID , using = "id69")
 public Button id69;
 
 
 /* expImgid191 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgid191']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary register'])[3]") 
 @FindBy(how = How.ID , using = "expImgid191")
 public Button expImgid191;
 
 
 /* id191 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[4]") 
 //@FindBy(how = How.XPATH , using="//button[@id='id191']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary register'])[4]") 
 @FindBy(how = How.ID , using = "id191")
 public Button id191;
 
 
 /* expImgid192 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[5]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgid192']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary register'])[5]") 
 @FindBy(how = How.ID , using = "expImgid192")
 public Button expImgid192;
 
 
 /* id192 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[6]") 
 //@FindBy(how = How.XPATH , using="//button[@id='id192']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary register'])[6]") 
 @FindBy(how = How.ID , using = "id192")
 public Button id192;
 
 
 /* expImgid197 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[7]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgid197']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary register'])[7]") 
 @FindBy(how = How.ID , using = "expImgid197")
 public Button expImgid197;
 
 
 /* id197 - BUTTON */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[8]") 
 //@FindBy(how = How.XPATH , using="//button[@id='id197']") 
 //@FindBy(how = How.XPATH , using="(//button[@title='Salary register'])[8]") 
 @FindBy(how = How.ID , using = "id197")
 public Button id197;
 
 
/****** IFRAMEELEMENT Elements ******/
 /* startIdiFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='startId_iFrame']") 
 @FindBy(how = How.ID , using = "startId_iFrame")
 public IFrameElement startIdiFrame;
 
 
 /* id10iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id10_iFrame']") 
 @FindBy(how = How.ID , using = "id10_iFrame")
 public IFrameElement id10iFrame;
 
 
 /* id548iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id548_iFrame']") 
 @FindBy(how = How.ID , using = "id548_iFrame")
 public IFrameElement id548iFrame;
 
 
 /* id433iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id433_iFrame']") 
 @FindBy(how = How.ID , using = "id433_iFrame")
 public IFrameElement id433iFrame;
 
 
 /* id561iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id561_iFrame']") 
 @FindBy(how = How.ID , using = "id561_iFrame")
 public IFrameElement id561iFrame;
 
 
 /* id690iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id690_iFrame']") 
 @FindBy(how = How.ID , using = "id690_iFrame")
 public IFrameElement id690iFrame;
 
 
 /* id435iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id435_iFrame']") 
 @FindBy(how = How.ID , using = "id435_iFrame")
 public IFrameElement id435iFrame;
 
 
 /* id692iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id692_iFrame']") 
 @FindBy(how = How.ID , using = "id692_iFrame")
 public IFrameElement id692iFrame;
 
 
 /* id821iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id821_iFrame']") 
 @FindBy(how = How.ID , using = "id821_iFrame")
 public IFrameElement id821iFrame;
 
 
 /* id694iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id694_iFrame']") 
 @FindBy(how = How.ID , using = "id694_iFrame")
 public IFrameElement id694iFrame;
 
 
 /* id439iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id439_iFrame']") 
 @FindBy(how = How.ID , using = "id439_iFrame")
 public IFrameElement id439iFrame;
 
 
 /* id823iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id823_iFrame']") 
 @FindBy(how = How.ID , using = "id823_iFrame")
 public IFrameElement id823iFrame;
 
 
 /* id568iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id568_iFrame']") 
 @FindBy(how = How.ID , using = "id568_iFrame")
 public IFrameElement id568iFrame;
 
 
 /* id696iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id696_iFrame']") 
 @FindBy(how = How.ID , using = "id696_iFrame")
 public IFrameElement id696iFrame;
 
 
 /* id313iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id313_iFrame']") 
 @FindBy(how = How.ID , using = "id313_iFrame")
 public IFrameElement id313iFrame;
 
 
 /* id825iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id825_iFrame']") 
 @FindBy(how = How.ID , using = "id825_iFrame")
 public IFrameElement id825iFrame;
 
 
 /* id570iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id570_iFrame']") 
 @FindBy(how = How.ID , using = "id570_iFrame")
 public IFrameElement id570iFrame;
 
 
 /* id698iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id698_iFrame']") 
 @FindBy(how = How.ID , using = "id698_iFrame")
 public IFrameElement id698iFrame;
 
 
 /* id443iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id443_iFrame']") 
 @FindBy(how = How.ID , using = "id443_iFrame")
 public IFrameElement id443iFrame;
 
 
 /* id827iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id827_iFrame']") 
 @FindBy(how = How.ID , using = "id827_iFrame")
 public IFrameElement id827iFrame;
 
 
 /* id572iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id572_iFrame']") 
 @FindBy(how = How.ID , using = "id572_iFrame")
 public IFrameElement id572iFrame;
 
 
 /* id700iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id700_iFrame']") 
 @FindBy(how = How.ID , using = "id700_iFrame")
 public IFrameElement id700iFrame;
 
 
 /* id829iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id829_iFrame']") 
 @FindBy(how = How.ID , using = "id829_iFrame")
 public IFrameElement id829iFrame;
 
 
 /* id702iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id702_iFrame']") 
 @FindBy(how = How.ID , using = "id702_iFrame")
 public IFrameElement id702iFrame;
 
 
 /* id831iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id831_iFrame']") 
 @FindBy(how = How.ID , using = "id831_iFrame")
 public IFrameElement id831iFrame;
 
 
 /* id704iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id704_iFrame']") 
 @FindBy(how = How.ID , using = "id704_iFrame")
 public IFrameElement id704iFrame;
 
 
 /* id832iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id832_iFrame']") 
 @FindBy(how = How.ID , using = "id832_iFrame")
 public IFrameElement id832iFrame;
 
 
 /* id834iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id834_iFrame']") 
 @FindBy(how = How.ID , using = "id834_iFrame")
 public IFrameElement id834iFrame;
 
 
 /* id707iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id707_iFrame']") 
 @FindBy(how = How.ID , using = "id707_iFrame")
 public IFrameElement id707iFrame;
 
 
 /* id836iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id836_iFrame']") 
 @FindBy(how = How.ID , using = "id836_iFrame")
 public IFrameElement id836iFrame;
 
 
 /* id581iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id581_iFrame']") 
 @FindBy(how = How.ID , using = "id581_iFrame")
 public IFrameElement id581iFrame;
 
 
 /* id710iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id710_iFrame']") 
 @FindBy(how = How.ID , using = "id710_iFrame")
 public IFrameElement id710iFrame;
 
 
 /* id583iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id583_iFrame']") 
 @FindBy(how = How.ID , using = "id583_iFrame")
 public IFrameElement id583iFrame;
 
 
 /* id713iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id713_iFrame']") 
 @FindBy(how = How.ID , using = "id713_iFrame")
 public IFrameElement id713iFrame;
 
 
 /* id716iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id716_iFrame']") 
 @FindBy(how = How.ID , using = "id716_iFrame")
 public IFrameElement id716iFrame;
 
 
 /* id719iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id719_iFrame']") 
 @FindBy(how = How.ID , using = "id719_iFrame")
 public IFrameElement id719iFrame;
 
 
 /* id851iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id851_iFrame']") 
 @FindBy(how = How.ID , using = "id851_iFrame")
 public IFrameElement id851iFrame;
 
 
 /* id724iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id724_iFrame']") 
 @FindBy(how = How.ID , using = "id724_iFrame")
 public IFrameElement id724iFrame;
 
 
 /* id852iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id852_iFrame']") 
 @FindBy(how = How.ID , using = "id852_iFrame")
 public IFrameElement id852iFrame;
 
 
 /* id602iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id602_iFrame']") 
 @FindBy(how = How.ID , using = "id602_iFrame")
 public IFrameElement id602iFrame;
 
 
 /* id476iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id476_iFrame']") 
 @FindBy(how = How.ID , using = "id476_iFrame")
 public IFrameElement id476iFrame;
 
 
 /* id734iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id734_iFrame']") 
 @FindBy(how = How.ID , using = "id734_iFrame")
 public IFrameElement id734iFrame;
 
 
 /* id478iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id478_iFrame']") 
 @FindBy(how = How.ID , using = "id478_iFrame")
 public IFrameElement id478iFrame;
 
 
 /* id737iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id737_iFrame']") 
 @FindBy(how = How.ID , using = "id737_iFrame")
 public IFrameElement id737iFrame;
 
 
 /* id482iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id482_iFrame']") 
 @FindBy(how = How.ID , using = "id482_iFrame")
 public IFrameElement id482iFrame;
 
 
 /* id611iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id611_iFrame']") 
 @FindBy(how = How.ID , using = "id611_iFrame")
 public IFrameElement id611iFrame;
 
 
 /* id484iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id484_iFrame']") 
 @FindBy(how = How.ID , using = "id484_iFrame")
 public IFrameElement id484iFrame;
 
 
 /* id101iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id101_iFrame']") 
 @FindBy(how = How.ID , using = "id101_iFrame")
 public IFrameElement id101iFrame;
 
 
 /* id486iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id486_iFrame']") 
 @FindBy(how = How.ID , using = "id486_iFrame")
 public IFrameElement id486iFrame;
 
 
 /* id488iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id488_iFrame']") 
 @FindBy(how = How.ID , using = "id488_iFrame")
 public IFrameElement id488iFrame;
 
 
 /* id490iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id490_iFrame']") 
 @FindBy(how = How.ID , using = "id490_iFrame")
 public IFrameElement id490iFrame;
 
 
 /* id364iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id364_iFrame']") 
 @FindBy(how = How.ID , using = "id364_iFrame")
 public IFrameElement id364iFrame;
 
 
 /* id368iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id368_iFrame']") 
 @FindBy(how = How.ID , using = "id368_iFrame")
 public IFrameElement id368iFrame;
 
 
 /* id370iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id370_iFrame']") 
 @FindBy(how = How.ID , using = "id370_iFrame")
 public IFrameElement id370iFrame;
 
 
 /* id499iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id499_iFrame']") 
 @FindBy(how = How.ID , using = "id499_iFrame")
 public IFrameElement id499iFrame;
 
 
 /* id501iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id501_iFrame']") 
 @FindBy(how = How.ID , using = "id501_iFrame")
 public IFrameElement id501iFrame;
 
 
 /* id629iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id629_iFrame']") 
 @FindBy(how = How.ID , using = "id629_iFrame")
 public IFrameElement id629iFrame;
 
 
 /* id374iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id374_iFrame']") 
 @FindBy(how = How.ID , using = "id374_iFrame")
 public IFrameElement id374iFrame;
 
 
 /* id503iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id503_iFrame']") 
 @FindBy(how = How.ID , using = "id503_iFrame")
 public IFrameElement id503iFrame;
 
 
 /* id632iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id632_iFrame']") 
 @FindBy(how = How.ID , using = "id632_iFrame")
 public IFrameElement id632iFrame;
 
 
 /* id505iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id505_iFrame']") 
 @FindBy(how = How.ID , using = "id505_iFrame")
 public IFrameElement id505iFrame;
 
 
 /* id378iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id378_iFrame']") 
 @FindBy(how = How.ID , using = "id378_iFrame")
 public IFrameElement id378iFrame;
 
 
 /* id634iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id634_iFrame']") 
 @FindBy(how = How.ID , using = "id634_iFrame")
 public IFrameElement id634iFrame;
 
 
 /* id380iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id380_iFrame']") 
 @FindBy(how = How.ID , using = "id380_iFrame")
 public IFrameElement id380iFrame;
 
 
 /* id636iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id636_iFrame']") 
 @FindBy(how = How.ID , using = "id636_iFrame")
 public IFrameElement id636iFrame;
 
 
 /* id382iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id382_iFrame']") 
 @FindBy(how = How.ID , using = "id382_iFrame")
 public IFrameElement id382iFrame;
 
 
 /* id510iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id510_iFrame']") 
 @FindBy(how = How.ID , using = "id510_iFrame")
 public IFrameElement id510iFrame;
 
 
 /* id638iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id638_iFrame']") 
 @FindBy(how = How.ID , using = "id638_iFrame")
 public IFrameElement id638iFrame;
 
 
 /* id268iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id268_iFrame']") 
 @FindBy(how = How.ID , using = "id268_iFrame")
 public IFrameElement id268iFrame;
 
 
 /* id278iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id278_iFrame']") 
 @FindBy(how = How.ID , using = "id278_iFrame")
 public IFrameElement id278iFrame;
 
 
 /* id66iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id66_iFrame']") 
 @FindBy(how = How.ID , using = "id66_iFrame")
 public IFrameElement id66iFrame;
 
 
 /* id349iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id349_iFrame']") 
 @FindBy(how = How.ID , using = "id349_iFrame")
 public IFrameElement id349iFrame;
 
 
 /* id350iFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='id350_iFrame']") 
 @FindBy(how = How.ID , using = "id350_iFrame")
 public IFrameElement id350iFrame;
 
 
 /* sliderBUttoniFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='sliderBUtton_iFrame']") 
 @FindBy(how = How.ID , using = "sliderBUtton_iFrame")
 public IFrameElement sliderBUttoniFrame;
 
 
 /* slideiFrame - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='slide_iFrame']") 
 @FindBy(how = How.ID , using = "slide_iFrame")
 public IFrameElement slideiFrame;
 
 
 /* transporter - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='transporter']") 
 @FindBy(how = How.ID , using = "transporter")
 public IFrameElement transporter;
 
 
 /* sliderBUttoniFrame_2 - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//iframe[@id='sliderBUtton_iFrame']") 
 @FindBy(how = How.ID , using = "sliderBUtton_iFrame")
 public IFrameElement sliderBUttoniFrame_2;
 
 
 /* slideiFrame_2 - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//iframe[@id='slide_iFrame']") 
 @FindBy(how = How.ID , using = "slide_iFrame")
 public IFrameElement slideiFrame_2;
 
 
 /* iframe - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id191']/div[2]/table/tbody/tr/td[2]/iframe")
 public IFrameElement iframe;
 
 
 /* transporter_2 - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//iframe[@id='transporter']") 
 @FindBy(how = How.ID , using = "transporter")
 public IFrameElement transporter_2;
 
 
/****** LINK Elements ******/
 /* skipToDashboardContentsPressEnter - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Skip to dashboard contents (Press Enter).')]") 
 //@FindBy(how = How.ID , using="skiplink") 
 //@FindBy(how = How.XPATH , using="//a[@id='skiplink']") 
 @FindBy(how = How.LINK_TEXT , using = "Skip to dashboard contents (Press Enter).")
 public Link skipToDashboardContentsPressEnter;
 
 
 /* tools - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Tools')]") 
 //@FindBy(how = How.ID , using="id10") 
 //@FindBy(how = How.XPATH , using="//a[@id='id10']") 
 @FindBy(how = How.LINK_TEXT , using = "Tools")
 public Link tools;
 
 
 /* dBYSK - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'DB_YSK')]") 
 //@FindBy(how = How.ID , using="id548") 
 //@FindBy(how = How.XPATH , using="//a[@id='id548']") 
 @FindBy(how = How.LINK_TEXT , using = "DB_YSK")
 public Link dBYSK;
 
 
 /* test30041218 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test30041218')]") 
 //@FindBy(how = How.ID , using="id433") 
 //@FindBy(how = How.XPATH , using="//a[@id='id433']") 
 @FindBy(how = How.LINK_TEXT , using = "Test30041218")
 public Link test30041218;
 
 
 /* test22170220 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test22170220')]") 
 //@FindBy(how = How.ID , using="id561") 
 //@FindBy(how = How.XPATH , using="//a[@id='id561']") 
 @FindBy(how = How.LINK_TEXT , using = "Test22170220")
 public Link test22170220;
 
 
 /* test56321124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test56321124')]") 
 //@FindBy(how = How.ID , using="id690") 
 //@FindBy(how = How.XPATH , using="//a[@id='id690']") 
 @FindBy(how = How.LINK_TEXT , using = "Test56321124")
 public Link test56321124;
 
 
 /* test37131218 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test37131218')]") 
 //@FindBy(how = How.ID , using="id435") 
 //@FindBy(how = How.XPATH , using="//a[@id='id435']") 
 @FindBy(how = How.LINK_TEXT , using = "Test37131218")
 public Link test37131218;
 
 
 /* test32391124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test32391124')]") 
 //@FindBy(how = How.ID , using="id692") 
 //@FindBy(how = How.XPATH , using="//a[@id='id692']") 
 @FindBy(how = How.LINK_TEXT , using = "Test32391124")
 public Link test32391124;
 
 
 /* test33140309 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test33140309')]") 
 //@FindBy(how = How.ID , using="id821") 
 //@FindBy(how = How.XPATH , using="//a[@id='id821']") 
 @FindBy(how = How.LINK_TEXT , using = "Test33140309")
 public Link test33140309;
 
 
 /* test49531124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test49531124')]") 
 //@FindBy(how = How.ID , using="id694") 
 //@FindBy(how = How.XPATH , using="//a[@id='id694']") 
 @FindBy(how = How.LINK_TEXT , using = "Test49531124")
 public Link test49531124;
 
 
 /* test48281218 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test48281218')]") 
 //@FindBy(how = How.ID , using="id439") 
 //@FindBy(how = How.XPATH , using="//a[@id='id439']") 
 @FindBy(how = How.LINK_TEXT , using = "Test48281218")
 public Link test48281218;
 
 
 /* test31230309 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test31230309')]") 
 //@FindBy(how = How.ID , using="id823") 
 //@FindBy(how = How.XPATH , using="//a[@id='id823']") 
 @FindBy(how = How.LINK_TEXT , using = "Test31230309")
 public Link test31230309;
 
 
 /* test30350220 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test30350220')]") 
 //@FindBy(how = How.ID , using="id568") 
 //@FindBy(how = How.XPATH , using="//a[@id='id568']") 
 @FindBy(how = How.LINK_TEXT , using = "Test30350220")
 public Link test30350220;
 
 
 /* test58091224 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test58091224')]") 
 //@FindBy(how = How.ID , using="id696") 
 //@FindBy(how = How.XPATH , using="//a[@id='id696']") 
 @FindBy(how = How.LINK_TEXT , using = "Test58091224")
 public Link test58091224;
 
 
 /* test59440216 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test59440216')]") 
 //@FindBy(how = How.ID , using="id313") 
 //@FindBy(how = How.XPATH , using="//a[@id='id313']") 
 @FindBy(how = How.LINK_TEXT , using = "Test59440216")
 public Link test59440216;
 
 
 /* test09280309 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test09280309')]") 
 //@FindBy(how = How.ID , using="id825") 
 //@FindBy(how = How.XPATH , using="//a[@id='id825']") 
 @FindBy(how = How.LINK_TEXT , using = "Test09280309")
 public Link test09280309;
 
 
 /* test32400220 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test32400220')]") 
 //@FindBy(how = How.ID , using="id570") 
 //@FindBy(how = How.XPATH , using="//a[@id='id570']") 
 @FindBy(how = How.LINK_TEXT , using = "Test32400220")
 public Link test32400220;
 
 
 /* test26161224 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test26161224')]") 
 //@FindBy(how = How.ID , using="id698") 
 //@FindBy(how = How.XPATH , using="//a[@id='id698']") 
 @FindBy(how = How.LINK_TEXT , using = "Test26161224")
 public Link test26161224;
 
 
 /* test12561218 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test12561218')]") 
 //@FindBy(how = How.ID , using="id443") 
 //@FindBy(how = How.XPATH , using="//a[@id='id443']") 
 @FindBy(how = How.LINK_TEXT , using = "Test12561218")
 public Link test12561218;
 
 
 /* test35330309 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test35330309')]") 
 //@FindBy(how = How.ID , using="id827") 
 //@FindBy(how = How.XPATH , using="//a[@id='id827']") 
 @FindBy(how = How.LINK_TEXT , using = "Test35330309")
 public Link test35330309;
 
 
 /* test10160320 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test10160320')]") 
 //@FindBy(how = How.ID , using="id572") 
 //@FindBy(how = How.XPATH , using="//a[@id='id572']") 
 @FindBy(how = How.LINK_TEXT , using = "Test10160320")
 public Link test10160320;
 
 
 /* test49311224 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test49311224')]") 
 //@FindBy(how = How.ID , using="id700") 
 //@FindBy(how = How.XPATH , using="//a[@id='id700']") 
 @FindBy(how = How.LINK_TEXT , using = "Test49311224")
 public Link test49311224;
 
 
 /* test29380309 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test29380309')]") 
 //@FindBy(how = How.ID , using="id829") 
 //@FindBy(how = How.XPATH , using="//a[@id='id829']") 
 @FindBy(how = How.LINK_TEXT , using = "Test29380309")
 public Link test29380309;
 
 
 /* test13401224 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test13401224')]") 
 //@FindBy(how = How.ID , using="id702") 
 //@FindBy(how = How.XPATH , using="//a[@id='id702']") 
 @FindBy(how = How.LINK_TEXT , using = "Test13401224")
 public Link test13401224;
 
 
 /* test43051110 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test43051110')]") 
 //@FindBy(how = How.ID , using="id831") 
 //@FindBy(how = How.XPATH , using="//a[@id='id831']") 
 @FindBy(how = How.LINK_TEXT , using = "Test43051110")
 public Link test43051110;
 
 
 /* test01040124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test01040124')]") 
 //@FindBy(how = How.ID , using="id704") 
 //@FindBy(how = How.XPATH , using="//a[@id='id704']") 
 @FindBy(how = How.LINK_TEXT , using = "Test01040124")
 public Link test01040124;
 
 
 /* test03311110 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test03311110')]") 
 //@FindBy(how = How.ID , using="id832") 
 //@FindBy(how = How.XPATH , using="//a[@id='id832']") 
 @FindBy(how = How.LINK_TEXT , using = "Test03311110")
 public Link test03311110;
 
 
 /* test16551210 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test16551210')]") 
 //@FindBy(how = How.ID , using="id834") 
 //@FindBy(how = How.XPATH , using="//a[@id='id834']") 
 @FindBy(how = How.LINK_TEXT , using = "Test16551210")
 public Link test16551210;
 
 
 /* test18090124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test18090124')]") 
 //@FindBy(how = How.ID , using="id707") 
 //@FindBy(how = How.XPATH , using="//a[@id='id707']") 
 @FindBy(how = How.LINK_TEXT , using = "Test18090124")
 public Link test18090124;
 
 
 /* test13030110 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test13030110')]") 
 //@FindBy(how = How.ID , using="id836") 
 //@FindBy(how = How.XPATH , using="//a[@id='id836']") 
 @FindBy(how = How.LINK_TEXT , using = "Test13030110")
 public Link test13030110;
 
 
 /* test42280320 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test42280320')]") 
 //@FindBy(how = How.ID , using="id581") 
 //@FindBy(how = How.XPATH , using="//a[@id='id581']") 
 @FindBy(how = How.LINK_TEXT , using = "Test42280320")
 public Link test42280320;
 
 
 /* test36150124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test36150124')]") 
 //@FindBy(how = How.ID , using="id710") 
 //@FindBy(how = How.XPATH , using="//a[@id='id710']") 
 @FindBy(how = How.LINK_TEXT , using = "Test36150124")
 public Link test36150124;
 
 
 /* test08320320 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test08320320')]") 
 //@FindBy(how = How.ID , using="id583") 
 //@FindBy(how = How.XPATH , using="//a[@id='id583']") 
 @FindBy(how = How.LINK_TEXT , using = "Test08320320")
 public Link test08320320;
 
 
 /* test23190124 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test23190124')]") 
 //@FindBy(how = How.ID , using="id713") 
 //@FindBy(how = How.XPATH , using="//a[@id='id713']") 
 @FindBy(how = How.LINK_TEXT , using = "Test23190124")
 public Link test23190124;
 
 
 /* test42290224 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test42290224')]") 
 //@FindBy(how = How.ID , using="id716") 
 //@FindBy(how = How.XPATH , using="//a[@id='id716']") 
 @FindBy(how = How.LINK_TEXT , using = "Test42290224")
 public Link test42290224;
 
 
 /* test30380224 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test30380224')]") 
 //@FindBy(how = How.ID , using="id719") 
 //@FindBy(how = How.XPATH , using="//a[@id='id719']") 
 @FindBy(how = How.LINK_TEXT , using = "Test30380224")
 public Link test30380224;
 
 
 /* dashboard1234 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'dash_board_1234')]") 
 //@FindBy(how = How.ID , using="id851") 
 //@FindBy(how = How.XPATH , using="//a[@id='id851']") 
 @FindBy(how = How.LINK_TEXT , using = "dash_board_1234")
 public Link dashboard1234;
 
 
 /* test40311025 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test40311025')]") 
 //@FindBy(how = How.ID , using="id724") 
 //@FindBy(how = How.XPATH , using="//a[@id='id724']") 
 @FindBy(how = How.LINK_TEXT , using = "Test40311025")
 public Link test40311025;
 
 
 /* dashBoard123 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'DashBoard123')]") 
 //@FindBy(how = How.ID , using="id852") 
 //@FindBy(how = How.XPATH , using="//a[@id='id852']") 
 @FindBy(how = How.LINK_TEXT , using = "DashBoard123")
 public Link dashBoard123;
 
 
 /* test16090520 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test16090520')]") 
 //@FindBy(how = How.ID , using="id602") 
 //@FindBy(how = How.XPATH , using="//a[@id='id602']") 
 @FindBy(how = How.LINK_TEXT , using = "Test16090520")
 public Link test16090520;
 
 
 /* test31101019 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test31101019')]") 
 //@FindBy(how = How.ID , using="id476") 
 //@FindBy(how = How.XPATH , using="//a[@id='id476']") 
 @FindBy(how = How.LINK_TEXT , using = "Test31101019")
 public Link test31101019;
 
 
 /* test25051225 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test25051225')]") 
 //@FindBy(how = How.ID , using="id734") 
 //@FindBy(how = How.XPATH , using="//a[@id='id734']") 
 @FindBy(how = How.LINK_TEXT , using = "Test25051225")
 public Link test25051225;
 
 
 /* test07121019 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test07121019')]") 
 //@FindBy(how = How.ID , using="id478") 
 //@FindBy(how = How.XPATH , using="//a[@id='id478']") 
 @FindBy(how = How.LINK_TEXT , using = "Test07121019")
 public Link test07121019;
 
 
 /* test22241225 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test22241225')]") 
 //@FindBy(how = How.ID , using="id737") 
 //@FindBy(how = How.XPATH , using="//a[@id='id737']") 
 @FindBy(how = How.LINK_TEXT , using = "Test22241225")
 public Link test22241225;
 
 
 /* test56461019 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test56461019')]") 
 //@FindBy(how = How.ID , using="id482") 
 //@FindBy(how = How.XPATH , using="//a[@id='id482']") 
 @FindBy(how = How.LINK_TEXT , using = "Test56461019")
 public Link test56461019;
 
 
 /* test49221023 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test49221023')]") 
 //@FindBy(how = How.ID , using="id611") 
 //@FindBy(how = How.XPATH , using="//a[@id='id611']") 
 @FindBy(how = How.LINK_TEXT , using = "Test49221023")
 public Link test49221023;
 
 
 /* test27041119 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test27041119')]") 
 //@FindBy(how = How.ID , using="id484") 
 //@FindBy(how = How.XPATH , using="//a[@id='id484']") 
 @FindBy(how = How.LINK_TEXT , using = "Test27041119")
 public Link test27041119;
 
 
 /* shyamTest - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Shyam_Test')]") 
 //@FindBy(how = How.ID , using="id101") 
 //@FindBy(how = How.XPATH , using="//a[@id='id101']") 
 @FindBy(how = How.LINK_TEXT , using = "Shyam_Test")
 public Link shyamTest;
 
 
 /* test57201119 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test57201119')]") 
 //@FindBy(how = How.ID , using="id486") 
 //@FindBy(how = How.XPATH , using="//a[@id='id486']") 
 @FindBy(how = How.LINK_TEXT , using = "Test57201119")
 public Link test57201119;
 
 
 /* test17301119 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test17301119')]") 
 //@FindBy(how = How.ID , using="id488") 
 //@FindBy(how = How.XPATH , using="//a[@id='id488']") 
 @FindBy(how = How.LINK_TEXT , using = "Test17301119")
 public Link test17301119;
 
 
 /* test13031219 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test13031219')]") 
 //@FindBy(how = How.ID , using="id490") 
 //@FindBy(how = How.XPATH , using="//a[@id='id490']") 
 @FindBy(how = How.LINK_TEXT , using = "Test13031219")
 public Link test13031219;
 
 
 /* test49401117 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test49401117')]") 
 //@FindBy(how = How.ID , using="id364") 
 //@FindBy(how = How.XPATH , using="//a[@id='id364']") 
 @FindBy(how = How.LINK_TEXT , using = "Test49401117")
 public Link test49401117;
 
 
 /* test21151217 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test21151217')]") 
 //@FindBy(how = How.ID , using="id368") 
 //@FindBy(how = How.XPATH , using="//a[@id='id368']") 
 @FindBy(how = How.LINK_TEXT , using = "Test21151217")
 public Link test21151217;
 
 
 /* test45241217 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test45241217')]") 
 //@FindBy(how = How.ID , using="id370") 
 //@FindBy(how = How.XPATH , using="//a[@id='id370']") 
 @FindBy(how = How.LINK_TEXT , using = "Test45241217")
 public Link test45241217;
 
 
 /* test06411020 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test06411020')]") 
 //@FindBy(how = How.ID , using="id499") 
 //@FindBy(how = How.XPATH , using="//a[@id='id499']") 
 @FindBy(how = How.LINK_TEXT , using = "Test06411020")
 public Link test06411020;
 
 
 /* test09031120 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test09031120')]") 
 //@FindBy(how = How.ID , using="id501") 
 //@FindBy(how = How.XPATH , using="//a[@id='id501']") 
 @FindBy(how = How.LINK_TEXT , using = "Test09031120")
 public Link test09031120;
 
 
 /* test02311123 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test02311123')]") 
 //@FindBy(how = How.ID , using="id629") 
 //@FindBy(how = How.XPATH , using="//a[@id='id629']") 
 @FindBy(how = How.LINK_TEXT , using = "Test02311123")
 public Link test02311123;
 
 
 /* test21321217 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test21321217')]") 
 //@FindBy(how = How.ID , using="id374") 
 //@FindBy(how = How.XPATH , using="//a[@id='id374']") 
 @FindBy(how = How.LINK_TEXT , using = "Test21321217")
 public Link test21321217;
 
 
 /* test49091120 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test49091120')]") 
 //@FindBy(how = How.ID , using="id503") 
 //@FindBy(how = How.XPATH , using="//a[@id='id503']") 
 @FindBy(how = How.LINK_TEXT , using = "Test49091120")
 public Link test49091120;
 
 
 /* test09471123 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test09471123')]") 
 //@FindBy(how = How.ID , using="id632") 
 //@FindBy(how = How.XPATH , using="//a[@id='id632']") 
 @FindBy(how = How.LINK_TEXT , using = "Test09471123")
 public Link test09471123;
 
 
 /* test28171120 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test28171120')]") 
 //@FindBy(how = How.ID , using="id505") 
 //@FindBy(how = How.XPATH , using="//a[@id='id505']") 
 @FindBy(how = How.LINK_TEXT , using = "Test28171120")
 public Link test28171120;
 
 
 /* test10491217 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test10491217')]") 
 //@FindBy(how = How.ID , using="id378") 
 //@FindBy(how = How.XPATH , using="//a[@id='id378']") 
 @FindBy(how = How.LINK_TEXT , using = "Test10491217")
 public Link test10491217;
 
 
 /* test23061223 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test23061223')]") 
 //@FindBy(how = How.ID , using="id634") 
 //@FindBy(how = How.XPATH , using="//a[@id='id634']") 
 @FindBy(how = How.LINK_TEXT , using = "Test23061223")
 public Link test23061223;
 
 
 /* test37561217 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test37561217')]") 
 //@FindBy(how = How.ID , using="id380") 
 //@FindBy(how = How.XPATH , using="//a[@id='id380']") 
 @FindBy(how = How.LINK_TEXT , using = "Test37561217")
 public Link test37561217;
 
 
 /* test24111223 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test24111223')]") 
 //@FindBy(how = How.ID , using="id636") 
 //@FindBy(how = How.XPATH , using="//a[@id='id636']") 
 @FindBy(how = How.LINK_TEXT , using = "Test24111223")
 public Link test24111223;
 
 
 /* test34040117 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test34040117')]") 
 //@FindBy(how = How.ID , using="id382") 
 //@FindBy(how = How.XPATH , using="//a[@id='id382']") 
 @FindBy(how = How.LINK_TEXT , using = "Test34040117")
 public Link test34040117;
 
 
 /* test40331120 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test40331120')]") 
 //@FindBy(how = How.ID , using="id510") 
 //@FindBy(how = How.XPATH , using="//a[@id='id510']") 
 @FindBy(how = How.LINK_TEXT , using = "Test40331120")
 public Link test40331120;
 
 
 /* test17201223 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test17201223')]") 
 //@FindBy(how = How.ID , using="id638") 
 //@FindBy(how = How.XPATH , using="//a[@id='id638']") 
 @FindBy(how = How.LINK_TEXT , using = "Test17201223")
 public Link test17201223;
 
 
 /* test34201016 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test34201016')]") 
 //@FindBy(how = How.ID , using="id268") 
 //@FindBy(how = How.XPATH , using="//a[@id='id268']") 
 @FindBy(how = How.LINK_TEXT , using = "Test34201016")
 public Link test34201016;
 
 
 /* test46311016 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test46311016')]") 
 //@FindBy(how = How.ID , using="id278") 
 //@FindBy(how = How.XPATH , using="//a[@id='id278']") 
 @FindBy(how = How.LINK_TEXT , using = "Test46311016")
 public Link test46311016;
 
 
 /* reports - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Reports')]") 
 //@FindBy(how = How.ID , using="id66") 
 //@FindBy(how = How.XPATH , using="//a[@id='id66']") 
 @FindBy(how = How.LINK_TEXT , using = "Reports")
 public Link reports;
 
 
 /* test25450917 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test25450917')]") 
 //@FindBy(how = How.ID , using="id349") 
 //@FindBy(how = How.XPATH , using="//a[@id='id349']") 
 @FindBy(how = How.LINK_TEXT , using = "Test25450917")
 public Link test25450917;
 
 
 /* test21490917 - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Test21490917')]") 
 //@FindBy(how = How.ID , using="id350") 
 //@FindBy(how = How.XPATH , using="//a[@id='id350']") 
 @FindBy(how = How.LINK_TEXT , using = "Test21490917")
 public Link test21490917;
 
 
 /* more - LINK */

 //@FindBy(how = How.XPATH , using="//a[contains(text(),'More...')]") 
 //@FindBy(how = How.ID , using="overflowMore") 
 //@FindBy(how = How.XPATH , using="//a[@id='overflowMore']") 
 @FindBy(how = How.LINK_TEXT , using = "More...")
 public Link more;
 
 
 /* test48281218_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test48281218')])[2]") 
 //@FindBy(how = How.ID , using="id439") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id439'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test48281218")
 public Link test48281218_2;
 
 
 /* test31230309_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test31230309')])[2]") 
 //@FindBy(how = How.ID , using="id823") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id823'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test31230309")
 public Link test31230309_2;
 
 
 /* test30350220_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test30350220')])[2]") 
 //@FindBy(how = How.ID , using="id568") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id568'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test30350220")
 public Link test30350220_2;
 
 
 /* test58091224_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test58091224')])[2]") 
 //@FindBy(how = How.ID , using="id696") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id696'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test58091224")
 public Link test58091224_2;
 
 
 /* test59440216_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test59440216')])[2]") 
 //@FindBy(how = How.ID , using="id313") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id313'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test59440216")
 public Link test59440216_2;
 
 
 /* test09280309_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test09280309')])[2]") 
 //@FindBy(how = How.ID , using="id825") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id825'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test09280309")
 public Link test09280309_2;
 
 
 /* test32400220_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test32400220')])[2]") 
 //@FindBy(how = How.ID , using="id570") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id570'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test32400220")
 public Link test32400220_2;
 
 
 /* test26161224_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test26161224')])[2]") 
 //@FindBy(how = How.ID , using="id698") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id698'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test26161224")
 public Link test26161224_2;
 
 
 /* test12561218_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test12561218')])[2]") 
 //@FindBy(how = How.ID , using="id443") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id443'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test12561218")
 public Link test12561218_2;
 
 
 /* test35330309_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test35330309')])[2]") 
 //@FindBy(how = How.ID , using="id827") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id827'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test35330309")
 public Link test35330309_2;
 
 
 /* test10160320_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test10160320')])[2]") 
 //@FindBy(how = How.ID , using="id572") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id572'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test10160320")
 public Link test10160320_2;
 
 
 /* test49311224_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test49311224')])[2]") 
 //@FindBy(how = How.ID , using="id700") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id700'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test49311224")
 public Link test49311224_2;
 
 
 /* test29380309_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test29380309')])[2]") 
 //@FindBy(how = How.ID , using="id829") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id829'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test29380309")
 public Link test29380309_2;
 
 
 /* test13401224_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test13401224')])[2]") 
 //@FindBy(how = How.ID , using="id702") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id702'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test13401224")
 public Link test13401224_2;
 
 
 /* test43051110_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test43051110')])[2]") 
 //@FindBy(how = How.ID , using="id831") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id831'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test43051110")
 public Link test43051110_2;
 
 
 /* test01040124_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test01040124')])[2]") 
 //@FindBy(how = How.ID , using="id704") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id704'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test01040124")
 public Link test01040124_2;
 
 
 /* test03311110_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test03311110')])[2]") 
 //@FindBy(how = How.ID , using="id832") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id832'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test03311110")
 public Link test03311110_2;
 
 
 /* test16551210_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test16551210')])[2]") 
 //@FindBy(how = How.ID , using="id834") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id834'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test16551210")
 public Link test16551210_2;
 
 
 /* test18090124_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test18090124')])[2]") 
 //@FindBy(how = How.ID , using="id707") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id707'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test18090124")
 public Link test18090124_2;
 
 
 /* test13030110_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test13030110')])[2]") 
 //@FindBy(how = How.ID , using="id836") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id836'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test13030110")
 public Link test13030110_2;
 
 
 /* test42280320_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test42280320')])[2]") 
 //@FindBy(how = How.ID , using="id581") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id581'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test42280320")
 public Link test42280320_2;
 
 
 /* test36150124_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test36150124')])[2]") 
 //@FindBy(how = How.ID , using="id710") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id710'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test36150124")
 public Link test36150124_2;
 
 
 /* test08320320_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test08320320')])[2]") 
 //@FindBy(how = How.ID , using="id583") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id583'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test08320320")
 public Link test08320320_2;
 
 
 /* test23190124_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test23190124')])[2]") 
 //@FindBy(how = How.ID , using="id713") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id713'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test23190124")
 public Link test23190124_2;
 
 
 /* test42290224_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test42290224')])[2]") 
 //@FindBy(how = How.ID , using="id716") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id716'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test42290224")
 public Link test42290224_2;
 
 
 /* test30380224_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test30380224')])[2]") 
 //@FindBy(how = How.ID , using="id719") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id719'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test30380224")
 public Link test30380224_2;
 
 
 /* dashboard1234_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'dash_board_1234')])[2]") 
 //@FindBy(how = How.ID , using="id851") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id851'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "dash_board_1234")
 public Link dashboard1234_2;
 
 
 /* test40311025_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test40311025')])[2]") 
 //@FindBy(how = How.ID , using="id724") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id724'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test40311025")
 public Link test40311025_2;
 
 
 /* dashBoard123_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'DashBoard123')])[2]") 
 //@FindBy(how = How.ID , using="id852") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id852'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "DashBoard123")
 public Link dashBoard123_2;
 
 
 /* test16090520_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test16090520')])[2]") 
 //@FindBy(how = How.ID , using="id602") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id602'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test16090520")
 public Link test16090520_2;
 
 
 /* test31101019_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test31101019')])[2]") 
 //@FindBy(how = How.ID , using="id476") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id476'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test31101019")
 public Link test31101019_2;
 
 
 /* test25051225_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test25051225')])[2]") 
 //@FindBy(how = How.ID , using="id734") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id734'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test25051225")
 public Link test25051225_2;
 
 
 /* test07121019_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test07121019')])[2]") 
 //@FindBy(how = How.ID , using="id478") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id478'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test07121019")
 public Link test07121019_2;
 
 
 /* test22241225_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test22241225')])[2]") 
 //@FindBy(how = How.ID , using="id737") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id737'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test22241225")
 public Link test22241225_2;
 
 
 /* test56461019_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test56461019')])[2]") 
 //@FindBy(how = How.ID , using="id482") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id482'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test56461019")
 public Link test56461019_2;
 
 
 /* test49221023_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test49221023')])[2]") 
 //@FindBy(how = How.ID , using="id611") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id611'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test49221023")
 public Link test49221023_2;
 
 
 /* test27041119_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test27041119')])[2]") 
 //@FindBy(how = How.ID , using="id484") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id484'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test27041119")
 public Link test27041119_2;
 
 
 /* shyamTest_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Shyam_Test')])[2]") 
 //@FindBy(how = How.ID , using="id101") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id101'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Shyam_Test")
 public Link shyamTest_2;
 
 
 /* test57201119_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test57201119')])[2]") 
 //@FindBy(how = How.ID , using="id486") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id486'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test57201119")
 public Link test57201119_2;
 
 
 /* test17301119_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test17301119')])[2]") 
 //@FindBy(how = How.ID , using="id488") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id488'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test17301119")
 public Link test17301119_2;
 
 
 /* test13031219_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test13031219')])[2]") 
 //@FindBy(how = How.ID , using="id490") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id490'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test13031219")
 public Link test13031219_2;
 
 
 /* test49401117_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test49401117')])[2]") 
 //@FindBy(how = How.ID , using="id364") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id364'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test49401117")
 public Link test49401117_2;
 
 
 /* test21151217_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test21151217')])[2]") 
 //@FindBy(how = How.ID , using="id368") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id368'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test21151217")
 public Link test21151217_2;
 
 
 /* test45241217_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test45241217')])[2]") 
 //@FindBy(how = How.ID , using="id370") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id370'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test45241217")
 public Link test45241217_2;
 
 
 /* test06411020_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test06411020')])[2]") 
 //@FindBy(how = How.ID , using="id499") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id499'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test06411020")
 public Link test06411020_2;
 
 
 /* test09031120_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test09031120')])[2]") 
 //@FindBy(how = How.ID , using="id501") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id501'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test09031120")
 public Link test09031120_2;
 
 
 /* test02311123_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test02311123')])[2]") 
 //@FindBy(how = How.ID , using="id629") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id629'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test02311123")
 public Link test02311123_2;
 
 
 /* test21321217_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test21321217')])[2]") 
 //@FindBy(how = How.ID , using="id374") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id374'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test21321217")
 public Link test21321217_2;
 
 
 /* test49091120_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test49091120')])[2]") 
 //@FindBy(how = How.ID , using="id503") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id503'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test49091120")
 public Link test49091120_2;
 
 
 /* test09471123_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test09471123')])[2]") 
 //@FindBy(how = How.ID , using="id632") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id632'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test09471123")
 public Link test09471123_2;
 
 
 /* test28171120_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test28171120')])[2]") 
 //@FindBy(how = How.ID , using="id505") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id505'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test28171120")
 public Link test28171120_2;
 
 
 /* test10491217_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test10491217')])[2]") 
 //@FindBy(how = How.ID , using="id378") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id378'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test10491217")
 public Link test10491217_2;
 
 
 /* test23061223_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test23061223')])[2]") 
 //@FindBy(how = How.ID , using="id634") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id634'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test23061223")
 public Link test23061223_2;
 
 
 /* test37561217_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test37561217')])[2]") 
 //@FindBy(how = How.ID , using="id380") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id380'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test37561217")
 public Link test37561217_2;
 
 
 /* test24111223_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test24111223')])[2]") 
 //@FindBy(how = How.ID , using="id636") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id636'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test24111223")
 public Link test24111223_2;
 
 
 /* test34040117_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test34040117')])[2]") 
 //@FindBy(how = How.ID , using="id382") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id382'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test34040117")
 public Link test34040117_2;
 
 
 /* test40331120_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test40331120')])[2]") 
 //@FindBy(how = How.ID , using="id510") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id510'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test40331120")
 public Link test40331120_2;
 
 
 /* test17201223_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test17201223')])[2]") 
 //@FindBy(how = How.ID , using="id638") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id638'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test17201223")
 public Link test17201223_2;
 
 
 /* test34201016_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test34201016')])[2]") 
 //@FindBy(how = How.ID , using="id268") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id268'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test34201016")
 public Link test34201016_2;
 
 
 /* test46311016_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test46311016')])[2]") 
 //@FindBy(how = How.ID , using="id278") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id278'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test46311016")
 public Link test46311016_2;
 
 
 /* reports_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Reports')])[2]") 
 //@FindBy(how = How.ID , using="id66") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id66'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Reports")
 public Link reports_2;
 
 
 /* test25450917_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test25450917')])[2]") 
 //@FindBy(how = How.ID , using="id349") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id349'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test25450917")
 public Link test25450917_2;
 
 
 /* test21490917_2 - LINK */

 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Test21490917')])[2]") 
 //@FindBy(how = How.ID , using="id350") 
 //@FindBy(how = How.XPATH , using="(//a[@id='id350'])[2]") 
 @FindBy(how = How.LINK_TEXT , using = "Test21490917")
 public Link test21490917_2;
 
 
 /* cloudeSuite - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='id69']/div/table/tbody/tr/td/a") 
 @FindBy(how = How.XPATH , using = "//a[@title='Cloude Suite']")
 public Link cloudeSuite;
 
 
 /* salaryRegister - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Salary Register')]") 
 //@FindBy(how = How.XPATH , using="//a[@title='GHR Cloudesuite']") 
 //@FindBy(how = How.XPATH , using="//div[@id='id69']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Salary Register")
 public Link salaryRegister;
 
 
 /* cloudeSuite_2 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='id69']/div/table/tbody/tr/td/a[2]") 
 @FindBy(how = How.XPATH , using = "(//a[@title='Cloude Suite'])[2]")
 public Link cloudeSuite_2;
 
 
 /* a - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id69']/div/table/tbody/tr/td[3]/div/a")
 public Link a;
 
 
 /* a_2 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id69']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_2;
 
 
 /* cloudSuite - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='id191']/div/table/tbody/tr/td/a") 
 @FindBy(how = How.XPATH , using = "//a[@title='Cloud Suite']")
 public Link cloudSuite;
 
 
 /* salaryRegister_2 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Salary register')])[2]") 
 //@FindBy(how = How.XPATH , using="//a[@title='GHR CloudSuite']") 
 //@FindBy(how = How.XPATH , using="//div[@id='id191']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Salary register")
 public Link salaryRegister_2;
 
 
 /* cloudSuite_2 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='id191']/div/table/tbody/tr/td/a[2]") 
 @FindBy(how = How.XPATH , using = "(//a[@title='Cloud Suite'])[2]")
 public Link cloudSuite_2;
 
 
 /* a_3 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id191']/div/table/tbody/tr/td[3]/div/a")
 public Link a_3;
 
 
 /* a_4 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id191']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_4;
 
 
 /* salaryRegister_3 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Salary register')])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='id192']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Salary register")
 public Link salaryRegister_3;
 
 
 /* a_5 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id192']/div/table/tbody/tr/td[3]/div/a")
 public Link a_5;
 
 
 /* a_6 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id192']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_6;
 
 
 /* salaryRegister_4 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Salary register')])[4]") 
 //@FindBy(how = How.XPATH , using="//div[@id='id197']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Salary register")
 public Link salaryRegister_4;
 
 
 /* a_7 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id197']/div/table/tbody/tr/td[3]/div/a")
 public Link a_7;
 
 
 /* a_8 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id197']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_8;
 
 

/****** BUTTON Elements ******/
 /* expImgEFSAdminChannel - BUTTON */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgEFSAdminChannel']") 
 //@FindBy(how = How.XPATH , using="//button[@title='System Administration']") 
 @FindBy(how = How.ID , using = "expImgEFSAdminChannel")
 public Button expImgEFSAdminChannel;
 
 
 /* expImgEFSContentChannel - BUTTON */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgEFSContentChannel']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Manage Content']") 
 @FindBy(how = How.ID , using = "expImgEFSContentChannel")
 public Button expImgEFSContentChannel;
 
 
 /* expImgRSERS - BUTTON */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[3]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgRS-ERS']") 
 //@FindBy(how = How.XPATH , using="//button[@title='ERS']") 
 @FindBy(how = How.ID , using = "expImgRS-ERS")
 public Button expImgRSERS;
 
 
 /* expImgRSERSRightsAdministration - BUTTON */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[4]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgRS-ERS_Rights_Administration']") 
 //@FindBy(how = How.XPATH , using="//button[@title='ERS Rights Administration']") 
 @FindBy(how = How.ID , using = "expImgRS-ERS_Rights_Administration")
 public Button expImgRSERSRightsAdministration;
 
 
 /* expImgSNLSN - BUTTON */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[5]") 
 //@FindBy(how = How.XPATH , using="//button[@id='expImgSN-LSN']") 
 //@FindBy(how = How.XPATH , using="//button[@title='LSN']") 
 @FindBy(how = How.ID , using = "expImgSN-LSN")
 public Button expImgSNLSN;
 
 
/****** IFRAMEELEMENT Elements ******/
 /* sliderBUttoniFrame_3 - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//iframe[@id='sliderBUtton_iFrame']") 
 @FindBy(how = How.ID , using = "sliderBUtton_iFrame")
 public IFrameElement sliderBUttoniFrame_3;
 
 
 /* slideiFrame_3 - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//iframe[@id='slide_iFrame']") 
 @FindBy(how = How.ID , using = "slide_iFrame")
 public IFrameElement slideiFrame_3;
 
 
 /* transporter_3 - IFRAMEELEMENT */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//iframe[@id='transporter']") 
 @FindBy(how = How.ID , using = "transporter")
 public IFrameElement transporter_3;
 
 
/****** LINK Elements ******/
 /* systemAdministration - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'System Administration')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='EFSAdminChannel']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "System Administration")
 public Link systemAdministration;
 
 
 /* installValidator - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Install Validator')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSInstallValidator']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Install Validator")
 public Link installValidator;
 
 
 /* systemSettings - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'System Settings')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSSystemSettings']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "System Settings")
 public Link systemSettings;
 
 
 /* services - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Services')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSManageServices']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Services")
 public Link services;
 
 
 /* synchronizeUsersAndRoles - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Synchronize Users and Roles')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSSyncUsers']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Synchronize Users and Roles")
 public Link synchronizeUsersAndRoles;
 
 
 /* manageUsersRoles - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Manage Users & Roles')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSManageUsersRoles']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Manage Users & Roles")
 public Link manageUsersRoles;
 
 
 /* manageContent - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Manage Content')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='EFSContentChannel']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Manage Content")
 public Link manageContent;
 
 
 /* content - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'Content')])[2]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSManageContent']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Content")
 public Link content;
 
 
 /* dashboardExport - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Dashboard Export')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSDashboardExport']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Dashboard Export")
 public Link dashboardExport;
 
 
 /* dashboardImport - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Dashboard Import')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSDashboardImport']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Dashboard Import")
 public Link dashboardImport;
 
 
 /* deploymentUtility - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Deployment Utility')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSDeploymentUtility']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Deployment Utility")
 public Link deploymentUtility;
 
 
 /* delivery - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Delivery')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSDelivery']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Delivery")
 public Link delivery;
 
 
 /* centralDeviceManagement - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'Central Device Management')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='EFSCentralDevMgmt']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "Central Device Management")
 public Link centralDeviceManagement;
 
 
 /* eRS - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="(//a[contains(text(),'ERS')])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='RS-ERS']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "ERS")
 public Link eRS;
 
 
 /* eRSDelivery - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'ERS Delivery')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='RS-ERS-delivery-administration']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "ERS Delivery")
 public Link eRSDelivery;
 
 
 /* eRSReportAdministration - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'ERS Report Administration')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='RS-ERS-administration']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "ERS Report Administration")
 public Link eRSReportAdministration;
 
 
 /* eRSMyReports - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'ERS My Reports')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='RS-ERS-myreports']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "ERS My Reports")
 public Link eRSMyReports;
 
 
 /* eRSRightsAdministration - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'ERS Rights Administration')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='RS-ERS_Rights_Administration']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "ERS Rights Administration")
 public Link eRSRightsAdministration;
 
 
 /* eRSRightsAdministration_2 - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'ERS - Rights Administration')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='RS-ERS-Rights-Administration']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "ERS - Rights Administration")
 public Link eRSRightsAdministration_2;
 
 
 /* lSN - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'LSN')]") 
 //@FindBy(how = How.XPATH , using="//div[@id='SN-LSN']/div/table/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "LSN")
 public Link lSN;
 
 
 /* a_9 - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='SN-LSN']/div/table/tbody/tr/td[3]/div/a")
 public Link a_9;
 
 
 /* a_10 - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='SN-LSN']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_10;
 
 
 /* lSNSmartNotification - LINK */

 @IFrames({
  @IFrame(name="id10_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px;", "src=go?id=tools", "id=id10_iFrame", }),
 })
 //@FindBy(how = How.XPATH , using="//a[contains(text(),'LSN Smart Notification')]") 
 //@FindBy(how = How.XPATH , using="//table[@id='SN-LSN-homepage']/tbody/tr/td/span/a") 
 @FindBy(how = How.LINK_TEXT , using = "LSN Smart Notification")
 public Link lSNSmartNotification;
 
 
 /* a_11 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id69']/div/table/tbody/tr/td[3]/div/a")
 public Link a_11;
 
 
 /* a_12 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id69']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_12;
 
 
 /* a_13 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id191']/div/table/tbody/tr/td[3]/div/a")
 public Link a_13;
 
 
 /* a_14 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id191']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_14;
 
 
 /* a_15 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id192']/div/table/tbody/tr/td[3]/div/a")
 public Link a_15;
 
 
 /* a_16 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id192']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_16;
 
 
 /* a_17 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id197']/div/table/tbody/tr/td[3]/div/a")
 public Link a_17;
 
 
 /* a_18 - LINK */

 @IFrames({
  @IFrame(name="id66_iFrame" , frameType=FrameType.IFRAME  , attributes={"tabindex=51", "frameborder=0", "onfocus=this.contentWindow.focus();", "style=z-index: -10; margin: 5px; overflow: visible; height: 462px; width: 1034px; display: none;", "src=go?id=id66", "id=id66_iFrame", }),
 })
 @FindBy(how = How.XPATH , using = "//div[@id='id197']/div/table/tbody/tr/td[3]/div/a[2]")
 public Link a_18;
 
 

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