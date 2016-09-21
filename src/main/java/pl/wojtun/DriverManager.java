package pl.wojtun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by wojtut01 on 29/08/16.
 */
public class DriverManager {

  private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

  public static WebDriver get(){
    return webDriverThreadLocal.get();
  }

  public static void set(WebDriver driver) {
    webDriverThreadLocal.set(driver);
  }

}
