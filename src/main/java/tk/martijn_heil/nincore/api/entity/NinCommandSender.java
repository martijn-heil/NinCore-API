package tk.martijn_heil.nincore.api.entity;


import tk.martijn_heil.nincore.api.MessageRecipient;
import tk.martijn_heil.nincore.api.HasLocale;
import tk.martijn_heil.nincore.api.NinCore;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public interface NinCommandSender extends MessageRecipient, HasLocale
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
