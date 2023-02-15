package SistemaDeEstoque.com.br;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import Conetion.ConectarSGBD;
import java.sql.SQLException;

public class PesquisarCodigo {
	PesquisarCodigo(){}

	public static Scanner ler;
	public Connection conn;
	
	public void pesquisarcodigodados() {
		
		conn = new ConectarSGBD().Entrar();
		ler = new Scanner(System.in);
		
		try {
			
			System.out.println("digite o codigo do produto");
			String codigop = ler.next();
			System.out.println("----------------------------------------------------------------------------------------------");
			
				PreparedStatement stmt = conn.prepareStatement("select codigo, nome, valor, quantidade from estoque_dados where codigo = '"+codigop+"';");
	    ResultSet result = stmt.executeQuery();
		 System.out.println("   ****      ****  ");
		while (result.next()) {
			  int codigow = result.getInt("codigo");
		      String nome = result.getString("NOME");
		      float valor = result.getFloat("valor");
		      int quantidade = result.getInt("quantidade");
		      System.out.println( "Codigo do Produto: " + codigow + "\n"
		      		+  "Nome do Produto:  "  + nome + "\n"
		      		+ "Valor do Produto: " + valor+ "R$\n"
		      		+ "Quantidade No Estoque: " +quantidade+ " UN\n");
		      System.out.println("   ****      ****  ");
		
		}
		System.out.println("          ESCOLHA UMA DAS ALTERNATIVAS A SEGUIR:\n"
				+ "----------- 1 . Realizar outra pesquisa ------------\n"
				+ "----------- 2 . Voltar ao inicio do Sistema --------");
		int escolha = ler.nextInt();
		if(escolha == 1) {
			
		}else{
			conn.close();
			System.out.println("conexao fechada");
		}
		}
		catch (SQLException erro){
		 }
	}
	
	
	
	
}
