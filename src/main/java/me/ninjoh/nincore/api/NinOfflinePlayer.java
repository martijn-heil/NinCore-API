package me.ninjoh.nincore.api;


import me.ninjoh.nincore.api.entity.NinPlayer;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public interface NinOfflinePlayer
{
    /**
     * Get the player's UUID.
     *
     * @return the player's UUID.
     */
    UUID getUuid();


    OfflinePlayer getOfflinePlayer();


    NinPlayer getNinOnlinePlayer();
}
