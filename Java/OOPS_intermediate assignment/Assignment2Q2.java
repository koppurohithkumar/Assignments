
import java.util.ArrayList;

public class Assignment2Q2 {
	int salary = 10000;
    public int getSalary(int salary){
    	this.salary = salary;
    	return salary;
    }
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int totalsal = 0;
    	for(Integer  sal : employeeSalaries ) {
    		totalsal += sal;
    	}
    	return totalsal;
    		
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q2 myObj2 = new Assignment2Q2();
		Manager manager = new Manager();
		
		int managerSalary = manager.getSalary(myObj2.salary);
		
		Labour labour = new Labour();
		
		int labourSalary = labour.getSalary(myObj2.salary);
		
		ArrayList<Integer>employeeSalary = new ArrayList<>();
		employeeSalary.add(managerSalary);
		employeeSalary.add(labourSalary);
		
		int Total = myObj2.totalEmployeesSalary(employeeSalary);
		
		System.out.println("Total Employee salary "+Total);

	}

}
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000+salary;
        return incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500+salary;
		return overtime;
    }
}