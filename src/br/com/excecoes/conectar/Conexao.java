package br.com.excecoes.conectar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public Connection conectar() throws Exception {
		return DriverManager.getConnection("");
	}

}
