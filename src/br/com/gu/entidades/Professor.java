package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private Long id;
	private String nome;
	private List<Aula> aula = new ArrayList<>();

	public Professor(String nome) {
		this.nome=nome;
	}
	public List<Aula> getAula() {
		return aula;
	}

	public void setAula(List<Aula> aula) {
		this.aula = aula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
