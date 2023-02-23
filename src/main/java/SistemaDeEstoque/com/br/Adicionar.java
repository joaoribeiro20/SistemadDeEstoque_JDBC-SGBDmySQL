package SistemaDeEstoque.com.br;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import Conetion.ConectarSGBD;
import java.sql.SQLException;
public class Adicionar {
	Adicionar(){
		
	}
	private int codigo;
	private String nome;
	private float valor;
	private int quantidade;
	private String marca;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
/*-------------------------------------------------*/
    
		
 public void adicionarDados() {	
    	Connection conexao = new ConectarSGBD().Entrar();
    	Adicionar add = new Adicionar();
	    Scanner ler = new Scanner(System.in);
		
		
    	try {
    		System.out.println("Digite o codigo do produto: ");
    		add.setCodigo(ler.nextInt());
    		System.out.println("Digite o nome do produto: ");
    		add.setNome(ler.next());
    		
    		System.out.println("Digite o valor do produto: ");
    		add.setValor(ler.nextFloat());
    		System.out.println("Digite o quantidade do produto em estoque: ");
    		add.setQuantidade(ler.nextInt());
    		System.out.println("Digite a marca do produto a ser adicionado: ");
    		add.setMarca(ler.next());
    		
    	PreparedStatement stmt = conexao.prepareStatement("INSERT "
    			+ "INTO estoque_dados (codigo, nome, valor, quantidade, marca)"
    			+ " VALUES (?, ?, ?, ?, ?);");
    	
       stmt.setInt(1, add.getCodigo());//
    	
       stmt.setString(2, add.getNome()); //Segundo parâmetro (Nome)"
       
       stmt.setFloat(3, add.getValor());//
       
       stmt.setInt(4, add.getQuantidade());//
       
       stmt.setString(5, add.getMarca());//
       
       stmt.executeUpdate();
       System.out.println("Produto adicionado");
       
       conexao.close();
       System.out.println("Conexcao fechada");
    	}
    	
    	catch (SQLException erro){
    		System.out.println("erro");
		}
    }

}


/*valor dentro da casa de 2 digitos (1,29, 9,99)
 * codigo do prduto ate 9 digitos, podenso repetir quanatas vezes quiser 
 * nome podendo conter caracteres especias como  - = + 
 * 
 * 
 * 
 * */
