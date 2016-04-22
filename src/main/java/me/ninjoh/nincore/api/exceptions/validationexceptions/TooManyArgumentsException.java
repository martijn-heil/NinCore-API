package me.ninjoh.nincore.api.exceptions.validationexceptions;

import me.ninjoh.nincore.api.entity.NinCommandSender;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import me.ninjoh.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;

import java.util.ResourceBundle;

public class TooManyArgumentsException extends ValidationException
{
    public TooManyArgumentsException(CommandSender commandSender)
    {
        super(commandSender, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("me.ninjoh.nincore.api.res.messages",
                NinCommandSender.fromCommandSender(commandSender).getMinecraftLocale().
                        toLocale()), "error.TooManyArguments"), null);
    }
}