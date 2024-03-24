import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.swing.text.TextAction;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.textCheck;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.checkerframework.checker.units.qual.Prefix.exa;
import static org.junit.Assert.assertEquals;

import java.net.URL;

import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.openqa.selenium.bidi.script.LocalValue.setValue;

//Uncomment each test before run please

public class QaAutoTest {

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
public void linkCheck (){
    //Accepting cookies
    open("https://www.ringcentral.com/");
    $(byText("Accept All Cookies")).click();
    //Clicking on a link
    $(byXpath("//*[@id=\"IID-cta-v2-36e87a6-el\"]")).click();
    String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
    String expectedUrl = "https://www.ringcentral.com/#contact-sales-modal";
    //Checking link address
    assertEquals(expectedUrl, currentUrl);
}
*/


/*
    @Test
    public void textCheck (){
        //Accepting cookies
        open("https://www.ringcentral.com/");
        $(byText("Accept All Cookies")).click();
        //Checking button text
        $(byXpath("//*[@id=\"IID-cta-v2-ec0946d6-el\"]")).shouldHave(exactText("Get the report"));
    }
*/


/*
    @Test
    public void formInputCheck() {
        open("https://www.ringcentral.com/Gartner");
        //Accepting cookies
        $(byText("Accept All Cookies")).click();
        //
        $("#IID-text-field-c53b942c").setValue("Test Name");
        $("#IID-text-field-c53b942c").shouldHave(value("Test Name"));
        $("#IID-text-field-c4f0eb2").setValue("test@mail.com");
        $("#IID-text-field-c4f0eb2").shouldHave(value("test@mail.com"));

        }
*/

    }



