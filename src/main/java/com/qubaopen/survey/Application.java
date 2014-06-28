package com.qubaopen.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;

@ComponentScan
@EnableAutoConfiguration
public final class Application {
	
//	@Bean
//	public AuditorAware<User> auditorAware() {
//		return new AuditorAware<User>() {
//			@Override
//			public User getCurrentAuditor() {
//				return null;
//			}
//		};
//	}
	
	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new Hibernate4Module())
			.registerModule(new JodaModule())
			.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		
		return mapper;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
