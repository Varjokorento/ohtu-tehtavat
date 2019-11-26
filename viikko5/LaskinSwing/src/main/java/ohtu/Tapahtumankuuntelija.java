package ohtu;

import ohtu.command.Komento;
import ohtu.command.operations.Miinus;
import ohtu.command.operations.Summa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class Tapahtumankuuntelija implements ActionListener {
    private JButton plus;
    private JButton miinus;
    private JButton nollaa;
    private JButton undo;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka sovellus;
    private HashMap<JButton, Komento> komennot;
 
    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
        this.plus = plus;
        this.miinus = miinus;
        this.nollaa = nollaa;
        this.undo = undo;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = new Sovelluslogiikka();
        komennot = new HashMap<>();
        komennot.put(plus, new Summa(tuloskentta, syotekentta, nollaa, undo, sovellus));
        komennot.put(miinus, new Miinus(tuloskentta, syotekentta, nollaa, undo, sovellus));

    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() != undo && ae.getSource() != nollaa)  {
            komennot.get(ae.getSource()).suorita();
        } else if (ae.getSource() == nollaa) {
            sovellus.nollaa();
        } else {
            System.out.println("undo pressed");
        }
    }
 
}