package princ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {

	private Statement stat;
	private PreparedStatement pstm;

	public Consultas(Connection con) {
		try {
			stat = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ResultSet result;

	/*
	 * CRUD
	 */

	// Encontrar todos os cursos
	
	public void findAllCurso() {

		String query = "SELECT * FROM curso";
		try {

			result = stat.executeQuery(query);

			while (result.next()) {
				System.out.println("o codigo: " + result.getString(1) + ", o nome: " + result.getString(2) + ", carga: "
						+ result.getString(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void CreateCourse(String nomeCurso, int cargaHoraria) {
		String query = "INSERT INTO curso(nomeCurso,cargaHoraria) VALUES(?,?)";
		
		
	}

}
