package pl.wojtun.interfaces;

import cucumber.api.java.en.Given;

/**
 * Created by wojtut01 on 29/08/16.
 */
public interface IMyStepdefs {

  @Given("^I fail")
  void Ifail() throws Throwable;

  @Given("^I pass$")
  void Ipass() throws Throwable;
}
