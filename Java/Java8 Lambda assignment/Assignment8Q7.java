import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment8Q7 {
    public static void main(String[] args) {
    	HashMap<String, Integer> obj= new HashMap<>();
    	obj.put("Cam",23);
    	obj.put("Mic",37);
    	obj.put("Rome",68);
    	obj.put("Hand",34);
    	obj.put("Hulk",56);
    	
    	System.out.println(obj.entrySet());

        Set<Object> result = obj.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .collect(Collectors.toSet());
        System.out.println(result);

    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	
		return null;}
}


