package me.ninjoh.nincore.api.logging;


import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.util.TextUtils;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLogger;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogRecord;


public class NinPluginLogger extends PluginLogger
{
    private String prefix;
    private static final Map<Level, ChatColor> levelColors = new HashMap<>();


    static
    {
        levelColors.put(Level.INFO, LogColor.INFO.toChatColor());
        levelColors.put(Level.CONFIG, LogColor.INFO.toChatColor());
        levelColors.put(Level.WARNING, LogColor.BAD.toChatColor());
        levelColors.put(Level.SEVERE, LogColor.VERY_BAD.toChatColor());
        levelColors.put(Level.FINE, null);
        levelColors.put(Level.FINER, null);
        levelColors.put(Level.FINEST, null);
    }


    public NinPluginLogger(Plugin context)
    {
        super(context);
        String prefix = context.getDescription().getPrefix();

        this.prefix = prefix != null ? ChatColor.DARK_AQUA + "[" + ChatColor.AQUA + prefix + ChatColor.DARK_AQUA + "] " : ChatColor.DARK_AQUA + "[" + ChatColor.AQUA + context.getDescription().getName() + ChatColor.DARK_AQUA + "] ";

        this.setParent(context.getServer().getLogger());
        this.setLevel(Level.ALL);
    }


    public void log(LogRecord logRecord)
    {
        String message = logRecord.getMessage();

        if(NinCore.get().consoleIsAnsiSupported())
        {
            if(!message.equals("") && levelColors.get(logRecord.getLevel()) != null)
            {
                message = levelColors.get(logRecord.getLevel()) + message;
                message = message.replace(ChatColor.RESET.toString(), levelColors.get(logRecord.getLevel()).toString());
            }

            logRecord.setMessage(TextUtils.ChatColorToAnsi(this.prefix) + TextUtils.ChatColorToAnsi(message) + TextUtils.ChatColorToAnsi(ChatColor.RESET.toString()));
        }
        else
        {
            logRecord.setMessage(TextUtils.removeChatColors(this.prefix) + TextUtils.removeChatColors(message));
        }

        super.getParent().log(logRecord);
    }
}
