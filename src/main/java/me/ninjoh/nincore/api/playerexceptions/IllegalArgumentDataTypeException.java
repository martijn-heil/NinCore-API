package me.ninjoh.nincore.api.playerexceptions;


import me.ninjoh.nincore.api.ExceptionMessageForCommandSender;
import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.util.MessageUtil;
import me.ninjoh.nincore.api.util.TranslationUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class IllegalArgumentDataTypeException implements ExceptionMessageForCommandSender
{

    public IllegalArgumentDataTypeException(CommandSender commandSender, String type, String actualValue)
    {
        Locale locale;
        String msg = null;

        if(commandSender instanceof Player)
        {
            locale = NinCore.getImplementation().getNinPlayer((Player) commandSender).getMinecraftLocale().toLocale();
        }
        else
        {
            locale = NinCore.getImplementation().getDefaultMinecraftLocale().toLocale();
        }

        switch(type)
        {
            case("BOOLEAN"):
                Object[] args = {actualValue};
                msg = TranslationUtils.transWithArgs("lang.messages", locale, args, "illegalDataType.BOOLEAN");
                break;

            case("INTEGER"):
                Object[] args2 = {actualValue};
                msg = TranslationUtils.transWithArgs("lang.messages", locale, args2, "illegalDataType.INTEGER");
                break;
        }


        if(msg != null)
        {
            MessageUtil.sendError(commandSender, msg);
        }
    }
}
