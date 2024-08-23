package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({DemoConstructorBindingConfigurationProperties.class,
    DemoSetterBindingConfigurationProperties.class})
public class DemoApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(DemoApplication.class)
        .run(args);
  }
}
