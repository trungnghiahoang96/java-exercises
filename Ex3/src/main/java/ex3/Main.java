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
        Path resultsCSV = Paths.get(RESOURCES + "input/results.csv");



        // Load teams.csv for creating a list of all team
        List<Team> listOfTeam = TeamCSVParser.parseLinesFromCSV(teamsCSV);


        // Task 1: print football and basketball team ordering by points

        // print football team with order
        System.out.println("Football team order by points before update: ");
        Printer.printWithOrder(listOfTeam, SportType.Football);

        // print basketball team with order
        System.out.println("Basketball team order by points before update: ");
        Printer.printWithOrder(listOfTeam, SportType.Basketball);


        // Task 2: load results.csv file to update result and print

        List<Team> listOfUpdatedTeam = Updater.updateFromResultsCSV(listOfTeam, resultsCSV);

        // print football team with new order after update
        System.out.println("Football team order by points after update: ");
        Printer.printWithOrder(listOfUpdatedTeam, SportType.Football);

        // print basketball team with new order after update
        System.out.println("Basketball team order by points after update: ");
        Printer.printWithOrder(listOfUpdatedTeam, SportType.Basketball);

    }
}
