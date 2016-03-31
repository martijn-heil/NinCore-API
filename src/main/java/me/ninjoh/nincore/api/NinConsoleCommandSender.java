package me.ninjoh.nincore.api;


import org.bukkit.command.ConsoleCommandSender;
import org.jetbrains.annotations.NotNull;

public interface NinConsoleCommandSender extends CanReceiveChatMessage
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
