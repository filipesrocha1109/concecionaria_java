package model;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {

	public int portas;
	public double portaMalas;

	public Carro() {

	}

	public Carro(String modelo) {
		super(modelo);
	}

	public Carro(String modelo, int portas) {
		super(modelo);
		this.portas = portas;
	}

	@Override
	public void cadastrar() {
		String texto = "Carro "+  this.modelo +" com " + this.portas + " portas, cadastrado com sucesso!!!";
		JOptionPane.showMessageDialog(null, texto);

	}

}
