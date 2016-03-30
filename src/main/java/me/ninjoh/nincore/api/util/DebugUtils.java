package me.ninjoh.nincore.api.util;


import org.bukkit.entity.Player;

public class DebugUtils
{
    public static String playerToDebugString(Player p)
    {
        return "UUID: '" + p.getUniqueId() + "', Username: '" + p.getName() + "'";
    }
}
