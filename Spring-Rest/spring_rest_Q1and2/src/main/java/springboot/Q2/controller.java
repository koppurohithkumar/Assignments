package springboot.Q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	@RequestMapping("/login")
	public ModelAndView input() {
		ModelAndView out = new ModelAndView("login");
		return out;
	}

}
