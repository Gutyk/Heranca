
public class EmpregadoComissionado extends Empregado {
	double totalDeVendas;
	double comissao;
	
	// método para calcular e retornar o valor do salário
	public double calcularSalario() {
		return totalDeVendas * comissao / 100;
	}
}
