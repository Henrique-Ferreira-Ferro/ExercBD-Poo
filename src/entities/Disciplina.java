package entities;

public class Disciplina {
	
	private String nomeDis;
	private int cargaHorario;
	
	private Curso curso;
	


	public Disciplina() {
		
	}


	public Disciplina(String nomeDis, int cargaHorario, Curso curso) {
		this.nomeDis = nomeDis;
		this.cargaHorario = cargaHorario;
		this.curso = curso;
	}


	public String getNomeDis() {
		return nomeDis;
	}


	public void setNomeDis(String nomeDis) {
		this.nomeDis = nomeDis;
	}


	public int getCargaHorario() {
		return cargaHorario;
	}


	public void setCargaHorario(int cargaHorario) {
		this.cargaHorario = cargaHorario;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
