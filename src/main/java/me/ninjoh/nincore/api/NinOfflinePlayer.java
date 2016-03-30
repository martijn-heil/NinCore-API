package me.ninjoh.nincore.api;


import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public interface NinOfflinePlayer
{
    /**
     * Get the related {@link OfflinePlayer}
     *
     * @return The related {@link OfflinePlayer}
     */
    @NotNull
    OfflinePlayer toOfflinePlayer();
}
