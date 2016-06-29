package tk.martijn_heil.nincore.api.exceptions;


import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.martijn_heil.nincore.api.NinCore;
import tk.martijn_heil.nincore.api.messaging.MessageRecipient;

public class ValidationException extends Exception
{
    @Nullable   private String logMessage;
    @NotNull    private String playerMessage;
    @NotNull    private MessageRecipient target;


    public ValidationException(@NotNull CommandSender target, @NotNull String playerMessage, @Nullable String logMessage)
    {
        super(logMessage); // The technical internal log message will be sent up the chain.
        this.logMessage = logMessage;
        this.playerMessage = playerMessage;
        this.target = NinCore.get().getEntityManager().getNinCommandSender(target);
    }


    public ValidationException(@NotNull MessageRecipient target, @NotNull String playerMessage, @Nullable String logMessage)
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
    public MessageRecipient getTarget()
    {
        return this.target;
    }


    @NotNull
    public String getPlayerMessage()
    {
        return this.playerMessage;
    }
}
