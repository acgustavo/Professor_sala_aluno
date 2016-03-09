package br.com.gu.entidades;

//import java.util.ArrayList;
//import java.util.List;

public class Turma {
	private Long id;
	private String descricao;
	private String semestre;
//	private List<Aula>aula = new ArrayList<>();
	
	public Turma(String descricao, String semestre) {
		this.descricao = descricao;
		this.semestre = semestre;
	}
//	public List<Aula> getAula() {
//		return aula;
//	}
//
//	public void setAula(List<Aula> aula) {
//		this.aula = aula;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return semestre;
	}
}
