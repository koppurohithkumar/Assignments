import java.util.ArrayList;

public class Assignment8Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(n->(n.length()%2!=0));
    	return employeeList;
    }
	public static void main(String[] args) {
    	Assignment8Q4 A1 = new Assignment8Q4();
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("Ram");
        employeeList.add("Snow");
        employeeList.add("Kumar");
        employeeList.add("Duck");
        employeeList.add("Fins");
        
    	System.out.println(A1.removeOddLength(employeeList));

	}

}
