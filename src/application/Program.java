package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome:");
		aluno.name = sc.nextLine();
		System.out.println("Digite as notas na sequencia: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.print(aluno.aprovado());
		

		sc.close();
	}

}
