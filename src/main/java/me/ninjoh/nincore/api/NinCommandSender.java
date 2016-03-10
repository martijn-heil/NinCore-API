package me.ninjoh.nincore.api;


import org.bukkit.command.CommandSender;

public interface NinCommandSender extends CanReceiveChatMessage
{
    /**
     * Get the related {@link CommandSender}.
     *
     * @return The related {@link CommandSender}
     */
    CommandSender getCommandSender();


    MinecraftLocale getMinecraftLocale();
}
