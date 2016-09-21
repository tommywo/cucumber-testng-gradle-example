package pl.wojtun;

/**
 * Created by wojtut01 on 15/11/15.
 */

import com.google.inject.Inject;
import com.google.inject.Provider;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.wojtun.interfaces.ISomeoneElsesStepdefs;

import java.lang.Exception;

@ScenarioScoped
public class MyStepdefs implements pl.wojtun.interfaces.IMyStepdefs {

  private ISomeoneElsesStepdefs someoneElsesStepdefs;

  @Inject
  public MyStepdefs(ISomeoneElsesStepdefs someoneElsesStepdefs) {
    this.someoneElsesStepdefs = someoneElsesStepdefs;
  }

  @Override
  @Given("^I fail")
  public void Ifail() throws Throwable {
    throw new Exception("fail");
    // Express the Regexp above with the code you wish you had
  }


  @Override
  @Given("^I pass$")
  public void Ipass() throws Throwable {
  }

  @Given("^I open (.*)$")
  public void iOpen(String site) throws Throwable {
    DriverManager.get().get(site);
  }
}

