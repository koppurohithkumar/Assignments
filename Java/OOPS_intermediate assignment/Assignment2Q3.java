import java.util.ArrayList;

public class Assignment2Q3 {
	
	int totalDeposits=10000;
	public int getCash(int totalDeposits){
    	this.totalDeposits=totalDeposits;
		return totalDeposits;
    }
	public int totalCashInBank(ArrayList<Integer> cash){
		int totalcash =0;
		for(Integer Cash : cash) {
			totalcash+=Cash;
		}
		return totalcash;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment2Q3 myObj = new Assignment2Q3();
		CurrentAccount CA= new CurrentAccount();
		
		int totalcurrent = CA.getCash(myObj.totalDeposits);
		
		SavingsAccount SA = new SavingsAccount();
		int totalsaving = SA.getCash(myObj.totalDeposits);
		
		ArrayList<Integer>total=new ArrayList<>();
		total.add(totalcurrent);
		total.add(totalsaving);
		
		int totalmoney = myObj.totalCashInBank(total);
		
		System.out.println(totalmoney);
		

	}
	

}
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash(int totalDeposits) {
    	int Tot_Current = totalDeposits+creditLimit;
    	return Tot_Current;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(int totalDeposits) {
    	int Tot_savings = totalDeposits+fixedDepositAmount;
    	return Tot_savings;
    }
}