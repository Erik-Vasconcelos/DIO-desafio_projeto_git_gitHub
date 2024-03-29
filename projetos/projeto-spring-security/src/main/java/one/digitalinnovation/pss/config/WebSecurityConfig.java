package one.digitalinnovation.pss.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import one.digitalinnovation.pss.service.SecurityDatabaseService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity // diz que está habilitado a configuração manual de autenticacao
@EnableGlobalMethodSecurity(prePostEnabled = true) // garante o uso global de alguns recursos da aplicação
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private SecurityDatabaseService securityService;

	@Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/login").permitAll().antMatchers("/managers")
				.hasAnyRole("MANAGERS").antMatchers("/manager/users").hasAnyRole("MANAGERS").antMatchers("/users")
				.hasAnyRole("USERS", "MANAGERS").anyRequest().authenticated().and().httpBasic();
	}

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.inMemoryAuthentication() .withUser("user")
	 * .password("{noop}user123") .roles("USERS") .and() .withUser("admin")
	 * .password("{noop}master123") .roles("MANAGERS"); }
	 */
}