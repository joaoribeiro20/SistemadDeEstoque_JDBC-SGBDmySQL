package SistemaDeEstoque.com.br;
import java.util.Scanner;




public class RodarTeste {	
	public static Scanner lerT;
	public static PesquisarCodigo pesquisarcodigo;
	
	public static void main(String[] args) {
		lerT = new Scanner(System.in);
		pesquisarcodigo = new PesquisarCodigo();	
		
		
		
		System.out.println("-------Bem Vindo ao sistema de controle do Estoque---------------------------------------------------------------------------\n"
				+ "-----Primeiro Escolha Qual Processo Deseja Execultar---------------------------------------------------------------------------------\n"
				+ "    **Escolha uma das alternativa a seguir**  \n"
				+ "       1 - Adicionar Iten novo\n"
				+ "       2 - Pesquisar iten pelo seu codigo de barra \n"
				+ "       3 - Pesquisar iten pelo seu nome\n"
				+ "       4 - exluir inten\n"
				+ "       5 - quantidade total de itens no estoque\n"
				+ "--------------------------------------------------------------------------------------------------------------------------------------\n"
				+ "               00 - Configurações internas\n"
				+ "                          0 - Sai");
			int terminal = lerT.nextInt();
			
		while (terminal >= 6) {	
			if(terminal == 1){
				
			}
			
			if(terminal == 2) {
			
				System.out.println("------------------------------------------------------------------------------------------------------");
				pesquisarcodigo.pesquisarcodigodados();
				
			}
			if(terminal == 3){
			}
			if(terminal == 4){
			}
			if(terminal == 5){
			}
			if(terminal == 00){
			}
			if(terminal == 0){
			}
			else {
			}
				System.out.println("Digite uma das opçoes validas acima");
			}
	}
}
