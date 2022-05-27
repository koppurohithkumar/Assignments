package springrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeRepository customerRepo;

	public List<employee> getAllemployees() {
		final List<employee> employeeList = new ArrayList<>();

		customerRepo.findAll().forEach(employeeList::add);
		return employeeList;
	}

	public employee getEmployeeById(int id) {
		return customerRepo.findById(id).get();
	}

	public employee addEmployee(employee emp) {
		return customerRepo.save(emp);
	}

	public boolean deleteEmployee(int id) {
		customerRepo.deleteById(id);
		return true;
	}

	public employee updateEmployee(employee emp) {
		return customerRepo.save(emp);
	}

}