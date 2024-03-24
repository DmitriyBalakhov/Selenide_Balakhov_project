import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.textCheck;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.assertEquals;

import java.net.URL;

import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;


public class QaAutoTest {

/*
    @Test
    public void pageTitleCheck (){
        //Accepting cookies
        open("https://www.ringcentral.com/");
        $(byText("Accept All Cookies")).click();
        String currentTitle = WebDriverRunner.getWebDriver().getTitle();
        String expectedTitle = "Message. Video. Phone. Contact Center. AI Solutions | RingCentral";
        assertEquals(expectedTitle, currentTitle);
        System.out.println(title());
    }
 */

/*
    @Test
    public void logoCheck (){
        //Accepting cookies
        open("https://www.ringcentral.com/");
        $(byText("Accept All Cookies")).click();
        //Checking logo presence
        $("#svg-1330251413-263886854").shouldBe(Condition.visible);
    }
*/

/*
    @Test
    public void checkGlobalHeaderElements() throws InterruptedException {
        open("https://www.ringcentral.com/");
        //Accepting cookies
        $(byText("Accept All Cookies")).click();
        //Checking element visibility
        $("#general-5a2d82ed75 > div.l-site.dynamic-numbers--invoca > header > nav > div.global-header.IID-global-header-690b8428.CID-global-header-58344ef6 > div > div > div > div.l-container.global-header__container > div.global-header__content > nav > div.primary-nav.primary-nav--small.primary-nav--rc2_0-rebranding.CID-primary-nav-40e8e197.IID-primary-nav-f22165d2 > div > div:nth-child(1)").shouldBe(Condition.visible);
        //Hover on element
        $("#general-5a2d82ed75 > div.l-site.dynamic-numbers--invoca > header > nav > div.global-header.IID-global-header-690b8428.CID-global-header-58344ef6 > div > div > div > div.l-container.global-header__container > div.global-header__content > nav > div.primary-nav.primary-nav--small.primary-nav--rc2_0-rebranding.CID-primary-nav-40e8e197.IID-primary-nav-f22165d2 > div > div:nth-child(1)").hover();
        //Clicking on element
        $("#general-5a2d82ed75 > div.l-site.dynamic-numbers--invoca > header > nav > div.global-header.IID-global-header-690b8428.CID-global-header-58344ef6 > div > div > div > div.l-container.global-header__container > div.global-header__content > nav > div.primary-nav.primary-nav--small.primary-nav--rc2_0-rebranding.CID-primary-nav-40e8e197.IID-primary-nav-f22165d2 > div > div:nth-child(1) > div.primary-nav__dropdown > div.primary-nav__dropdown-content > div.l-container > div > div > div.grid.IID-grid-a449ca2.CID-grid-1659f761 > div > div > div > div > div > div > div.grid.IID-grid-7ab8e176.CID-grid-1659f761 > div > div.grid-item.l-flex__col--2.l-tab-flex__col--12.l-mob-flex__col--12.l-flex__col--flex-grow-1.IID-grid-item-f844422.CID-grid-item-1e7a19ff > div > div.link-card.IID-link-card-8786babf.CID-link-card-7153c5c8 > div > a").click();
        //Checking current URL after click
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        String expectedUrl = "https://www.ringcentral.com/office/how-it-works.html";
        assertEquals(expectedUrl, currentUrl);
        //System.out.println("Current URL: " + currentUrl);


        //assertThat(currentUrl).isEqualToIgnoringCase(expectedUrl);

        //$("")
        }
*/
    /*
@Test
public void linkCheck (){
    //Accepting cookies
    open("https://www.ringcentral.com/");
    $(byText("Accept All Cookies")).click();
    //Clicking on a link
    $(byXpath("//*[@id=\"IID-cta-v2-36e87a6-el\"]")).click();
    //System.out.println(url());
    String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
    String expectedUrl = "https://www.ringcentral.com/#contact-sales-modal";
    //Checking link address
    assertEquals(expectedUrl, currentUrl);
}
*/

    @Test
    public void textCheck (){
        //Accepting cookies
        open("https://www.ringcentral.com/");
        $(byText("Accept All Cookies")).click();
        //
        $(byXpath("//*[@id=\"IID-cta-v2-36e87a6-el\"]")).shouldHave(textCheck("Try free"));

    }

    }


//switchTo().window(1);
