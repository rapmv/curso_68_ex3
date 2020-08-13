package ententies;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double result = 0;
	
	public String aprovado() {
		result = nota1+ nota2+ nota3;
		if (result>=60) {
			return "Final Grade: "
				+String.format("%.2f", result)
				+"\n"
				+"Passou "
				+name;
		}
		else {
			return "Final Grade: "
					+result
					+"\n"
					+"Não passou "
					+name
					+"\nfaltou: "
					+String.format("%.2f", (60-result));
		}
	}
}
