package br.com.letcode.finalMod7;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Turma {
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void imprime() throws IOException {
		FileWriter arq = null;
		try {
			String nomeArq = "Impressao " + this.nome;
			arq = new FileWriter(nomeArq);
			PrintWriter escreve = new PrintWriter(arq);
			escreve.printf("Turma %s\n\nTotal de alunos: %d\n\n\n", this.nome, this.alunos.size());
			for(int i=0; i<this.alunos.size(); i++) {
				escreve.printf("%s\n", this.alunos.get(i).getNome());
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			if (arq != null) {
				arq.close();
            }
		}
	}
	
}
