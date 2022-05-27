import java.util.Scanner;

public class Assignment4Q1and2 {
	int sc;

	public static void main(String[] args) { 
		try {
			int num1,num2,div;
			Scanner a=new Scanner(System.in);
			System.out.println("Enter the first digit: ");
			num1=a.nextInt();
			System.out.println("Enter the second digit: ");
			num2=a.nextInt();
			div=num1/num2;
			System.out.println("Result: "+div);
			System.out.println("Division complete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Divisor cannot be zero");
			System.out.println(" UnsupportedOperationException");
		}
	}

}
