package me.ninjoh.nincore.api.exceptions.validationexceptions;


import me.ninjoh.nincore.api.entity.NinCommandSender;
import me.ninjoh.nincore.api.exceptions.ValidationException;
import me.ninjoh.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;

import java.util.ResourceBundle;

public class NotEnoughArgumentsException extends ValidationException
{
    public NotEnoughArgumentsException(CommandSender commandSender)
    {
        super(commandSender, TranslationUtils.getStaticMsg(ResourceBundle.getBundle("me.ninjoh.nincore.api.res.messages",
                NinCommandSender.fromCommandSender(commandSender).getMinecraftLocale().
                        toLocale()), "error.NotEnoughArguments"), null);
    }
}
