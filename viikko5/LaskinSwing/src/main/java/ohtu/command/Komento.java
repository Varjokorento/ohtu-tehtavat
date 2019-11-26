package ohtu.command;


import ohtu.Sovelluslogiikka;

import javax.swing.*;

public abstract class Komento {
    protected JTextField tuloskentta;
    protected JTextField syotekentta;
    protected JButton nollaa;
    protected JButton undo;
    protected Sovelluslogiikka sovelluslogiikka;

    public Komento(JTextField tuloskentta, JTextField syotekentta, JButton nollaa, JButton undo, Sovelluslogiikka sovelluslogiikka) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovelluslogiikka = sovelluslogiikka;
    }

    public Komento() {
        //
    }

    public abstract void suorita();
}