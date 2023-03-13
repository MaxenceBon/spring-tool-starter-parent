package de.rieckpil.blog;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests(authorize -> authorize
				.mvcMatchers("/dashboard").permitAll()
				.mvcMatchers(HttpMethod.GET, "/api/tasks/**").permitAll()
				.mvcMatchers("/api/users/**").permitAll()
				.mvcMatchers("/**").authenticated()
			)
			.httpBasic();
	}

}
