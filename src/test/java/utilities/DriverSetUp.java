package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
    WebDriver browser;


// open a browser

    @BeforeSuite
    public void openBrowser(){
        browser = new ChromeDriver();
    }

//Close browser

    @AfterSuite
    public void CloseBrwser(){
        browser.close();
    }



    public WebDriver getBrowser(String browser_name){
        if(browser_name.equalsIgnoreCase("Chrome"))
            return new ChromeDriver();

        else if(browser_name.equalsIgnoreCase("Firefox"))
            return new FirefoxDriver();
        else if(browser_name.equalsIgnoreCase("Edge"))
            return new EdgeDriver();
        else {
            throw new RuntimeException("Browser  is not available"+browser_name);
        }

    }

}


