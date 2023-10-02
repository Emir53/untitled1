import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
public class testCases {


    Playwright playwright=Playwright.create();
    Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

    Page page=browser.newPage();



    @Test
    public void case001(){
        // automation exercise sitesine git
        page.navigate("https://automationexercise.com/");
        // home page açıldı mı kontrol et
        page.locator("img[alt='Website for automation practice']").isVisible();
        // login butonuna tıkla
        page.click("//a[contains(.,'Signup / Login')]");
        //login sayfası açıldı mı kontrol et
        page.locator("//h2[text()='Login to your account']").isVisible();
        // email ve şifre girip login butonuna tıkla
        page.type("input[data-qa='login-email']","emir@mail.com");
        page.type("input[type='password']","emir");
        page.click("button[data-qa='login-button']");
        // ***
        // kullanıcı adı ile giriş yaptın yazısını kontrol et
        page.locator("//a[contains(.,'Logged in as emir')]").isEnabled();
        page.locator("//a[contains(.,'Logged in as emir')]").isVisible();

    }

    @Test
    public void case002(){
        // automation exercise sitesine git
        page.navigate("https://automationexercise.com/");
        // home page açıldı mı kontrol et
        page.locator("img[alt='Website for automation practice']").isVisible();
        // login butonuna tıkla
        page.click("//a[contains(.,'Signup / Login')]");
        //login sayfası açıldı mı kontrol et
        page.locator("//h2[text()='Login to your account']").isVisible();
        // email ve şifre girip login butonuna tıkla
        page.type("input[data-qa='login-email']","emir@mail.com");
        page.type("input[type='password']","emir");
        page.click("button[data-qa='login-button']");
        // ***
        // kullanıcı adı ile giriş yaptın yazısını kontrol et
        page.locator("//a[contains(.,'Logged in as emir')]").isEnabled();
        page.locator("//a[contains(.,'Logged in as emir')]").isVisible();

    }


}
