package me.ninjoh.nincore.api;


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


    /**
     * Get the related {@link OfflinePlayer}
     *
     * @return The related {@link OfflinePlayer}
     */
    OfflinePlayer toOfflinePlayer();
}
