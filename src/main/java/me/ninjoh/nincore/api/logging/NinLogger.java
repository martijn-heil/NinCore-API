package me.ninjoh.nincore.api.logging;


import me.ninjoh.nincore.api.NinCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.libs.jline.Terminal;
import org.bukkit.craftbukkit.v1_9_R1.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Attribute;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class NinLogger
{
    private final JavaPlugin plugin;
    private static final Terminal terminal;
    private static final Map<ChatColor, String> replacements = new EnumMap<>(ChatColor.class);
    private static final Map<Level, ChatColor> levelColors = new HashMap<>();
    private String prefix;


    static
    {
        terminal = ((CraftServer) Bukkit.getServer()).getReader().getTerminal();

        replacements.put(ChatColor.BLACK, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.BLACK).boldOff().toString());
        replacements.put(ChatColor.DARK_BLUE, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.BLUE).boldOff().toString());
        replacements.put(ChatColor.DARK_GREEN, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.GREEN).boldOff().toString());
        replacements.put(ChatColor.DARK_AQUA, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.CYAN).boldOff().toString());
        replacements.put(ChatColor.DARK_RED, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.RED).boldOff().toString());
        replacements.put(ChatColor.DARK_PURPLE, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.MAGENTA).boldOff().toString());
        replacements.put(ChatColor.GOLD, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.YELLOW).boldOff().toString());
        replacements.put(ChatColor.GRAY, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.WHITE).boldOff().toString());
        replacements.put(ChatColor.DARK_GRAY, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.BLACK).bold().toString());
        replacements.put(ChatColor.BLUE, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.BLUE).bold().toString());
        replacements.put(ChatColor.GREEN, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.GREEN).bold().toString());
        replacements.put(ChatColor.AQUA, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.CYAN).bold().toString());
        replacements.put(ChatColor.RED, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.RED).bold().toString());
        replacements.put(ChatColor.LIGHT_PURPLE, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.MAGENTA).bold().toString());
        replacements.put(ChatColor.YELLOW, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.YELLOW).bold().toString());
        replacements.put(ChatColor.WHITE, Ansi.ansi().a(Attribute.RESET).fg(Ansi.Color.WHITE).bold().toString());
        replacements.put(ChatColor.MAGIC, Ansi.ansi().a(Attribute.BLINK_SLOW).toString());
        replacements.put(ChatColor.BOLD, Ansi.ansi().a(Attribute.UNDERLINE_DOUBLE).toString());
        replacements.put(ChatColor.STRIKETHROUGH, Ansi.ansi().a(Attribute.STRIKETHROUGH_ON).toString());
        replacements.put(ChatColor.UNDERLINE, Ansi.ansi().a(Attribute.UNDERLINE).toString());
        replacements.put(ChatColor.ITALIC, Ansi.ansi().a(Attribute.ITALIC).toString());
        replacements.put(ChatColor.RESET, Ansi.ansi().a(Attribute.RESET).toString());

        levelColors.put(Level.INFO, LogColor.INFO.toChatColor());
        levelColors.put(Level.WARNING, LogColor.BAD.toChatColor());
        levelColors.put(Level.SEVERE, LogColor.VERY_BAD.toChatColor());
        levelColors.put(Level.FINE, null);
        levelColors.put(Level.FINER, null);
        levelColors.put(Level.FINEST, null);
    }


    public NinLogger(JavaPlugin plugin)
    {
        this.plugin = plugin;

        prefix = ((plugin.getDescription().getPrefix() != null) ?
                plugin.getDescription().getPrefix() : "[" + plugin.getDescription().getName() + "]");

        prefix = prefix.replace("[", ChatColor.DARK_AQUA + "[" + ChatColor.AQUA);
        prefix = prefix.replace("]", ChatColor.DARK_AQUA + "]" + ChatColor.RESET);
    }


    public void info(String msg)
    {
        this.log(Level.INFO, msg);
    }


    public void warning(String msg)
    {
        this.log(Level.WARNING, msg);
    }


    public void severe(String msg)
    {
        this.log(Level.SEVERE, msg);
    }


    public void fine(String msg)
    {
        this.log(Level.FINE, msg);
    }


    public void finer(String msg)
    {
        this.log(Level.FINER, msg);
    }


    public void finest(String msg)
    {
        this.log(Level.FINEST, msg);
    }


    public void config(String msg)
    {
        this.log(Level.CONFIG, msg);
    }


    public void log(Level level, String msg)
    {
        String result = msg;

        if(!result.equals("")) result = levelColors.get(level) + result;

        result = result.replace(ChatColor.RESET.toString(), levelColors.get(level).toString());


        // The NinCore implementation may not be initialized yet at this point in execution.
        if (terminal.isAnsiSupported() &&
                (NinCore.getImplementation() == null || NinCore.getImplementation().useColoredLogging()))
        {
            result = prefix + " " + result;

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

            plugin.getLogger().log(level, result);
        }
    }
}
