package pl.wojtun;

import com.google.inject.Inject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.java.guice.ScenarioScoped;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by wojtut01 on 29/08/16.
 */

public class Hooks
{
  @Before
  public void before(Scenario scenario){
      WebDriver driver = new ChromeDriver();
      DriverManager.set(driver);
  }

  @After
  public void after(Scenario scenario){
    DriverManager.get().quit();
  }
}
