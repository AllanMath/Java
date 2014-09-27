import java.awt.Container;
import java.awt.Font;
import javax.swing.*;

public class Principal extends JFrame {	
	private static final long serialVersionUID = 4746656342741712647L;
	
	public Principal() { 
        Container c = getContentPane();
        c.setLayout(null);   
        /*Border border = BorderFactory.createLineBorder(Color.BLUE, 1);*/

        JLabel lblescolha=new JLabel("Escolha uma opção");
        lblescolha.setBounds(170,15,180,20);
        lblescolha.setFont(new Font("Trebuchet MS", Font.BOLD, 20));  
        /*lblescolha.setBorder(border);*/
        c.add(lblescolha);
        
	}
	
	public static void main(String[] args){
    	Principal o=new Principal();
    	o.setVisible(true);
    	o.setTitle("Projeto: Estudando Física no Computador");
    	o.setSize(500, 400);
    	o.setResizable(false);
    	o.setLocationRelativeTo(null);
    	o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
 }
