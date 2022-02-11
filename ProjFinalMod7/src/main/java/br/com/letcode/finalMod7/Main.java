package br.com.letcode.finalMod7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Turma java = Turma.builder().nome("JAVA").build();
		Turma bd = Turma.builder().nome("BANCO DE DADOS").build();
		
		String[] lista1 = {"Alexandre Martins", "Vitor Hugo Lima", "Esther Rodrigues", "Lavinía Cunha", "Natália Gomes",
				"Yago Ramos", "Letícia Cunha", "Srta. Ana Júlia Ramos", "Pietra Martins", "Thomas Peixoto", "Thales Faria"};
		
		String[] lista2 = {"Vitor Hugo Lima", "Esther Rodrigues", "Natan Nascimento", "Lavinía Cunha", "Natália Gomes", 
				"Dra. Lavínia Lopes", "Yago Ramos", "Letícia Cunha", "Luiz Miguel Azevedo", "Srta. Ana Júlia Ramos", 
				"Thales Faria", "Dra. Alana Porto"};
		
		List<Aluno> listAux1 = new ArrayList<Aluno>();
		List<Aluno> listAux2 = new ArrayList<Aluno>();
		
		for(int i=0; i<lista1.length; i++) {
			Aluno aux = new Aluno(lista1[i]);
			listAux1.add(aux);
		}
		java.setAlunos(listAux1);
		
		for(int i=0; i<lista2.length; i++) {
			Aluno aux = new Aluno(lista2[i]);
			listAux2.add(aux);
		}
		bd.setAlunos(listAux2);
		
		java.imprime();
		bd.imprime();
		
	}

}
