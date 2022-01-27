package com.app.dev.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter {

	@SuppressWarnings("unused")
	private final String[] PUBLIC = { "/api/actualitesall", };

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()// disable cookies
				.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				.antMatchers( "/api/**all" ).permitAll()
				.antMatchers( "/api/imageupload" ).permitAll()
				.anyRequest().authenticated()
				.and().formLogin().loginPage("/api/auth").permitAll()
				.and()
				.httpBasic();

	}

}