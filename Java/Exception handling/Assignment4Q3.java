import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class Assignment4Q3 {
	static int q=10000;
	public static void main(String[] args) {
			System.out.println("Account balance: "+q);
			try {
				withdraw();
			} catch (InsufficientResourcesException e) {
				e.printStackTrace();
			} 
			catch (IllegalAccessException e) {
				e.printStackTrace();
			}
	}
	private static void withdraw() throws InsufficientResourcesException, IllegalAccessException {
		System.out.println("Enter the amountot withdraw: ");
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
		if(e>=q) {
			throw new InsufficientResourcesException("Amount exceds the available balance");
		}
		else if (e<0) {
			throw new IllegalAccessException("Amount cannot be negative");
		}
		else {
			q-=e;
			System.out.println("Available balance: "+q);
		}
	}

}