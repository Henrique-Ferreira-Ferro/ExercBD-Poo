package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {
public static Connection conector() {
		
		Connection con = null;
		String path = "jdbc:mysql://localhost:3306/escola";
		String nome = "root";
		String senha = "46182001";
		
		try {
			con = DriverManager.getConnection(path,nome,senha);
			return con;
		}catch(SQLException e) {
			System.out.println(e);
			return null;
		}
		
	}

	public boolean estaConectado() {
		if(conector() != null) {
			return true;
		}else {
			return false;
		}
	}

}
