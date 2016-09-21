package pl.wojtun.interfaces;

import cucumber.api.java.en.Given;

/**
 * Created by wojtut01 on 29/08/16.
 */
public interface ISomeoneElsesStepdefs {

  @Given("^I pass also$")
  void Ipass() throws Throwable;
}
