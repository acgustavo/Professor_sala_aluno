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
		Aula fisica1_1 = new Aula("Impulso e movimento linear", albert, "03/07/2015", lab50, eng15_2);
		Aula fisica2 = new Aula("Queda livre de corpos", isaac, "28/08/2015", e35, eng15_2);
		Aula fisica2_1 = new Aula("Queda livre de corpos", isaac, "03/09/2015", lab50, eng15_2);
		
		//impressao das aulas 
		System.out.println("Professor\t\t" + " Conteudo\t\t\t" + " Data\t\t" + " Sala\t\t\t\t" + " Turma\t\t\t\t");
		System.out.println(fisica1.getProfessor().getNome() +"\t\t"+ fisica1.getConteudo() +"\t"+ fisica1.getData() +"\t"+ fisica1.getSala().getNumero() +"\t\t\t"+ fisica1.getTurma().getSemestre());
		System.out.println(fisica1_1.getProfessor().getNome() +"\t\t"+ fisica1_1.getConteudo() +"\t"+ fisica1_1.getData() +"\t"+ fisica1_1.getSala().getNumero() +"\t"+ fisica1_1.getTurma().getSemestre());
		System.out.println(fisica2.getProfessor().getNome() +"\t\t"+ fisica2.getConteudo() +"\t\t"+ fisica2.getData() +"\t"+ fisica2.getSala().getNumero() +"\t\t\t"+ fisica2.getTurma().getSemestre());
		System.out.println(fisica2_1.getProfessor().getNome() +"\t\t"+ fisica2_1.getConteudo() +"\t\t"+ fisica2_1.getData() +"\t"+ fisica2_1.getSala().getNumero() +"\t"+ fisica2_1.getTurma().getSemestre());
		
	}	

}
