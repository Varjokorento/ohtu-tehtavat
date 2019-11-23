package ohtu.intjoukkosovellus.joukko;

import ohtu.intjoukkosovellus.joukko.IntJoukko;

public class IntJoukkoUtils {

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        int[] aTaulu = a.toIntArray();
        int[] bTaulu = b.toIntArray();
        for (int value : aTaulu) {
            x.lisaa(value);
        }
        for (int value : bTaulu) {
            x.lisaa(value);
        }
        return x;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko y = new IntJoukko();
        int[] aTaulu = a.toIntArray();
        int[] bTaulu = b.toIntArray();
        for (int value : aTaulu) {
            for (int i : bTaulu) {
                if (value == i) {
                    y.lisaa(i);
                }
            }
        }
        return y;

    }

    public static IntJoukko erotus ( IntJoukko a, IntJoukko b) {
        IntJoukko z = new IntJoukko();
        int[] aTaulu = a.toIntArray();
        int[] bTaulu = b.toIntArray();
        for (int value : aTaulu) {
            z.lisaa(value);
        }
        for (int value : bTaulu) {
            z.poista(value);
        }
        return z;
    }
}
