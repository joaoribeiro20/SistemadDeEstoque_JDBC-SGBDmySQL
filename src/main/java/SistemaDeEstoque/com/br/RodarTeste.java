package SistemaDeEstoque.com.br;
import java.util.Scanner;

public class RodarTeste {	
	
	public static Scanner lerT;
	public static PesquisarCodigo pesquisarcodigo;
	
	
	public static void main(String[] args) {
		int rodarteste = 1;
/***************************************************************/		
		lerT = new Scanner(System.in);
		pesquisarcodigo = new PesquisarCodigo();
		Adicionar addex = new Adicionar();
/***************************************************************/
		 while (rodarteste >= 1) {
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
/********************************************************************/
	 switch (terminal) {
	case 1:
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		addex.adicionarDados();
		System.out.println("          ESCOLHA UMA DAS ALTERNATIVAS A SEGUIR:\n"
				+ "----------- 1 . Adicionar outro produto novo ------------\n"
				+ "----------- 2 . Voltar ao inicio do Sistema --------");
		
		int escolha1 = lerT.nextInt();
		if(escolha1 == 1) {
			rodarteste = 2;
			terminal = 1;
		}else{
			rodarteste = 2;
		}


	break;
	case 2:
		System.out.println("------------------------------------------------------------------------------------------------------");
		pesquisarcodigo.pesquisarcodigodados();
		System.out.println("          ESCOLHA UMA DAS ALTERNATIVAS A SEGUIR:\n"
				+ "----------- 1 . Realizar outra pesquisa ------------\n"
				+ "----------- 2 . Voltar ao inicio do Sistema --------");
		
		int escolha2 = lerT.nextInt();
		if(escolha2 == 1) {
			rodarteste = 2;
			terminal = 2;
		}else{
			rodarteste = 2;
		}

		break;
	case 3:

		// bloco de código que será executado

		break;
	case 4:

		// bloco de código que será executado

		break;
	case 5:

		// bloco de código que será executado

		break;
	case 6:

		// bloco de código que será executado

		break;
	case 0:

		rodarteste = 0;
		break;
		}
	}
	}//main
}//rodarTeste
