package test.jfrogUse.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"test.jfrog.jfrogTest", "test.jfrogUse.demo"})
public class DemoApplication {

  @Autowired
  private Test test;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  public ApplicationRunner initializeTest() {
    return args -> {
      // Call the testJfrog method from the Test bean
      test.testJfrog();
    };
  }
}
