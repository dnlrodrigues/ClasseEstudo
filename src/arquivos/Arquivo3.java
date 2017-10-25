package arquivos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Arquivo3 {

	static Boolean criado = true;
	static Path path1;
	Charset utf8 = StandardCharsets.UTF_8;
	static	ArrayList <String> lista = new ArrayList<String>();
	
	
	public void criar() throws IOException{
		path1 = Paths.get("C:/eclipse neon/workspace/Testes/teste3/contas.txt");
		Files.createDirectories(path1.getParent());
		criado = false;
		}
	
	
	public void registro (int conta, String cliente){
		try {
			if (criado){
				criar();
				listaContas(conta, cliente);
				}
			else {
				listaContas(conta, cliente);
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public void listaContas (int conta, String cliente){
		lista.add("Conta: " + conta + " Cliente: " + cliente);
		}
	
	public void gravar () throws IOException{	
		/*Escrita
		 * Escrever as contas e os clientes no arquivo;
		 */
		try (BufferedWriter w = Files.newBufferedWriter(path1, utf8)){
			for (String listaArray : lista) {
				w.write(listaArray);
				w.newLine();
			}
			}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void lerArquivo() throws IOException{
		/*Leitura
		 * Ler as contas e os clientes no arquivo;
		 */
		try(BufferedReader r= Files.newBufferedReader(path1, utf8)){
			String line = null;
			while ((line = r.readLine())!= null){
				System.out.println(line);
			}
		}
			catch (IOException e){
				e.printStackTrace();
			}
		}
}
		

