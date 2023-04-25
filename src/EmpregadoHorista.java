
public class EmpregadoHorista extends Empregado {
	int totalDeHorasTrabalhadas;
	double valorDaHoraTrabalhada;
	
	// método para calcular e retornar o valor do salário
		public double calcularSalario() {
			return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
		}
}
