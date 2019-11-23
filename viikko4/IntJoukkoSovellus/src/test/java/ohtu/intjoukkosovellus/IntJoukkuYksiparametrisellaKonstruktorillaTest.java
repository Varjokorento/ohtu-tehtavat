
package ohtu.intjoukkosovellus;

import ohtu.intjoukkosovellus.joukko.IntJoukko;
import org.junit.Before;


public class IntJoukkuYksiparametrisellaKonstruktorillaTest extends IntJoukkoTest {
    
    @Before
    @Override
    public void setUp() {
        joukko = new IntJoukko(3);
        joukko.lisaa(10);
        joukko.lisaa(3);
    }
    
    // perii kaikki testit luokasta IntJoukkoTest
}
