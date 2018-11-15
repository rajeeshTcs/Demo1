package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.gtnexus.testautomation.runtime.core.BasePageObject;
import com.gtnexus.testautomation.runtime.elements.Button;
import com.gtnexus.testautomation.runtime.elements.CheckBox;
import com.gtnexus.testautomation.runtime.elements.Link;
import com.gtnexus.testautomation.runtime.elements.Password;
import com.gtnexus.testautomation.runtime.elements.Text;

/**
 *  Auto Generated Code Using GTNexus Automation :: PageBot ::
 *  :: Java Driven PageObject Generator Beta ::
 *  Captured Environment : https://wiki.infor.com/confluence/login.action
 */


public class LogInInforWikiPage extends BasePageObject<LogInInforWikiPage> {

public static final String PAGE_URL = "confluence/login.action";

@Override
public String relativePageUrl() {
    return this.PAGE_URL;
}

/**
 * Start Of Auto generated fields
 */
/****** CHECKBOX Elements ******/
 /* oscookie - CHECKBOX */

 //@FindBy(how = How.NAME , using="os_cookie") 
 //@FindBy(how = How.XPATH , using="//input[@id='os_cookie']") 
 //@FindBy(how = How.XPATH , using="//input[@name='os_cookie']") 
 //@FindBy(how = How.XPATH , using="//input[@value='true']") 
 @FindBy(how = How.ID , using = "os_cookie")
 public CheckBox oscookie;
 
 
/****** LINK Elements ******/
 /* jIRAToTheWikiSupportProject - LINK */

 //@FindBy(how = How.LINK_TEXT , using="JIRA to the Wiki Support project.") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://jira/secure/CreateIssue.jspa?pid=10230']") 
 //@FindBy(how = How.XPATH , using="//div[@id='header-precursor']/div/div/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'JIRA to the Wiki Support project.')]")
 public Link jIRAToTheWikiSupportProject;
 
 
 /* linkedApplications - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Linked Applications") 
 //@FindBy(how = How.XPATH , using="//a[@href='#app-switcher']") 
 //@FindBy(how = How.XPATH , using="//header[@id='header']/nav/div/div/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Linked Applications')]")
 public Link linkedApplications;
 
 
 /* lawsonJIRA - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Lawson JIRA") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://jira.lawson.com/']") 
 //@FindBy(how = How.XPATH , using="//a[@title='http://jira.lawson.com/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='app-switcher']/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Lawson JIRA')]")
 public Link lawsonJIRA;
 
 
 /* inforSunSystems - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Infor | SunSystems") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://ukfawdatasrv:8080/jira/']") 
 //@FindBy(how = How.XPATH , using="//a[@title='http://ukfawdatasrv:8080/jira/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='app-switcher']/div/ul/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Infor | SunSystems')]")
 public Link inforSunSystems;
 
 
 /* inforWiki - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Infor Wiki") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://wiki.infor.com/confluence/']") 
 //@FindBy(how = How.XPATH , using="//a[@title='https://wiki.infor.com/confluence/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='app-switcher']/div/ul/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Infor Wiki')]")
 public Link inforWiki;
 
 
 /* inforJiraWikiSupport - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Infor Jira - Wiki Support") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://jira.infor.com/browse/WIKI']") 
 //@FindBy(how = How.XPATH , using="//a[@title='http://jira.infor.com/browse/WIKI']") 
 //@FindBy(how = How.XPATH , using="//div[@id='app-switcher']/div/ul/li[3]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Infor Jira - Wiki Support')]")
 public Link inforJiraWikiSupport;
 
 
 /* inforHCMJIRA - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Infor HCM JIRA") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://hcmjira.infor.com:8443/secure/MyJiraHome.jspa']") 
 //@FindBy(how = How.XPATH , using="//a[@title='https://hcmjira.infor.com:8443/secure/MyJiraHome.jspa']") 
 //@FindBy(how = How.XPATH , using="//div[@id='app-switcher']/div/ul/li[4]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Infor HCM JIRA')]")
 public Link inforHCMJIRA;
 
 
 /* inforJIRA - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Infor JIRA") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://jira.infor.com/']") 
 //@FindBy(how = How.XPATH , using="//a[@title='https://jira.infor.com/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='app-switcher']/div/ul/li[5]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Infor JIRA')]")
 public Link inforJIRA;
 
 
 /* inforWiki_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Infor Wiki") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/']") 
 //@FindBy(how = How.XPATH , using="//h1[@id='logo']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Infor Wiki')]")
 public Link inforWiki_2;
 
 
 /* spaces - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Spaces") 
 //@FindBy(how = How.ID , using="space-menu-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='space-menu-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='#space-menu-link-content']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Spaces']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Spaces')]")
 public Link spaces;
 
 
 /* help - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Help") 
 //@FindBy(how = How.ID , using="help-menu-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='help-menu-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='#']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Help']") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Help')])[2]")
 public Link help;
 
 
 /* onlineHelp - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Online Help") 
 //@FindBy(how = How.ID , using="confluence-help-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='confluence-help-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://docs.atlassian.com/confluence/docs-60/']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Visit the Confluence documentation home']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Online Help')]")
 public Link onlineHelp;
 
 
 /* keyboardShortcuts - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Keyboard Shortcuts") 
 //@FindBy(how = How.ID , using="keyboard-shortcuts-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='keyboard-shortcuts-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence']") 
 //@FindBy(how = How.XPATH , using="//a[@title='View available keyboard shortcuts (?)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Keyboard Shortcuts')]")
 public Link keyboardShortcuts;
 
 
 /* feedBuilder - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Feed Builder") 
 //@FindBy(how = How.ID , using="feed-builder-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='feed-builder-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/dashboard/configurerssfeed.action']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Create your custom RSS feed.']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Feed Builder')]")
 public Link feedBuilder;
 
 
 /* whatsNew - LINK */

 //@FindBy(how = How.LINK_TEXT , using="What’s new") 
 //@FindBy(how = How.ID , using="whats-new-menu-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='whats-new-menu-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://confluence.atlassian.com/display/DOC/Confluence+6.0+Release+Notes']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'What’s new')]")
 public Link whatsNew;
 
 
 /* availableGadgets - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Available Gadgets") 
 //@FindBy(how = How.ID , using="gadget-directory-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='gadget-directory-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence'])[2]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Browse gadgets provided by Confluence']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Available Gadgets')]")
 public Link availableGadgets;
 
 
 /* aboutConfluence - LINK */

 //@FindBy(how = How.LINK_TEXT , using="About Confluence") 
 //@FindBy(how = How.ID , using="confluence-about-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='confluence-about-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/aboutconfluencepage.action']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Get more information about Confluence']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'About Confluence')]")
 public Link aboutConfluence;
 
 
 /* logIn - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Log in") 
 //@FindBy(how = How.ID , using="login-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='login-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Log in')]")
 public Link logIn;
 
 
 /* forgotYourPassword - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Forgot your password?") 
 //@FindBy(how = How.ID , using="forgot-password") 
 //@FindBy(how = How.XPATH , using="//a[@id='forgot-password']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/forgotuserpassword.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Forgot your password?')]")
 public Link forgotYourPassword;
 
 
 /* deutsch - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Deutsch") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=de_DE']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Deutsch')]")
 public Link deutsch;
 
 
 /* englishUK - LINK */

 //@FindBy(how = How.LINK_TEXT , using="English (UK)") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=en_GB']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'English (UK)')]")
 public Link englishUK;
 
 
 /* englishUS - LINK */

 //@FindBy(how = How.LINK_TEXT , using="English (US)") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=en_US']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'English (US)')]")
 public Link englishUS;
 
 
 /* espaol - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Español") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=es_ES']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[3]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Español')]")
 public Link espaol;
 
 
 /* franais - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Français") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=fr_FR']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[4]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Français')]")
 public Link franais;
 
 
 /* portugus - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Português") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=pt_BR']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[5]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Português')]")
 public Link portugus;
 
 
 /* a - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Русский") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=ru_RU']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[6]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Русский')]")
 public Link a;
 
 
 /* a_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="日本語") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=ja_JP']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[7]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'日本語')]")
 public Link a_2;
 
 
 /* a_3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="한국어") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/login.action?language=ko_KR']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='login-language']/li[8]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'한국어')]")
 public Link a_3;
 
 
 /* atlassianConfluence - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Atlassian Confluence") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://www.atlassian.com/software/confluence']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='poweredby']/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Atlassian Confluence')]")
 public Link atlassianConfluence;
 
 
 /* reportABug - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Report a bug") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://support.atlassian.com/help/confluence']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='poweredby']/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Report a bug')]")
 public Link reportABug;
 
 
 /* atlassianNews - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Atlassian News") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://www.atlassian.com/about/connected.jsp?s_kwcid=Confluence-stayintouch']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='poweredby']/li[3]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Atlassian News')]")
 public Link atlassianNews;
 
 
 /* atlassian - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Atlassian") 
 //@FindBy(how = How.XPATH , using="//a[@href='http://www.atlassian.com/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='footer-logo']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Atlassian')])[3]")
 public Link atlassian;
 
 
/****** PASSWORD Elements ******/
 /* ospassword - PASSWORD */

 //@FindBy(how = How.NAME , using="os_password") 
 //@FindBy(how = How.XPATH , using="//input[@id='os_password']") 
 //@FindBy(how = How.XPATH , using="//input[@name='os_password']") 
 @FindBy(how = How.ID , using = "os_password")
 public Password ospassword;
 
 
/****** SUBMIT Elements ******/
 /* quicksearchsubmit - SUBMIT */

 //@FindBy(how = How.XPATH , using="//input[@id='quick-search-submit']") 
 //@FindBy(how = How.XPATH , using="//input[@value='Search']") 
 @FindBy(how = How.ID , using = "quick-search-submit")
 public Button quicksearchsubmit;
 
 
 /* login - SUBMIT */

 //@FindBy(how = How.NAME , using="login") 
 //@FindBy(how = How.XPATH , using="//input[@id='loginButton']") 
 //@FindBy(how = How.XPATH , using="//input[@name='login']") 
 //@FindBy(how = How.XPATH , using="//input[@value='Log in']") 
 @FindBy(how = How.ID , using = "loginButton")
 public Button login;
 
 
/****** TEXT Elements ******/
 /* queryString - TEXT */

 //@FindBy(how = How.NAME , using="queryString") 
 //@FindBy(how = How.XPATH , using="//input[@id='quick-search-query']") 
 //@FindBy(how = How.XPATH , using="//input[@name='queryString']") 
 //@FindBy(how = How.XPATH , using="//input[@title='Quick Search (/or g , g)']") 
 @FindBy(how = How.ID , using = "quick-search-query")
 public Text queryString;
 
 
 /* osusername - TEXT */

 //@FindBy(how = How.NAME , using="os_username") 
 //@FindBy(how = How.XPATH , using="//input[@id='os_username']") 
 //@FindBy(how = How.XPATH , using="//input[@name='os_username']") 
 @FindBy(how = How.ID , using = "os_username")
 public Text osusername;
 
 
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