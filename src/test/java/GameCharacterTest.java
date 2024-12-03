import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCharacterTest {
    @Test
    void testInitialCharacterState() {
        GameCharacter myPlayer = new GameCharacter();
        assertEquals("Healthy", myPlayer.getState());
    }
    @Test
    void testDamagedCharacterState() {
        GameCharacter myPlayer = new GameCharacter();
        myPlayer.takeDamage(50);
        assertEquals("Injured", myPlayer.getState());
    }
    @Test
    void testHealing() {
        GameCharacter myPlayer = new GameCharacter();
        myPlayer.takeDamage(50);
        myPlayer.heal();
        assertEquals(70, myPlayer.getHealth());
    }
    @Test
    void testEliminatedCharacterState() {
        GameCharacter myPlayer = new GameCharacter();
        myPlayer.takeDamage(100);
        assertEquals("Eliminated", myPlayer.getState());
    }
}