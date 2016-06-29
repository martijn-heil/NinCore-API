package tk.martijn_heil.nincore.api.entity;


import org.bukkit.entity.Player;

public interface NinOnlinePlayer extends NinOfflinePlayer, NinCommandSender
{
    /**
     * Get the bukkit player.
     *
     * @return bukkit player.
     */
    Player toPlayer();
}
