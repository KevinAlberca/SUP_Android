package Main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import Components.DecrypterPanel;
import Components.CrypterPanel;

public class Main extends JFrame {

	private static final long serialVersionUID = -7379587371723737961L;

	public Main(){
		this.setTitle("Crypter / Decrypter");
		this.setSize(300, 200); // Defini la taille de la vue
		this.setLocationRelativeTo(null); // Centre la vue
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kill le process lorsque l'on quitte la fenetre
		this.setLayout(new GridLayout(2, 1));
		this.getContentPane().add(new CrypterPanel()); // Ajoute CrypterPanel dans le programme
		this.getContentPane().add(new DecrypterPanel());
		this.setVisible(true); // Rend le programme visible
	}
	
	public static void main(String[] args) {
		new Main();
	}
}