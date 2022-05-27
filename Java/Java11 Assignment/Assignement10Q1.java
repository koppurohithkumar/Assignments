@FunctionalInterface
interface sI{
	double input(int p,int t,int r);
}
public class Assignement10Q1 {

	public static void main(String[] args) {
		sI obj=(var p,var t,var r)->(p*t*r/100);
		System.out.println(obj.input(13, 5, 12));
	}
}
