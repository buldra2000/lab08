package it.unibo.deathnote.api;

public class DeathNoteImpl implements DeathNote{

    private String name;
    private String lastName;
    private String details;
    private String cause;
    private String deathCause;
    private String deathDetails;

    @Override
    public String getDeathCause(String name) {

        if(cause == null || cause.isBlank()){
            throw new IllegalArgumentException("Error");
        }

        return this.deathCause;
        
    }

    @Override
    public String getDeathDetails(String name) {
        
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Error");
        }

        return this.deathDetails;
    }

    @Override
    public String getRule(int ruleNumber) {
        
        if(ruleNumber <= 0 || ruleNumber > RULES.size()){
            throw new IllegalArgumentException("Error");
        }
        
        return RULES.get(ruleNumber - 1);
    }

    @Override
    public boolean isNameWritten(String name) {
        throw new IllegalArgumentException("Error");
    }

    @Override
    public boolean writeDeathCause(String cause) {
        
        if(cause == null || cause.isBlank()){
             throw new IllegalArgumentException("Error");
        }
        this.cause = cause;
        return true;
    }

    @Override
    public boolean writeDetails(String details) {

        if(details == null || details.isBlank()){
            throw new IllegalArgumentException("Error");
        }

       this.details = details;
       return true;
    }

    @Override
    public void writeName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Error");
        }

        this.lastName = name;
        this.details = null;
        this.cause = null;
    }
}