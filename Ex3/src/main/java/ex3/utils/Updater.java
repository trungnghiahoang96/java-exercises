package ex3.utils;

import ex3.Team;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class Updater {

    public void updateOneTeam(final String resultRecord, List<Team> listOfTeam) {
        final String[] resultColumn = resultRecord.split(",");
        listOfTeam.stream().forEach(team -> {
            if (team.getTeamName().equals(resultColumn[0])) {
                team.updatePoints(resultColumn[1]);
            }
        });
    }

    public void updateFromResultsCSV(final List<Team> listOfTeam, final Path inputPath) throws IOException {
        final List<String> recordsOfResult = Files.readAllLines(inputPath);
        recordsOfResult.stream().forEach(resultRecord -> updateOneTeam(resultRecord, listOfTeam));

    }

}
