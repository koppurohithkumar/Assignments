import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment8Q6 {
    public List<String> convertToUpperCase(List<String> list) {  	
		return list;		
    }  
    public static void main(String[] args) {
    	List<String> obj=new ArrayList<>();
    	obj.add("Amar");
    	obj.add("ramu");
    	obj.add("kaMMU");
    	obj.add("eyE");
    	obj.add("ANESH");
    	obj.add("thakur");
    	
    	System.out.println(obj);
    	obj.replaceAll(new replace());
    	System.out.println(obj);
    }
}
class replace implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		return t.toLowerCase();
	}
}
