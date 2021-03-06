package tk.martijn_heil.nincore.api.util;

import org.bukkit.ChatColor;
import org.fusesource.jansi.Ansi;
import org.jetbrains.annotations.Contract;

import java.util.EnumMap;
import java.util.Map;

/**
 * Utilities for String manipulation.
 *
 * @author rylinaux
 * @author Ninjoh
 */
public class TextUtils
{

    /**
     * Returns an array of Strings as a single String.
     *
     * @param args  the array
     * @param start the index to start at
     * @return the array as a String
     */
    @Contract(pure = true)
    public static String consolidateStrings(String[] args, int start)
    {
        String ret = args[start];
        if (args.length > (start + 1))
        {
            for (int i = (start + 1); i < args.length; i++)
                ret = ret + " " + args[i];
        }
        return ret;
    }


    public static String ChatColorToAnsi(String s)
    {
        Map<ChatColor, String> replacements = new EnumMap<>(ChatColor.class);

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

        for (ChatColor color : ChatColor.values())
        {
            if (replacements.containsKey(color))
            {
                s = s.replaceAll("(?i)" + color.toString(), replacements.get(color));
            }
            else
            {
                s = s.replaceAll("(?i)" + color.toString(), "");
            }
        }

        return s;
    }


    public static String removeChatColors(String s)
    {
        for (ChatColor color : ChatColor.values())
        {
            s = s.replaceAll(color.toString(), "");
        }

        return s;
    }


    public static String appendChatColorsToChatColorReset(String s, ChatColor... chatColors)
    {
        String s2 = "";
        for (ChatColor color : chatColors)
        {
            s2 += color.toString();
        }

        return s.replaceAll(ChatColor.RESET.toString(), ChatColor.RESET.toString() + s2);
    }


    public static String replaceChatColorResetWithChatColors(String s, ChatColor... replacements)
    {
        String replacementString = "";
        for (ChatColor replacement : replacements)
        {
            replacementString += replacement.toString();
        }

        return s.replaceAll(ChatColor.RESET.toString(), replacementString);
    }
}
