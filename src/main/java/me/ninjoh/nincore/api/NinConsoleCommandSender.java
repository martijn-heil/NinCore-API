package me.ninjoh.nincore.api;


import org.bukkit.command.ConsoleCommandSender;

public interface NinConsoleCommandSender extends CanReceiveChatMessage
{


    /**
     * Get the ConsoleCommandSender
     *
     * @return The ConsoleCommandSender
     */
    ConsoleCommandSender getConsoleCommandSender();
}
