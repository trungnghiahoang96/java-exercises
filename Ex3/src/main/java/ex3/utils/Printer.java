package ex3.utils;

import ex3.Team;
import ex3.types.SportType;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public final class Printer {
    public void printWithOrder(final List<Team> listOfTeam, final SportType sportType) {

        List<Team> sortedTeam = listOfTeam.stream()
                .filter(team -> team.getSportType() == sportType)
                .sorted(Comparator.comparingInt(Team::getPoints))
                .collect(Collectors.toList());

        System.out.println(sortedTeam);
    }
}
