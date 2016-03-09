package br.com.gu.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula {
	private Long id;
	private String conteudo;
	private Date data;
	private Professor professor;
	private Sala sala;
	private Turma turma;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Aula(String conteudo, Professor professor, String data, Sala sala, Turma turma) {
		this.conteudo = conteudo;
		try {
			this.data = sdf.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.professor = professor;
		this.sala = sala;
		this.turma = turma;
	}
	
	public Aula() {
	}
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getData() {
		String a = sdf.format(data);
		return a;
	}

	public void setData(String data) {
		try {
			this.data = sdf.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return (conteudo + "\t" + sdf.format(data) + "\t" + sala + "\t\t\t" + turma /*+ "\n\t\t\t"*/);
	}

}