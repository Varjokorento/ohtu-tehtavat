
package ohtu.intjoukkosovellus;

import ohtu.intjoukkosovellus.joukko.IntJoukko;
import org.junit.Before;

public class IntJoukkoKaksiparametrisellaKonstruktorillaTest extends IntJoukkoTest {
    
    @Before
    public void setUp() {
        joukko = new IntJoukko(4, 2);
        joukko.lisaa(10);
        joukko.lisaa(3);
    }
}
