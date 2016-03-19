package me.ninjoh.nincore.api;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.libs.jline.Terminal;
import org.bukkit.craftbukkit.v1_9_R1.CraftServer;
import org.fusesource.jansi.Ansi;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
public class NinCoreAPILogger
{
    private static final Terminal terminal;
    private static final Map<ChatColor, String> replacements = new EnumMap<>(ChatColor.class);
    private static final Map<Level, ChatColor> levelColors = new HashMap<>();

    private String plainPrefix = "[NinCore-API]";
    private String coloredPrefix;


    static
    {
        terminal = ((CraftServer) Bukkit.getServer()).getReader().getTerminal();

        replacements.put(ChatColor.BLACK, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLACK).boldOff().toString());
        replacements.put(ChatColor.DARK_BLUE, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLUE).boldOff().toString());
        replacements.put(ChatColor.DARK_GREEN, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.GREEN).boldOff().toString());
        replacements.put(ChatColor.DARK_AQUA, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.CYAN).boldOff().toString());
        replacements.put(ChatColor.DARK_RED, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.RED).boldOff().toString());
        replacements.put(ChatColor.DARK_PURPLE, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.MAGENTA).boldOff().toString());
        replacements.put(ChatColor.GOLD, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.YELLOW).boldOff().toString());
        replacements.put(ChatColor.GRAY, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.WHITE).boldOff().toString());
        replacements.put(ChatColor.DARK_GRAY, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLACK).bold().toString());
        replacements.put(ChatColor.BLUE, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLUE).bold().toString());
        replacements.put(ChatColor.GREEN, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.GREEN).bold().toString());
        replacements.put(ChatColor.AQUA, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.CYAN).bold().toString());
        replacements.put(ChatColor.RED, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.RED).bold().toString());
        replacements.put(ChatColor.LIGHT_PURPLE, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.MAGENTA).bold().toString());
        replacements.put(ChatColor.YELLOW, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.YELLOW).bold().toString());
        replacements.put(ChatColor.WHITE, Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.WHITE).bold().toString());
        replacements.put(ChatColor.MAGIC, Ansi.ansi().a(Ansi.Attribute.BLINK_SLOW).toString());
        replacements.put(ChatColor.BOLD, Ansi.ansi().a(Ansi.Attribute.UNDERLINE_DOUBLE).toString());
        replacements.put(ChatColor.STRIKETHROUGH, Ansi.ansi().a(Ansi.Attribute.STRIKETHROUGH_ON).toString());
        replacements.put(ChatColor.UNDERLINE, Ansi.ansi().a(Ansi.Attribute.UNDERLINE).toString());
        replacements.put(ChatColor.ITALIC, Ansi.ansi().a(Ansi.Attribute.ITALIC).toString());
        replacements.put(ChatColor.RESET, Ansi.ansi().a(Ansi.Attribute.RESET).toString());

        levelColors.put(Level.INFO, ChatColor.YELLOW);
        levelColors.put(Level.WARNING, ChatColor.RED);
        levelColors.put(Level.SEVERE, ChatColor.DARK_RED);
        levelColors.put(Level.FINE, null);
        levelColors.put(Level.FINER, null);
        levelColors.put(Level.FINEST, null);
    }


    protected NinCoreAPILogger()
    {
        coloredPrefix = plainPrefix.replace("[", ChatColor.DARK_AQUA + "[" + ChatColor.AQUA);
        coloredPrefix = coloredPrefix.replace("]", ChatColor.DARK_AQUA + "]" + ChatColor.RESET);
    }

    protected void info(String msg)
    {
        this.log(Level.INFO, msg);
    }


    protected void warning(String msg)
    {
        this.log(Level.WARNING, msg);
    }


    protected void severe(String msg)
    {
        this.log(Level.SEVERE, msg);
    }


    protected void fine(String msg)
    {
        this.log(Level.FINE, msg);
    }


    protected void finer(String msg)
    {
        this.log(Level.FINER, msg);
    }


    protected void finest(String msg)
    {
        this.log(Level.FINEST, msg);
    }


    protected void config(String msg)
    {
        this.log(Level.CONFIG, msg);
    }


    protected void log(Level level, String msg)
    {
        String result = msg;

        if(!result.equals("")) result = levelColors.get(level) + result;

        result = result.replace(ChatColor.RESET.toString(), levelColors.get(level).toString());

        if (terminal.isAnsiSupported())
        {
            result = coloredPrefix + " " + result;
            for (ChatColor color : ChatColor.values())
            {
                if (replacements.containsKey(color))
                {
                    result = result.replaceAll("(?i)" + color.toString(), replacements.get(color));
                }
                else
                {
                    result = result.replaceAll("(?i)" + color.toString(), "");
                }
            }

            // plugin.getLogger().log(level, result + Ansi.ansi().reset().toString());
            Bukkit.getLogger().log(level, result + Ansi.ansi().reset().toString());
        }
        else
        {
            for (ChatColor color : ChatColor.values())
            {
                result = result.replaceAll(color.toString(), "");
            }

            Bukkit.getLogger().log(level, plainPrefix + " " + result);
        }
    }
}
