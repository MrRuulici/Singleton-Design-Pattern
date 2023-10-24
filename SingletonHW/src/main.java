
public class main {

	public static void main(String[] args) {
		
		Singleton text1 = Singleton.getInstance();
	        
	    Singleton text2 = Singleton.getInstance();
	        
	    if (text1 == text2) {
	    	System.out.println("Ambele instantieri sunt la fel");
	       } else {
	        System.out.println("Ceva nu e ok");
	       }

	}

}
