package statistics.matcher;

import java.util.ArrayList;
import java.util.List;

public class QueryBuilder {

    private List<Matcher> matchers = new ArrayList<>();

    public Matcher build() {
        Matcher allMatchers = new And(matchers.toArray(new Matcher[matchers.size()]));
        this.matchers = new ArrayList<>();
        return allMatchers;
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        this.matchers.add(new Or(matchers));
        return this;
    }

    public QueryBuilder playsIn(String team) {
        this.matchers.add(new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasAtLeast(int score, String fieldName) {
        this.matchers.add(new HasAtLeast(score, fieldName));
        return this;
    }

    public QueryBuilder hasFewerThan(int score, String fieldName) {
        this.matchers.add(new HasFewerThan(score, fieldName));
        return this;
    }
}
