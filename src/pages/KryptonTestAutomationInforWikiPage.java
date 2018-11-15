package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.gtnexus.testautomation.runtime.annotations.IFrame;
import com.gtnexus.testautomation.runtime.annotations.IFrames;
import com.gtnexus.testautomation.runtime.core.BasePageObject;
import com.gtnexus.testautomation.runtime.core.api.FrameType;
import com.gtnexus.testautomation.runtime.elements.Button;
import com.gtnexus.testautomation.runtime.elements.IFrameElement;
import com.gtnexus.testautomation.runtime.elements.Link;
import com.gtnexus.testautomation.runtime.elements.Text;
import com.gtnexus.testautomation.runtime.elements.TextArea;

/**
 *  Auto Generated Code Using GTNexus Automation :: PageBot ::
 *  :: Java Driven PageObject Generator Beta ::
 *  Captured Environment : https://wiki.infor.com/confluence/pages/viewpage.action?spaceKey=KTA&title=Krypton+Test+Automation+Home
 */


public class KryptonTestAutomationInforWikiPage extends BasePageObject<KryptonTestAutomationInforWikiPage> {

public static final String PAGE_URL = "confluence/pages/viewpage.action?spaceKey=KTA&title=Krypton+Test+Automation+Home";

@Override
public String relativePageUrl() {
    return this.PAGE_URL;
}

/**
 * Start Of Auto generated fields
 */
/****** BUTTON Elements ******/
 /* spacefavouriteadd - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='space-favourite-add']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Add to my spaces']") 
 @FindBy(how = How.ID , using = "space-favourite-add")
 public Button spacefavouriteadd;
 
 
 /* spacefavouriteremove - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[2]") 
 //@FindBy(how = How.XPATH , using="//button[@id='space-favourite-remove']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Remove from my spaces']") 
 @FindBy(how = How.ID , using = "space-favourite-remove")
 public Button spacefavouriteremove;
 
 
 /* spacetoolsmenutrigger - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'ConfigureSpace tools')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='space-tools-menu-trigger']") 
 @FindBy(how = How.ID , using = "space-tools-menu-trigger")
 public Button spacetoolsmenutrigger;
 
 
 /* rtebuttonlabels - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[4]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rte-button-labels']") 
 @FindBy(how = How.ID , using = "rte-button-labels")
 public Button rtebuttonlabels;
 
 
 /* rtebuttonrestrictions - BUTTON */

 //@FindBy(how = How.XPATH , using="(//button[contains(text(),'')])[5]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rte-button-restrictions']") 
 @FindBy(how = How.ID , using = "rte-button-restrictions")
 public Button rtebuttonrestrictions;
 
 
 /* rtebuttonedit - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Edit')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rte-button-edit']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Return To edit Mode']") 
 @FindBy(how = How.ID , using = "rte-button-edit")
 public Button rtebuttonedit;
 
 
 /* rtebuttonpreview - BUTTON */

 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Preview')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rte-button-preview']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Preview']") 
 @FindBy(how = How.ID , using = "rte-button-preview")
 public Button rtebuttonpreview;
 
 
 /* confirm - BUTTON */

 //@FindBy(how = How.NAME , using="confirm") 
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Save')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rte-button-publish']") 
 //@FindBy(how = How.XPATH , using="//button[@name='confirm']") 
 //@FindBy(how = How.XPATH , using="//button[@value='Save']") 
 //@FindBy(how = How.XPATH , using="//button[@title='Save']") 
 @FindBy(how = How.ID , using = "rte-button-publish")
 public Button confirm;
 
 
 /* cancel - BUTTON */

 //@FindBy(how = How.NAME , using="cancel") 
 //@FindBy(how = How.XPATH , using="//button[contains(text(),'Close')]") 
 //@FindBy(how = How.XPATH , using="//button[@id='rte-button-cancel']") 
 //@FindBy(how = How.XPATH , using="//button[@name='cancel']") 
 //@FindBy(how = How.XPATH , using="//button[@value='cancel']") 
 @FindBy(how = How.ID , using = "rte-button-cancel")
 public Button cancel;
 
 
/****** IFRAMEELEMENT Elements ******/
 /* notificationsminiviewiframe - IFRAMEELEMENT */

 //@FindBy(how = How.XPATH , using="//iframe[@id='notifications-miniview-iframe']") 
 @FindBy(how = How.ID , using = "notifications-miniview-iframe")
 public IFrameElement notificationsminiviewiframe;
 
 
/****** LINK Elements ******/
 /* skipToContent - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to content") 
 //@FindBy(how = How.XPATH , using="//a[@href='#title-heading']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='assistive-skip-links']/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to content')]")
 public Link skipToContent;
 
 
 /* skipToBreadcrumbs - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to breadcrumbs") 
 //@FindBy(how = How.XPATH , using="//a[@href='#breadcrumbs']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='assistive-skip-links']/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to breadcrumbs')]")
 public Link skipToBreadcrumbs;
 
 
 /* skipToHeaderMenu - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to header menu") 
 //@FindBy(how = How.XPATH , using="//a[@href='#header-menu-bar']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='assistive-skip-links']/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to header menu')]")
 public Link skipToHeaderMenu;
 
 
 /* skipToActionMenu - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to action menu") 
 //@FindBy(how = How.XPATH , using="//a[@href='#navigation']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='assistive-skip-links']/li[3]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to action menu')]")
 public Link skipToActionMenu;
 
 
 /* skipToQuickSearch - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to quick search") 
 //@FindBy(how = How.XPATH , using="//a[@href='#quick-search-query']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='assistive-skip-links']/li[4]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to quick search')]")
 public Link skipToQuickSearch;
 
 
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
 
 
 /* people - LINK */

 //@FindBy(how = How.LINK_TEXT , using="People") 
 //@FindBy(how = How.ID , using="people-directory-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='people-directory-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/browsepeople.action']") 
 //@FindBy(how = How.XPATH , using="//a[@title='People']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'People')]")
 public Link people;
 
 
 /* calendars - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Calendars") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/calendar/mycalendar.action']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Calendars']") 
 //@FindBy(how = How.XPATH , using="//header[@id='header']/nav/div/div[1]/ul/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Calendars')]")
 public Link calendars;
 
 
 /* create - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Create") 
 //@FindBy(how = How.ID , using="quick-create-page-button") 
 //@FindBy(how = How.XPATH , using="//a[@id='quick-create-page-button']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/createpage.action?spaceKey=KTA&fromPageId=364312260&src=quick-create']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Create blank page (c)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Create')]")
 public Link create;
 
 
 /* create_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Create") 
 //@FindBy(how = How.ID , using="create-page-button") 
 //@FindBy(how = How.XPATH , using="//a[@id='create-page-button']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/createpage.action?spaceKey=KTA&fromPageId=364312260']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Create from template']") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Create')])[2]")
 public Link create_2;
 
 
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
 //@FindBy(how = How.XPATH , using="//a[@href='https://confluence.atlassian.com/display/DOC/Confluence+6.0+Release+Notes?a=false']") 
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
 
 
 /* _1 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="1") 
 //@FindBy(how = How.ID , using="notifications-anchor") 
 //@FindBy(how = How.XPATH , using="//a[@id='notifications-anchor']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence'])[3]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Open Notifications (g , n)']") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'1')])[3]")
 public Link _1;
 
 
 /* bathiyaLadduwahetty - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='user-menu-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[2]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Bathiya Ladduwahetty']") 
 @FindBy(how = How.ID , using = "user-menu-link")
 public Link bathiyaLadduwahetty;
 
 
 /* addPersonalSpace - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Add Personal Space…") 
 //@FindBy(how = How.ID , using="create-personal-space-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='create-personal-space-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/spaces/createpersonalspace.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Add Personal Space…')]")
 public Link addPersonalSpace;
 
 
 /* recentlyViewed - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Recently Viewed") 
 //@FindBy(how = How.ID , using="view-user-history-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-user-history-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewuserhistory.action']") 
 //@FindBy(how = How.XPATH , using="//a[@title=' (g , r)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Recently Viewed')]")
 public Link recentlyViewed;
 
 
 /* profile - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Profile") 
 //@FindBy(how = How.ID , using="view-user-profile-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-user-profile-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewmyprofile.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Profile')]")
 public Link profile;
 
 
 /* tasks - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Tasks") 
 //@FindBy(how = How.ID , using="view-mytasks-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-mytasks-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/plugins/inlinetasks/mytasks.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Tasks')]")
 public Link tasks;
 
 
 /* savedForLater - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Saved for later") 
 //@FindBy(how = How.ID , using="user-favourites-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='user-favourites-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewmyfavourites.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Saved for later')]")
 public Link savedForLater;
 
 
 /* watches - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Watches") 
 //@FindBy(how = How.ID , using="user-watches-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='user-watches-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewnotifications.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Watches')]")
 public Link watches;
 
 
 /* drafts - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Drafts") 
 //@FindBy(how = How.ID , using="user-drafts-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='user-drafts-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewmydrafts.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Drafts')]")
 public Link drafts;
 
 
 /* network - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Network") 
 //@FindBy(how = How.ID , using="user-network-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='user-network-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewfollow.action?username=bladduwahetty']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Network')]")
 public Link network;
 
 
 /* settings - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Settings") 
 //@FindBy(how = How.ID , using="user-settings-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='user-settings-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/users/viewmysettings.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Settings')]")
 public Link settings;
 
 
 /* atlassianMarketplace - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Atlassian Marketplace") 
 //@FindBy(how = How.ID , using="upm-requests-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='upm-requests-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/plugins/servlet/upm/requests?source=header_user']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Atlassian Marketplace')]")
 public Link atlassianMarketplace;
 
 
 /* logOut - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Log Out") 
 //@FindBy(how = How.ID , using="logout-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='logout-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/logout.action']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Log Out')]")
 public Link logOut;
 
 
 /* kryptonTestAutomation - LINK */

 //@FindBy(how = How.XPATH , using="//a[@title='Krypton Test Automation']") 
 //@FindBy(how = How.XPATH , using="//div[@id='full-height-container']/div[1]/div/div/div/div/div/div/div/div/a") 
 @FindBy(how = How.XPATH , using = "//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home?src=sidebar']")
 public Link kryptonTestAutomation;
 
 
 /* kryptonTestAutomation_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Automation") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home?src=sidebar'])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@title='Krypton Test Automation'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='full-height-container']/div[1]/div/div/div/div/div[1]/div/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Test Automation')]")
 public Link kryptonTestAutomation_2;
 
 
 /* calendars_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Calendars") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/calendars?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//div[@id='full-height-container']/div[1]/div/div/div/div[1]/div/div/div/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Calendars')]")
 public Link calendars_2;
 
 
 /* expandAll - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Expand all") 
 //@FindBy(how = How.XPATH , using="//div[@id='full-height-container']/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div/div/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Expand all')]")
 public Link expandAll;
 
 
 /* collapseAll - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Collapse all") 
 //@FindBy(how = How.XPATH , using="//div[@id='full-height-container']/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div/div/a[1]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Collapse all')]")
 public Link collapseAll;
 
 
 /* kryptonTestAutomationHome - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Automation Home") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home?src=sidebar'])[3]") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan364312260-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Test Automation Home')]")
 public Link kryptonTestAutomationHome;
 
 
 /* a - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371954875-0']") 
 @FindBy(how = How.ID , using = "plusminus371954875-0")
 public Link a;
 
 
 /* introductionToKrypton - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Introduction to Krypton") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Introduction+to+Krypton?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954875-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Introduction to Krypton')]")
 public Link introductionToKrypton;
 
 
 /* gettingStarted - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Getting Started") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Getting+Started?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954884-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Getting Started')]")
 public Link gettingStarted;
 
 
 /* a_2 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371954844-0']") 
 @FindBy(how = How.ID , using = "plusminus371954844-0")
 public Link a_2;
 
 
 /* testCaseDesign - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Case Design") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Case+Design?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954844-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Test Case Design')]")
 public Link testCaseDesign;
 
 
 /* a_3 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371954890-0']") 
 @FindBy(how = How.ID , using = "plusminus371954890-0")
 public Link a_3;
 
 
 /* testAutomation - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Automation") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Automation?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954890-0']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Test Automation')])[3]")
 public Link testAutomation;
 
 
 /* testExecution - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Execution") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Execution?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954894-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Test Execution')]")
 public Link testExecution;
 
 
 /* testResultsAnalysisAndDecisionMaking - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Results Analysis and Decision Making") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Results+Analysis+and+Decision+Making?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954898-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Test Results Analysis and Decision Making')]")
 public Link testResultsAnalysisAndDecisionMaking;
 
 
 /* a_4 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376772074-0']") 
 @FindBy(how = How.ID , using = "plusminus376772074-0")
 public Link a_4;
 
 
 /* kryptonTraining - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Training") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Training?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376772074-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Training')]")
 public Link kryptonTraining;
 
 
 /* a_5 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376780729-0']") 
 @FindBy(how = How.ID , using = "plusminus376780729-0")
 public Link a_5;
 
 
 /* kryptonSupport - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Support") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Support?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376780729-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Support')]")
 public Link kryptonSupport;
 
 
 /* a_6 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371957295-0']") 
 @FindBy(how = How.ID , using = "plusminus371957295-0")
 public Link a_6;
 
 
 /* kryptonReleaseNotes - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Release Notes") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Release+Notes?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371957295-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Release Notes')]")
 public Link kryptonReleaseNotes;
 
 
 /* a_7 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus375117173-0']") 
 @FindBy(how = How.ID , using = "plusminus375117173-0")
 public Link a_7;
 
 
 /* recycleBin - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Recycle Bin") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Recycle+Bin?src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375117173-0']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Recycle Bin')]")
 public Link recycleBin;
 
 
 /* gS - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='space-pages-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/collector/pages.action?key=KTA&src=sidebar']") 
 //@FindBy(how = How.XPATH , using="//a[@title=' (g , s)']") 
 @FindBy(how = How.ID , using = "space-pages-link")
 public Link gS;
 
 
 /* overview - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Overview") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/spaces/viewspacesummary.action?key=KTA&src=spacetools']") 
 //@FindBy(how = How.XPATH , using="//div[@id='space-tools-menu']/div/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Overview')]")
 public Link overview;
 
 
 /* contentTools - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Content Tools") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/reorderpages.action?key=KTA&src=spacetools']") 
 //@FindBy(how = How.XPATH , using="//div[@id='space-tools-menu']/div/div/ul/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Content Tools')]")
 public Link contentTools;
 
 
 /* reorderPages - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Reorder pages") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/pages/reorderpages.action?key=KTA&src=spacetools'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='space-tools-menu']/div[1]/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Reorder pages')]")
 public Link reorderPages;
 
 
 /* a_8 - LINK */

 @FindBy(how = How.XPATH , using = "//div[@id='full-height-container']/div[1]/div/div/div[1]/a")
 public Link a_8;
 
 
 /* edit - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Edit") 
 //@FindBy(how = How.ID , using="editPageLink") 
 //@FindBy(how = How.XPATH , using="//a[@id='editPageLink']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/editpage.action?pageId=364312260']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Edit (e)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Edit')]")
 public Link edit;
 
 
 /* saveForLater - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Save for later") 
 //@FindBy(how = How.ID , using="page-favourite") 
 //@FindBy(how = How.XPATH , using="//a[@id='page-favourite']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence'])[4]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Save for later (f)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Save for later')]")
 public Link saveForLater;
 
 
 /* watching - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Watching") 
 //@FindBy(how = How.ID , using="watch-content-button") 
 //@FindBy(how = How.XPATH , using="//a[@id='watch-content-button']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence'])[5]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Stop watching (w)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Watching')]")
 public Link watching;
 
 
 /* share - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Share") 
 //@FindBy(how = How.ID , using="shareContentLink") 
 //@FindBy(how = How.XPATH , using="//a[@id='shareContentLink']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence'])[6]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Share this content by emailing other users (s)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Share')]")
 public Link share;
 
 
 /* a_9 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='action-menu-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[3]") 
 @FindBy(how = How.ID , using = "action-menu-link")
 public Link a_9;
 
 
 /* attachments0 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Attachments (0)") 
 //@FindBy(how = How.ID , using="view-attachments-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-attachments-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpageattachments.action?pageId=364312260']") 
 //@FindBy(how = How.XPATH , using="//a[@title='View Attachments (t)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Attachments (0)')]")
 public Link attachments0;
 
 
 /* pageHistory - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Page History") 
 //@FindBy(how = How.ID , using="action-view-history-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-view-history-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpreviousversions.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Page History')]")
 public Link pageHistory;
 
 
 /* restrictions - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Restrictions") 
 //@FindBy(how = How.ID , using="action-page-permissions-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-page-permissions-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewinfo.action?pageId=364312260']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Edit restrictions']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Restrictions')]")
 public Link restrictions;
 
 
 /* pageInformation - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Page Information") 
 //@FindBy(how = How.ID , using="view-page-info-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-page-info-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/pages/viewinfo.action?pageId=364312260'])[2]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Page Information')]")
 public Link pageInformation;
 
 
 /* resolvedComments0 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Resolved comments (0)") 
 //@FindBy(how = How.ID , using="view-resolved-comments") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-resolved-comments']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence'])[7]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Resolved comments (0)')]")
 public Link resolvedComments0;
 
 
 /* linkToThisPage - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Link to this Page…") 
 //@FindBy(how = How.ID , using="link-to-page-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='link-to-page-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/pages/viewinfo.action?pageId=364312260'])[3]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Link to this Page (k)']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Link to this Page…')]")
 public Link linkToThisPage;
 
 
 /* viewInHierarchy - LINK */

 //@FindBy(how = How.LINK_TEXT , using="View in Hierarchy") 
 //@FindBy(how = How.ID , using="view-in-hierarchy-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='view-in-hierarchy-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/reorderpages.action?key=KTA&openId=364312260#selectedPageInHierarchy']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'View in Hierarchy')]")
 public Link viewInHierarchy;
 
 
 /* viewStorageFormat - LINK */

 //@FindBy(how = How.LINK_TEXT , using="View Storage Format") 
 //@FindBy(how = How.ID , using="action-source-editor-view-storage-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-source-editor-view-storage-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/plugins/viewstorage/viewpagestorage.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'View Storage Format')]")
 public Link viewStorageFormat;
 
 
 /* viewSource - LINK */

 //@FindBy(how = How.LINK_TEXT , using="View Source") 
 //@FindBy(how = How.ID , using="action-view-source-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-view-source-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/plugins/viewsource/viewpagesrc.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'View Source')]")
 public Link viewSource;
 
 
 /* exportToPDF - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Export to PDF") 
 //@FindBy(how = How.ID , using="action-export-pdf-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-export-pdf-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/spaces/flyingpdf/pdfpageexport.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Export to PDF')]")
 public Link exportToPDF;
 
 
 /* exportToWord - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Export to Word") 
 //@FindBy(how = How.ID , using="action-export-word-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-export-word-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/exportword?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Export to Word')]")
 public Link exportToWord;
 
 
 /* importWordDocument - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Import Word Document") 
 //@FindBy(how = How.ID , using="import-word-doc") 
 //@FindBy(how = How.XPATH , using="//a[@id='import-word-doc']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/worddav/uploadimport.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Import Word Document')]")
 public Link importWordDocument;
 
 
 /* viewVisioFile - LINK */

 //@FindBy(how = How.LINK_TEXT , using="View Visio File") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/plugins/lucidchart/selectVisio.action?contentId=364312260']") 
 //@FindBy(how = How.XPATH , using="//ul[@id='action-menu-secondary']/li[9]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'View Visio File')]")
 public Link viewVisioFile;
 
 
 /* copy - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Copy") 
 //@FindBy(how = How.ID , using="action-copy-page-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-copy-page-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/copypage.action?idOfPageToCopy=364312260&spaceKey=KTA']") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Copy')])[2]")
 public Link copy;
 
 
 /* move - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Move") 
 //@FindBy(how = How.ID , using="action-move-page-dialog-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-move-page-dialog-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpage.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Move')]")
 public Link move;
 
 
 /* delete - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Delete") 
 //@FindBy(how = How.ID , using="action-remove-content-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='action-remove-content-link']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/removepage.action?pageId=364312260']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Delete')]")
 public Link delete;
 
 
 /* pages - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Pages") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/collector/pages.action?key=KTA&src=breadcrumbs-collector']") 
 //@FindBy(how = How.XPATH , using="//ol[@id='breadcrumbs']/li/span/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Pages')])[2]")
 public Link pages;
 
 
 /* skipToEndOfBanner - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to end of banner") 
 //@FindBy(how = How.XPATH , using="//a[@href='#page-banner-end']") 
 //@FindBy(how = How.XPATH , using="//div[@id='title-heading']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to end of banner')]")
 public Link skipToEndOfBanner;
 
 
 /* unrestricted - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='content-metadata-page-restrictions']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Unrestricted']") 
 @FindBy(how = How.ID , using = "content-metadata-page-restrictions")
 public Link unrestricted;
 
 
 /* jIRALinks - LINK */

 //@FindBy(how = How.LINK_TEXT , using="JIRA links") 
 //@FindBy(how = How.ID , using="content-metadata-jira") 
 //@FindBy(how = How.XPATH , using="//a[@id='content-metadata-jira']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'JIRA links')]")
 public Link jIRALinks;
 
 
 /* goToStartOfBanner - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Go to start of banner") 
 //@FindBy(how = How.XPATH , using="//a[@href='#page-banner-start']") 
 //@FindBy(how = How.XPATH , using="//div[@id='title-heading']/a[1]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Go to start of banner')]")
 public Link goToStartOfBanner;
 
 
 /* kryptonTestAutomationHome_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Automation Home") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home']") 
 //@FindBy(how = How.XPATH , using="//h1[@id='title-text']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Test Automation Home')])[2]")
 public Link kryptonTestAutomationHome_2;
 
 
 /* skipToEndOfMetadata - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Skip to end of metadata") 
 //@FindBy(how = How.XPATH , using="//a[@href='#page-metadata-end']") 
 //@FindBy(how = How.XPATH , using="//div[@id='content']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Skip to end of metadata')]")
 public Link skipToEndOfMetadata;
 
 
 /* dianeMetzger - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Diane Metzger") 
	// @FindBy(how = How.XPATH , using="(//a[@href='
	// /confluence/display/~dsten'])[2]")
 //@FindBy(how = How.XPATH , using="//div[@id='content']/div[2]/ul/li/span/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Diane Metzger')]")
 public Link dianeMetzger;
 
 
 /* ravindraMuthukrishna - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Ravindra Muthukrishna") 
	// @FindBy(how = How.XPATH , using="(//a[@href='
	// /confluence/display/~rmuthukrishna'])[4]")
 //@FindBy(how = How.XPATH , using="//div[@id='content']/div[2]/ul/li/span[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Ravindra Muthukrishna')]")
 public Link ravindraMuthukrishna;
 
 
 /* jun222017 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Jun 22, 2017") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/diffpagesbyversion.action?pageId=364312260&selectedPageVersions=11&selectedPageVersions=12']") 
 //@FindBy(how = How.XPATH , using="//a[@title='Show changes']") 
 //@FindBy(how = How.XPATH , using="//div[@id='content']/div[2]/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Jun 22, 2017')]")
 public Link jun222017;
 
 
 /* goToStartOfMetadata - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Go to start of metadata") 
 //@FindBy(how = How.XPATH , using="//a[@href='#page-metadata-start']") 
 //@FindBy(how = How.XPATH , using="//div[@id='content']/a[1]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Go to start of metadata')]")
 public Link goToStartOfMetadata;
 
 
 /* clickHere - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Click here") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://teams.microsoft.com/_#/conversations/General?threadId=19:03cf5de15d204eb19aa68f4f6a26d745@thread.skype&ctx=channel']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div/div/div/div/div/p[2]/span/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Click here')]")
 public Link clickHere;
 
 
 /* K - LINK */

 //@FindBy(how = How.LINK_TEXT , using="K") 
 //@FindBy(how = How.XPATH , using="//a[@href='https://teams.microsoft.com/l/team/19:03cf5de15d204eb19aa68f4f6a26d745@thread.skype/']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div/div/div/div/div/p[2]/span/a[1]") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'K')])[23]")
 public Link K;
 
 
 /* expandAll_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Expand all") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[4]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div/div/div/div/div/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Expand all')])[2]")
 public Link expandAll_2;
 
 
 /* collapseAll_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Collapse all") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[5]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div/div/div/div/div/a[1]") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Collapse all')])[2]")
 public Link collapseAll_2;
 
 
 /* kryptonTestAutomationHome_3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Automation Home") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home'])[2]") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan364312260-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Test Automation Home')])[3]")
 public Link kryptonTestAutomationHome_3;
 
 
 /* a_10 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371954875-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[6]") 
 @FindBy(how = How.ID , using = "plusminus371954875-1")
 public Link a_10;
 
 
 /* introductionToKrypton_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Introduction to Krypton") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Introduction+to+Krypton']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954875-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Introduction to Krypton')])[2]")
 public Link introductionToKrypton_2;
 
 
 /* howKryptonStacksUpAgainstTheCompetition - LINK */

 //@FindBy(how = How.LINK_TEXT , using="How Krypton stacks up against the Competition") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/How+Krypton+stacks+up+against+the+Competition']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371980348-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'How Krypton stacks up against the Competition')]")
 public Link howKryptonStacksUpAgainstTheCompetition;
 
 
 /* typesOfTestingSupportedByKrypton - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Types of Testing Supported by Krypton") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Types+of+Testing+Supported+by+Krypton']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371980306-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Types of Testing Supported by Krypton')]")
 public Link typesOfTestingSupportedByKrypton;
 
 
 /* collaboratingForSuccess - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Collaborating for Success") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Collaborating+for+Success']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376785447-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Collaborating for Success')]")
 public Link collaboratingForSuccess;
 
 
 /* gettingStarted_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Getting Started") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Getting+Started']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954884-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Getting Started')])[2]")
 public Link gettingStarted_2;
 
 
 /* a_11 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371954844-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[7]") 
 @FindBy(how = How.ID , using = "plusminus371954844-1")
 public Link a_11;
 
 
 /* testCaseDesign_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Case Design") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Case+Design']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954844-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Test Case Design')])[2]")
 public Link testCaseDesign_2;
 
 
 /* settingUpAJiraTCMProject - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Setting up a Jira TCM Project") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Setting+up+a+Jira+TCM+Project']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376780493-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Setting up a Jira TCM Project')]")
 public Link settingUpAJiraTCMProject;
 
 
 /* a_12 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus375105029-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[8]") 
 @FindBy(how = How.ID , using = "plusminus375105029-1")
 public Link a_12;
 
 
 /* testCaseAuthoring - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Case Authoring") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Case+Authoring']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105029-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Test Case Authoring')]")
 public Link testCaseAuthoring;
 
 
 /* a_13 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371954890-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[9]") 
 @FindBy(how = How.ID , using = "plusminus371954890-1")
 public Link a_13;
 
 
 /* testAutomation_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Automation") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Automation']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954890-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Test Automation')])[6]")
 public Link testAutomation_2;
 
 
 /* a_14 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376772040-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[10]") 
 @FindBy(how = How.ID , using = "plusminus376772040-1")
 public Link a_14;
 
 
 /* howToInstallTheKryptonISE - LINK */

 //@FindBy(how = How.LINK_TEXT , using="How to Install the Krypton ISE") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/How+to+Install+the+Krypton+ISE']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376772040-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'How to Install the Krypton ISE')]")
 public Link howToInstallTheKryptonISE;
 
 
 /* a_15 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371952308-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[11]") 
 @FindBy(how = How.ID , using = "plusminus371952308-1")
 public Link a_15;
 
 
 /* kryptonTestScriptRepositories - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Script Repositories") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Test+Script+Repositories']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371952308-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Test Script Repositories')]")
 public Link kryptonTestScriptRepositories;
 
 
 /* a_16 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus375123784-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[12]") 
 @FindBy(how = How.ID , using = "plusminus375123784-1")
 public Link a_16;
 
 
 /* managingTheTestScriptRepository - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Managing the Test Script Repository") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Managing+the+Test+Script+Repository']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375123784-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Managing the Test Script Repository')]")
 public Link managingTheTestScriptRepository;
 
 
 /* a_17 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371979260-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[13]") 
 @FindBy(how = How.ID , using = "plusminus371979260-1")
 public Link a_17;
 
 
 /* kryptonScripting - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Scripting") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Scripting']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371979260-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Scripting')]")
 public Link kryptonScripting;
 
 
 /* managingCloudSuiteProductVersions - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Managing CloudSuite/Product Versions") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpage.action?pageId=375126281']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375126281-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Managing CloudSuite/Product Versions')]")
 public Link managingCloudSuiteProductVersions;
 
 
 /* a_18 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus375117388-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[14]") 
 @FindBy(how = How.ID , using = "plusminus375117388-1")
 public Link a_18;
 
 
 /* testAutomationBestPractices - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Automation Best Practices") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Automation+Best+Practices']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375117388-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Test Automation Best Practices')]")
 public Link testAutomationBestPractices;
 
 
 /* a_19 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376770559-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[15]") 
 @FindBy(how = How.ID , using = "plusminus376770559-1")
 public Link a_19;
 
 
 /* testScriptReviewProcess - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Script Review Process") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Script+Review+Process']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376770559-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Test Script Review Process')]")
 public Link testScriptReviewProcess;
 
 
 /* testExecution_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Execution") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Execution']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954894-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Test Execution')])[2]")
 public Link testExecution_2;
 
 
 /* testResultsAnalysisAndDecisionMaking_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Results Analysis and Decision Making") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Test+Results+Analysis+and+Decision+Making']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954898-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Test Results Analysis and Decision Making')])[2]")
 public Link testResultsAnalysisAndDecisionMaking_2;
 
 
 /* a_20 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376772074-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[16]") 
 @FindBy(how = How.ID , using = "plusminus376772074-1")
 public Link a_20;
 
 
 /* kryptonTraining_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Training") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Training']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376772074-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Training')])[2]")
 public Link kryptonTraining_2;
 
 
 /* kryptonTrainingWorkshop - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Training Workshop") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Training+Workshop']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376772076-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Training Workshop')]")
 public Link kryptonTrainingWorkshop;
 
 
 /* cloudSuiteProductsVideos - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Cloud Suite products Videos") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Cloud+Suite+products+Videos']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376779259-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Cloud Suite products Videos')]")
 public Link cloudSuiteProductsVideos;
 
 
 /* a_21 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376780729-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[17]") 
 @FindBy(how = How.ID , using = "plusminus376780729-1")
 public Link a_21;
 
 
 /* kryptonSupport_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Support") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Support']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376780729-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Support')])[2]")
 public Link kryptonSupport_2;
 
 
 /* connectingToKryptonSupport - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Connecting to Krypton Support") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Connecting+to+Krypton+Support']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376778885-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Connecting to Krypton Support')]")
 public Link connectingToKryptonSupport;
 
 
 /* fAQ - LINK */

 //@FindBy(how = How.LINK_TEXT , using="FAQ") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/FAQ']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan367126259-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'FAQ')]")
 public Link fAQ;
 
 
 /* a_22 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus376784570-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[18]") 
 @FindBy(how = How.ID , using = "plusminus376784570-1")
 public Link a_22;
 
 
 /* qAManagementProcess - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Q&A Management Process") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpage.action?pageId=376784570']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376784570-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Q&A Management Process')]")
 public Link qAManagementProcess;
 
 
 /* a_23 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus371957295-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[19]") 
 @FindBy(how = How.ID , using = "plusminus371957295-1")
 public Link a_23;
 
 
 /* kryptonReleaseNotes_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Release Notes") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Release+Notes']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371957295-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Release Notes')])[2]")
 public Link kryptonReleaseNotes_2;
 
 
 /* kryptonRuntime67xReleaseNotes - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Runtime 6.7.x release notes") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Runtime+6.7.x+release+notes']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371957297-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton Runtime 6.7.x release notes')]")
 public Link kryptonRuntime67xReleaseNotes;
 
 
 /* a_24 - LINK */

 //@FindBy(how = How.XPATH , using="//a[@id='plusminus375117173-1']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[20]") 
 @FindBy(how = How.ID , using = "plusminus375117173-1")
 public Link a_24;
 
 
 /* recycleBin_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Recycle Bin") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Recycle+Bin']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375117173-1']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Recycle Bin')])[2]")
 public Link recycleBin_2;
 
 
 /* settingUpTheKryptonPlayground - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Setting Up The Krypton Playground") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Setting+Up+The+Krypton+Playground']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan367126361-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Setting Up The Krypton Playground')]")
 public Link settingUpTheKryptonPlayground;
 
 
 /* writingYourFirstScript - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Writing your first script") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Writing+your+first+script']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105129-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Writing your first script')]")
 public Link writingYourFirstScript;
 
 
 /* centralScriptRepository - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Central Script Repository") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Central+Script+Repository']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105096-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Central Script Repository')]")
 public Link centralScriptRepository;
 
 
 /* generatingRequiredPages - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Generating Required Pages") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Generating+Required+Pages']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105254-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Generating Required Pages')]")
 public Link generatingRequiredPages;
 
 
 /* gitFeatureBranchWorkflow - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Git Feature Branch Workflow") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Git+Feature+Branch+Workflow']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105801-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Git Feature Branch Workflow')]")
 public Link gitFeatureBranchWorkflow;
 
 
 /* installingGitOnWindows - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Installing Git on Windows") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Installing+Git+on+Windows']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954743-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Installing Git on Windows')]")
 public Link installingGitOnWindows;
 
 
 /* kryptonActionRecorder - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton action recorder") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+action+recorder']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105138-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Krypton action recorder')]")
 public Link kryptonActionRecorder;
 
 
 /* kryptonInstallation - LINK */

 //@FindBy(how = How.LINK_TEXT , using="krypton Installation") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/krypton+Installation']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105155-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'krypton Installation')]")
 public Link kryptonInstallation;
 
 
 /* projectStructure - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Project Structure") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Project+Structure']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105080-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Project Structure')]")
 public Link projectStructure;
 
 
 /* scriptingProcess - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Scripting Process") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Scripting+Process']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105088-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Scripting Process')]")
 public Link scriptingProcess;
 
 
 /* settingUpTheScriptProject - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Setting Up The Script Project") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Setting+Up+The+Script+Project']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105051-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Setting Up The Script Project')]")
 public Link settingUpTheScriptProject;
 
 
 /* usingAutomatorScriptIDE - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Using Automator Script IDE") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Using+Automator+Script+IDE']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105099-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Using Automator Script IDE')]")
 public Link usingAutomatorScriptIDE;
 
 
 /* usingConsoleGitBash - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Using Console - Git Bash") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Using+Console+-+Git+Bash']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105102-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Using Console - Git Bash')]")
 public Link usingConsoleGitBash;
 
 
 /* writingPerformanceScripts - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Writing Performance scripts​") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpage.action?pageId=375105314']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375105314-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Writing Performance scripts​')]")
 public Link writingPerformanceScripts;
 
 
 /* scriptRepositoryStructure - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Script Repository Structure") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Script+Repository+Structure']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan375123848-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Script Repository Structure')]")
 public Link scriptRepositoryStructure;
 
 
 /* howToFixGitPushRejected - LINK */

 //@FindBy(how = How.LINK_TEXT , using="How to fix git push rejected") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/How+to+fix+git+push+rejected']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376778744-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'How to fix git push rejected')]")
 public Link howToFixGitPushRejected;
 
 
 /* howToUpdateGITWrappers - LINK */

 //@FindBy(how = How.LINK_TEXT , using="How to Update GIT Wrappers") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/How+to+Update+GIT+Wrappers']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376778871-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'How to Update GIT Wrappers')]")
 public Link howToUpdateGITWrappers;
 
 
 /* toolIntroduction - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Tool Introduction") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Tool+Introduction']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan371954837-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Tool Introduction')]")
 public Link toolIntroduction;
 
 
 /* howToSetupAvatar - LINK */

 //@FindBy(how = How.LINK_TEXT , using="How to setup Avatar") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/How+to+setup+Avatar']") 
 //@FindBy(how = How.XPATH , using="//span[@id='childrenspan376785332-1']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'How to setup Avatar')]")
 public Link howToSetupAvatar;
 
 
 /* a_25 - LINK */

 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li/div/a") 
 @FindBy(how = How.XPATH , using = "//a[@href='/confluence/users/editmyprofilepicture.action']")
 public Link a_25;
 
 
 /* bathiyaLadduwahetty_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Bathiya Ladduwahetty") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/~bladduwahetty']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/div/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Bathiya Ladduwahetty')]")
 public Link bathiyaLadduwahetty_2;
 
 
 /* prerequisitesForSettingUpKryptonScriptingEnvironment - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Prerequisites for Setting up Krypton Scripting Environment") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Prerequisites+for+Setting+up+Krypton+Scripting+Environment']") 
 //@FindBy(how = How.XPATH , using="(//a[@title='Krypton Test Automation'])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/div[1]/span/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Prerequisites for Setting up Krypton Scripting Environment')]")
 public Link prerequisitesForSettingUpKryptonScriptingEnvironment;
 
 
 /* viewChange - LINK */

 //@FindBy(how = How.LINK_TEXT , using="view change") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/diffpagesbyversion.action?pageId=371979286&selectedPageVersions=13&selectedPageVersions=12']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/div[1]/span[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'view change')]")
 public Link viewChange;
 
 
 /* a_26 - LINK */

 @FindBy(how = How.XPATH , using = "//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[1]/div/a")
 public Link a_26;
 
 
 /* ravindraMuthukrishna_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Ravindra Muthukrishna") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/~rmuthukrishna']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[1]/ul/div/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Ravindra Muthukrishna')])[2]")
 public Link ravindraMuthukrishna_2;
 
 
 /* checklistForFunctionalReviewByTheCloudSuiteProductTeam - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Checklist for Functional Review by the CloudSuite/Product Team") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpage.action?pageId=376770106']") 
 //@FindBy(how = How.XPATH , using="(//a[@title='Krypton Test Automation'])[4]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[1]/ul/li/div[1]/span/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Checklist for Functional Review by the CloudSuite/Product Team')]")
 public Link checklistForFunctionalReviewByTheCloudSuiteProductTeam;
 
 
 /* viewChange_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="view change") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/diffpagesbyversion.action?pageId=376770106&selectedPageVersions=13&selectedPageVersions=12']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[1]/ul/li/div[1]/span[2]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'view change')])[2]")
 public Link viewChange_2;
 
 
 /* testScriptReviewProcess_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Test Script Review Process") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/KTA/Test+Script+Review+Process'])[2]") 
 //@FindBy(how = How.XPATH , using="(//a[@title='Krypton Test Automation'])[5]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[1]/ul/li[1]/div[1]/span/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Test Script Review Process')])[2]")
 public Link testScriptReviewProcess_2;
 
 
 /* viewChange_3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="view change") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/diffpagesbyversion.action?pageId=376770559&selectedPageVersions=21&selectedPageVersions=20']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[1]/ul/li[1]/div[1]/span[2]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'view change')])[3]")
 public Link viewChange_3;
 
 
 /* a_27 - LINK */

 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[2]/div/a") 
 @FindBy(how = How.XPATH , using = "(//a[@href='/confluence/users/editmyprofilepicture.action'])[2]")
 public Link a_27;
 
 
 /* bathiyaLadduwahetty_3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Bathiya Ladduwahetty") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/~bladduwahetty'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[2]/ul/div/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Bathiya Ladduwahetty')])[2]")
 public Link bathiyaLadduwahetty_3;
 
 
 /* settingUpKryptonScriptRepository - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Setting Up Krypton Script Repository") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Setting+Up+Krypton+Script+Repository']") 
 //@FindBy(how = How.XPATH , using="(//a[@title='Krypton Test Automation'])[6]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[2]/ul/li/div[1]/span/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Setting Up Krypton Script Repository')]")
 public Link settingUpKryptonScriptRepository;
 
 
 /* viewChange_4 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="view change") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/diffpagesbyversion.action?pageId=376772489&selectedPageVersions=16&selectedPageVersions=15']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[2]/ul/li/div[1]/span[2]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'view change')])[4]")
 public Link viewChange_4;
 
 
 /* a_28 - LINK */

 @FindBy(how = How.XPATH , using = "//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[3]/div/a")
 public Link a_28;
 
 
 /* ravindraMuthukrishna_3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Ravindra Muthukrishna") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/~rmuthukrishna'])[2]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[3]/ul/div/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Ravindra Muthukrishna')])[3]")
 public Link ravindraMuthukrishna_3;
 
 
 /* preconditionsForPublishingQuestionsToTheQATracker - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Preconditions for Publishing Questions to the Q&A Tracker") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/viewpage.action?pageId=376784252']") 
 //@FindBy(how = How.XPATH , using="(//a[@title='Krypton Test Automation'])[7]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[3]/ul/li/div[1]/span/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Preconditions for Publishing Questions to the Q&A Tracker')]")
 public Link preconditionsForPublishingQuestionsToTheQATracker;
 
 
 /* viewChange_5 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="view change") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/pages/diffpagesbyversion.action?pageId=376784252&selectedPageVersions=5&selectedPageVersions=4']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/ul/li[3]/ul/li/div[1]/span[2]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'view change')])[5]")
 public Link viewChange_5;
 
 
 /* showMore - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Show More") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/plugins/recently-updated/changes.action?theme=social&pageSize=5&startIndex=5&searchToken=229242&spaceKeys=KTA&contentType=page, comment, blogpost']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div/div[1]/div/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Show More')]")
 public Link showMore;
 
 
 /* ravindraMuthukrishna_4 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Ravindra Muthukrishna") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/~rmuthukrishna'])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div[1]/div/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Ravindra Muthukrishna')])[4]")
 public Link ravindraMuthukrishna_4;
 
 
 /* chameeraSamarawickrama - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Chameera Samarawickrama") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/~csamarawickrama']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div[1]/div/div/ul/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Chameera Samarawickrama')]")
 public Link chameeraSamarawickrama;
 
 
 /* bathiyaLadduwahetty_4 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Bathiya Ladduwahetty") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/~bladduwahetty'])[3]") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div[1]/div/div/ul/li[2]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Bathiya Ladduwahetty')])[3]")
 public Link bathiyaLadduwahetty_4;
 
 
 /* dianeMetzger_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Diane Metzger") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/~dsten']") 
 //@FindBy(how = How.XPATH , using="//div[@id='main-content']/div/div[1]/div[1]/div/div[1]/div/div/ul/li[3]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Diane Metzger')])[2]")
 public Link dianeMetzger_2;
 
 
 /* like - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Like") 
 //@FindBy(how = How.XPATH , using="//div[@id='likes-section']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Like')]")
 public Link like;
 
 
 /* editLabels - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Edit Labels") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[21]") 
 //@FindBy(how = How.XPATH , using="//a[@title='Edit Labels (l)']") 
 //@FindBy(how = How.XPATH , using="//div[@id='labels-section']/div/div/ul/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Edit Labels')]")
 public Link editLabels;
 
 
 /* a_29 - LINK */

 //@FindBy(how = How.XPATH , using="//div[@id='comments-section']/div/div/p/a") 
 @FindBy(how = How.XPATH , using = "//a[@href='/confluence/users/profile/editmyprofilepicture.action']")
 public Link a_29;
 
 
 /* addComment - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Add Comment") 
 //@FindBy(how = How.ID , using="add-comment-rte") 
 //@FindBy(how = How.XPATH , using="//a[@id='add-comment-rte']") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home?showComments=true&showCommentArea=true#addcomment']") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Add Comment')]")
 public Link addComment;
 
 
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
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Atlassian')])[4]")
 public Link atlassian;
 
 
 /* kryptonTestAutomation_3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Automation") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/display/KTA']") 
 //@FindBy(how = How.XPATH , using="//ol[@id='quickedit-breadcrumbs']/li/span/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Test Automation')])[5]")
 public Link kryptonTestAutomation_3;
 
 
 /* pages_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Pages") 
 //@FindBy(how = How.XPATH , using="//a[@href='/confluence/collector/pages.action?key=KTA']") 
 //@FindBy(how = How.XPATH , using="//ol[@id='quickedit-breadcrumbs']/li[1]/span/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Pages')])[4]")
 public Link pages_2;
 
 
 /* kryptonTestAutomationHome_4 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Krypton Test Automation Home") 
 //@FindBy(how = How.XPATH , using="(//a[@href='/confluence/display/KTA/Krypton+Test+Automation+Home'])[3]") 
 //@FindBy(how = How.XPATH , using="//ol[@id='quickedit-breadcrumbs']/li[2]/span/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Krypton Test Automation Home')])[4]")
 public Link kryptonTestAutomationHome_4;
 
 
 /* paragraph - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Paragraph") 
 //@FindBy(how = How.ID , using="format-dropdown-display") 
 //@FindBy(how = How.XPATH , using="//a[@id='format-dropdown-display']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[22]") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Paragraph')])[2]")
 public Link paragraph;
 
 
 /* paragraph_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Paragraph") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[23]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Paragraph')]")
 public Link paragraph_2;
 
 
 /* heading1 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Heading 1") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[24]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Heading 1')]")
 public Link heading1;
 
 
 /* heading2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Heading 2") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[25]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Heading 2')]")
 public Link heading2;
 
 
 /* heading3 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Heading 3") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[26]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[3]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Heading 3')]")
 public Link heading3;
 
 
 /* heading4 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Heading 4") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[27]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[4]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Heading 4')]")
 public Link heading4;
 
 
 /* heading5 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Heading 5") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[28]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[5]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Heading 5')]")
 public Link heading5;
 
 
 /* heading6 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Heading 6") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[29]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[6]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Heading 6')]")
 public Link heading6;
 
 
 /* preformatted - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Preformatted") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[30]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[7]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Preformatted')]")
 public Link preformatted;
 
 
 /* quote - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Quote") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[31]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='format-dropdown-display-menu']/li[8]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Quote')]")
 public Link quote;
 
 
 /* bold - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Bold") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[32]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-bold']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Bold')]")
 public Link bold;
 
 
 /* italic - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Italic") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[33]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-italic']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Italic')]")
 public Link italic;
 
 
 /* underline - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Underline") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[34]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-underline']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Underline')]")
 public Link underline;
 
 
 /* colourPicker - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Colour picker") 
 //@FindBy(how = How.ID , using="rte-button-color") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-color']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[35]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Colour picker')]")
 public Link colourPicker;
 
 
 /* moreColours - LINK */

 //@FindBy(how = How.LINK_TEXT , using="More colours") 
 //@FindBy(how = How.ID , using="rte-button-color-selector") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-color-selector']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[36]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'More colours')]")
 public Link moreColours;
 
 
 /* a_30 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[37]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),' ')]")
 public Link a_30;
 
 
 /* a_31 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[38]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[1]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[2]")
 public Link a_31;
 
 
 /* a_32 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[39]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[2]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[3]")
 public Link a_32;
 
 
 /* a_33 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[40]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[3]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[4]")
 public Link a_33;
 
 
 /* a_34 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[41]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[4]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[5]")
 public Link a_34;
 
 
 /* a_35 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[42]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[5]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[6]")
 public Link a_35;
 
 
 /* a_36 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[43]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[6]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[7]")
 public Link a_36;
 
 
 /* a_37 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[44]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[7]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[8]")
 public Link a_37;
 
 
 /* a_38 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[45]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[8]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[9]")
 public Link a_38;
 
 
 /* a_39 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[46]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[9]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[10]")
 public Link a_39;
 
 
 /* a_40 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[47]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[10]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[11]")
 public Link a_40;
 
 
 /* a_41 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[48]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[11]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[12]")
 public Link a_41;
 
 
 /* a_42 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[49]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[12]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[13]")
 public Link a_42;
 
 
 /* a_43 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[50]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[13]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[14]")
 public Link a_43;
 
 
 /* a_44 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[51]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[14]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[15]")
 public Link a_44;
 
 
 /* a_45 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[52]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[15]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[16]")
 public Link a_45;
 
 
 /* a_46 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[53]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[16]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[17]")
 public Link a_46;
 
 
 /* a_47 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[54]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[17]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[18]")
 public Link a_47;
 
 
 /* a_48 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[55]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[18]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[19]")
 public Link a_48;
 
 
 /* a_49 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[56]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[19]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[20]")
 public Link a_49;
 
 
 /* a_50 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[57]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[20]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[21]")
 public Link a_50;
 
 
 /* a_51 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[58]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[21]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[22]")
 public Link a_51;
 
 
 /* a_52 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[59]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[22]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[23]")
 public Link a_52;
 
 
 /* a_53 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[60]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[23]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[24]")
 public Link a_53;
 
 
 /* a_54 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[61]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[24]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[25]")
 public Link a_54;
 
 
 /* a_55 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[62]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[25]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[26]")
 public Link a_55;
 
 
 /* a_56 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[63]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[26]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[27]")
 public Link a_56;
 
 
 /* a_57 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[64]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[27]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[28]")
 public Link a_57;
 
 
 /* a_58 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[65]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[28]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[29]")
 public Link a_58;
 
 
 /* a_59 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[66]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[29]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[30]")
 public Link a_59;
 
 
 /* a_60 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[67]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[30]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[31]")
 public Link a_60;
 
 
 /* a_61 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[68]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[31]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[32]")
 public Link a_61;
 
 
 /* a_62 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[69]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[32]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[33]")
 public Link a_62;
 
 
 /* a_63 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[70]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[33]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[34]")
 public Link a_63;
 
 
 /* a_64 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[71]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[34]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[35]")
 public Link a_64;
 
 
 /* a_65 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[72]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[35]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[36]")
 public Link a_65;
 
 
 /* a_66 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[73]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[36]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[37]")
 public Link a_66;
 
 
 /* a_67 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[74]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[37]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[38]")
 public Link a_67;
 
 
 /* a_68 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[75]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[38]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[39]")
 public Link a_68;
 
 
 /* a_69 - LINK */

 //@FindBy(how = How.LINK_TEXT , using=" ") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[76]") 
 //@FindBy(how = How.XPATH , using="//li[@id='color-picker-control']/div/div/div/ul/li[39]/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),' ')])[40]")
 public Link a_69;
 
 
 /* formatting - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Formatting") 
 //@FindBy(how = How.ID , using="rte-button-more") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-more']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[77]") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Formatting')])[2]")
 public Link formatting;
 
 
 /* strikethrough - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Strikethrough") 
 //@FindBy(how = How.ID , using="rte-strikethrough") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-strikethrough']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[78]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Strikethrough')]")
 public Link strikethrough;
 
 
 /* subscript - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Subscript") 
 //@FindBy(how = How.ID , using="rte-sub") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-sub']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[79]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Subscript')]")
 public Link subscript;
 
 
 /* superscript - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Superscript") 
 //@FindBy(how = How.ID , using="rte-sup") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-sup']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[80]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Superscript')]")
 public Link superscript;
 
 
 /* monospace - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Monospace") 
 //@FindBy(how = How.ID , using="rte-monospace") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-monospace']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[81]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Monospace')]")
 public Link monospace;
 
 
 /* clearFormatting - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Clear formatting") 
 //@FindBy(how = How.ID , using="rte-removeformat") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-removeformat']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[82]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Clear formatting')]")
 public Link clearFormatting;
 
 
 /* bulletList - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Bullet list") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[83]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-bullist']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Bullet list')]")
 public Link bulletList;
 
 
 /* numberedList - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Numbered list") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[84]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-numlist']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Numbered list')]")
 public Link numberedList;
 
 
 /* taskList - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Task list") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[85]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-tasklist']/a") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Task list')])[2]")
 public Link taskList;
 
 
 /* outdent - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Outdent") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[86]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-outdent']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Outdent')]")
 public Link outdent;
 
 
 /* indent - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Indent") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[87]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-indent']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Indent')]")
 public Link indent;
 
 
 /* alignLeft - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Align left") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[88]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-justifyleft']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Align left')]")
 public Link alignLeft;
 
 
 /* alignCenter - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Align center") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[89]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-justifycenter']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Align center')]")
 public Link alignCenter;
 
 
 /* alignRight - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Align right") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[90]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-justifyright']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Align right')]")
 public Link alignRight;
 
 
 /* pageLayout - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Page layout") 
 //@FindBy(how = How.ID , using="rte-button-pagelayout-2") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-pagelayout-2']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[91]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Page layout')]")
 public Link pageLayout;
 
 
 /* link - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Link") 
 //@FindBy(how = How.ID , using="rte-button-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[92]") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Link')])[2]")
 public Link link;
 
 
 /* table - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Table") 
 //@FindBy(how = How.ID , using="rte-button-insert-table") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-insert-table']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[93]") 
 @FindBy(how = How.XPATH , using = "(//a[contains(text(),'Table')])[2]")
 public Link table;
 
 
 /* insert - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Insert") 
 //@FindBy(how = How.ID , using="rte-button-insert") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-insert']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[94]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Insert')]")
 public Link insert;
 
 
 /* filesAndImages - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Files and images") 
 //@FindBy(how = How.ID , using="rte-insert-image") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-image']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[95]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Files and images')]")
 public Link filesAndImages;
 
 
 /* link_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Link") 
 //@FindBy(how = How.ID , using="rte-insert-link") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-link']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[96]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Link')]")
 public Link link_2;
 
 
 /* symbol - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Symbol") 
 //@FindBy(how = How.ID , using="rte-insert-symbol") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-symbol']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[97]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Symbol')]")
 public Link symbol;
 
 
 /* emoticon - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Emoticon") 
 //@FindBy(how = How.ID , using="rte-insert-emoticon") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-emoticon']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[98]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Emoticon')]")
 public Link emoticon;
 
 
 /* markup - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Markup") 
 //@FindBy(how = How.ID , using="rte-insert-wikimarkup") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-wikimarkup']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[99]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Markup')]")
 public Link markup;
 
 
 /* horizontalRule - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Horizontal rule") 
 //@FindBy(how = How.ID , using="rte-insert-hr") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-hr']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[100]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Horizontal rule')]")
 public Link horizontalRule;
 
 
 /* taskList_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Task list") 
 //@FindBy(how = How.ID , using="rte-insert-tasklist") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-tasklist']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[101]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Task list')]")
 public Link taskList_2;
 
 
 /* userMention - LINK */

 //@FindBy(how = How.LINK_TEXT , using="User mention") 
 //@FindBy(how = How.ID , using="insertmention-button") 
 //@FindBy(how = How.XPATH , using="//a[@id='insertmention-button']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[102]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'User mention')]")
 public Link userMention;
 
 
 /* jIRAIssueFilter - LINK */

 //@FindBy(how = How.LINK_TEXT , using="JIRA Issue/Filter") 
 //@FindBy(how = How.ID , using="jiralink") 
 //@FindBy(how = How.XPATH , using="//a[@id='jiralink']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[103]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'JIRA Issue/Filter')]")
 public Link jIRAIssueFilter;
 
 
 /* info - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Info") 
 //@FindBy(how = How.ID , using="info") 
 //@FindBy(how = How.XPATH , using="//a[@id='info']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[104]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Info')]")
 public Link info;
 
 
 /* addLucidchartDiagram - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Add Lucidchart Diagram") 
 //@FindBy(how = How.ID , using="lucidchart") 
 //@FindBy(how = How.XPATH , using="//a[@id='lucidchart']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[105]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Add Lucidchart Diagram')]")
 public Link addLucidchartDiagram;
 
 
 /* status - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Status") 
 //@FindBy(how = How.ID , using="status") 
 //@FindBy(how = How.XPATH , using="//a[@id='status']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[106]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Status')]")
 public Link status;
 
 
 /* gallery - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Gallery") 
 //@FindBy(how = How.ID , using="gallery") 
 //@FindBy(how = How.XPATH , using="//a[@id='gallery']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[107]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Gallery')]")
 public Link gallery;
 
 
 /* tableOfContents - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Table of Contents") 
 //@FindBy(how = How.ID , using="toc") 
 //@FindBy(how = How.XPATH , using="//a[@id='toc']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[108]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Table of Contents')]")
 public Link tableOfContents;
 
 
 /* teamCalendar - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Team Calendar") 
 //@FindBy(how = How.ID , using="calendar") 
 //@FindBy(how = How.XPATH , using="//a[@id='calendar']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[109]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Team Calendar')]")
 public Link teamCalendar;
 
 
 /* otherMacros - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Other macros") 
 //@FindBy(how = How.ID , using="rte-insert-macro") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-insert-macro']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[110]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Other macros')]")
 public Link otherMacros;
 
 
 /* pageLayout_2 - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Page layout") 
 //@FindBy(how = How.ID , using="rte-button-pagelayout") 
 //@FindBy(how = How.XPATH , using="//a[@id='rte-button-pagelayout']") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[111]") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Page layout')]")
 public Link pageLayout_2;
 
 
 /* noLayout - LINK */

 //@FindBy(how = How.LINK_TEXT , using="No layout") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[112]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'No layout')]")
 public Link noLayout;
 
 
 /* twoColumnsimple - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Two column (simple)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[113]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Two column (simple)')]")
 public Link twoColumnsimple;
 
 
 /* twoColumnsimpleLeftSidebar - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Two column (simple, left sidebar)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[114]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[2]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Two column (simple, left sidebar)')]")
 public Link twoColumnsimpleLeftSidebar;
 
 
 /* twoColumnsimpleRightSidebar - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Two column (simple, right sidebar)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[115]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[3]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Two column (simple, right sidebar)')]")
 public Link twoColumnsimpleRightSidebar;
 
 
 /* threeColumnsimple - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Three column (simple)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[116]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[4]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Three column (simple)')]")
 public Link threeColumnsimple;
 
 
 /* twoColumn - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Two column") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[117]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[5]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Two column')]")
 public Link twoColumn;
 
 
 /* twoColumnleftSidebar - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Two column (left sidebar)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[118]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[6]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Two column (left sidebar)')]")
 public Link twoColumnleftSidebar;
 
 
 /* twoColumnrightSidebar - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Two column (right sidebar)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[119]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[7]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Two column (right sidebar)')]")
 public Link twoColumnrightSidebar;
 
 
 /* threeColumn - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Three column") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[120]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[8]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Three column')]")
 public Link threeColumn;
 
 
 /* threeColumnleftAndRightSidebars - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Three column (left and right sidebars)") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[121]") 
 //@FindBy(how = How.XPATH , using="//ul[@id='pagelayout-menu-options']/li[9]/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Three column (left and right sidebars)')]")
 public Link threeColumnleftAndRightSidebars;
 
 
 /* undo - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Undo") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[122]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-undo']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Undo')]")
 public Link undo;
 
 
 /* redo - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Redo") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[123]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-redo']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Redo')]")
 public Link redo;
 
 
 /* findReplace - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Find/Replace") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[124]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-searchreplace']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Find/Replace')]")
 public Link findReplace;
 
 
 /* keyboardShortcutsHelp - LINK */

 //@FindBy(how = How.LINK_TEXT , using="Keyboard shortcuts help") 
 //@FindBy(how = How.XPATH , using="(//a[@href='#'])[125]") 
 //@FindBy(how = How.XPATH , using="//li[@id='rte-button-help']/a") 
 @FindBy(how = How.XPATH , using = "//a[contains(text(),'Keyboard shortcuts help')]")
 public Link keyboardShortcutsHelp;
 
 
 /* notifications - LINK */

 @IFrames({
  @IFrame(name="notifications-miniview-iframe" , frameType=FrameType.IFRAME  , attributes={"id=notifications-miniview-iframe", "src=/confluence/plugins/servlet/notifications-miniview", "frameborder=0", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='mw-container']/div/div/ul/li/a") 
 @FindBy(how = How.XPATH , using = "//a[@title='Notifications']")
 public Link notifications;
 
 
 /* personalTasks - LINK */

 @IFrames({
  @IFrame(name="notifications-miniview-iframe" , frameType=FrameType.IFRAME  , attributes={"id=notifications-miniview-iframe", "src=/confluence/plugins/servlet/notifications-miniview", "frameborder=0", }),
 })
 //@FindBy(how = How.XPATH , using="//div[@id='mw-container']/div/div/ul/li[1]/a") 
 @FindBy(how = How.XPATH , using = "//a[@title='Personal Tasks']")
 public Link personalTasks;
 
 
/****** SUBMIT Elements ******/
 /* quicksearchsubmit - SUBMIT */

 //@FindBy(how = How.XPATH , using="//input[@id='quick-search-submit']") 
 //@FindBy(how = How.XPATH , using="//input[@value='Search']") 
 @FindBy(how = How.ID , using = "quick-search-submit")
 public Button quicksearchsubmit;
 
 
 /* search - SUBMIT */

 //@FindBy(how = How.XPATH , using="//div[@id='pagetreesearch']/form/input[3]") 
 @FindBy(how = How.XPATH , using = "(//input[@value='Search'])[2]")
 public Button search;
 
 
/****** TEXT Elements ******/
 /* queryString - TEXT */

 //@FindBy(how = How.NAME , using="queryString") 
 //@FindBy(how = How.XPATH , using="//input[@id='quick-search-query']") 
 //@FindBy(how = How.XPATH , using="//input[@name='queryString']") 
 //@FindBy(how = How.XPATH , using="//input[@title='Quick Search (/or g , g)']") 
 @FindBy(how = How.ID , using = "quick-search-query")
 public Text queryString;
 
 
 /* queryString_2 - TEXT */

 //@FindBy(how = How.XPATH , using="//div[@id='pagetreesearch']/form/input[2]") 
 @FindBy(how = How.XPATH , using = "(//input[@name='queryString'])[2]")
 public Text queryString_2;
 
 
 /* title - TEXT */

 //@FindBy(how = How.NAME , using="title") 
 //@FindBy(how = How.XPATH , using="//input[@id='content-title']") 
 //@FindBy(how = How.XPATH , using="//input[@name='title']") 
 //@FindBy(how = How.XPATH , using="//input[@value='Krypton Test Automation Home']") 
 @FindBy(how = How.ID , using = "content-title")
 public Text title;
 
 
/****** TEXTAREA Elements ******/
 /* wysiwygContent - TEXTAREA */

 //@FindBy(how = How.NAME , using="wysiwygContent") 
 //@FindBy(how = How.XPATH , using="//textarea[@id='wysiwygTextarea']") 
 //@FindBy(how = How.XPATH , using="//textarea[@name='wysiwygContent']") 
 @FindBy(how = How.ID , using = "wysiwygTextarea")
 public TextArea wysiwygContent;
 
 
 /* editorhtmlsource - TEXTAREA */

 //@FindBy(how = How.XPATH , using="//textarea[@id='editor-html-source']") 
 @FindBy(how = How.ID , using = "editor-html-source")
 public TextArea editorhtmlsource;
 
 
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