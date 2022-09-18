package tests.demoqa.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
  public static String getRandomString(int length) {
    String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
    StringBuilder result = new StringBuilder();
    Random rnd = new Random();
    while (result.length() < length) {
      int index = (int) (rnd.nextFloat() * SALTCHARS.length());
      result.append(SALTCHARS.charAt(index));
    }

    return result.toString();
  }

  public static String getRandomString1(int length) {
    return RandomStringUtils.randomAlphabetic(length);
  }

  public static Long getRandomLong(Long min, Long max) {
    return ThreadLocalRandom.current().nextLong(min, max);
  }

  public static String getRandomPhone() {
    return "838" + getRandomLong(1111111L, 9999999L).toString();
  }
}