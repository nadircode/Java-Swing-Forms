import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;


public class AddCours extends JFrame implements Runnable{
	
	
	Message m1 ;
	Container c;
	JLabel idcours;
    JTextField tidcours;
    JLabel nomcours;
    JTextField tnomcours;
    JLabel desccours;
    JTextField tdesccours;
    JLabel coefcours;
    JTextField tcoefcours;
    JButton ajouter , fermer ;
	Thread anime;
	public AddCours(){
        super("Ajouter d'un cours");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);
        
        idcours = new JLabel("ID Cours");
        idcours.setSize(150, 20);
        idcours.setLocation(50, 100);
        c.add(idcours);
        
        tidcours = new JTextField();
        tidcours.setSize(190, 20);
        tidcours.setLocation(200, 100);
        c.add(tidcours);
        
        nomcours = new JLabel("Nom du Cours");
        nomcours.setSize(150, 20);
        nomcours.setLocation(50, 150);
        c.add(nomcours);
        
        tnomcours = new JTextField();
        tnomcours.setSize(150, 20);
        tnomcours.setLocation(200, 150);
        c.add(tnomcours);
        
        desccours = new JLabel("Description du Cours");
        desccours.setSize(150, 20);
        desccours.setLocation(50, 200);
        c.add(desccours);
        
        tdesccours = new JTextField();
        tdesccours.setSize(150, 20);
        tdesccours.setLocation(200, 200);
        c.add(tdesccours);
        
        coefcours = new JLabel("Coefficient  du Cours");
        coefcours.setSize(150, 20);
        coefcours.setLocation(50, 250);
        c.add(coefcours);
        
        tcoefcours = new JTextField();
        tcoefcours.setSize(150, 20);
        tcoefcours.setLocation(200, 250);
        c.add(tcoefcours);
        
        ajouter = new JButton("Ajouter");
        ajouter.setSize(100, 20);
        ajouter.setLocation(100, 300);
        
        ajouter.addActionListener(new ActionListener(){     
       	   public void actionPerformed(ActionEvent actionEvent){
     		    m1 = new Message();
     		    m1.pack();
     		    
     	        m1.function();
     	   }
     	});
        c.add(ajouter);
        
        fermer = new JButton("Fermer");
        fermer.setSize(100, 20);
        fermer.setLocation(200, 300);
        fermer.addActionListener(new ActionListener(){     
        	   public void actionPerformed(ActionEvent actionEvent){
        		    setVisible(false);
        		    dispose();
        	   }
        	});
        c.add(fermer);
        
        
        anime = new Thread(this);
        anime.start();
    }
	public void function(Graphics g){
        // JFrame window = new JFrame("BorderLayoutExemple"); 
        this.setLayout(new BorderLayout());
        
        
   
        this.setVisible(true);
        

    }
	
	public void paint(Graphics g){
        super.paint(g);
        function(g);
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		repaint();
	}
}
