package ex3;

import ex3.types.SportType;

public class FootballTeam implements Team {
    private String teamName;
    private Integer points;
    private String sponsor;
    private SportType sportType;


    public FootballTeam(String teamName, Integer points, String sponsor) {
        this.teamName = teamName;
        this.points = points;
        this.sponsor = sponsor;
        this.sportType = SportType.Football;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    public String getSponsor() {
        return sponsor;
    }

    public SportType getSportType() {
        return sportType;
    }

    @Override
    public void updatePoints(String result) {
        switch (result) {
            case "Win":
                points += 3;
                break;
            case "Drawn":
                points += 1;
                break;
        }
    }



    @Override
    public String toString() {
        return String.format("%-20s | %-7d | %s", teamName, points, sponsor);
    }
}
