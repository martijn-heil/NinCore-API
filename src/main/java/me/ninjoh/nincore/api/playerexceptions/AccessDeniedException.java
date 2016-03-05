package me.ninjoh.nincore.api.playerexceptions;

import me.ninjoh.nincore.api.ExceptionMessageForCommandSender;
import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.util.MessageUtil;
import me.ninjoh.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;
import java.util.ResourceBundle;

public class AccessDeniedException implements ExceptionMessageForCommandSender
{
    public AccessDeniedException(CommandSender commandSender)
    {
        Locale locale;

        if(commandSender instanceof Player)
        {
            locale = NinCore.getImplementation().getNinPlayer((Player) commandSender).getMinecraftLocale().toLocale();
        }
        else
        {
            locale = NinCore.getImplementation().getDefaultMinecraftLocale().toLocale();
        }

        MessageUtil.sendError(commandSender,
                TranslationUtils.getStaticMsg(ResourceBundle.getBundle("lang.messages", locale), "error.AccessDenied"));
    }
}
