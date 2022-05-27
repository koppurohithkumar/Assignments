package springboot.Q2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String validateUser(@RequestParam String username, @RequestParam String password) {
		if (username.equals("Rajesh") && password.equals("password"))
			return "Valid User";
		else
			return "Invalid User";

	}

}
