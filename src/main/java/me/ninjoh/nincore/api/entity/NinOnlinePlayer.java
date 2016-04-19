package me.ninjoh.nincore.api.entity;


import me.ninjoh.nincore.api.NinCore;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public interface NinOnlinePlayer extends NinOfflinePlayer, NinCommandSender
{
    /**
     * Get the bukkit player.
     *
     * @return bukkit player.
     */
    Player toPlayer();

    @Nullable
    static NinOnlinePlayer fromPlayer(Player p)
    {
        return NinCore.get().getEntityManager().getNinOnlinePlayer(p);
    }
}
