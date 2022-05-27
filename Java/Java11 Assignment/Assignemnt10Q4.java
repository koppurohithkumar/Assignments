import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Assignemnt10Q4 {

	public static void main(String[] args) {
		var o="C:\\Users\\Rajesh\\Desktop\\StudentList.txt";
		try {
			var oo=Files.readString(Path.of(o));
			System.out.println(oo);
			System.out.println("----------------------");
			var o1=oo.lines().count();
			System.out.println("Total no of Students= "+o1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
