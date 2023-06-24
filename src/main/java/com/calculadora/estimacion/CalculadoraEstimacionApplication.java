package com.calculadora.estimacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CalculadoraEstimacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraEstimacionApplication.class, args);
	}
	
	@Configuration
    public static class MvcConfig implements WebMvcConfigurer {
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName("forward:/Formulario.html");
        }
	}
}
