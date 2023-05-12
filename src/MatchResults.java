import java.util.Objects;
import java.util.regex.Pattern;

public class MatchResults {

    private static final Pattern INPUT_PATTERN = Pattern.compile("(\\d{2}\\.\\d{2}\\. \\d{2}:\\d{2})/(.+)/(.+)/([0-9]+)/([0-9]+)");

    private String team1;
    private int team1Score;
    private String team2;
    private int team2Score;

    public static boolean isInputValid(String input) {
        return INPUT_PATTERN.matcher(input).matches();
    }

    public static MatchResults of(String input) {
        if (!isInputValid(input)) {
            throw new IllegalArgumentException("Invalid input: " + input);
        }
        return parse(input);
    }

    private static MatchResults parse(String line) {
        if (!isInputValid(line)) {
            throw new IllegalArgumentException("Invalid input: " + line);
        }
        String[] parts = line.split("/");
        String team1 = parts[1];
        int team1Score = Integer.parseInt(parts[3]);
        String team2 = parts[2];
        int team2Score = Integer.parseInt(parts[4]);
        return new MatchResults(team1, team1Score, team2, team2Score);
    }

    public MatchResults(String team1, int team1Score, String team2, int team2Score) {
        this.team1 = team1;
        this.team1Score = team1Score;
        this.team2 = team2;
        this.team2Score = team2Score;
    }

    public String getTeam1() {
        return team1;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public String getTeam2() {
        return team2;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchResults that = (MatchResults) o;
        return team1Score == that.team1Score && team2Score == that.team2Score && Objects.equals(team1, that.team1) && Objects.equals(team2, that.team2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team1, team1Score, team2, team2Score);
    }

    @Override
    public String toString() {
        return "MatchResults{" +
                "team1='" + team1 + '\'' +
                ", team1Score=" + team1Score +
                ", team2='" + team2 + '\'' +
                ", team2Score=" + team2Score +
                '}';
    }
}