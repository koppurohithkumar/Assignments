package springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<employee> getAllDetails() {
		List<employee> employeeList = employeeService.getAllemployees();
		return employeeList;
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public employee addEmployee(@RequestBody employee emp) {
		return employeeService.addEmployee(emp);

	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public boolean deleteEmplolyee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);

	}

	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public employee updateEmployee(@RequestBody employee emp) {
		return employeeService.updateEmployee(emp);
	}
}