package tk.martijn_heil.nincore.api.entity;


import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import tk.martijn_heil.nincore.api.messaging.MessageRecipient;

public interface NinCommandSender extends MessageRecipient
{
    /**
     * Get the related {@link CommandSender}.
     *
     * @return The related {@link CommandSender}
     */
    @NotNull
    CommandSender toCommandSender();
}
