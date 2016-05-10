package tk.martijn_heil.nincore.api.util;


import org.bukkit.entity.Player;

public class DebugUtils
{
    @Deprecated
    public static String playerToDebugString(Player p)
    {
        return "UUID: '" + p.getUniqueId() + "', Username: '" + p.getName() + "'";
    }
}
