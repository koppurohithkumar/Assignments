import java.util.ArrayList;
import java.util.Arrays;

public class Assignement10Q3 {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("A quick brown fox jumps over the lazy dog");
		String [] arr=obj.stream().toArray(o->new String[o]);
		System.out.println(Arrays.toString(arr));
	}
}
