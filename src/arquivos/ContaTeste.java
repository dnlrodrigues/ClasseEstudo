package arquivos;

import java.io.IOException;

public class ContaTeste {
	
	public static void main(String[] args) throws IOException {

		Arquivo3 arquivo = new Arquivo3();		
		
		try{
		Conta c1 = new Conta("Daniela",  1224);
		c1.exibeSaldo();
	
		
		Conta c2 = new Conta ("Kelvy", 1225);
		c2.exibeSaldo();
		
		c1.deposita(c1,500);
		c2.deposita(c2,800);
			
		c2.tranferePara(c1, 250);
			
		c1.saca(c1, 100);
		
		c2.saca(c2, 30);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		
		c1.imprimi();
		c2.imprimi();
		
		}
		finally {
			arquivo.gravar();
			arquivo.lerArquivo();
			
		
		}
		

	}

}
