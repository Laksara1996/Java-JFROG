package test.jfrogUse.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.jfrog.jfrogTest.Plugin;

@Component
public class Test {

  @Autowired
  private Plugin plugin;

  public void testJfrog() {
    System.out.println("\nInitialized\n");
    plugin.execute();
    Integer summation = plugin.sum(3, 5);
    System.out.println("\nSum = \n" + summation);
  }
}