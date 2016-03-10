package me.ninjoh.nincore.api.exceptions.validationexceptions;

import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import me.ninjoh.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;

import java.util.ResourceBundle;

public class InvalidCommandSenderException extends ValidationException
{
    public InvalidCommandSenderException(CommandSender commandSender)
    {
        super(commandSender, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("lang.messages",
                NinCore.getImplementation().getNinCommandSender(commandSender).getMinecraftLocale().
                        toLocale()), "error.InvalidCommandSender"), null);
    }
}
