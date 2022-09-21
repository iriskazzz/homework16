package tests.simple;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {
  @Test
  @Disabled
  @Feature("Простые тесты")
  @Story("Выключенные тесты")
  @DisplayName("Выключенный простой тест №1")
  void test1() {
    assertTrue(false);
  }

  @Test
  @Feature("Простые тесты")
  @Story("Выключенные тесты")
  @Disabled("Any text here")
  @DisplayName("Выключенный простой тест №1")
  void test2() {
    assertTrue(false);
  }
}
