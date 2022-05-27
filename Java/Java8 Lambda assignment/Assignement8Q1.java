@FunctionalInterface
interface arthmeticOperations{
	double input(int num1,int num2);

}

public class Assignement8Q1  {

	public static void main(String[] args) {
		
		arthmeticOperations add= (num1,num2) -> (num1+num2);
		arthmeticOperations sub= (num1,num2) -> (num1-num2);
		arthmeticOperations mul= (num1,num2) -> (num1*num2);
		arthmeticOperations div= (num1,num2) -> (num1/num2);
		System. out. println(add.input(13,5));
		System. out. println(sub.input(13,5));
		System. out. println(mul.input(13,5));
		System. out. println(div.input(13,5));



	}

}

