package singletonsss.com;

public class Aplicacao {

	public static void main(String[] args) {

		DataBaseSingleton db = DataBaseSingleton.getInstance();
		db.executarComando("select * from  tbl_produto");
		
		DataBaseSingleton outrodb = DataBaseSingleton.getInstance();
		
		outrodb.executarComando("selec * from tbl_cliente");
	}

}
	