package me.ninjoh.nincore.api.entity;


import me.ninjoh.nincore.api.CanReceiveChatMessage;
import me.ninjoh.nincore.api.HasLocale;
import me.ninjoh.nincore.api.NinCore;
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

    static NinCommandSender fromCommandSender(CommandSender sender)
    {
        return NinCore.get().getEntityManager().getNinCommandSender(sender);
    }
}
