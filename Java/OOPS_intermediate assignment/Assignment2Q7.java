public class Assignment2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
	private void selectRoles(){}
    private void roles(String role){}
    private void addItems() {}
    private void addItemsOperation(int choice) {}
    private void placeOrder() {}
    private void placeOrderOperation(int choice) {}

}
abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	int noOfCandies = 0 ;
	int Dollarconvertedrupee=60;
    public int addCandies(int candies){
    	this.noOfCandies += noOfCandies;
    	return noOfCandies;
    }
    public int getCost() {
    	int CandiesTotal = noOfCandies*Dollarconvertedrupee;
    	return CandiesTotal;
    }
}
class Cookie extends DesertItem {
	int noofCookies = 0;
	int Euroconvertedrupee=70;
    public int addCookies(int candies){
    	this.noofCookies+=noofCookies;
    	return noofCookies;
    }
    public int getCost() {
    	int CookiesTotal = noofCookies*Euroconvertedrupee;
    	return CookiesTotal;
    }
}
class IceCream extends DesertItem {
	int noOfIceCreames=0;
	int Rupees ;
    public int addIceCreams(int candies){
    	this.noOfIceCreames=noOfIceCreames;
    	return noOfIceCreames;
    }
    public int getCost() {
    	return noOfIceCreames;
    }
}