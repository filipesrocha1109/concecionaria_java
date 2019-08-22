package model;

import javax.swing.JOptionPane;

public class Veiculo {

	public int id, passageiros, ano;
	public String modelo;
	public String placa;

	public Veiculo() {

	}

	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public Veiculo(int id, int passageiros, int ano, String modelo, String placa) {
		this.id = id;
		this.passageiros = passageiros;
		this.ano = ano;
		this.modelo = modelo;
		this.placa = placa;
	}

	public void cadastrar() {
		String texto = "veiculo " +" "+ this.modelo + " "+"cadastrado com sucesso !!!";
		JOptionPane.showMessageDialog(null, texto);
	}

}
