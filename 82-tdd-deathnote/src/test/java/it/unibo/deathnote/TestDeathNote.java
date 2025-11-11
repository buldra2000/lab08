package it.unibo.deathnote;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import it.unibo.deathnote.api.DeathNote;
import it.unibo.deathnote.api.DeathNoteImpl;

class TestDeathNote {

    final static int ZERO = 0;
    final static int NEGATIVE = -1000;

    @Test
    public void RuleNumberZero(){
        DeathNote note = new DeathNoteImpl();

        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            note.getRule(ZERO);
        });

        assertFalse(e.getMessage().isEmpty(), "Message Empty");
        assertFalse(e.getMessage().isBlank(), "Not Exist Rule 0");
    }

    @Test
    public void RuleNumberNegative(){
        DeathNote note = new DeathNoteImpl();

        for(int rule = ZERO; rule <= NEGATIVE; rule--){
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            note.getRule(-1);
        });

        assertFalse(e.getMessage().isEmpty(), "Message Empty");
        assertFalse(e.getMessage().isBlank(), "Not Exist Negative Rules");
        }
    }
}