package br.com.letcode.finalMod7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Escola escola = new Escola();
		
		String[] lista1 = {"Alexandre Martins", "Vitor Hugo Lima", "Esther Rodrigues", "Lavinía Cunha", "Natália Gomes",
				"Yago Ramos", "Letícia Cunha", "Srta. Ana Júlia Ramos", "Pietra Martins", "Thomas Peixoto", "Thales Faria"};
		
		String[] lista2 = {"Vitor Hugo Lima", "Esther Rodrigues", "Natan Nascimento", "Lavinía Cunha", "Natália Gomes", 
				"Dra. Lavínia Lopes", "Yago Ramos", "Letícia Cunha", "Luiz Miguel Azevedo", "Srta. Ana Júlia Ramos", 
				"Thales Faria", "Dra. Alana Porto"};
		
		List<Aluno> listAux1 = new ArrayList<Aluno>();
		List<Aluno> listAux2 = new ArrayList<Aluno>();
		
		for(String x : lista1) {
			Aluno aux = new Aluno(x);
			listAux1.add(aux);
		}
		escola.java.setAlunos(listAux1);
		
		for(String x : lista2) {
			Aluno aux = new Aluno(x);
			listAux2.add(aux);
		}
		escola.bd.setAlunos(listAux2);
		
		escola.java.imprime();
		escola.bd.imprime();
		
		
		
		for(Aluno a : escola.java.getAlunos()) {
			escola.allAlunos.add(a.getNome());
		}
		
		for(Aluno a : escola.bd.getAlunos()) {
			escola.allAlunos.add(a.getNome());
		}
		
		for(String a : escola.allAlunos) {
			System.out.println(a);
		}
		
		
		escola.imprimeAllAlunos();
		
		
	}

}
