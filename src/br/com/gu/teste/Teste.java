package br.com.gu.teste;

import br.com.gu.entidades.Aula;
import br.com.gu.entidades.Professor;
import br.com.gu.entidades.Sala;
import br.com.gu.entidades.TipoSala;
import br.com.gu.entidades.Turma;

public class Teste {
	public static void main(String[] args) {
		
		//cadastro professores
		Professor albert = new Professor("Albert Einstein");
		Professor isaac = new Professor("Isaac Newton");
		
		//cadastro salas
		Sala e35 = new Sala("", "35, Engenharias",TipoSala.teorica);
		Sala lab50 = new Sala("", "50, Laboratorio de Fisica",TipoSala.pratica);
		
		//cadastro turma
		Turma eng15_2 = new Turma("", "2ºsemestre Engenharias, 2015.2");
						
		//cadastro de aulas 
		Aula fisica1 = new Aula("Impulso e movimento linear", albert, "01/07/2015", e35, eng15_2);
		albert.getAula().add(fisica1);
		Aula fisica1_1 = new Aula("Impulso e movimento linear", albert, "03/07/2015", lab50, eng15_2);
		albert.getAula().add(fisica1_1);
		Aula fisica2 = new Aula("Queda livre de corpos", isaac, "28/08/2015", e35, eng15_2);
		isaac.getAula().add(fisica2);
		Aula fisica2_1 = new Aula("Queda livre de corpos", isaac, "03/09/2015", lab50, eng15_2);
		isaac.getAula().add(fisica2_1);
		
		//impressao das aulas 
		System.out.println("Professor\t\t" + " Conteudo\t\t\t" + " Data\t\t" + " Sala\t\t\t\t" + " Turma\t\t\t\t");
		System.out.println(albert.getNome() +"\t\t"+ albert.getAula());
		System.out.println(isaac.getNome() +"\t\t"+ isaac.getAula());
	}	

}
