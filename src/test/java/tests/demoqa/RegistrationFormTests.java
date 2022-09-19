package tests.demoqa;

import org.junit.jupiter.api.Test;
import tests.demoqa.data.TestData;
import tests.demoqa.pages.RegistrationFormPage;

import static io.qameta.allure.Allure.step;
import static tests.demoqa.data.TestData.*;

public class RegistrationFormTests extends TestBase {
  RegistrationFormPage registrationFormPage = new RegistrationFormPage();
  TestData testData = new TestData();


  @Test
  void fillPracticeForm() {
    step("Open registrations form", () -> {
      registrationFormPage.openPage();
    });

    step("Fill form", () -> {
      registrationFormPage
              .setFirstName(firstName)
              .setLastName(lastName)
              .setEmail(email)
              .setGenter(gender)
              .setNumber(number)
              .setBirthDate(day, month, year)
              .setSubjects(subject)
              .setHobbies(hobby)
              .setPicture(picture)
              .setCurrentAddress(currentAddress)
              .setState(state)
              .setCity(city)
              .clickSubmit();
    });

    step("Check form results", () -> {
      registrationFormPage.checkResultTable()
              .checkResult("Student Name", fullName)
              .checkResult("Student Email", "email324")
              .checkResult("Gender", gender)
              .checkResult("Mobile", number)
              .checkResult("Date of Birth", expectedDateOfBirth)
              .checkResult("Subjects", subject)
              .checkResult("Hobbies", hobby)
              .checkResult("Picture", picture)
              .checkResult("Address", currentAddress)
              .checkResult("State and City", stateAndCity);
    });

  }

}
