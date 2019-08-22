package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
	public int eixos;
	public double carga;

	public Caminhao() {

	}

	public Caminhao(String modelo) {
		super(modelo);
	}

	public Caminhao(String modelo, int eixos) {
		super(modelo);
		this.eixos = eixos;
	}

	@Override
	public void cadastrar() {
		String texto = "Caminhão " + this.modelo + " com " + this.eixos + " eixos, cadastrado com sucesso!!!";
		JOptionPane.showMessageDialog(null, texto);

	}

}
