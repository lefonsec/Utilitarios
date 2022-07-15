package singletonsss.com;

public class DataBaseSingleton {

	private static	DataBaseSingleton instance;
	
	private DataBaseSingleton() {
		System.out.println("Connerctin on serve mysqldb....");
	}
	
	public static DataBaseSingleton getInstance() {
		if(instance == null) {
			instance = new DataBaseSingleton();
		}
		return instance; 
	}
	
	public void executarComando(String comando) {
		System.out.println("MySQL " + comando);
	}
}
