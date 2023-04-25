
public class Main {
	public static void main(String[] args) {
		
		Empregado[] empregado = new Empregado[3];
		
		// gerar objetos
		empregado[0] = new EmpregadoHorista();
		empregado[1] = new EmpregadoComissionado();
		empregado[2] = new EmpregadoHorista();
		
		// imprimir o salário dos empregados
		for(int i = 0; i < empregado.length; i++) {
			System.out.println(empregado[i].calcularSalario());
		}
		

	}
	
	
}
