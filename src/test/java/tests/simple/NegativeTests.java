package tests.simple;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegativeTests {
  @Test
  @Feature("Простые тесты")
  @Story("Негативные тесты")
  @DisplayName("Негативный простой тест №1")
  void test1() {
    assertTrue(false);
  }

  @Test
  @Feature("Простые тесты")
  @Story("Негативные тесты")
  @DisplayName("Негативный простой тест №2")
  void test2() {
    assertTrue(false);
  }

  @Test
  @Feature("Простые тесты")
  @Story("Негативные тесты")
  @DisplayName("Негативный простой тест №3")
  void test3() {
    assertTrue(false);
  }

  @Test
  @Feature("Простые тесты")
  @Story("Негативные тесты")
  @DisplayName("Негативный простой тест №4")
  void test4() {
    assertTrue(false);
  }

  @Test
  @Feature("Простые тесты")
  @Story("Негативные тесты")
  @DisplayName("Негативный простой тест №5")
  void test5() {
    assertTrue(false);
  }

  @Test
  @Feature("Простые тесты")
  @Story("Негативные тесты")
  @DisplayName("Негативный простой тест №6")
  void test6() {
    assertTrue(false);
  }
}
