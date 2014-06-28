package com.qubaopen.survey.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.qubaopen.survey.repository.MyRepositoryFactoryBean;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(
	basePackages = "com.qubaopen.survey.**.repository",
	repositoryFactoryBeanClass = MyRepositoryFactoryBean.class
)
public class RepoConfiguration {

}
