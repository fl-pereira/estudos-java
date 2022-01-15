
public class Funcionario {

	public static void main(String[] args) {
		
		int codFuncProgram1, horasTrabalhadas1;
		double salarioHora1, salarioTotal1;
		String nomeFunc;
					
		salarioHora1 = 7.25;
		horasTrabalhadas1 = 180;
		salarioTotal1 = salarioHora1 * horasTrabalhadas1;
		codFuncProgram1 = 1408;
		
		if (codFuncProgram1 == 1407) {
			nomeFunc = "José Almeida";
		} else {
			nomeFunc = "Funcionário não identificado";
		}
		
		System.out.printf("O funcionário " +codFuncProgram1 +", de nome " +nomeFunc +" recebe o salário de: %.2f", salarioTotal1);
		
	}

}
