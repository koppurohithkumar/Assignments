public class Assignment2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle5 rectangle= new Rectangle5();
		Cube5 cube = new Cube5();
		Line5 line = new Line5();
		
		System.out.println(rectangle.draw());
		System.out.println(cube.draw());
		System.out.println(line.draw());
		
	}

}
class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	String Draw = "Draw the shape Rectangle";
		return Draw ;
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	String Draw = "Draw the shape Line";
    	return Draw;
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	String Draw = "Draw the shape Cube";
    	return Draw;
    }
}
abstract class Shape5 {
    abstract public String draw();
}