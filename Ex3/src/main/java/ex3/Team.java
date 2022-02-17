package ex3;

import ex3.types.SportType;

public interface Team {
    void updatePoints(String result);

    String getTeamName();

    Integer getPoints();

    SportType getSportType();

}
