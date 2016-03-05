package me.ninjoh.nincore.api.command;


import org.bukkit.ChatColor;

public enum NinArgumentColor
{
    OPTIONAL(ChatColor.DARK_GRAY),
    REQUIRED(ChatColor.GREEN);


    private ChatColor color;

    NinArgumentColor(ChatColor color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return this.color.toString();
    }
}
