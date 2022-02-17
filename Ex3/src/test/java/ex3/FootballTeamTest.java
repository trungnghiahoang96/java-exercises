package ex3;

import ex3.types.SportType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballTeamTest {

    private FootballTeam footballTeamTest;

    @BeforeEach
    void setUp() {
        System.out.println("Start testcase ...");
        footballTeamTest = new FootballTeam("Navi", 0, "Navi Inc");
    }

    @Test
    void updatePointsWinCase() {
        footballTeamTest.updatePoints("Win");
        assertEquals(3, footballTeamTest.getPoints());
    }

    @Test
    void updatePointsDrawnCase() {
        footballTeamTest.updatePoints("Drawn");
        assertEquals(1, footballTeamTest.getPoints());
    }

    @Test
    void updatePointsLoseCase() {
        footballTeamTest.updatePoints("Lose");
        assertEquals(0, footballTeamTest.getPoints());
    }

    @Test
    void getSportType() {
        assertEquals("Football", SportType.Football.name());
    }
}