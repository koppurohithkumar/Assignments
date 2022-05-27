package springboot.Q1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_Q1 {
	@RequestMapping("/hello")
	public String helloworld() {
		return "Hello World";
	}

}
