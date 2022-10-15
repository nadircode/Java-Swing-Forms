import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;


public class Formulaire extends JFrame implements Runnable{
	
	
	AddCours c1 ;
	Thread anime;
	JMenu fichier, cours  , etudiant , connexion , a_propos;  
	JMenuItem coursItem; 
    public Formulaire(){
        super("Formulaire");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        anime = new Thread(this);
        anime.start();
    }

    public void function(Graphics g){
        // JFrame window = new JFrame("BorderLayoutExemple"); 
        this.setLayout(new BorderLayout());
        JMenuBar menubar=new JMenuBar();  
        fichier=new JMenu("Fichier");
        cours=new JMenu("Cours");
        etudiant=new JMenu("Etudiant");
        connexion=new JMenu("Connexion");
        a_propos=new JMenu("a propos");
        
        coursItem = new JMenuItem("Ajouter d'un cours");  
        
        cours.add(coursItem);
        
        menubar.add(fichier);
        menubar.add(cours);
        menubar.add(etudiant);
        menubar.add(connexion);
        menubar.add(a_propos);
        
        coursItem.addActionListener(new ActionListener(){     
      	   public void actionPerformed(ActionEvent actionEvent){
      		    c1 = new AddCours();
      		    c1.pack();
      		    c1.setSize(500,500);
      	        c1.function(g);
      	   }
      	});
        
        
        this.setJMenuBar(menubar);
        this.setVisible(true);
        

    }

    public void paint(Graphics g){
        super.paint(g);
        function(g);
    }

    @Override
    public void run() {
        repaint();
    }

    public static void main(String[] args) {
        new Formulaire().setVisible(true);
        
    }

}
