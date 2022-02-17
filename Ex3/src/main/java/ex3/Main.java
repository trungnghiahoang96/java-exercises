package ex3;

import ex3.types.SportType;
import ex3.utils.Printer;
import ex3.utils.TeamCSVParser;
import ex3.utils.Updater;


import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String RESOURCES = "src/main/resources/";

        Path teamsCSV = Paths.get(RESOURCES + "input/teams.csv");
        Path resutlsCSV = Paths.get(RESOURCES + "input/results.csv");


        TeamCSVParser teamCSVParser = new TeamCSVParser();

        // Load teams.csv for creating a list of all team
        List<Team> listOfTeam = teamCSVParser.parseLinesFromCSV(teamsCSV);


        // Task 1: print football and basketball team ordering by points
        Printer printer = new Printer();

        // print football team with order
        printer.printWithOrder(listOfTeam, SportType.Football);

        // print basketball team with order
        printer.printWithOrder(listOfTeam, SportType.Basketball);


        // Task 2: load results.csv file to update result and print
        Updater updater = new Updater();
        updater.updateFromResultsCSV(listOfTeam, resutlsCSV);

        // print football team with new order after update
        printer.printWithOrder(listOfTeam, SportType.Football);

        // print basketball team with new order after update
        printer.printWithOrder(listOfTeam, SportType.Basketball);

    }
}
