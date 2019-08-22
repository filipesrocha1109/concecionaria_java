package view;

import javax.swing.JOptionPane;
import model.Carro;
import model.Moto;
import model.Veiculo;
import model.Caminhao;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = -1;

		while (opcao != 0) {

			String menu = " 1 - Cadastrar Veículo \n" + " 2 - Cadastrar Carro \n" + " 3 - Cadastrar Moto \n"
					+ " 4 - Cadastrar Caminhão \n" + " 0 - Sair \n";
			opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				Veiculo v = new Veiculo();
				v.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				v.cadastrar();
				break;
			case 2:
				Carro c = new Carro();
				c.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				String sPortas = JOptionPane.showInputDialog("Digite a quantidade de portas:");
				c.portas = Integer.valueOf(sPortas);
				c.cadastrar();
				break;

			case 3:
				Moto m = new Moto();
				m.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				m.cilindradas = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de cilindradas:"));
				m.cadastrar();
				break;

			case 4:
				Caminhao t = new Caminhao();
				t.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				t.eixos = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de eixos:"));
				t.cadastrar();
				break;
			default:
				if (opcao != 0) {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
				break;
			}
		}

	}

}
