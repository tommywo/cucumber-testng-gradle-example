package pl.wojtun;

/**
 * Created by wojtut01 on 15/11/15.
 */

import cucumber.api.java.en.Given;

import java.lang.Exception;

public class MyStepdefs {

  @Given("^I fail")
  public void Ifail() throws Throwable {
    throw new Exception("fail");
    // Express the Regexp above with the code you wish you had
  }


  @Given("^I pass$")
  public void Ipass() throws Throwable {
  }
}

