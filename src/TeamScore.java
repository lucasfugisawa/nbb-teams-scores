import java.util.Objects;

public class TeamScore {

    private String teamName;
    private Integer score = 0;
    private Integer victories = 0;

    public TeamScore(String teamName) {
        this.teamName = teamName;
    }

    public TeamScore(String teamName, Integer score, Integer victories) {
        this.teamName = teamName;
        this.score = score;
        this.victories = victories;
    }

    public Integer getScore() {
        return score;
    }

    public void addScore(Integer score) {
        this.score += score;
    }

    public Integer getVictories() {
        return victories;
    }

    public void addVictories(Integer victories) {
        this.victories += victories;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setVictories(Integer victories) {
        this.victories = victories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamScore teamScore = (TeamScore) o;
        return Objects.equals(teamName, teamScore.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    @Override
    public String toString() {
        return "TeamScore{" +
                "teamName='" + teamName + '\'' +
                ", score=" + score +
                ", victories=" + victories +
                '}';
    }
}
