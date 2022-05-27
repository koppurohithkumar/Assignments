import java.util.HashSet;

class Employee{
	private int id,salary;
	private String name,department;
	
	public Employee(int id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		
	}
	private void displayDetails() {
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	
}

public class Assignment5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Employee> book = new HashSet<Employee>();
		
		Employee E1= new Employee(001,"jaia",5000,"AstroPhysics");
		Employee E2= new Employee(002,"jaib",500000,"AstroPhysics");
		Employee E3= new Employee(3,"jaic",500,"AstroPhysics");
		Employee E4= new Employee(004,"jaid",50,"AstroPhysics");
		Employee E5= new Employee(005,"jaie",5,"AstroPhysics");
		Employee E6= new Employee(001,"jaia",5000,"AstroPhysics");
		
		book.add(E1);
		book.add(E2);
		book.add(E3);
		book.add(E4);
		book.add(E5);
		book.add(E6);
		
		for(Employee e: book) {
			System.out.println(e.getId() +" "+e.getName()+" "+e.getSalary()+" "+e.getDepartment());		
		}
	}

}