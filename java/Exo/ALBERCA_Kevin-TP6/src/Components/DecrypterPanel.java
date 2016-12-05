package Components;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;


public class DecrypterPanel extends JPanel {

	private static final long serialVersionUID = 9131970873800152347L;

	public DecrypterPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.GRAY);
		
		JTextField textfield = new JTextField("String to unhash", 30);
		textfield.setSize(new Dimension(200, 24));
		textfield.setMaximumSize(textfield.getPreferredSize());
		
		JLabel label = new JLabel(" ");
		
		MyButton button = new MyButton(label, textfield);
		button.setText("Unhash generator");
		
		JPanel textFieldPanel = new JPanel();
			textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.PAGE_AXIS));
			textFieldPanel.setSize(300, 30);
			textFieldPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
			textFieldPanel.add(textfield);
		
		JPanel labelPanel = new JPanel();
			labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
			labelPanel.add(label);
			
		JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
			buttonPanel.add(button);
		
		this.add(labelPanel);
		this.add(textFieldPanel);
		this.add(buttonPanel);
			
	}
	
	public static void main(String[] args) {
		new DecrypterPanel();
	}
	
}
