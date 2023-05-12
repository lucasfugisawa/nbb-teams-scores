import java.time.LocalDateTime;
import java.util.*;

public class ScoreTable {

    private final LinkedHashMap<String, TeamScore> scoreTable = new LinkedHashMap<>();
    private final LinkedList<MatchResults> matchResults = new LinkedList<>();

    private final LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    public ScoreTable accountMatchResults(MatchResults results) {

        scoreTable.merge(results.getTeam1(),
                new TeamScore(
                        results.getTeam1(),
                        results.getTeam1Score(),
                        (results.getTeam1Score() > results.getTeam2Score()) ? 1 : 0
                ),
                (currentTeamScore, newTeamScore) -> {
                    currentTeamScore.addScore(results.getTeam1Score());
                    currentTeamScore.addVictories(newTeamScore.getVictories());
                    return currentTeamScore;
                }
        );

        scoreTable.merge(results.getTeam2(),
                new TeamScore(
                        results.getTeam2(),
                        results.getTeam2Score(),
                        (results.getTeam2Score() > results.getTeam1Score()) ? 1 : 0
                ),
                (currentTeamScore, newTeamScore) -> {
                    currentTeamScore.addScore(results.getTeam2Score());
                    currentTeamScore.addVictories(newTeamScore.getVictories());
                    return currentTeamScore;
                }
        );

        matchResults.add(results);
        this.updatedAt = LocalDateTime.now();
        return this;
    }

    public Map<String, TeamScore> getScoreTable() {
        return Collections.unmodifiableMap(scoreTable);
    }

    public List<MatchResults> getAccountedMatchResults() {
        return Collections.unmodifiableList(matchResults);
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LinkedHashMap<String, TeamScore> getRanking(long maxResults) {
        return scoreTable.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(
                        Comparator.comparing(TeamScore::getVictories)
                                .thenComparing(TeamScore::getScore)
                                .reversed()))
                .limit(maxResults)
                .collect(
                        LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll
                );
    }

    public LinkedHashMap<String, TeamScore> getRanking() {
        return getRanking(scoreTable.size());
    }

    @Override
    public String toString() {
        return "ScoreTable{" +
                "scoreTable=" + scoreTable +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}