package ex3;

import ex3.types.SportType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketballTeamTest {
    private BasketballTeam basketballTeamTest;

    @BeforeEach
    void setUp() {
        basketballTeamTest = new BasketballTeam("Cloud9", 0);
    }

    @Test
    void updatePointsWinCase() {
        basketballTeamTest.updatePoints("Win");
        assertEquals(2, basketballTeamTest.getPoints());
    }

    @Test
    void getSportType() {
        assertEquals("Basketball", SportType.Basketball.name());
    }
}