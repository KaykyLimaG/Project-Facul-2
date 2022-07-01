package br.com.turma.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	
	public static Connection obterConexao() {
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbusuarios?useTimezone=truh&serverTimezone=UTC","root","root");
			System.out.println("Banco de dados conectado com sucesso!!!");
			
			
		} catch (SQLException e) {
			System.err.println("Não foi possivel conectar no Banco de dados");
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
}
