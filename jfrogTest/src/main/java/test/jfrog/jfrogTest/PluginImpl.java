package test.jfrog.jfrogTest;

import org.springframework.stereotype.Component;

@Component
public class PluginImpl implements Plugin {
  @Override
  public String execute() {
    System.out.println("Executing PluginImpl1");
    return "Plugin Got Executed";
  }

  @Override
  public Integer sum(Integer first, Integer second) {
    System.out.println("first: " + first + " second: " + second);
    return first + second;
  }
}
