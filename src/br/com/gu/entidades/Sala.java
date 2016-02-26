package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Sala {
	private Long id;
	private String descricao;
	private String numero;
	private TipoSala tipoSala;
	private List<Aula>aula = new ArrayList();
	
	public Sala(String descricao, String numero, TipoSala tipoSala) {
		this.descricao = descricao;
		this.numero = numero;
		this.tipoSala = tipoSala;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoSala getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(TipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}

}
