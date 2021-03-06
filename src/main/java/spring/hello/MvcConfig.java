package spring.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by martin on 21/01/17.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/home").setViewName("home");
       registry.addViewController("/").setViewName("home");
       registry.addViewController("/hello").setViewName("hello");
       registry.addViewController("/login").setViewName("login");
       registry.addViewController("/greeting").setViewName("greeting");
       registry.addViewController("/result").setViewName("result");
   }
}
