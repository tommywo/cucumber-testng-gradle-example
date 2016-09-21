package pl.wojtun;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

import pl.wojtun.interfaces.IMyStepdefs;
import pl.wojtun.interfaces.ISomeoneElsesStepdefs;

/**
 * Created by wojtut01 on 29/08/16.
 */
public class MyInjectorSource implements InjectorSource {

  @Override
  public Injector getInjector() {
    return Guice.createInjector(Stage.PRODUCTION, CucumberModules.SCENARIO, binder -> {
      binder.bind(IMyStepdefs.class).to(MyStepdefs.class);
      binder.bind(ISomeoneElsesStepdefs.class).to(SomeoneElsesStepdefs.class);
    });
  }

}
