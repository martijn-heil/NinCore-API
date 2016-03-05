package me.ninjoh.nincore.api.playerexceptions;

import me.ninjoh.nincore.api.ExceptionMessageForCommandSender;
import me.ninjoh.nincore.api.MinecraftLocale;
import me.ninjoh.nincore.api.util.MessageUtil;
import me.ninjoh.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;

import java.util.Locale;
import java.util.ResourceBundle;

public class InvalidCommandSenderException implements ExceptionMessageForCommandSender
{
    public InvalidCommandSenderException(CommandSender commandSender)
    {
        String msg;

        // Sender is never a player.
        Locale locale = MinecraftLocale.getDefault().toLocale();

        msg = TranslationUtils.getStaticMsg(ResourceBundle.getBundle("lang.messages",
                locale), "error.InvalidCommandSender");


        MessageUtil.sendError(commandSender, msg);
    }
}
