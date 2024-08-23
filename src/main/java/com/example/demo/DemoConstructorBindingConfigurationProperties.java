package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "demo")
public class DemoConstructorBindingConfigurationProperties {

  private final String value;

  public DemoConstructorBindingConfigurationProperties(String value) {
    this.value = value;
  }

  public String value() {
    return value;
  }
}
