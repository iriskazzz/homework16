package tests.properties;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

  @Test
  @Feature("Системные настройки")
  @Story("Проверки значений настроек")
  @DisplayName("Проверка на значение браузера")
  void simplePropertyTest() {
    String browserName = System.getProperty("browser");
    System.out.println(browserName); // null
  }

  @Test
  @Feature("Системные настройки")
  @Story("Проверки значений настроек")
  @DisplayName("Проверка на значение браузера после его присваения")
  void simplePropertyTest1() {
    System.setProperty("browser", "opera");
    String browserName = System.getProperty("browser");
    System.out.println(browserName); // opera
  }

  @Test
  @Feature("Системные настройки")
  @Story("Проверки значений настроек")
  @DisplayName("Проверка на дефолтное значение браузера")
  void simplePropertyTes2() {
    String browserName = System.getProperty("browser", "firefox");
    System.out.println(browserName); // firefox
  }

  @Test
  @Feature("Системные настройки")
  @Story("Проверки значений настроек")
  @DisplayName("Проверка на значение браузера при дефолтном значении и заданном")
  void simplePropertyTes3() {
    System.setProperty("browser", "opera");
    String browserName = System.getProperty("browser", "firefox");
    System.out.println(browserName); // opera
  }

  @Test
  @Feature("Системные настройки")
  @Story("Проверки значений настроек")
  @Disabled
  @Tag("properties")
  @DisplayName("Проверка на атбируты браузера")
  void simplePropertyTes4() {
    String browserName = System.getProperty("browser_name", "firefox");
    String browserVersion = System.getProperty("browser_version", "101");
    String browserSize = System.getProperty("browser_size", "1920x1080");

    System.out.println(browserName);
    System.out.println(browserVersion);
    System.out.println(browserSize);

        /*
        From IDEA
                firefox
                101
                1920x1080
        gradle clean properties_test
                firefox
                101
                1920x1080
        gradle clean properties_test -Dbrowser_name=safari
                safari
                101
                1920x1080
        gradle clean properties_test -Dbrowser_name=safari -Dbrowser_version=99.0 -Dbrowser_size=300x300
                safari
                99.0
                300x300
         */
  }

  @Test
  @Disabled
  @Tag("hello")
  void simplePropertyTes5() {
    System.out.println("Hello, " + System.getProperty("some_text", "qa.guru"));

        /*
        gradle clean hello_test
            Hello, qa.guru
        gradle clean hello_test -Dsome_text=students
            Hello, students
        gradle clean hello_test -Dsome_text=students of qa.guru
                FAILURE: Build failed with an exception.
                * What went wrong:
                Task 'of' not found in root project 'qa_guru_14_11_jenkins'.
        gradle clean hello_test -Dsome_text="students of qa.guru"
            Hello, students of qa.guru
        gradle clean hello_test "-Dsome_text=students of qa.guru"
            Hello, students of qa.guru
         */
  }
}
