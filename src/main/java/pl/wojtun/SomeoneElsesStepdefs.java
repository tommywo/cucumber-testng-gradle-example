package pl.wojtun;

import com.google.inject.Inject;
import com.google.inject.Provider;

import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;

import pl.wojtun.interfaces.IMyStepdefs;

/**
 * Created by wojtut01 on 29/08/16.
 */

@ScenarioScoped
public class SomeoneElsesStepdefs implements pl.wojtun.interfaces.ISomeoneElsesStepdefs {

  private IMyStepdefs stepdefs;

  @Inject
  public SomeoneElsesStepdefs(IMyStepdefs stepdefs) {
    this.stepdefs = stepdefs;

  }

  @Override
  @Given("^I pass also$")
  public void Ipass() throws Throwable {
    stepdefs.Ipass();
  }

}
