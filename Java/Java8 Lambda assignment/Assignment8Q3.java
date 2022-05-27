
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Assignment8Q3 {
    static int modifyValue(int n,Function fun) {

      return (int)fun.apply(n);
    }

    static class Product {
    	
    }

    static void display(int r) {
        System.out.println(r);

        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);
        
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));
    }

    public static void main(String[] args) {
        int r =modifyValue(5,val->(Integer)val+ 5);
        display(r); 
        
        
        ArrayList<String> A31 = new ArrayList<>();
      	A31.add("Ram");
      	A31.add("Manasa");
      	List<String> list = new ArrayList<>();
      	 Supplier<ArrayList<String>> AA = () -> {
      		 for(String i:A31) {
      			 list.add(i);
      		 }
    			return (ArrayList<String>) list;
      	 };
      	    
      	  System.out.println(AA.get());	    
      	}
    
}