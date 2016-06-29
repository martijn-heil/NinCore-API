package tk.martijn_heil.nincore.api.entity;


import org.bukkit.command.ConsoleCommandSender;
import org.jetbrains.annotations.NotNull;
import tk.martijn_heil.nincore.api.messaging.MessageRecipient;

public interface NinConsoleCommandSender extends MessageRecipient
{


    /**
     * Get the ConsoleCommandSender
     *
     * @deprecated Use {@link NinConsoleCommandSender#toConsoleCommandSender()}
     *
     * @return The ConsoleCommandSender
     */
    @Deprecated
    @NotNull
    ConsoleCommandSender getConsoleCommandSender();

    /**
     * Get the {@link ConsoleCommandSender}
     *
     * @return The {@link ConsoleCommandSender}
     */
    ConsoleCommandSender toConsoleCommandSender();
}
