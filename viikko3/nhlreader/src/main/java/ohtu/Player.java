
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private int goals;
    private int assists;
    private String nationality;
    private String team;
    private String penalties;
    private String birthdate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return name + " team " + team
                + " goals: " + goals
                + " assists: "
                +  assists + " penalties: " + penalties + " nationality " + nationality + " birthDate: " + birthdate;
    }

    @Override
    public int compareTo(Player player) {
            if(this.getGoals() + this.getAssists() > player.getGoals() + player.getAssists())
                return -1;
            else if (this.getGoals() + this.getAssists() == player.getGoals() + player.getAssists())
                return 0 ;
            return 1 ;
        }

}
