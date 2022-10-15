import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Message extends JFrame implements Runnable{
	
	public Message() {
		JOptionPane.showMessageDialog(this,"Cours Ajouté");  
	}
	
	
	public void function(){
        // JFrame window = new JFrame("BorderLayoutExemple"); 
        this.setLayout(new BorderLayout());
        
        
   
        this.setVisible(true);
        

    }
	
	public void paint(Graphics g){
        super.paint(g);
        function();
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		repaint();
	}
}
