package br.com.letcode.finalMod7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Escola {
	
	Turma java = Turma.builder().nome("JAVA").build();
	Turma bd = Turma.builder().nome("BANCO DE DADOS").build();
	
	Set <String> allAlunos = new HashSet<String>();
	
	public void addAluno(String x) {
		this.allAlunos.add(x);
	}
	
	public void imprimeAllAlunos() throws IOException {
		
		for(String aluno: this.allAlunos) {
			System.out.println(aluno);
		}
		
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
