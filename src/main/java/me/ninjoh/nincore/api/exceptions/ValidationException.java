package me.ninjoh.nincore.api.exceptions;


import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValidationException extends Exception
{
    @Nullable  private String logMessage;
    private String playerMessage;
    private CommandSender target;

    public ValidationException(@NotNull CommandSender target,@NotNull String playerMessage, @Nullable String logMessage)
    {
        super(logMessage); // The technical internal log message will be sent up the chain.
        this.logMessage = logMessage;
        this.playerMessage = playerMessage;
        this.target = target;
    }


    @Nullable
    public String getLogMessage()
    {
        return this.logMessage;
    }


    @NotNull
    public CommandSender getTarget()
    {
        return this.target;
    }


    @NotNull
    public String getPlayerMessage()
    {
        return this.playerMessage;
    }
}
