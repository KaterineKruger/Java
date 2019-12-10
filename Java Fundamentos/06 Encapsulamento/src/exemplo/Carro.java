package exemplo;

public class Carro {

	// Atributos
	private String marca, fabricante;
	private double valor;
	
	// M�todos M�gicos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	// M�todo de seguro
	private double seguro() {
		return valor * 0.1;
	}
	
	// M�todo de ipva
	private double ipva() {
		return valor * 0.05;
	}
	
	// M�todo para exibir os dados
	public void dados() {
		System.out.println("Fabricante: "+fabricante);
		System.out.println("Marca: "+marca);
		System.out.println("Valor: "+valor);
		System.out.println("Valor do seguro: "+seguro());
		System.out.println("Valor do IPVA: "+ipva());
	}
	
}