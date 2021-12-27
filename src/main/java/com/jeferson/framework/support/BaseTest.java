package com.jeferson.framework.support;

import com.jeferson.framework.webdrives.DriverFactory;
import com.jeferson.framework.webdrives.DriverManager;
import com.jeferson.framework.webdrives.Drivers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        WebDriver driver = DriverFactory.getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
        driver.get(Property.get("google"));
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        DriverManager.quit();
    }

}
