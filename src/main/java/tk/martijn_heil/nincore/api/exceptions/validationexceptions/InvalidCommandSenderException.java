package tk.martijn_heil.nincore.api.exceptions.validationexceptions;

import tk.martijn_heil.nincore.api.MessageRecipient;
import tk.martijn_heil.nincore.api.entity.NinCommandSender;
import tk.martijn_heil.nincore.api.exceptions.ValidationException;
import tk.martijn_heil.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;

import java.util.ResourceBundle;

public class InvalidCommandSenderException extends ValidationException
{
    public InvalidCommandSenderException(CommandSender commandSender)
    {
        super(commandSender, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("tk.martijn_heil.nincore.api.res.messages",
                NinCommandSender.fromCommandSender(commandSender).getMinecraftLocale().
                        toLocale()), "error.InvalidCommandSender"), null);
    }


    public InvalidCommandSenderException(MessageRecipient target)
    {
        super(target, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("tk.martijn_heil.nincore.api.res.messages",
                target.getMinecraftLocale().
                        toLocale()), "error.InvalidCommandSender"), null);
    }
}
