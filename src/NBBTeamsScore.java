import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NBBTeamsScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do arquivo de dados: ");
        String fileName = scanner.next();

        System.out.print("Informe o tamanho do ranking ou 0 para encerrar: ");
        int option = scanner.nextInt();

        if (option == 0) {
            System.exit(0);
        }

        String contents = readFile(fileName);
        List<MatchResults> matches = loadMatchResults(contents);
        ScoreTable scoreTable = computeScores(matches);

        scoreTable.getRanking(option).forEach(NBBTeamsScore::printTeamScore);
    }

    private static ScoreTable computeScores(List<MatchResults> matches) {
        ScoreTable ranking = new ScoreTable();
        matches.forEach(ranking::accountMatchResults);
        return ranking;
    }

    public static String readFile(String fileName) {
        String content = null;
        try {
            content = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Arquivo não encontrado.");
        }
        return content;
    }

    public static List<MatchResults> loadMatchResults(String data) {
        return Arrays.stream(data.split("\\r?\\n"))
                .filter(MatchResults::isInputValid)
                .map(MatchResults::of)
                .toList();
    }

    private static void printTeamScore(String team, TeamScore score) {
        System.out.println(team + ", " + score.getVictories() + " vitórias, " + score.getScore() + " pontos.");
    }
}

