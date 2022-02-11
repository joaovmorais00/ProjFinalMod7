package br.com.letcode.finalMod7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
		for(String x : lista1) {
			Aluno aux = new Aluno(x);
			listAux1.add(aux);
		}
		java.setAlunos(listAux1);
		
		for(String x : lista2) {
			Aluno aux = new Aluno(x);
			listAux2.add(aux);
		}
		bd.setAlunos(listAux2);
		
		java.imprime();
		bd.imprime();
		
		Set <String> allAlunos = new HashSet<String>();
		
		for(Aluno a : java.getAlunos()) {
			allAlunos.add(a.getNome());
		}
		
		for(Aluno a : bd.getAlunos()) {
			allAlunos.add(a.getNome());
		}
		
		for(String a : allAlunos) {
			System.out.println(a);
		}
		
		
		
		FileWriter arq = null;
		try {
			arq = new FileWriter("Impressão Alunos");
			PrintWriter escreve = new PrintWriter(arq);
			escreve.printf("Impressão Alunos:\n\n");
			for(String aluno : allAlunos) {
				escreve.printf("%s\n", aluno);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			if (arq != null) {
				arq.close();
            }
		}
		
	}

}
