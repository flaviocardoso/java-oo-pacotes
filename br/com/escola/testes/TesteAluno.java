
import java.util.Scanner;

import modelo.escola.*;
import modelo.escola.excecao.NotaException;
import modelo.escola.excecao.StringComprimentoException;

public class TesteAluno {
	public static void main (String[] args) {
		
		
		String nomeAluno;
		double nota1;
		double nota2;
		Aluno aluno1 = null;
		
		int countNome = 0;
		int countNota = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			while(countNome < 1) {
				System.out.println("Escreva o nome do aluno.");
				nomeAluno = sc.nextLine();
				
				
				try {
					aluno1 = new Aluno(nomeAluno);
					countNome++;
				} catch (StringComprimentoException ex) {
					System.out.println(ex.getMessage());
				}
			}
			
			while(countNota < 1) {
				System.out.println("Escreva a nota1 do aluno.");
				nota1 = sc.nextDouble();
				
				try {
					aluno1.setNota1(nota1);
					countNota++;
				} catch (NotaException ex) {
					System.out.println(ex.getMessage());
				}
			}
			
			while(countNota < 2) {
				System.out.println("Escreva nota2 do aluno.");
				nota2 = sc.nextDouble();
				
				try {
					aluno1.setNota2(nota2);
					countNota++;
				} catch (NotaException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		
		System.out.printf(
				"Nome do Aluno é %s, Médio é %.2f \n. Situação: %s.", 
				aluno1.getNomeAluno(), 
				aluno1.getMediaAluno(),
				(aluno1.aprovado()) ? "Aprovado" : "Reprovado");
		
		
	}
}
