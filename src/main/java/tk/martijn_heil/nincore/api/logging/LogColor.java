package tk.martijn_heil.nincore.api.logging;


import org.bukkit.ChatColor;

/**
 * A semantic representations of colours which may be used in a {@link NinPluginLogger} or {@link ModuleLogger}.
 * This essentially is a wrapper for {@link ChatColor}.
 */
public enum LogColor
{
    HIGHLIGHT(ChatColor.LIGHT_PURPLE),
    BAD(ChatColor.RED),
    VERY_BAD(ChatColor.DARK_RED),
    GOOD(ChatColor.GREEN),
    INFO(ChatColor.YELLOW),
    RESET(ChatColor.RESET);

    ChatColor relatedChatColor;


    LogColor(ChatColor relatedChatColor)
    {
        this.relatedChatColor = relatedChatColor;
    }


    @Override
    public String toString()
    {
        return this.relatedChatColor.toString();
    }


    public ChatColor toChatColor()
    {
        return this.relatedChatColor;
    }
}
