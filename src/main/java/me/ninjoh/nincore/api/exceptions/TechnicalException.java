package me.ninjoh.nincore.api.exceptions;


import java.util.logging.Level;

public class TechnicalException extends Exception
{
    private Level logLevel;

    public TechnicalException(String message)
    {
        super(message);
    }


    public TechnicalException(String logMessage, Level logLevel)
    {
        super(logMessage);
        this.logLevel = logLevel;
    }


    public TechnicalException() {}


    public Level getLogLevel()
    {
        return this.logLevel;
    }
}
