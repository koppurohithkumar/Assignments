package springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.beta.replyservice", "com.beta.ruleService" })
@SpringBootApplication
public class SpringRestQ6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestQ6Application.class, args);
	}

}
