public class ControleBonus {

	private double total;
	public void registra(Funcionario f) {
		double bonus = f.getBonus();
		this.total = this.total + bonus;
	}
	
	public double getTotal() {
		return total;
	}
}
