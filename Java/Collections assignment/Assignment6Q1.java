
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



public class Assignment6Q1 {

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	
}
	

	@Test
	void test_case() {
		System.out.println("Annotations Included");
	}
	
	public static void main(String[] args) {
		Assignment6Q1 A7=new Assignment6Q1();
		
		
		A7.test_case();
	}
	
	
	
}