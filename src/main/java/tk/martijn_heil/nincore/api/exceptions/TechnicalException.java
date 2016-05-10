package tk.martijn_heil.nincore.api.exceptions;


import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class TechnicalException extends RuntimeException
{
    private Level logLevel;


    public TechnicalException(String message)
    {
        super(message);
    }


    public TechnicalException(@NotNull String logMessage, @NotNull Level logLevel)
    {
        super(logMessage);
        this.logLevel = logLevel;
    }


    public TechnicalException()
    {
    }


    public Level getLogLevel()
    {
        return this.logLevel;
    }
}
