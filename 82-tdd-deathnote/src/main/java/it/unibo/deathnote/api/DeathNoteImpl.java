package it.unibo.deathnote.api;

public class DeathNoteImpl implements DeathNote{

    @Override
    public String getDeathCause(String name) {
        throw new IllegalArgumentException("Error");
    }

    @Override
    public String getDeathDetails(String name) {
        throw new IllegalArgumentException("Error");
    }

    @Override
    public String getRule(int ruleNumber) {
        
        throw new IllegalArgumentException("Error");
    }

    @Override
    public boolean isNameWritten(String name) {
        throw new IllegalArgumentException("Error");
    }

    @Override
    public boolean writeDeathCause(String cause) {
        throw new IllegalArgumentException("Error");
    }

    @Override
    public boolean writeDetails(String details) {
        throw new IllegalArgumentException("Error");
    }

    @Override
    public void writeName(String name) {
        throw new IllegalArgumentException("Error");
    }
}