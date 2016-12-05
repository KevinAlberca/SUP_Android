package Components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyButton extends JButton implements MouseListener {

	private static final long serialVersionUID = 1930399217688529375L;
	private JLabel label;
	private JTextField textfield;
	
	public MyButton(JLabel jLabel, JTextField jTextField){
		super();
		this.label = jLabel;
		this.textfield = jTextField;
		
		this.addMouseListener(this);
	}

	
    public String crypt(String password){
    	String aCrypter= "";
        for (int i=0; i<password.length();i++)  {
        	int c=password.charAt(i)^48;  
            aCrypter=aCrypter+(char)c; 
        }
        return aCrypter;
    } 
    
	@Override
	public void mouseClicked(MouseEvent e) {
		label.setText(crypt(textfield.getText()));
		textfield.setText("");
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
