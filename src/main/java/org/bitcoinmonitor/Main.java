package org.bitcoinmonitor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("integration.xml")
public class Main {

		    public static void main(String[] args) {
		    	System.out.println("Hello world");
		        new AnnotationConfigApplicationContext(Main.class);
		    }

//		    @Bean
//		    public String newline() {
//		        return System.getProperty("line.separator");
//		    }
//
//		    @Bean
//		    public Twitter twitterTemplate(OAuth2Operations oauth2) {
//		        return new TwitterTemplate(oauth2.authenticateClient().getAccessToken());
//		    }
//
//		    @Bean
//		    public OAuth2Operations oauth2Template(Environment env) {
//		        return new OAuth2Template(env.getProperty("clientId"), env.getProperty("clientSecret"), "", "https://api.twitter.com/oauth2/token");
//		    }
}
