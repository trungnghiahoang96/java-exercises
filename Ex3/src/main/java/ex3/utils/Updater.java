package ex3.utils;

import ex3.Team;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public final class Updater {

    
    /**
     * @param listOfTeam
     * @param inputPath
     * @return list of updated team after match results from CSV file
     */
    public static List<Team> updateFromResultsCSV(final List<Team> listOfTeam, final Path inputPath) throws IOException {
        final List<String> recordsOfResult = Files.readAllLines(inputPath);
        return listOfTeam.stream().peek(team -> recordsOfResult.forEach(record -> {
                    final String[] resultRow = record.split(",");
                    String teamName = resultRow[0];
                    String resultMatch = resultRow[1];
                    if (team.getTeamName().equals(teamName)) team.updatePoints(resultMatch);
                }

        )).collect(Collectors.toList());

    }

}
