package model;

import javax.swing.JOptionPane;

public class Moto extends Veiculo {
	public int cilindradas;
	public boolean partidaEletrica;

	public Moto() {

	}

	public Moto(String modelo) {
		super(modelo);
	}

	public Moto(String modelo, int cilindradas) {
		super(modelo);
		this.cilindradas = cilindradas;
	}

	@Override
	public void cadastrar() {
		String texto = "Moto " + this.modelo + " com " + this.cilindradas + " cilindradas, cadastrado com sucesso!!!";
		JOptionPane.showMessageDialog(null, texto);

	}

}
