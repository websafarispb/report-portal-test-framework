package com.report_portal.report_portal_test_framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstStepTest {

    ChromeDriver  driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromiumdriver().setup();

    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        driver.get("https://reportportal.epam.com/");
        String title = driver.getTitle();
    }
}
