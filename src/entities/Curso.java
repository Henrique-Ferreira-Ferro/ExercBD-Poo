package entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private int codigo;
	private String nome;
	private int cargaTotal;
	
	private List<Disciplina> disciplinas;
	
	
	public Curso() {
		disciplinas = new ArrayList<>();
	}
	
	
	public Curso(int codigo, String nome, int cargaTotal) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaTotal = cargaTotal;
		disciplinas = new ArrayList<>();
	}



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
	
	public int getCargaTotal() {
		return cargaTotal;
	}
	
	public void setCargaTotal(int cargaTotal) {
		this.cargaTotal = cargaTotal;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public void exibirInfo() {
		System.out.println("Abaixo informações referente ao curso e a disciplina");
		System.out.println("O curso possui o código: " + this.getCodigo()+ ". O nome do curso é: "+ this.nome+ ". Por fim sua carga horaria é de: "+ this.getCargaTotal());
		System.out.println("--------------------------------------");
		System.out.println("Abaixo informações referente a disciplina:");
		System.out.println();
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina.getNomeDis() + "   -------   " + disciplina.getCargaHorario()+ " Horas");
		}
	}
	
	
}
