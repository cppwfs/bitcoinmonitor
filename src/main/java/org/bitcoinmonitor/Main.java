package org.bitcoinmonitor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// Phase 3
//@ComponentScan
// Phase 2
@Configuration
// Phase 2
@ImportResource("integration.xml")
public class Main {

		    public static void main(String[] args) {
		    	System.out.println("Hello world");
//Phase 2
		        new AnnotationConfigApplicationContext(Main.class);
		    }
}
