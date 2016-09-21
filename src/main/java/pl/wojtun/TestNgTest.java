package pl.wojtun;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wojtut01 on 29/08/16.
 */
public class TestNgTest {


  @BeforeMethod
  public void before(){
    System.out.println();
  }

  @Test
  public void test(){
    Assert.assertTrue(false);
    // Create object of TestNG Class
  }
}
