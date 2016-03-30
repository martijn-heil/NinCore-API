package me.ninjoh.nincore.api;


import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public interface NinCommandSender extends CanReceiveChatMessage, HasLocale
{
    /**
     * Get the related {@link CommandSender}.
     *
     * @return The related {@link CommandSender}
     */
    @NotNull
    CommandSender toCommandSender();
}
