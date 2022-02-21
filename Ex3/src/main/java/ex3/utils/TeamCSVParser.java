package ex3.utils;

import ex3.BasketballTeam;
import ex3.FootballTeam;
import ex3.Team;
import ex3.types.SportType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;

import static java.util.stream.Collectors.toList;


public final class TeamCSVParser {


    public static Team parseLine(final String line) {
        final String[] columns = line.split(",");

        final String sportType = columns[0];
        final String teamName = columns[1];
        final int points = Integer.parseInt(columns[2]);

        Team createdTeam = null;
        if (sportType.equals(SportType.Football.name())) {
            String sponsor = columns[3];
            createdTeam = new FootballTeam(teamName, points, sponsor);
        }
        if (sportType.equals(SportType.Basketball.name())) {
            createdTeam = new BasketballTeam(teamName, points);
        }
        return createdTeam;
    }

    public static List<Team> parseLinesFromCSV(final Path inputPath) throws IOException {
        final List<String> lines = Files.readAllLines(inputPath);
        return lines.stream().map(TeamCSVParser::parseLine).collect(toList());
    }

}

