package tests.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
  @BeforeAll
  static void configure() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    DesiredCapabilities capabilities = new DesiredCapabilities();

    if (System.getProperty("remote_url") != null) {
      Configuration.remote = System.getProperty("remote_url");
      capabilities.setCapability("enableVNC", true);
      capabilities.setCapability("enableVideo", true);
    }

    Configuration.browser = System.getProperty("browser_name", "chrome");
    Configuration.browserVersion = System.getProperty("browser_version", "100.0");
    Configuration.browserSize = System.getProperty("browser_size", "1920x1080");

    Configuration.browserCapabilities = capabilities;
    Configuration.baseUrl = "https://demoqa.com";

//    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
  }

  @AfterEach
  void addAttachments() {
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
  }
}
