package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class CreateAccount extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testCreateAccount() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("CREATE ACCOUNT")).click();
    driver.findElement(By.id("user_last_name")).clear();
    driver.findElement(By.id("user_last_name")).sendKeys("");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("");
  }
}
