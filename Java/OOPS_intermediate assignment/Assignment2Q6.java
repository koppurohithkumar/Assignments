public class Assignment2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence FP = new FilePersistence();
		Persistence DBP = new DatabasePersistence();
		
		System.out.println(FP.persist());
		System.out.println(DBP.persist());
		
		
	}

}
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Filepersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Databasepersistence";
    }
}
/*class Client{
	Persistence FP = new FilePersistence();
	Persistence DbP = new DatabasePersistence();
}*/