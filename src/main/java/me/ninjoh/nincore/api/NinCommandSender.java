package me.ninjoh.nincore.api;


import org.bukkit.command.CommandSender;

public interface NinCommandSender extends CanReceiveChatMessage
{
    CommandSender getCommandSender();
}
