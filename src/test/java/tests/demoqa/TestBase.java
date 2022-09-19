package tests.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
  @BeforeAll
  static void configure() {
    Configuration.baseUrl = "https://demoqa.com";
    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
  }
}
