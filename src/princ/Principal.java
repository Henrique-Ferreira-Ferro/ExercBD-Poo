package princ;

import dto.ModuloConexao;

public class Principal {
	public static void main(String[] args) {
		
		ModuloConexao modulo = new ModuloConexao();
		
		
		Consultas consulta = new Consultas(modulo.conector());
		
		
		consulta.findAllCurso();
		
	}
}
