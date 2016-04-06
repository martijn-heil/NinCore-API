package me.ninjoh.nincore.api.entity;


import me.ninjoh.nincore.api.NinCommandSender;
import me.ninjoh.nincore.api.NinCore;
import me.ninjoh.nincore.api.NinOfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public interface NinPlayer extends NinOfflinePlayer, NinCommandSender
{
    /**
     * Get the bukkit player.
     *
     * @return bukkit player.
     */
    Player toPlayer();

    @Nullable
    static NinPlayer fromPlayer(Player p)
    {
        return NinCore.get().getNinPlayer(p);
    }
}
