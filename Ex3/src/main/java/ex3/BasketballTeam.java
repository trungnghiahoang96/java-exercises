package ex3;

import ex3.types.SportType;

public class BasketballTeam implements Team {
    private String teamName;
    private Integer points;
    private SportType sportType;


    public BasketballTeam(String teamName, Integer points) {
        this.teamName = teamName;
        this.points = points;
        this.sportType = SportType.Basketball;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    @Override
    public SportType getSportType() {
        return sportType;
    }

    @Override
    public void updatePoints(String result) {
        switch (result) {
            case "Win":
                points += 2;
                break;
        }
    }



    @Override
    public String toString() {
        return String.format("%-20s | %-7d ", teamName, points);
    }
}
