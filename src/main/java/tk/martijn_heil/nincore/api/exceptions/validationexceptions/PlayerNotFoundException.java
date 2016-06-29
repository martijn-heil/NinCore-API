package tk.martijn_heil.nincore.api.exceptions.validationexceptions;

import org.bukkit.command.CommandSender;
import tk.martijn_heil.nincore.api.NinCore;
import tk.martijn_heil.nincore.api.exceptions.ValidationException;
import tk.martijn_heil.nincore.api.messaging.MessageRecipient;
import tk.martijn_heil.nincore.api.util.TranslationUtils;

import java.util.ResourceBundle;

public class PlayerNotFoundException extends ValidationException
{
    public PlayerNotFoundException(CommandSender commandSender)
    {
        super(commandSender, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("tk.martijn_heil.nincore.api.res.messages",
                NinCore.get().getEntityManager().getNinCommandSender(commandSender).getMinecraftLocale().
                        toLocale()), "error.PlayerNotFound"), null);
    }


    public PlayerNotFoundException(MessageRecipient target)
    {
        super(target, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("tk.martijn_heil.nincore.api.res.messages",
                target.getMinecraftLocale().
                        toLocale()), "error.PlayerNotFound"), null);
    }
}
