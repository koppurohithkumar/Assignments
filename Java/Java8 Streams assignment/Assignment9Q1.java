import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Assignment9Q1 {

	public static void main(String[] args) {
		List<Fruit> obj=Arrays.asList(
				new Fruit("Mango",30,40,"Yellow"),
				new Fruit("Apple",423,120,"Red"),
				new Fruit("Orange",56,90,"Orange"),
				new Fruit("Banana",233,40,"Yellow"),
				new Fruit("Goa",32,50,"Green"));
		obj.stream()
		  .filter(p->p.getCalories()<100)
		  .forEach(p->System.out.println(p.getName()));
		System.out.println("-------------------");
		obj.stream()
		  .sorted(Comparator.comparing(Fruit::getColor))
		  .forEach(p->System.out.println(p.getName()));
		System.out.println("-------------------");
		obj.stream()
		  .filter(p->p.getColor().equals("Red"))
          .sorted(Comparator.comparingInt(Fruit::getPrice))
		  .forEach(p->System.out.println(p.getName()));
	}

}
class Fruit { 
	
	private String name; 
	private int calories; 
	private int price; 
	private String color;
	
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
