import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {
    Battle battle;

    @BeforeEach
    public void beforeBattle() {
        battle = new Battle();
    }

    @Test
    public void testEmptyText() {

        String battle = this.battle.battle("", "");
        assertEquals("justUpperCas", battle);
    }
    @Test
    public void testTeamsEqual() {
        String battle1 = this.battle.battle("ONE", "NEO");
        assertEquals("Tie!", battle1);
        String battle2 = this.battle.battle("FIVE", "EVIF");
        assertEquals("Tie!", battle2);
        String battle3 = this.battle.battle("TWO", "OWT");
        assertEquals("Tie!", battle3);
    }
    @Test
    public void testTeamTwoWin() {
        String battle1 = this.battle.battle("ONE", "TWO");
        assertEquals("TWO", battle1);
        String battle2 = this.battle.battle("FIVE", "THREE");
        assertEquals("THREE", battle2);
        String battle3 = this.battle.battle("TWO", "THREE");
        assertEquals("THREE", battle3);
    }
    @Test
    public void testTeamOneWin() {
        String battle1 = this.battle.battle("TWO", "ONE");
        assertEquals("TWO", battle1);
        String battle2 = this.battle.battle("THREE", "FIVE");
        assertEquals("THREE", battle2);
        String battle3 = this.battle.battle("THREE", "TWO");
        assertEquals("THREE", battle3);
    }

}