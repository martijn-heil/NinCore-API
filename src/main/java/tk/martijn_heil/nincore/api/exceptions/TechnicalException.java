package tk.martijn_heil.nincore.api.exceptions;


import org.jetbrains.annotations.Nullable;

import java.util.logging.Level;

public class TechnicalException extends RuntimeException
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


    public TechnicalException()
    {
    }


    @Nullable
    public Level getLogLevel()
    {
        return this.logLevel;
    }
}
