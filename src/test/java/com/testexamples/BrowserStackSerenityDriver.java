package com.testexamples;

/**
 * Created by haroonnaderi on 2/5/18.
 */

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserStackSerenityDriver implements DriverSource{


    public WebDriver newDriver() {

        String username = System.getenv("USERNAME");
        String accessKey = System.getenv("AUTOMATEKEY");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("build", "Gradle Serenity Demo");
        capabilities.setCapability("project", "Desktop Browser Test");
        capabilities.setCapability("browser", "IE");
        capabilities.setCapability("browser_version", "7.0");
        capabilities.setCapability("os", "Windows");
        capabilities.setCapability("os_version", "XP");
        capabilities.setCapability("browserstack.debug", "true");


        try {
            return new RemoteWebDriver(new URL("http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public boolean takesScreenshots() {
        return false;
    }
}
