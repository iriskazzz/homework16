package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

  @Test
  void simplePropertyTest() {
    String browserName = System.getProperty("browser");
    System.out.println(browserName); // null
  }

  @Test
  void simplePropertyTest1() {
    System.setProperty("browser", "opera");
    String browserName = System.getProperty("browser");
    System.out.println(browserName); // opera
  }

  @Test
  void simplePropertyTes2() {
    String browserName = System.getProperty("browser", "firefox");
    System.out.println(browserName); // firefox
  }

  @Test
  void simplePropertyTes3() {
    System.setProperty("browser", "opera");
    String browserName = System.getProperty("browser", "firefox");
    System.out.println(browserName); // opera
  }

  @Test
  @Tag("properties")
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


}
