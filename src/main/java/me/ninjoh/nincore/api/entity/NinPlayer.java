package me.ninjoh.nincore.api.entity;


import me.ninjoh.nincore.api.NinCommandSender;
import me.ninjoh.nincore.api.NinOfflinePlayer;
import org.bukkit.entity.Player;

public interface NinPlayer extends NinOfflinePlayer, NinCommandSender
{
    /**
     * Get the bukkit player.
     *
     * @return bukkit player.
     */
    Player toPlayer();
}
