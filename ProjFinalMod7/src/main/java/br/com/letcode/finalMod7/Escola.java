package br.com.letcode.finalMod7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Escola {
	
	Turma java = Turma.builder().nome("JAVA").build();
	Turma bd = Turma.builder().nome("BANCO DE DADOS").build();
	
	Set <String> allAlunos = new HashSet<String>();
	
//	public void ordenaAllAlunos() {
//		
//		List<String> aux = new ArrayList<String>(this.allAlunos);
//		
//		
//	}
//	
//	private void mergeSort(List<String> lista){
//		if (lista.size() < 2) {
//	        return;
//	    }
//		
//	    int meio = lista.size() / 2;
//	    
//	    List<String> esq = new ArrayList<String>();
//	    for(int i=0; i<meio; i++) {
//	    	esq.add(lista.get(i));
//	    }
//	    
//	    List<String> dir = new ArrayList<String>();  
//	    for(int i=meio; i<lista.size(); i++) {
//	    	dir.add(lista.get(i));
//	    }
//
//	    this.mergeSort(esq);
//	    this.mergeSort(dir);
//
//	    merge(lista, esq, dir);
//	}
//	
//	private void merge(List<String> lista, List<String> esq, List<String> dir) {
//		
//	}
	
	public void imprimeAllAlunos() throws IOException {
//		this.ordenaAllAlunos();
		
		FileWriter arq = null;
		try {
			arq = new FileWriter("Impressão Alunos");
			PrintWriter escreve = new PrintWriter(arq);
			escreve.printf("Impressão Alunos:\n\n");
			for(String aluno : this.allAlunos) {
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
