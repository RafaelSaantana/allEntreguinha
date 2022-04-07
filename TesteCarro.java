import javax.swing.JOptionPane;

public class TesteCarro {

	public static void main(String[] args) {
/*		Versão com construtor: */
		
		String carro1 = JOptionPane.showInputDialog("Insira o carro de sua preferencia: ");
		String adicional1 = JOptionPane.showInputDialog("Insira o adicional do carro: ");
		
		String carro2 = JOptionPane.showInputDialog("Insira o segundo carro de sua preferencia: ");
		String adicional2 = JOptionPane.showInputDialog("Insira o adicional do segundo carro: ");
		
		CarroClasse conjunto1 = new CarroClasse(carro1,adicional1);
		CarroClasse conjunto2 = new CarroClasse(carro2,adicional2);
		
		System.out.println(conjunto1.getCarro());
		System.out.println(conjunto1.getAdicional());
		System.out.println(conjunto2.getCarro());
		System.out.println(conjunto2.getAdicional());
		
	}
}		
/*		Sem o construtor
		
		CarroClasse carro1 = new CarroClasse();
		CarroClasse carro2 = new CarroClasse();
		carro1.setCarro("Uno");
		carro1.setAdicional("Escada");
		carro2.setCarro("Golzinho");
		carro2.setAdicional("Rebaixado");
		System.out.println(carro1.getCarro());
		System.out.println(carro1.getAdicional());
		System.out.println(carro2.getCarro());
		System.out.println(carro2.getAdicional());
		
	}

}
*/