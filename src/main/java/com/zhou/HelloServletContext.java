package com.zhou;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.zhou"})
@EnableWebMvc
public class HelloServletContext extends WebMvcConfigurerAdapter {

   @Override
   public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
      converters.add(new GsonHttpMessageConverter());
   }

}
