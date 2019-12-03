package statistics.matcher;

import statistics.Player;

public class Not implements Matcher {

    private Matcher matcher;

    public Not(Matcher match) {
        matcher = match;
    }

    @Override
    public boolean matches(Player p) {
        return !this.matcher.matches(p);
    }
}