package me.ninjoh.nincore.api;


import org.bukkit.command.ConsoleCommandSender;
import org.jetbrains.annotations.NotNull;

public interface NinConsoleCommandSender extends CanReceiveChatMessage
{


    /**
     * Get the ConsoleCommandSender
     *
     * @return The ConsoleCommandSender
     */
    @NotNull
    ConsoleCommandSender getConsoleCommandSender();
}
