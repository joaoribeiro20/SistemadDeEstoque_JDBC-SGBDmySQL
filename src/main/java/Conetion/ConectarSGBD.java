package Conetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectarSGBD {
	

	public Connection Entrar() {
		Connection conn = null;
		
		try {
			//System.out.println("funcao ok");			
			Class.forName("com.mysql.jdbc.Driver"); // chamando o drive/arquivo.jar/bibioteca/api/dependencia ...//
			
			//conexao = DriverManager.getConnection(acessar.getUrl(), acessar.getUsuariodados(), acessar.getSenha()); // pegamos as variaveis que tinhamos criado e colocamos dentro da função 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/estoque", "root","55230326");
			//System.out.println("Conectado!");	
			
			//Fecha a conexão
			//conexao.close();
			//System.out.println("conexao fechada");
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
		return conn;
	}	
	
}
