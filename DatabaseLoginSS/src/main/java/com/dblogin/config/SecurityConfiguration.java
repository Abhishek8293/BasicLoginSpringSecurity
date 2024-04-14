package com.dblogin.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.dblogin.dao.UserDaoImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Bean
	public UserDaoImpl userDaoImpl() {
		return new UserDaoImpl();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean 
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                		.requestMatchers("/permit","/register").permitAll()
                        .anyRequest()
                        .authenticated())
                .formLogin(Customizer.withDefaults())
                .logout(logout->logout.logoutUrl("/random")
                		.logoutSuccessUrl("http://localhost:4200/home")
                		.permitAll());
		return http.build();
	}
	
	

		@Bean
		public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
			return configuration.getAuthenticationManager();		
	}
	
		
	

}
