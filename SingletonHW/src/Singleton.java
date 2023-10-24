
public class Singleton {
	 
	private static Singleton instance = null;
	public String s = "Hello World";
	
	//constructor private ca sa nu se poata instantia din alta parte
	private Singleton() {
		
	//Metoda statica pentru instantiere
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		        }
		return instance;
	}
	
	
	
	
}
