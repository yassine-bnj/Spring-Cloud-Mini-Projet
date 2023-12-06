package com.yassine.irrigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;


/*@Configuration
public class CorsConfig implements WebFluxConfigurer  {

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowCredentials(true)
	                .allowedOrigins("*")
	                .allowedHeaders("*")
	                .allowedMethods("*")
	                .exposedHeaders(HttpHeaders.SET_COOKIE);
	    }

	    @Bean
	    public CorsWebFilter corsWebFilter() {
	        CorsConfiguration corsConfiguration = new CorsConfiguration();
	        corsConfiguration.setAllowCredentials(true);
	        corsConfiguration.addAllowedHeader("*");
	        corsConfiguration.addAllowedMethod("*");
	        corsConfiguration.addAllowedOrigin("*");
	        corsConfiguration.addExposedHeader(HttpHeaders.SET_COOKIE);
	        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
	        corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
	        return new CorsWebFilter(corsConfigurationSource);
	    }*/
//@Configuration
//public class WebConfig extends   extends CorsConfiguration
//{
//    @Bean
//    public CorsWebFilter corsFilter()
//    {
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials( true );
//        config.setAllowedOrigins( List.of( "*" ) );
//        config.setAllowedMethods( List.of( "GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD" ) );
//        config.setAllowedHeaders( List.of( "origin", "content-type", "accept", "authorization", "cookie" ) );
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration( "/**", config );
//
//        return new CorsWebFilter( source );
//    }
	
/*
	  @Bean
	    public FilterRegistrationBean<CorsFilter> corsFilterRegistrationBean() {
	        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>(corsFilter());
	        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	        return registrationBean;
	    }
	
	
	
	
	
*/	
	/*@Bean
	  public CorsWebFilter corsFilter() {
	    org.springframework.web.cors.CorsConfiguration corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
	    corsConfiguration.setAllowCredentials(true);
	    corsConfiguration.addAllowedOrigin("*");
	    corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD"));
	    corsConfiguration.addAllowedHeader("origin");
	    corsConfiguration.addAllowedHeader("content-type");
	    corsConfiguration.addAllowedHeader("accept");
	    corsConfiguration.addAllowedHeader("authorization");
	    corsConfiguration.addAllowedHeader("cookie");
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", corsConfiguration);
	    return new CorsWebFilter(source);
	  }
	
	
	
/*final éUrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
final CorsConfiguration corsConfiguration = new CorsConfiguration();
corsConfiguration.setAllowCredentials(true);
corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin"));
corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
source.registerCorsConfiguration("/**", corsConfiguration);
return new CorsFilter(source);*/
//}

//}