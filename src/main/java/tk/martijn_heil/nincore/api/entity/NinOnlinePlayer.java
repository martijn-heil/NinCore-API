package tk.martijn_heil.nincore.api.entity;


import org.bukkit.entity.Player;
import tk.martijn_heil.nincore.api.NinCore;

public interface NinOnlinePlayer extends NinOfflinePlayer, NinCommandSender
{
    /**
     * Get the bukkit player.
     *
     * @return bukkit player.
     */
    Player toPlayer();

    static NinOnlinePlayer fromPlayer(Player p)
    {
        return NinCore.get().getEntityManager().getNinOnlinePlayer(p);
    }
}
