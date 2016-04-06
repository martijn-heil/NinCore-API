package me.ninjoh.nincore.api;


import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NinOfflinePlayer
{
    /**
     * Get the related {@link OfflinePlayer}
     *
     * @return The related {@link OfflinePlayer}
     */
    @NotNull
    OfflinePlayer toOfflinePlayer();

    @Nullable
    static NinOfflinePlayer fromOfflinePlayer(OfflinePlayer offlinePlayer)
    {
        return NinCore.get().getNinOfflinePlayer(offlinePlayer);
    }
}
