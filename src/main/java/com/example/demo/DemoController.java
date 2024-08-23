package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demo")
public class DemoController {

  private final DemoConstructorBindingConfigurationProperties demoConstructorBindingConfigurationProperties;
  private final DemoSetterBindingConfigurationProperties demoSetterBindingConfigurationProperties;

  public DemoController(
      DemoConstructorBindingConfigurationProperties demoConstructorBindingConfigurationProperties,
      DemoSetterBindingConfigurationProperties demoSetterBindingConfigurationProperties) {
    this.demoConstructorBindingConfigurationProperties = demoConstructorBindingConfigurationProperties;
    this.demoSetterBindingConfigurationProperties = demoSetterBindingConfigurationProperties;
  }

  @GetMapping("/constructor-binding")
  public String getValueConstructorBinding() {
    String value = demoConstructorBindingConfigurationProperties.value();
    return value;
  }

  @GetMapping("/setter-binding")
  public String getValueSetterBinding() {
    String value = demoSetterBindingConfigurationProperties.getValue();
    return value;
  }
}
